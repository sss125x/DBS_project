using System.Collections;
using UnityEngine;
using UnityEngine.UI;
using TMPro;

public class RealSubmit : MonoBehaviour
{
    public Button realsubmit;
    public GameObject survey;
    public GameObject recommend;
    public SubmitSurvey Surveyscript;

    public TMP_Text wait;

    void Start()
    {
        realsubmit.onClick.AddListener(ButtonClick);
    }

    void ButtonClick()
    {
        if (Surveyscript.result3 != "")
        {
            wait.text = "";
            survey.SetActive(false);
            recommend.SetActive(true);
        }
        else if (Surveyscript.result3 == "")
        {
            wait.text = "Please wait for the ML model to run...";
            StartCoroutine(BlinkText()); // 调用闪烁效果协程
        }
    }

    IEnumerator BlinkText()
    {
        WaitForSeconds waitTime = new WaitForSeconds(0.5f);

        // 闪烁10次
        for (int i = 0; i < 10; i++)
        {
            wait.color = Color.red; // 设置文本颜色为红色
            yield return waitTime;

            wait.color = Color.clear; // 设置文本颜色为透明
            yield return waitTime;
        }
    }
}


//using System.Collections;
//using System.Collections.Generic;
//using UnityEngine;
//using UnityEngine.UI;
//using TMPro;

//public class RealSubmit : MonoBehaviour
//{
//    public Button realsubmit;
//    public GameObject survey;
//    public GameObject recommend;
//    public SubmitSurvey Surveyscript;

//    public TMP_Text wait;

//    void Start()
//    {
//        realsubmit.onClick.AddListener(ButtonClick);
//    }

//    void ButtonClick()
//    {
//        if (Surveyscript.result3 != "")
//        {
//            survey.SetActive(false);
//            recommend.SetActive(true);
//        }
//        else if (Surveyscript.result3 == "")
//        {
//            wait.text = "Please wait for the ML model to run...";
//        }
//    }
//}
