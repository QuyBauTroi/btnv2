package com.example.demojavasql;

import com.example.demojavasql.entities.User;
import com.example.demojavasql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoJavaSqlApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoJavaSqlApplication.class, args);
    }

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Moi ban nhap id user muon tim");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        userService.findUserById(id);
        System.out.println("Mời bạn nhập tên user muốn tìm:");
        String name  = new Scanner(System.in).nextLine();
        userService.findUserByName(name);
    }
}
