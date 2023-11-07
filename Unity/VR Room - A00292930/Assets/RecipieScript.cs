using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RecipieScript : RespawnableObject
{
    public Transform SpawnLocation;


        public GameObject socket1;
        public GameObject socket2;
        public GameObject socket3;

    
    [Serializable]
    public struct requiredIngredients
    {
        public GameObject product;
        public string Ingredient1;
        public string Ingredient2;
        public string Ingredient3;
    }


    public requiredIngredients[] Recipies;

    // Start is called before the first frame update
    void Start()
    {
        
    }


    // Update is called once per frame
    void Update()
    {
        if (attachedObject != null)
        {
            // You've found the attached object
            Debug.Log("Attached object found: " + attachedObject.name);
        }
        else
        {
            // No attached object found
            Debug.Log("No attached object found.");
        }
    }
}
