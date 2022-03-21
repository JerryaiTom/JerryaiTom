package demo.movie.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.movie.entity.MovieEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MovieDao extends BaseMapper<MovieEntity> {
}
