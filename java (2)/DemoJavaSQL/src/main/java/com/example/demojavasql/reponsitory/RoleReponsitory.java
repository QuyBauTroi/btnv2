package com.example.demojavasql.reponsitory;

import com.example.demojavasql.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleReponsitory extends JpaRepository<Role,Integer> {
    @Query(value = "select * from  Role where name = ?", nativeQuery = true)
    Role findByRoleName(String name);
}
