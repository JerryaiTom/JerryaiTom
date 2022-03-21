package demo.movie.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.movie.entity.ViewingrecordEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ViewingrecordDao extends BaseMapper<ViewingrecordEntity> {

}
