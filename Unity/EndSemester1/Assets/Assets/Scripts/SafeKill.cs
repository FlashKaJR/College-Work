using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SafeKill : MonoBehaviour
{
    //public PlayerMovement player;
    public enemyAgroZone enemyObject;
    // Start is called before the first frame update
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {

    }
    private void OnTriggerEnter2D(Collider2D collision)
    {
        if (collision.name.Equals(enemyObject.Target.name))
        {

            //Debug.Log("Player entered enemy agro zone");
            Destroy(enemyObject.enemy);
            enemyObject.player.jumpk = true;


        }

    }
}

