using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using TMPro;

public class PlayerInventory : MonoBehaviour
{

    //public TusMoveTowards target;
    public bool Collected;
    public bool WarningZone;
    public int Kills = 0;
    public int Lifes = 2;

    public GameObject player;
    public TextMeshProUGUI guiHealth;
    public TextMeshProUGUI guiScore;
    public TextMeshProUGUI guiRage;

    

    //public Transform SpawnPoint;
    // Start is called before the first frame update
    void Start()
    {
        Kills = 0;
    }

    // Update is called once per frame
    void Update()
    {
        if (Lifes <= 0)
        {
            /*Scene scene = SceneManager.GetActiveScene(); */
            SceneManager.LoadScene(2);
            Debug.Log("Respawned");            
        }
        if (Kills >= 7)
        {
            SceneManager.LoadScene(3);
            Debug.Log("Respawned");
        }
        guiHealth.text = "Lifes: " + Lifes.ToString();
        guiScore.text = "Kills: " + Kills.ToString() + " / 7";
        if (Collected)
        {
            guiRage.text = "Killer Mode: On";
        }
        else
        {
            guiRage.text = "Killer Mode: OFF";
        }

    }
    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.collider.tag =="Collectible")
        {
            GameObject col = collision.gameObject;
            Collected = true;          
            Destroy(col);
            StartCoroutine(Timer());
            
        }

        if (Collected == false && collision.collider.tag == "Enemy")
        {           
                Lifes--;
                //Debug.Log("Lifes: " + Lifes);           
        }        
    }
    private void OnTriggerEnter2D(Collider2D collision)
    {
        if (collision.GetComponent<Collider2D>().tag == "Collectible")
        {
            //Debug.Log("Entered");
            WarningZone = true;
        }
    }

    private void OnTriggerExit2D(Collider2D collision)
    {
        if (collision.GetComponent<Collider2D>().tag == "Collectible")
        {
            //Debug.Log("Left");
            WarningZone = false;
        }
    }
    IEnumerator Timer()
    {
        yield return new WaitForSeconds(5);
        Collected = false;
    }



}
