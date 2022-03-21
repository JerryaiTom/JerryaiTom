package demo.movie.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import demo.movie.dao.MovieDao;
import demo.movie.dao.ViewingrecordDao;
import demo.movie.entity.MovieEntity;
import demo.movie.entity.ViewingrecordEntity;
import demo.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao movieDao;
    @Autowired
    private ViewingrecordDao viewingrecordDao;

    @Override
    public Map<String, Object> viewMovie(int id) {
        Map<String,Object> map=new HashMap<>();
        QueryWrapper<ViewingrecordEntity> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id",id);
        List<ViewingrecordEntity> viewingrecordEntity=viewingrecordDao.selectList(queryWrapper);
        List<Integer> idList=new ArrayList<>();
        for(ViewingrecordEntity a:viewingrecordEntity){
            idList.add(a.getMovieId());
        }
        QueryWrapper<MovieEntity> movieEntityQueryWrapper=new QueryWrapper<>();
        movieEntityQueryWrapper.in("id",idList);
        List<MovieEntity> movieEntity=movieDao.selectList(movieEntityQueryWrapper);
        map.put("movieView",movieEntity);
        return map;
    }
}
