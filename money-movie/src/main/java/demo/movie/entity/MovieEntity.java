package demo.movie.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("movie")
public class MovieEntity {
    private int id;
    private String  movieName;
    private String  movieDescribe;
    private String country;
    private Date createTime;
    private Date lastTime;

}
