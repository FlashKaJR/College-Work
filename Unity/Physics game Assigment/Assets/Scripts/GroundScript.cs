using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Tilemaps;
using UnityEngine.SceneManagement;

public class GroundScript : MonoBehaviour
{
    [Serializable]
    public struct PlatformData
    {
        public Tilemap tilemapPrefab;
    }

    public PlatformData[] pattern;


    public GameObject Clouds;
    public GameObject oldCloud;

    public PlayerInfo PlayerInfo;
    public GameObject Player;

    Tilemap currentTilemap1;
    Tilemap currentTilemap2;
    Tilemap currentTilemap3;

    Tilemap previousTilemap1;
    Tilemap previousTilemap2;
    Tilemap previousTilemap3;

    Tilemap lastTilemap1;
    Tilemap lastTilemap2;
    Tilemap lastTilemap3;

    Vector3 tilemapCurrPosition;
    Vector3 tilemapPrevPosition;
    Vector3 tilemapNextPosition;


    Vector3 cloudPosition;

    public float distFromLast;
    public float distFromLastCloud;
    public float distThisFrame;
    bool ResetMessage;

    private void Start()
    {
        //Preset distance of platforms
        Vector3 startCurrPosition = new Vector3(Player.transform.position.x + 150, 6, 0);
        Vector3 startPrevPosition = new Vector3(startCurrPosition.x + 74, 6, 0);
        Vector3 startNextPosition = new Vector3(startPrevPosition.x + 74, 6, 0);

        //Instantiate all platforms at start location
        Tilemap startCurrTilemap = Instantiate(pattern[3].tilemapPrefab, startCurrPosition, Quaternion.identity);
        startCurrTilemap.transform.SetParent(transform);

        Tilemap startPrevTilemap = Instantiate(pattern[2].tilemapPrefab, startPrevPosition, Quaternion.identity);
        startPrevTilemap.transform.SetParent(transform);

        Tilemap startNextTilemap = Instantiate(pattern[1].tilemapPrefab, startNextPosition, Quaternion.identity);
        startNextTilemap.transform.SetParent(transform);
    }

    // Update is called once per frame
    void Update()
    {
        //Calculate distance this frame
        distThisFrame = PlayerInfo.speed * Time.deltaTime;
        //Calculate distance from last frame
        distFromLast += distThisFrame;
        distFromLastCloud += distThisFrame;

        //Randomize what platform will be next
        int patternIndex1 = UnityEngine.Random.Range(0, pattern.Length);
        int patternIndex2 = UnityEngine.Random.Range(0, pattern.Length);
        int patternIndex3 = UnityEngine.Random.Range(0, pattern.Length);

        //Preset distance of platforms
        tilemapCurrPosition = new Vector3(Player.transform.position.x + 148, 6, 0);
        tilemapPrevPosition = new Vector3(tilemapCurrPosition.x +74, 6, 0);
        tilemapNextPosition = new Vector3(tilemapPrevPosition.x +74, 6, 0);

        //Cloud position
        cloudPosition = new Vector3(Player.transform.position.x +30, Player.transform.position.y, 0);


        if (distFromLastCloud >= 75.0f)
        {
            //Delete old clouds
            if (oldCloud != null)
            {
                Destroy(oldCloud.gameObject);
            }

            //Cloud creation
            if (UnityEngine.Random.Range(1, 3 + 1) == 1 && Player.transform.position.y >= 10)
            {
                GameObject cloneCloud = Instantiate(Clouds, cloudPosition, Quaternion.identity);
                oldCloud = cloneCloud;
            }
            distFromLastCloud = 0.0f;

        }


            if (distFromLast >= 218.0f)
            {
            //Delete old platforms
            if (lastTilemap1 != null || lastTilemap2 != null || lastTilemap3 != null)
                {
                    Destroy(lastTilemap1.gameObject);
                    Destroy(lastTilemap2.gameObject);
                    Destroy(lastTilemap3.gameObject);
                }


            //Instantiate all platforms around the player
            Tilemap cloneCurrTilemap = Instantiate(pattern[patternIndex1].tilemapPrefab, tilemapCurrPosition, Quaternion.identity);
            cloneCurrTilemap.transform.SetParent(transform);

            Tilemap clonePrevTilemap = Instantiate(pattern[patternIndex2].tilemapPrefab, tilemapPrevPosition, Quaternion.identity);
            clonePrevTilemap.transform.SetParent(transform);

            Tilemap cloneNextTilemap = Instantiate(pattern[patternIndex3].tilemapPrefab, tilemapNextPosition, Quaternion.identity);
            cloneNextTilemap.transform.SetParent(transform);


            //Delay destruction of old platforms
            if (previousTilemap1 != null || previousTilemap2 != null || previousTilemap3 != null)
            {
                lastTilemap1 = previousTilemap1;
                lastTilemap2 = previousTilemap2;
                lastTilemap3 = previousTilemap3;
            }
            if (currentTilemap1 != null || currentTilemap2 != null || currentTilemap3 != null)
            {
                previousTilemap1 = currentTilemap1;
                previousTilemap2 = currentTilemap2;
                previousTilemap3 = currentTilemap3;
            }
            currentTilemap1 = cloneCurrTilemap;
            currentTilemap2 = clonePrevTilemap;
            currentTilemap3 = cloneNextTilemap;


            //Reset Current distance
            distFromLast = 0.0f;
            
        }
        //Restart if player falls under the ground
        if(Player.transform.position.y <= -4)
        {
            SceneManager.LoadScene(0);
        }
    }   
}
