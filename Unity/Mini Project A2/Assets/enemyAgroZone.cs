using System.Collections;
using System.Collections.Generic;
using UnityEngine;


public class enemyAgroZone : MonoBehaviour
{
    public GameObject Target;
    public GameObject enemy;
    public float movementSpeed = 2F;
    private Rigidbody2D enemyRigidBody;
    private Vector2 calculateDirection;
    private bool targetDetected = false;
    private Animator animator;
    private SpriteRenderer enemySR;
    void Start()
    {
        enemyRigidBody = enemy.GetComponent<Rigidbody2D>();

        animator = enemy.GetComponent<Animator>();

        enemySR = enemy.GetComponent<SpriteRenderer>();

    }

    // Update is called once per frame
    void Update()
    {
              if (targetDetected)
        {
            animator.SetBool("Walking", true);

            if (calculateDirection.x < 0)
            {
                enemySR.flipX = true;
            }
            else{
                enemySR.flipX = false;

            }
        }
        else{
            animator.SetBool("Walking", false);

        }

    }
    private void OnTriggerEnter2D(Collider2D collision)
{
    if (collision.name.Equals(Target.name))
    {
        targetDetected = true;
            Debug.Log("Player entered enemy agro zone");
        }
}

private void OnTriggerExit2D(Collider2D collision)
{
    if (collision.name.Equals(Target.name))
    {
        targetDetected = false;
            Debug.Log("Player left enemy agro zone");
        }
}
private void FixedUpdate ()
{
    if (targetDetected)
    {
        calculateDirection = (Target.transform.position - enemy.transform.position).normalized;

        enemyRigidBody.velocity = calculateDirection * movementSpeed;

    }
    else{
        enemyRigidBody.velocity = new Vector2(0, 0);
    }
}

}