package com.example.dbs.insurance.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dbs.insurance.entity.Survey;
import com.example.dbs.insurance.service.ISurveyService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author PuW
 * @since 2023-12-23
 */
@Controller
@RequestMapping("/insurance/survey")
public class SurveyController {

    @Resource
    ISurveyService iSurveyService;

    @GetMapping("{id}")
    @ResponseBody
    public Survey test(@PathVariable("id") int id) {
        QueryWrapper<Survey> wrapper = new QueryWrapper<Survey>().eq("SurveyID", id);
//        System.out.println(iSurveyService.getOne(wrapper).toString());
        return iSurveyService.getOne(wrapper);
    }

    @PostMapping
    @ResponseBody
    public String getSurvey(@RequestParam Map<String, String> sur) {
        System.out.println(sur);

        Process proc;
        // 编译器是python
        String exe = "G:\\Anaconda\\Anaconda3_9\\envs\\DGF2\\python.exe";
        // py文件存的绝对路径
        String path = "D:\\pythonProject\\Flu_project\\ML.py";
        // 传入的参数
        String args = "\"" + sur.toString() + "\"";

        System.out.println("kaishi");
        int t = -1;
        try {
            proc = Runtime.getRuntime().exec("D:\\act.cmd &&" + exe + ' ' + path + ' ' + args);// 执⾏py⽂件
            // ⽤输⼊输出流来截取结果
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                if (line.equals("['Insufficient_Weight']") || line.equals("['Normal_Weight']"))
                    t = 0;
                else if (line.equals("['Overweight_Level_I']") || line.equals("['Overweight_Level_II']"))
                    t = 1;
                else
                    t = 2;
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Survey news = new Survey();
        news.setAge(Integer.parseInt(sur.get("Age")));
        try {
            Thread.sleep(5000); // 暂停 1000 毫秒，即 1 秒钟
        } catch (InterruptedException e) {
            // 处理中断异常
        }
        switch (t) {
            case 0:
                return "LOW";
            case 1:
                return "MODERATE";
            case 2:
                return "HIGH";
        }
        return "unknown wrong";
    }
}
