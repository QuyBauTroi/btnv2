package com.example.demojavasql.service;

import com.example.demojavasql.entities.User;
import com.example.demojavasql.reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserReponsitory userReponsitory;
    public void findUserById(int id){
        User user = userReponsitory.findByUserID(id);
        if (user!=null)
            System.out.println(user);
        else System.out.println("Khong tìm thấy" +id);
    }
    public void findUserByName(String name){
        List<User> users = userReponsitory.findUsersByName(name);

        if (!users.isEmpty()) {
            for (User user : users) {
                System.out.println(user);
            }
        } else {
            System.out.println("Không tìm thấy User nào có tên " + name);
        }
    }
}
