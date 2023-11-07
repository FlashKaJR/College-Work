using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BasicPlayerMovement : MonoBehaviour
{
    public float speed = 6.0f;

	// Use this for initialization
	void Start ()
    {
      
	}
	
	// Update is called once per frame
	void Update ()
    {
        // Move the player ship to where the mouse is clicked on-screen
       // if (Input.GetButton("Fire1"))
        //{
        //    Vector3 newpos = Camera.main.ScreenToWorldPoint(Input.mousePosition);  
        //    transform.position = new Vector3(newpos.x, newpos.y, 0.0f);
        //}

        Vector3 input = new Vector3(0.0f,0.0f,0.0f);

        // Move the player based on cursor key inputs
        if (Input.GetKey(KeyCode.LeftArrow))
        {
            input += Vector3.left;
        }if (Input.GetKey(KeyCode.A))
        {
            input += Vector3.left;
        }


        if (Input.GetKey(KeyCode.RightArrow))
        {
            input += Vector3.right;
        }
        if (Input.GetKey(KeyCode.D))
        {
            input += Vector3.right;
        }


        if (Input.GetKey(KeyCode.UpArrow))
        {
            input += Vector3.up;
        }
        if (Input.GetKey(KeyCode.W))
        {
            input += Vector3.up;
        }


        if (Input.GetKey(KeyCode.DownArrow))
        {
            input += Vector3.down;
        }
        if (Input.GetKey(KeyCode.S))
        {
            input += Vector3.down;
        }

        if (Input.GetMouseButton(0))
        {
            if (Input.GetMouseButton(1))
            {
                MouseHold();
            }
        }


        Vector3 velocity = input.normalized * speed * Time.deltaTime;

        // Could replace the above with the following code
        //Vector3 velocity = Vector3(Input.GetAxis("Horizontal"), Input.GetAxis("Vertical"), 0);
        
        transform.position += velocity;
    }
      void MouseHold()
    {
        Vector3 mousePosition = Camera.main.ScreenToWorldPoint(Input.mousePosition);
        Vector3 rangetoclose = mousePosition - transform.position;
        Vector3 normalizedrangetoclose = rangetoclose.normalized;
        float speeddelta = speed * Time.deltaTime;
        Vector3 delta = speeddelta * normalizedrangetoclose;
        transform.Translate(delta);
    }

    void OnBecameInvisible()
    {
        Camera cam = Camera.main;

        if (cam != null)
        {
            Vector3 viewportPosition = cam.WorldToViewportPoint(transform.position);

            Vector3 newPosition = transform.position;

            if (viewportPosition.x > 1 || viewportPosition.x < 0)
            {
                newPosition.x = -newPosition.x;
            }

            if (viewportPosition.y > 1 || viewportPosition.y < 0)
            {
                newPosition.y = -newPosition.y;
            }

            transform.position = newPosition;
        }
    }
}
