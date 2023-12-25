using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
using UnityEngine;

public class StartNow : MonoBehaviour
{
    public Button start;
    public GameObject empty1;
    public GameObject empty2;

    void Start()
    {
        start.onClick.AddListener(ButtonClick);
    }

    void ButtonClick()
    {
        empty1.SetActive(false);
        empty2.SetActive(true);
    }
}
