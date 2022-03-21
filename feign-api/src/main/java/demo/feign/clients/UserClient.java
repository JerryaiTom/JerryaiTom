package demo.feign.clients;



import demo.feign.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userService")
public interface UserClient {

    @GetMapping("/user/info/{username}")
    UserEntity findByName(@PathVariable("username") String username);
}
