package top.flobby.boot.mbp.tools;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/2
 * @description :
 */

public class CodeGenerator {
    @Test
    public void startGenerator() {
        //1、全局配置
        GlobalConfig config = new GlobalConfig();
        String projectPath =
                System.getProperty("user.dir");
        config.setActiveRecord(true)//开启AR模式
                .setAuthor("flobby")//设置作者
                .setOutputDir(projectPath +
                        "/src/main/java")//⽣成路径(⼀般在此项⽬的src/main/java下)
                .setFileOverride(true)//第⼆次⽣成会把第⼀次⽣成的覆盖掉
                .setOpen(true)//⽣成完毕后是否⾃动打开输出⽬录
                //.setSwagger2(true)//实体属性 Swagger2 注解
                //.setIdType(IdType.AUTO)//主键策略
                .setServiceName("%sService")//⽣成的service接⼝名字⾸字⺟是否为I，这样设置就没有I
                .setBaseResultMap(true)//⽣成resultMap
                .setBaseColumnList(true);//在xml中⽣成基础列
        //2、数据源配置
        DataSourceConfig dataSourceConfig = new
                DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)//数据库类型
                .setDriverName("com.mysql.cj.jdbc.Driver")

                .setUrl("jdbc:mysql://localhost:3306/db_spring")
                .setUsername("root")
                .setPassword("kobe24");
        //3、策略配置
        StrategyConfig strategyConfig = new
                StrategyConfig();
        strategyConfig.setCapitalMode(true)//开启全局⼤写命名

                .setNaming(NamingStrategy.underline_to_camel)//表名映射到实体的命名策略(下划线到驼峰)
                //表字段映射属性名策略为驼峰式(未指定按naming)

                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix("t_")//表名前缀
                //.setSuperEntityClass("你⾃⼰的⽗类实体,没有就不⽤设置!")
                //.setSuperEntityColumns("id");//写于⽗类中的公共字段
                //.setSuperControllerClass("⾃定义继承的Controller类全称，带包名,没有就不⽤设置!")
                .setRestControllerStyle(true)//⽣成@RestController 控制器
                .setEntityLombokModel(true)//使⽤lombok
                .setInclude("t_teacher",
                        "t_clazz", "t_student");//逆向⼯程使⽤的表，采⽤数据库部分表测试
        //4、包名策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("top.flobby.boot.mbp") //设置包名的parent
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("domain")
                .setXml("mapper");//设置xml⽂件的⽬录
        //5、整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);
        //6、执⾏
        autoGenerator.execute();
    }
}
