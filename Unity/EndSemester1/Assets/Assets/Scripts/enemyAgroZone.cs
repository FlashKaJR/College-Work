using System.Collections;
using System.Collections.Generic;
using UnityEngine;


public class enemyAgroZone : MonoBehaviour
{
    public GameObject Target;
    public GameObject enemy;

    private Animator animator;
    public PlayerMovement player;
    
    

    void Start()
    {
        animator = enemy.GetComponent<Animator>();
    }

   
    void Update()
    {
       
    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
        if (collision.name.Equals(Target.name))
        {
            
            //Debug.Log("Player entered enemy agro zone");
            Destroy(enemy);
            player.damagek = true;
            

        }

    }
   


   

}