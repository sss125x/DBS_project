package com.example.dbs;

import com.example.dbs.insurance.service.IAccountService;
import com.google.common.collect.ImmutableMap;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

@SpringBootTest
class DbsApplicationTests {

//    private static final Logger log;
//
//    static {
//        System.setProperty("java.util.logging.SimpleFormatter.format", "[%4$-7s] %5$s %n");
//        log = Logger.getLogger(DbsApplicationTests.class.getName());
//    }

    @Resource
    private IAccountService iAccountService;

    @Test
    void contextLoads() {

        Map<String, String> a = ImmutableMap.of("age", "24", "height", "1.91");

        Process proc;
        // 编译器是python
        String exe = "G:\\Anaconda\\Anaconda3_9\\envs\\DGF2\\python.exe";
        // py文件存的绝对路径
        String path = "D:\\pythonProject\\Flu_project\\ML.py";
        // 传入的参数
        String args = "\"" + a.toString() + "\"";

        try {
            proc = Runtime.getRuntime().exec("D:\\act.cmd &&" + exe + ' ' + path + ' ' + args);// 执⾏py⽂件
            // ⽤输⼊输出流来截取结果
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        log.info("Loading application properties");
//        Properties properties = new Properties();
//        properties.load(DbsApplicationTests.class.getClassLoader().getResourceAsStream("application.properties"));
//
//        log.info("Connecting to the database");
//        Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties);
//        log.info("Database connection test: " + connection.getCatalog());
//        log.info("Closing database connection");
//        connection.close();
    }

}
