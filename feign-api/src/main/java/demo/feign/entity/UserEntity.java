package demo.feign.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserEntity {
    private Integer id;
    private String  username;
    private String password;
    private Integer roleId;
    private String salt;
    private Date createTime;
    private Date lastTime;

}
