using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MoveTowards : MonoBehaviour
{

    public GameObject target;
    public float speed = 1.0f;
    // Start is called before the first frame update
    void Start()
    {
        //NPC position - transform.position

        transform.position = new Vector3(0.0f, 0.0f, 0.0f);

        //target positon - target.transform.position
        //vector3.MoveTowards  move NPC to target
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
