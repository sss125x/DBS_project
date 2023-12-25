package com.example.dbs;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class generator {
    public static void main(String arg[]) {

        String url = "jdbc:sqlserver://testserver2425.database.windows.net:1433;database=project_part4;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        String username = "myroot";
        String password = "Wp123321";

        String moduleName = "insurance";
        String mapperLocation = "D:\\IDEA_project\\DBS\\src\\main\\resources\\mapper\\" + moduleName;
//        String tables = "Address,Associate,Companies,COMPANY_MEMBER_ACCOUNT,Contract,CONTRACT_BENEFITS_CUSTOMER,CONTRACT_P_PRODUCT,Customer,CUSTOMER_CLAIMS_CONTRACT,CUSTOMER_MEMBER_ACCOUNT,LICENSE,Product,Survey";
        String tables = "Survey";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("PuW") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\IDEA_project\\DBS\\src\\main\\java\\"); // 指定输出目录
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))
                .packageConfig(builder -> {
                    builder.parent("com.example.dbs") // 设置父包名
                            .moduleName(moduleName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperLocation)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables) // 设置需要生成的表名
                            .addTablePrefix(); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
