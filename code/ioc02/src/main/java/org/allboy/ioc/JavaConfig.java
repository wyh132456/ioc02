package org.allboy.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 为了体现条件注解得作用,将Bean同名,调用时依据系统得环境进行条件得判断
 */
@Configuration
public class JavaConfig {

    @Bean("cmd")
    @Conditional(WindowsCondition.class)
    ShowCmd winCmd(){
        return new WindowsShowCmd();
    }

    @Bean("cmd")
    @Conditional(LinuxCondition.class)
    ShowCmd linuxCmd(){
        return new LinuxShowCmd();
    }


    /**
     * 测试环境
     * @return
     */
    @Bean
    @Profile("dev")
    DataSource devDs(){
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql:///vhr");
        ds.setUserName("root");
        ds.setPassWord("123");
        return ds;
    }


    /**
     * 开发环境
     * @return
     */
    @Bean
    @Profile("prod")
    DataSource porDs(){
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql://192.168.23.56:3306/vhr");
        ds.setUserName("root");
        ds.setPassWord("123456");
        return ds;
    }

}
