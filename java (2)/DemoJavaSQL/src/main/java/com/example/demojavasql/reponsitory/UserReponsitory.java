package com.example.demojavasql.reponsitory;

import com.example.demojavasql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserReponsitory extends JpaRepository<User , Integer> {
    @Query(value = "select * from User where  id = ?", nativeQuery = true)
    User findByUserID(int id);

    @Query(value = "select  * from  User where name = ?", nativeQuery = true)
    List<User> findUsersByName(String name);
}
