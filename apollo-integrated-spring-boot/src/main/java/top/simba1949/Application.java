package top.simba1949;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @EnableApolloConfig ： 开启 apollo
 * @author Anthony
 * @date 2020/7/25 15:10
 */
@EnableApolloConfig
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
