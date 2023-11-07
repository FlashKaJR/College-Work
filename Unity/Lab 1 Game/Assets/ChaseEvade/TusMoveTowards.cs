using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TusMoveTowards : MonoBehaviour
{
    public bool Runner;
    public bool Guardian;
    public bool Wanderer;
    public PlayerInventory enemyObject;
    public GameObject target;
    public float speed = 1.0f;
    public float range;
    public bool inRange;
    

    // Start is called before the first frame update
    void Start()
    {              

    }

    // Update is called once per frame
    void Update()
    {
        float speedDelta = speed * Time.deltaTime;

        Vector3 newPosition = tusMoveTowards(transform.position, target.transform.position, speedDelta);

        transform.position = newPosition;      
    }
     Vector3 tusMoveTowards(Vector3 predatorPosition, Vector3 target, float maxDistanceDelta)
     {     
        Vector3 rangeToClose = target - predatorPosition;
        float dist = rangeToClose.magnitude;

        Vector3 normRangeToClose = rangeToClose.normalized ;
        Vector3 speedRange = rangeToClose.normalized * maxDistanceDelta; 



        if (enemyObject.Collected || enemyObject.WarningZone)//If close or taken the kill orb
        {
            
            if (enemyObject.Collected)
            {
                speed = 2.0f;               
            }           
            if (!Guardian)
            {
                range = 14.0f;
            }
            

            if (dist < range)//move away from the player if in range
            {
                if (!Runner)
                {
                    inRange = true;
                }               
                if (!Guardian)
                {
                    Vector3 newPosition = predatorPosition - normRangeToClose * maxDistanceDelta;
                    return newPosition;
                }               
            }
        }
        else 
        {
            if (!Runner)
            {
                inRange = false;
            }
            if (!Guardian)
            {
                range = 7.0f;
            }
        }
        
     
        if (dist < range)// if in range
        {
            if (!Runner)
            {
                inRange = true;
            }
            if (enemyObject.Kills >= 2)// improved movement as game progresses
            {
                if (Wanderer)
                {
                    speed = 7.0f;
                    range = 10.0f;
                }
                else
                {
                    speed = 5.0f;
                    range = 7.0f;
                }
                
            }
            else// Default movement at start of game
            {
                if (!Wanderer)
                {
                    range = 7.0f;
                }
                    
                speed = 4.0f;
            }                        
            Vector3 newPosition = predatorPosition + normRangeToClose * maxDistanceDelta;
            return newPosition;
        }
        else
        {
            if (!Runner)
            {
                inRange = false;
            }
            if (Runner)
            {
                
                speed = 1.0f;
                Vector3 newPosition = predatorPosition + normRangeToClose * maxDistanceDelta;

                return newPosition;
            }
            else
            {
                if (!Wanderer)
                {
                    range = 7.0f;
                }
                if (!Runner)
                {
                    speed = 0.0f;
                }
               
                Vector3 newPosition = predatorPosition + normRangeToClose * maxDistanceDelta;

                return newPosition;                
            }
        }

     }
    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.collider.tag == "Player")
        {
            enemyObject.Kills++;
            Destroy(gameObject);
        }       
    }




    }
