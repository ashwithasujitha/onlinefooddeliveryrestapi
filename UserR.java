package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.User;

public interface UserR extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.name = :name")
List<User> findByName(@Param("name") String name);

}
