package com.example.restfulapi.web.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class UsersService {
    public static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1, "james", new Date()));
        users.add(new User(2, "Sohn", new Date()));
        users.add(new User(3, "영준", new Date()));
    }
    public List<User> findAll(){
        return users;
    }//findAll

    public User findOne(Integer id){
        //아이디가 없을 경우, 결과값을 null로
        try{
            users.get(id-1);//인덱스이므로 0,1,2....
        }catch (NullPointerException nullPointerException){
            return null;

        }catch (TypeNotPresentException typeNotPresentException){
            return null;
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            return users.get(id-1);
        }
    }//findOne

    public User save(User user){
        UserDTO userDTO = new UserDTO().packaging(name);


        return ;
    }
}
