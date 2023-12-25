using System.Collections;
using UnityEngine;
using UnityEngine.UI;
using TMPro;

public class ResultShow : MonoBehaviour
{
    public TMP_Text risk;
    public TMP_Text plan;
    public SubmitSurvey Surveyscript;

    void Update()
    {
        string result = Surveyscript.result3;

        if (result == "HIGH")
        {
            risk.text = "High Risk";
            plan.text = "Plan A";
            risk.color = new Color(1f, 0.5f, 0.5f); // Ç³ºìÉ«
            plan.color = new Color(1f, 0.5f, 0.5f);
        }
        else if (result == "MODERATE")
        {
            risk.text = "Moderate Risk";
            plan.text = "Plan B";
            risk.color = new Color(1f, 0.75f, 0.4f); // Ç³³ÈÉ«
            plan.color = new Color(1f, 0.75f, 0.4f);
        }
        else if (result == "LOW")
        {
            risk.text = "Low Risk";
            plan.text = "Plan C";
            risk.color = new Color(0.5f, 0.5f, 1f); // Ç³À¶É«
            plan.color = new Color(0.5f, 0.5f, 1f);
        }
    }
}

