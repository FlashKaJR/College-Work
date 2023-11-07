using System.Collections;
using System.Collections.Generic;
using UnityEngine;


public class FSMEnemy : MonoBehaviour
{
    //public bool Runner;
    //public bool Guardian;
    //public bool Wanderer;
    public PlayerInventory enemyObject;
    public GameObject target;
    public float speed;
    public float range;
    public bool inRange;
    public float dist;
    public enum EnemyType
    {
        Runner,
        Guardian,
        Wanderer
    }

    public enum EnemyState
    {
        CHASE,
        DANGERCHASE,
        IDLE,
        WARNED,
        EVADING
    };
    public EnemyType enemyType;
    public EnemyState currentState = EnemyState.CHASE;


    // Start is called before the first frame update
    void Start()
    {        
            range = 7.0f;      
    }

    // Update is called once per frame
    void Update()
    {
        switch (currentState)
        {
            case EnemyState.CHASE:
                Chase();
                break;
            case EnemyState.DANGERCHASE:
                DangerChase();
                break;

            case EnemyState.IDLE:
                Idle();
                break;
            case EnemyState.WARNED:
                Warned();
                break;
            case EnemyState.EVADING:
                Evading();
                break;
        }
        CheckDistance();
        if (enemyObject.WarningZone || enemyObject.Collected)
        {
            range = 14.0f;
        }
        if (enemyObject.Kills >= 2)
        {
            if (enemyType == EnemyType.Wanderer)
            {
                speed = 6.5f;
                range = 10.0f;
            }
            else
            {
                speed = 5.0f;
                range = 7.0f;
            }
        }
    }    

    void CheckDistance()
    {
        float speedDelta = speed * Time.deltaTime;
        Vector3 rangeToClose = target.transform.position - transform.position;
        dist = rangeToClose.magnitude;


        if (dist < range && enemyObject.Kills < 2)
        {
            inRange = true;            
            currentState = EnemyState.CHASE;           
        }
        if (dist < range && enemyObject.Kills >= 2)
        {
            inRange = true;            
            currentState = EnemyState.DANGERCHASE;
        }
        if (dist > range)
        {
            inRange = false;
            currentState = EnemyState.IDLE;
        }
        if (dist < range && enemyObject.Collected && enemyType != EnemyType.Guardian)
        {
            inRange = true;
            currentState = EnemyState.EVADING;
        }
        if (dist < range && enemyObject.WarningZone && enemyType != EnemyType.Guardian)
        {
            inRange = true;
            currentState = EnemyState.WARNED;
        }
    }

    void Chase()
    {
        inRange = true;
        speed = 4.0f;
        range = 7.0f;
        MoveChase();
    }    

    void DangerChase()
    {
        inRange = true;        
        MoveChase();
    }

    void Idle()
    {
        range = 7.0f;
        inRange = false;
        if (enemyType == EnemyType.Runner)
        {
            speed = 1;
            MoveChase();
        }
        else
        {
            
            speed= 0;
        }
    }

    void Warned()
    {
        speed = 4.0f;
        inRange = true;
        MoveEvade();
    }

    void Evading()
    {
        speed = 2.0f;
        inRange = true;
        MoveEvade();
    }

    void MoveChase()
    {
        float speedDelta = speed * Time.deltaTime;
        Vector3 rangeToClose = target.transform.position - transform.position;
        Vector3 normRangeToClose = rangeToClose.normalized;
        Vector3 newPosition = transform.position + normRangeToClose * speedDelta;
        transform.position = newPosition;
    }

    void MoveEvade()
    {
        float speedDelta = speed * Time.deltaTime;
        Vector3 rangeToClose = target.transform.position - transform.position;
        Vector3 normRangeToClose = rangeToClose.normalized;
        Vector3 newPosition = transform.position - normRangeToClose * speedDelta;
        transform.position = newPosition;
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