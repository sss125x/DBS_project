using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
using UnityEngine;
using TMPro;

public class Sighup : MonoBehaviour
{
    public Button signup;
    public GameObject empty3;
    public GameObject empty4;

    public test2 testscript2;
    public TMP_Text alert2;

    void Start()
    {
        signup.onClick.AddListener(ButtonClick);
    }

    void ButtonClick()
    {
        if (testscript2.result2 == "created successfully")
        {
            alert2.text = "";
            empty3.SetActive(true);
            empty4.SetActive(false);
        }
        else
        {
            alert2.text = "Duplicate userID !";
        }
    }
}
