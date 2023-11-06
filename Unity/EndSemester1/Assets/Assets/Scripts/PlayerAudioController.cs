using JetBrains.Annotations;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerAudioController : MonoBehaviour
{
    public AudioSource walkingAudio;
    public AudioSource damageAudio;
    public AudioSource jumpAudio;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void PlayerWalkingAudio(bool walking)
    {
        if (walking && !walkingAudio.isPlaying)
        {
            walkingAudio.Play();
        }
        if (!walking)
        {
            walkingAudio.Stop();
        }

      
        
    }
    public void PlayJumpAudio()
        {
            jumpAudio.Play();
        }
    public void PlayDamageAudio()
    {
        damageAudio.Play();
    }

}
