package demo.user.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import demo.user.dao.UserDao;
import demo.user.entity.UserEntity;
import demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity selectByName(String username) {
        QueryWrapper<UserEntity> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("username",username);
        UserEntity userEntity=userDao.selectOne(queryWrapper);
        return userEntity;
    }
}
