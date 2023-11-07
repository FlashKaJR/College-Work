using UnityEngine;
using TMPro;

public class DragTarget : MonoBehaviour
{
	public LayerMask m_DragLayers;
	public LayerMask m_DecorLayers;

	[Range (0.0f, 100.0f)]
	public float m_Damping = 1.0f;

	[Range (0.0f, 100.0f)]
	public float m_Frequency = 5.0f;

	public bool m_DrawDragLine = true;
	public Color m_Color = Color.cyan;

	private TargetJoint2D m_TargetJoint;
    bool start = true;
    public Camera m_MainCamera;
    public Camera m_ExtraCamera;
    bool drag;
    bool decor = true;



    public TextMeshProUGUI guiInfo;
    public TextMeshProUGUI guiExtraInfo;

    void Start()
    {
        Physics2D.IgnoreLayerCollision(LayerMask.NameToLayer("Draggable"), LayerMask.NameToLayer("Decor"));
        m_MainCamera.enabled = true;
        m_ExtraCamera.enabled = false;
    }

    void Update ()
	{

        
        // Calculate the world position for the mouse.
        var worldPos = Camera.main.ScreenToWorldPoint (Input.mousePosition);


            if (start)
            {
                if (Input.GetMouseButtonDown (0))
		        {
                    var body = (Rigidbody2D)null;
                    var collider = Physics2D.OverlapPoint (worldPos, m_DragLayers);
			        var colliderD = Physics2D.OverlapPoint (worldPos, m_DecorLayers);
			        if (!collider && !colliderD)
				        return;
                    if (collider)
                    {
                        body = collider.attachedRigidbody;
                        decor = false;
                    }

                    else
                    {
                        body = colliderD.attachedRigidbody;
                    }

			        //var body = collider.attachedRigidbody;
			        if (!body)
				        return;

			        m_TargetJoint = body.gameObject.AddComponent<TargetJoint2D> ();
			        m_TargetJoint.dampingRatio = m_Damping;
			        m_TargetJoint.frequency = m_Frequency;

			        m_TargetJoint.anchor = m_TargetJoint.transform.InverseTransformPoint (worldPos);
                if (!decor)
                {
                    drag = true;
                    guiInfo.text = "";
                    guiExtraInfo.text = "";
                }
                    
                }
                else if (Input.GetMouseButtonUp (0))
		        {
			        Destroy (m_TargetJoint);
                    if (drag)
                    {
                        m_MainCamera.enabled = false;
                        m_ExtraCamera.enabled = true;
                        start = false;
                    }
                
                    m_TargetJoint = null;             
			        return;
		        }
            }
		
		
		if (m_TargetJoint)
		{
			m_TargetJoint.target = worldPos;

			if (m_DrawDragLine)
				Debug.DrawLine (m_TargetJoint.transform.TransformPoint (m_TargetJoint.anchor), worldPos, m_Color);
		}
	}
}
