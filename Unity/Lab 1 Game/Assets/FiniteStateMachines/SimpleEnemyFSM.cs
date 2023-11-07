using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SimpleEnemyFSM : MonoBehaviour
{
    public GameObject target;
    public float speed = 1.0f;
    public float closeRange;
    public float farRange;
    public enum EnemyState
    {
        CHASE,
        IDLE,
        FARIDLE
    };
    public Waypoints waypoint;
    public EnemyState currentState = EnemyState.CHASE;



    // Update is called once per frame
    void Update()
    {

        switch (currentState)
        {
            case EnemyState.CHASE:
                BasicChase();
                break;
            case EnemyState.IDLE:
                Idle();
                break;
            case EnemyState.FARIDLE:
                Idle();
                break;
        }
        CheckDistance();       
    }

    void CheckDistance()
    {
        Vector3 rangeToClose = target.transform.position - transform.position;
        float dist = rangeToClose.magnitude;
        if (dist <= closeRange)
        {
            waypoint.inRange= true;
            waypoint.farRange = false;
            currentState = EnemyState.CHASE;
        }
        else if (dist <= farRange && dist >= closeRange)
        {
            waypoint.inRange = false;
            waypoint.farRange = true;
            currentState = EnemyState.IDLE;
        }
        else
        {
            waypoint.inRange= false;
            waypoint.farRange = false;
            currentState = EnemyState.FARIDLE;
        }
    }
    void BasicChase()
    {
        float speedDelta  = speed * Time.deltaTime;

        if (Mathf.Abs(transform.position.x - target.transform.position.x) > speedDelta)
        {
            if (transform.position.x > target.transform.position.x)
            {
                float deltax = -speedDelta;
                transform.Translate(new Vector3(deltax, 0, 0));
            }
            else if (transform.position.x < target.transform.position.x)
            {
                float deltax = speedDelta;
                transform.Translate(new Vector3(deltax, 0, 0));
            }
        }

        if (Mathf.Abs(transform.position.y - target.transform.position.y) > speedDelta)
        {
            if (transform.position.y > target.transform.position.y)
            {
                float deltay = -speedDelta;
                transform.Translate(new Vector3(0, deltay, 0));
            }
            else if (transform.position.y < target.transform.position.y)
            {
                float deltay = speedDelta;
                transform.Translate(new Vector3(0, deltay, 0));
            }
        }
    }

    void Idle()
    {

    }

}






