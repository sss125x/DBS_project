using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
using UnityEngine;
using TMPro;


public class Calculate : MonoBehaviour
{
    public TMP_InputField heightInputField;
    public TMP_InputField weightInputField;
    public TMP_InputField bmiInputField;
    public TMP_Text resultText;
    public Button calculate;

    void Start()
    {
        calculate.onClick.AddListener(ButtonClick);
    }

    void ButtonClick()
    {
        float height = float.Parse(heightInputField.text);
        float weight = float.Parse(weightInputField.text);

        float bmi = weight / (height * height);

        bmiInputField.text = bmi.ToString("F2");

        if (bmi >= 18.5 && bmi < 24.9f)
        {
            resultText.text = "Based on your BMI, which is " + bmi.ToString("F2") + ", you are within the normal weight range, typically considered healthy. We recommend purchasing <color=blue>Plan C</color>.";
        }
        else if (bmi >= 25 && bmi < 29.9)
        {
            resultText.text = "Based on your BMI, which is " + bmi.ToString("F2") + ", you are overweight, which may increase the risk of illness. We recommend purchasing <color=orange>Plan B</color> or <color=red>Plan A</color>.";
        }
        else if (bmi >= 30)
        {
            resultText.text = "Based on your BMI, which is " + bmi.ToString("F2") + ", you are classified as obese. We do not provide insurance.";
        }
        else
        {
            resultText.text = "Based on your BMI, which is " + bmi.ToString("F2") + ", you are underweight, which may pose health risks. We don't recommend any plans, but <color=blue>Plan C</color> is optional.";
        }
    }
}
