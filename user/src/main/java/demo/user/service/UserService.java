package demo.user.service;


import demo.user.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface UserService {

    //根据名字查询出用户信息
    UserEntity selectByName( String username);

}
