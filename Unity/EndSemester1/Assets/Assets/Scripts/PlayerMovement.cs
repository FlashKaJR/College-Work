using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.InputSystem;
using TMPro;
using UnityEngine.SceneManagement;

public class PlayerMovement : MonoBehaviour
{

    Rigidbody2D rb;
    Animator animator;
    SpriteRenderer spriteRenderer;
    GroundCheck groundCheck;
    enemyAgroZone agro;
    //ItemLife itemLife;
    //PlayerInventory playerInventory;
    public PlayerInventory playerInventory;
    public TextMeshProUGUI guiHealth;
    public TextMeshProUGUI guiFruits;
    public Vector2 movementDirection;
    public int movementSpeed = 2;
    public int jumpImpulse = 4;
    public int lifes = 5;
    bool inair = false;
    public bool jumpk = false;
    public bool damagek = false;
    public PlayerAudioController playerAudio;

    // Start is called before the first frame update
    void Start()
    {
        rb = gameObject.GetComponent<Rigidbody2D>();
        animator = gameObject.GetComponent<Animator>();
        spriteRenderer = gameObject.GetComponent<SpriteRenderer>();
        groundCheck = gameObject.GetComponent<GroundCheck>();
        agro = gameObject.GetComponent<enemyAgroZone>();
        //itemLife = gameObject.GetComponent<ItemLife>();
    }

    // Update is called once per frame

    void Update()
    {

        // Is the Player Moving?
        if (movementDirection != Vector2.zero)
        {
            // Is the Run animation set the False?
            if (animator.GetBool("Run") == false)
            {
                // Enable the Run Animation
                animator.SetBool("Run", true);
                playerAudio.PlayerWalkingAudio(true);
            }

            if (movementDirection.x < 0)
            {
                spriteRenderer.flipX = true;
            }

            else
            {
                spriteRenderer.flipX = false;
            }

        }
        // If the player is not moving - they're standing still
        else
        {
            // Disable the Run Animation
            animator.SetBool("Run", false);
            playerAudio.PlayerWalkingAudio(false);
        }
        if (jumpk)
        {
            rb.velocity = new Vector2(rb.velocity.x, jumpImpulse);
            jumpk = false;
            playerAudio.PlayJumpAudio();
        }
        if (damagek)
        {
            animator.SetTrigger("Hit");
            damagek = false;
            lifes--;
            playerAudio.PlayDamageAudio();
            //Debug.Log("Player lifes:" + lifes);
        }
        guiHealth.text = "Lifes: " + lifes.ToString();
        guiFruits.text = playerInventory.Collected.ToString() + "/50 Fruits";
        if (playerInventory.Collected == 50)
        {
            lifes++;
            playerInventory.Collected = 0;
        }
        if (lifes == 0)
        {
            Scene scene = SceneManager.GetActiveScene(); SceneManager.LoadScene(scene.name);
        }
    }

    void FixedUpdate()
    {
        // Move the Player on the X axis only
        rb.velocity = new Vector2((movementDirection.x * movementSpeed), rb.velocity.y);

    }

    void OnMove(InputValue movementValue)
    {
        // When user input is detected - update the movement variable
        movementDirection = movementValue.Get<Vector2>();
    }

    void OnFire()
    {
        // Trigger the Attack Animation
        /*animator.SetTrigger("Hit");*/

    }

    void OnJump()
    {
        // Trigger the Jump Animation
        if (groundCheck.isGrounded)
        {
            //Debug.Log("Player has Jumped!");
            rb.velocity = new Vector2(rb.velocity.x, jumpImpulse);
            animator.SetTrigger("Jump");
            inair = true;
            playerAudio.PlayJumpAudio();
        }

    }
    void OnDoubleJump()
    {
        // Trigger the Double Jump Animation
        if (inair)
        {
            //Debug.Log("Player has Double jumped!");
            rb.velocity = new Vector2(rb.velocity.x, jumpImpulse);
            animator.SetTrigger("Double jump");
            inair = false;
            playerAudio.PlayJumpAudio();
        }
    }

}