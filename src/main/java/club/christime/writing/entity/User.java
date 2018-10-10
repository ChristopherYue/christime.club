package club.christime.writing.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class User {
    private long userId;
    private String userName;
    private String userPwd;
    private String userSalt;
    private String userAvatar;
    private int sex;
    private String city;
    private int userStatus;
    private Date create_time;
}
