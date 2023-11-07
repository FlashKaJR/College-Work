using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Waypoints : MonoBehaviour
{
    [Serializable]
    public struct WaypointData
    {
        public GameObject location;
        public int speed;
        public float wait;
    }
    public WaypointData[] pattern;
    public WaypointData[] farpattern;

    public int patternindex = 0;
    public float speed = 0;
    //public TusMoveTowards move;
    public float distance;
    //public float Timer = 0;

    bool pause;
    public bool inRange;
    public bool farRange;

    // Use this for initialization
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {

        if (!inRange)
        {
            if (pause)
            {
                return;
            }

            // process the current instruction in our control data array
            WaypointData data = pattern[patternindex];
            WaypointData fardata = farpattern[patternindex];
            speed = data.speed;

            // find the range to close vector
            Vector3 rangetoclose;
            if (!farRange)
            {
                rangetoclose = data.location.transform.position - transform.position;
            }
            else
            {
                rangetoclose = fardata.location.transform.position - transform.position;
            }
            //Vector3 rangetoclose = data.location.transform.position - transform.position;

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

                patternindex++;
                // reset the patternindex if we are at the end of the instruction array
                if (patternindex >= pattern.Length)
                {
                    patternindex = 0;
                }




                StartCoroutine(PauseEnemy(data.wait));

                // process the current instruction in our control data array
                data = pattern[patternindex];
                fardata= farpattern[patternindex];
                /*speed = speeds[patternindex];*/
                // find the new range to close vector
                if (!farRange) 
                {
                    rangetoclose = data.location.transform.position - transform.position;
                }
                else
                {
                    rangetoclose = fardata.location.transform.position - transform.position;
                }
                
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
