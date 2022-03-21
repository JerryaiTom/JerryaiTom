package demo.movie;

import demo.feign.clients.UserClient;
import demo.feign.utils.FeignClientConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients(clients = UserClient.class,defaultConfiguration = FeignClientConfiguration.class)
@MapperScan("demo.movie.dao")
public class MovieApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class,args);
    }
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
