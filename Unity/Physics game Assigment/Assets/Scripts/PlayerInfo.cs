using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using TMPro;

public class PlayerInfo : MonoBehaviour
{
    public static Rigidbody2D rb;

    Vector3 startPos;

    public float speed;
    public float dist;

    public TextMeshProUGUI guiScore;
    public TextMeshProUGUI guiHelp;


    // Start is called before the first frame update
    void Start()
    {
        startPos = transform.position;
        rb = GetComponent<Rigidbody2D>();
    }

    // Update is called once per frame
    void Update()
    {
        speed = rb.velocity.magnitude;
        float rangeToClose = startPos.x - transform.position.x;
        dist = Mathf.Abs(rangeToClose);
        int score = Mathf.RoundToInt(dist);
        guiScore.text = "Score: " + score.ToString();

        if(score >= 20 && speed <= 0.2)
        {
            guiHelp.text = "Your Score: " + score.ToString() + " Press \"R\" to try again.";
        }
    }
}
