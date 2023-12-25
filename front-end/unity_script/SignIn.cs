using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
using UnityEngine;

public class SignIn : MonoBehaviour
{
    public Button sighin;
    public GameObject empty1;
    public GameObject empty2;
    public GameObject empty3;

    void Start()
    {
        sighin.onClick.AddListener(ButtonClick);
    }

    void ButtonClick()
    {
        empty1.SetActive(false);
        empty2.SetActive(false);
        empty3.SetActive(true);
    }
}
