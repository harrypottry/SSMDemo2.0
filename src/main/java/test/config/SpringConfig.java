package test.config;

import com.hp.ibatis.session.MySqlSessionFactory;
import com.hp.ibatis.session.MySqlSessionFactoryBuilder;
import com.hp.spring.aop.annotation.MyEnableAspectJAutoProxy;
import com.hp.spring.beans.annotation.*;

/**
 * @作者：刘时明
 * @时间:2018/12/29-20:35
 * @说明：
 */
@MyComponentScan("test")
@MyConfiguration
@MyPropertySource("my.properties")
@MyEnableAspectJAutoProxy
public class SpringConfig
{
    @MyValue("${viession}")
    private String viession;

    @MyBean
    public MySqlSessionFactory initMySqlSessionFactory()
    {
        System.out.println(viession);
        return new MySqlSessionFactoryBuilder().build("jdbc.properties", true);
    }
}
