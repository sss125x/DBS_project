using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using TMPro;

public class RealSignin : MonoBehaviour
{
    public Button realsighin;
    public GameObject empty1;
    public GameObject empty2;
    public GameObject empty3;
    public GameObject empty4;
    public GameObject survey;

    public test testscript;
    public TMP_Text alert;

    void Start()
    {
        realsighin.onClick.AddListener(ButtonClick);
    }

    void ButtonClick()
    {
        if(testscript.result1 == "true")
        {
            alert.text = "";
            empty1.SetActive(false);
            empty2.SetActive(false);
            empty3.SetActive(false);
            empty4.SetActive(false);
            survey.SetActive(true);
        }
        else if (testscript.result1 == "false")
        {
            alert.text = "Wrong id or password !";
        }
    }
}
