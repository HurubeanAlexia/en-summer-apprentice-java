package com.endavaspring.endavapractica;
import java.sql.*;

import com.endavaspring.endavapractica.domain.Venue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;

@SpringBootApplication
public class EndavaPracticaApplication {

    public static void main(String[] args) {

        SpringApplication.run(EndavaPracticaApplication.class, args);
    }



}
