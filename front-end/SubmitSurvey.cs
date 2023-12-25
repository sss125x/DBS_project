using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using System.Net.Http;
using TMPro;

public class SubmitSurvey : MonoBehaviour
{
    public Button submit;

    //Input
    public TMP_InputField age;
    public string ageres;

    public TMP_InputField height;
    public string heightres;

    public TMP_InputField weight;
    public string weightres;

    //4 YES/NO
    public ToggleGroup family;
    public string familyres;

    public ToggleGroup FAVC;
    public string FAVCres;

    public ToggleGroup Smoke;
    public string Smokeres;

    public ToggleGroup SCC;
    public string SCCres;

    //Dropdown
    public TMP_Dropdown FCVC;
    public int FCVCres;

    public TMP_Dropdown NCP;
    public int NCPres;

    public TMP_Dropdown CAEC;
    public string CAECres;

    public TMP_Dropdown CH2O;
    public int CH2Ores;

    public TMP_Dropdown FAF;
    public int FAFres;

    public TMP_Dropdown TUE;
    public int TUEres;

    public TMP_Dropdown CALC;
    public string CALCres;

    public TMP_Dropdown MTRANS;
    public string MTRANSres;

    public string result3;

    void Start()
    {
        //Input
        submit.onClick.AddListener(getInput);

        //4 YES/NO
        submit.onClick.AddListener(CheckFamily);
        submit.onClick.AddListener(CheckFAVC);
        submit.onClick.AddListener(CheckSmoke);
        submit.onClick.AddListener(CheckSCC);

        //Dropdown
        submit.onClick.AddListener(checkFCVC);     //
        submit.onClick.AddListener(checkNCP);      //
        submit.onClick.AddListener(checkCAEC);
        submit.onClick.AddListener(checkCH2O);     //
        submit.onClick.AddListener(checkFAF);      //

        submit.onClick.AddListener(checkTUE);      //
        submit.onClick.AddListener(checkCALC);
        submit.onClick.AddListener(checkMTRANS);

        //Postdata
        submit.onClick.AddListener(PostData3);
    }

    async void PostData3()
    {
        string url = "http://100.8.92.61:8754/insurance/survey";   
        var postData = new Dictionary<string, string>();

        //string account1 = account.text;
        //string password1 = password.text;
        //string name1 = name.text;

        postData.Add("Age", ageres);
        postData.Add("Height", heightres);
        postData.Add("Weight", weightres);

        postData.Add("family_history_with_overweight", familyres);
        postData.Add("FAVC", FAVCres);
        postData.Add("SMOKE", Smokeres);
        postData.Add("SCC", SCCres);

        postData.Add("FCVC", FCVCres.ToString());     //
        postData.Add("NCP", NCPres.ToString());       //
        postData.Add("CAEC", CAECres);
        postData.Add("CH2O", CH2Ores.ToString());     //
        postData.Add("FAF", FAFres.ToString());       //

        postData.Add("TUE", TUEres.ToString());       //
        postData.Add("CALC", CALCres);
        postData.Add("MTRANS", MTRANSres);

        print("idk");

        using (var httpClient = new HttpClient())
        {
            var response = await httpClient.PostAsync(url, new FormUrlEncodedContent(postData));
            print(await response.Content.ReadAsStringAsync());
            result3 = await response.Content.ReadAsStringAsync();
        }
    }

    //Input
    void getInput()
    {
        ageres = age.text;
        heightres = height.text;
        weightres = weight.text;
        Debug.Log("ALL RIGHT!");
    }

    //4 YES/NO
    void CheckFamily()
    {
        foreach (Toggle toggle in family.ActiveToggles())
        {
            if (toggle.isOn)
            {
                if (toggle.CompareTag("Yes"))
                {
                    familyres = "yes";
                    Debug.Log("Yes1");
                }
                else if (toggle.CompareTag("No")) 
                {
                    familyres = "no";
                    Debug.Log("No1");
                }
            }
        }
    }

    void CheckFAVC()
    {
        foreach (Toggle toggle in FAVC.ActiveToggles())
        {
            if (toggle.isOn)
            {
                if (toggle.CompareTag("Yes"))
                {
                    FAVCres = "yes";
                    Debug.Log("Yes2");
                }
                else if (toggle.CompareTag("No"))
                {
                    FAVCres = "no";
                    Debug.Log("No2");
                }
            }
        }
    }

    void CheckSmoke()
    {
        foreach (Toggle toggle in Smoke.ActiveToggles())
        {
            if (toggle.isOn)
            {
                if (toggle.CompareTag("Yes"))
                {
                    Smokeres = "yes";
                    Debug.Log("Yes3");
                }
                else if (toggle.CompareTag("No"))
                {
                    Smokeres = "no";
                    Debug.Log("No3");
                }
            }
        }
    }

    void CheckSCC()
    {
        foreach (Toggle toggle in SCC.ActiveToggles())
        {
            if (toggle.isOn)
            {
                if (toggle.CompareTag("Yes"))
                {
                    SCCres = "yes";
                    Debug.Log("Yes4");
                }
                else if (toggle.CompareTag("No"))
                {
                    SCCres = "no";
                    Debug.Log("No4");
                }
            }
        }
    }

    //Dropdown
    void checkFCVC()
    {
        int selectedIndex = FCVC.value; 

        switch (selectedIndex)
        {
            case 1:
                FCVCres = 1;
                Debug.Log("11");
                break;
            case 2:
                FCVCres = 2;
                Debug.Log("12");
                break;
            case 3:
                FCVCres = 3;
                Debug.Log("13");
                break;
            default:
                Debug.Log("other");
                break;
        }
    }

    void checkNCP()
    {
        int selectedIndex = NCP.value;

        switch (selectedIndex)
        {
            case 1:
                NCPres = 1;
                Debug.Log("21");
                break;
            case 2:
                NCPres = 2;
                Debug.Log("22");
                break;
            case 3:
                NCPres = 3;
                Debug.Log("23");
                break;
            case 4:
                NCPres = 4;
                Debug.Log("24");
                break;
            default:
                Debug.Log("other");
                break;
        }
    }

    void checkCAEC()
    {
        int selectedIndex = CAEC.value;

        switch (selectedIndex)
        {
            case 1:
                CAECres = "no";
                Debug.Log("31");
                break;
            case 2:
                CAECres = "Sometimes";
                Debug.Log("32");
                break;
            case 3:
                CAECres = "Frequently";
                Debug.Log("33");
                break;
            case 4:
                CAECres = "Always";
                Debug.Log("34");
                break;
            default:
                Debug.Log("other");
                break;
        }
    }

    void checkCH2O()
    {
        int selectedIndex = CH2O.value;

        switch (selectedIndex)
        {
            case 1:
                CH2Ores = 1;
                Debug.Log("41");
                break;
            case 2:
                CH2Ores = 2;
                Debug.Log("42");
                break;
            case 3:
                CH2Ores = 3;
                Debug.Log("43");
                break;
            default:
                Debug.Log("other");
                break;
        }
    }

    void checkFAF()
    {
        int selectedIndex = FAF.value;

        switch (selectedIndex)
        {
            case 1:
                FAFres = 0;
                Debug.Log("51");
                break;
            case 2:
                FAFres = 1;
                Debug.Log("52");
                break;
            case 3:
                FAFres = 2;
                Debug.Log("53");
                break;
            case 4:
                FAFres = 3;
                Debug.Log("54");
                break;
            default:
                Debug.Log("other");
                break;
        }
    }

    void checkTUE()
    {
        int selectedIndex = TUE.value;

        switch (selectedIndex)
        {
            case 1:
                TUEres = 0;
                Debug.Log("61");
                break;
            case 2:
                TUEres = 1;
                Debug.Log("62");
                break;
            case 3:
                TUEres = 2;
                Debug.Log("63");
                break;
            default:
                Debug.Log("other");
                break;
        }
    }

    void checkCALC()
    {
        int selectedIndex = CALC.value;

        switch (selectedIndex)
        {
            case 1:
                CALCres = "no";
                Debug.Log("71");
                break;
            case 2:
                CALCres = "Sometimes";
                Debug.Log("72");
                break;
            case 3:
                CALCres = "Frequently";
                Debug.Log("73");
                break;
            case 4:
                CALCres = "Always";
                Debug.Log("74");
                break;
            default:
                Debug.Log("other");
                break;
        }
    }

    void checkMTRANS()
    {
        int selectedIndex = MTRANS.value;

        switch (selectedIndex)
        {
            case 1:
                MTRANSres = "Automobile";
                Debug.Log("81");
                break;
            case 2:
                MTRANSres = "Motorbike";
                Debug.Log("82");
                break;
            case 3:
                MTRANSres = "Bike";
                Debug.Log("83");
                break;
            case 4:
                MTRANSres = "Public_Transportation";
                Debug.Log("84");
                break;
            case 5:
                MTRANSres = "Walking";
                Debug.Log("85");
                break;
            default:
                Debug.Log("other");
                break;
        }
    }
}
