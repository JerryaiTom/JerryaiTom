package demo.user.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
