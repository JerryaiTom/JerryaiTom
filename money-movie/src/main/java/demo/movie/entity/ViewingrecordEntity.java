package demo.movie.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("viewingrecord")
public class ViewingrecordEntity {

    private Integer Id;
    private Integer movieId;
    private Integer userId;

}
