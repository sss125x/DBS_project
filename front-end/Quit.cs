using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
using UnityEngine;

public class Quit : MonoBehaviour
{
    public Button quit;

    void Start()
    {
        quit.onClick.AddListener(ButtonClick);
    }

    void ButtonClick()
    {
        Debug.Log("quit");
        Application.Quit();
    }
}
