using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class WaypointPatternMovement : MonoBehaviour
{
    [Serializable]
    public struct WaypointData
    {
        public GameObject location;
        public int speed;
        public float wait;
    }
    public WaypointData[] pattern;
   
    public int patternindex = 0;
    public float speed = 0;
    public FSMEnemy move;
    public float distance;
    //public float Timer = 0;

    bool pause;   

    // Use this for initialization
    void Start ()
    {
        
	}
	
	// Update is called once per frame
	void Update ()
    {
        if (!move.inRange)
        {


            // process the current instruction in our control data array
            WaypointData data = pattern[patternindex];
            speed = data.speed;

            // find the range to close vector
            Vector3 rangetoclose = data.location.transform.position - transform.position;

            // draw this vector at the position of the enemy
            //Debug.DrawRay(transform.position, rangetoclose, Color.cyan);
            // what's our distance to the waypoint?
            distance = rangetoclose.magnitude;

            // how far do we move each frame
            float speeddelta = speed * Time.deltaTime;

            // if we're close enough to the current waypoint 
            // then increase the pattern index

            if (distance <= 0.3)
            {
                //speed = 0;
                //Timer += Time.deltaTime;
                //if (Timer >= targetTime)
                //{
                //    patternindex++;
                //    Timer= 0.0f;

                //}
                patternindex++;
                // reset the patternindex if we are at the end of the instruction array
                if (patternindex >= pattern.Length)
                {
                    patternindex = 0;
                }




                StartCoroutine(PauseEnemy(data.wait));

                // process the current instruction in our control data array
                data = pattern[patternindex];
                /*speed = speeds[patternindex];*/
                // find the new range to close vector
                rangetoclose = data.location.transform.position - transform.position;
            }

            // in what direction is our waypoint?
            Vector3 normalizedrangetoclose = rangetoclose.normalized;

            // draw this vector at the position of the waypoint
            //Debug.DrawRay(transform.position, normalizedrangetoclose, Color.magenta);

            Vector3 delta = speeddelta * normalizedrangetoclose;

            transform.Translate(delta);
        }
    }

    IEnumerator PauseEnemy(float wait)
    {
        pause = true;
        yield return new WaitForSeconds(wait);
        pause = false;
    }

}
