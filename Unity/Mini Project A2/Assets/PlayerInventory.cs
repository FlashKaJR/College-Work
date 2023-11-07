using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerInventory : MonoBehaviour
{
    public AudioSource collectablesAudioPlayer;
    public int bombs =0;
    public int keys =0;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }
    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.collider.tag =="C.Bomb")
        {
            GameObject cBomb = collision.gameObject;

            bombs++;
            collectablesAudioPlayer.clip = cBomb.GetComponent<ItemAudio>().audioFile;
            collectablesAudioPlayer.Play();
            Destroy(cBomb);

            Debug.Log("Player has collected " + bombs + " Bomb(s) in the inventory. ");
        }

        if (collision.collider.tag == "C.Keys")
        {
            GameObject cKey = collision.gameObject;

            keys++;
            collectablesAudioPlayer.clip = cKey.GetComponent<ItemAudio>().audioFile;
            collectablesAudioPlayer.Play();
            Destroy(cKey);

            Debug.Log("Player has collected " + keys + " Key(s) in the inventory. ");
        }

    }

}
