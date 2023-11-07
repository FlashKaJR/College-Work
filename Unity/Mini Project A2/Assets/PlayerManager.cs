using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.InputSystem;

public class PlayerManager : MonoBehaviour
{
    // Start is called before the first frame update
    public float playerSpeed = 1;

    private Rigidbody2D rb;
    private Vector2 movement;
    private Animator animate;
    private SpriteRenderer playerSR;
    public PlayerAudioController playerAudio;

    // Start is called before the first frame update.
    void Start()
    {
        rb = gameObject.GetComponent<Rigidbody2D>();

        animate = gameObject.GetComponent<Animator>();

        playerSR = gameObject.GetComponent<SpriteRenderer>();

    }

    // Update is called once per frame
    void Update()
    {
        if (movement != Vector2.zero)
        {
            animate.SetBool("Walking", true);

            playerAudio.PlayerWalkingAudio(true);
            if (movement.x < 0)
            {
                playerSR.flipX = false;
            }
            else
            {
                playerSR.flipX = true;
            }
        }
        else
        {
            animate.SetBool("Walking", false);
           // playerAudio.PlayerWalkingAudio(false);
        }
    }

    private void FixedUpdate()
    {
        rb.MovePosition(rb.position + (movement * playerSpeed * Time.fixedDeltaTime));
    }

    void OnMove(InputValue MovePosition)
    {
        movement = MovePosition.Get<Vector2>();

    }
    void OnFire()
    {
        if (movement == Vector2.zero) { 
        animate.SetTrigger("Attack");

        playerAudio.PlayAttackAudio();
        }
    }
}