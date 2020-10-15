package com.example.restfulapi.web.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Integer id;
    private String name;
    private Date createdAt;
    public static Integer nextVal = 3;

    public UserDTO packaging(String name){
        UserDTO user = new UserDTO();
        user.setId(++nextVal);
        log.info("name :"+name );
        user.setName(name);
        user.setCreatedAt(new Date());

        return user;
    }
}
