using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using System.Net.Http;
using TMPro;

public class test2 : MonoBehaviour
{
    public Button testbtn2;
    public TMP_InputField account;
    public TMP_InputField password;
    public TMP_InputField name;
    public string result2;

    void Start()
    {
        //GameObject.Find("Äã°´Å¥µÄid").GetComponent<Botton>().onClick.AddListener(PostData);
        testbtn2.onClick.AddListener(PostData2);
    }

    async void PostData2()
    {
        string url = "http://100.8.92.61:8754/insurance/account/signup";
        var postData = new Dictionary<string, string>();

        string account1 = account.text;
        string password1 = password.text;
        string name1 = name.text;

        postData.Add("id", account1);
        postData.Add("pwd", password1);
        postData.Add("AccountName", name1);

        print("idk");

        using (var httpClient = new HttpClient())
        {
            var response = await httpClient.PostAsync(url, new FormUrlEncodedContent(postData));
            print(await response.Content.ReadAsStringAsync());
            result2 = await response.Content.ReadAsStringAsync();
        }
    }
}
