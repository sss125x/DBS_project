using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using System.Net.Http;
using TMPro;


public class test : MonoBehaviour
{
    public Button testbtn;
    public string result1;

    public TMP_InputField accountInputField;
    public TMP_InputField passwordInputField;

    void Start()
    {
        testbtn.onClick.AddListener(PostData);
        //GameObject.Find("Äã°´Å¥µÄid").GetComponent<Button>().onClick.AddListener(PostData);
    }

    async void PostData()
    {
        string url = "http://100.8.92.61:8754/insurance/account";
        var postData = new Dictionary<string, string>();

        string account = accountInputField.text;
        string password = passwordInputField.text;

        postData.Add("id", account);
        postData.Add("pwd", password);
        using (var httpClient = new HttpClient())
        {
            var response = await httpClient.PostAsync(url, new FormUrlEncodedContent(postData));
            //print(await response.Content.ReadAsStringAsync());
            result1 = await response.Content.ReadAsStringAsync();
        }
    }
}




