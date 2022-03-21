package demo.movie.controller;



import demo.feign.clients.UserClient;
import demo.feign.entity.UserEntity;

import demo.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Resource
    RestTemplate template;

    @Autowired(required = false)
    private UserClient userClient;

    @GetMapping(value = "view/{username}")
    public Map<String,Object> view(@PathVariable("username") String username, @RequestHeader(value = "Truth")String truth){

//         UserEntity userEntity= template.getForObject("http://localhost:8083/user/info/"+username, UserEntity.class);
        System.out.println("-----------------------------------------------");
        System.out.println(truth);
         UserEntity userEntity=userClient.findByName(username);
         Map<String,Object> map=new HashMap<>();
         map.put("UserInfo",userEntity);
         map.put("viewMovie",movieService.viewMovie(userEntity.getId()));
         return map;
    }
}
