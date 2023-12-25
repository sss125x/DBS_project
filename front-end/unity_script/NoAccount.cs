using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
using UnityEngine;

public class NoAccount : MonoBehaviour
{
    public Button noaccount;
    public GameObject empty3;
    public GameObject empty4;

    void Start()
    {
        noaccount.onClick.AddListener(ButtonClick);
    }

    void ButtonClick()
    {
        empty3.SetActive(false);
        empty4.SetActive(true);
    }
}
