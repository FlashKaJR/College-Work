using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TimerScript : MonoBehaviour
{
    public PlayerInventory playerObject;
    public float targetTime;
    public float Timer;
    public bool startTimer;
    
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if (startTimer)
        {
            Timer += Time.deltaTime;
            if (Timer >= targetTime)
            {
                //Debug.Log("Kill time expired");
                playerObject.Collected = false;
                Timer = 0.0f;
                startTimer = false;
            }
        }
    }
}
