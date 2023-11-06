using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerInventory : MonoBehaviour
{
    public AudioSource collectablesAudioPlayer;
    public int Collected =0;
    
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }
    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.collider.tag =="Collectible")
        {
            GameObject col = collision.gameObject;

            Collected++;
            collectablesAudioPlayer.clip = col.GetComponent<ItemAudio>().audioFile;
            collectablesAudioPlayer.Play();
            Destroy(col);

            //Debug.Log("Player has collected " + Collected + " Fruits(s) in the inventory. ");
        }



    }

}
