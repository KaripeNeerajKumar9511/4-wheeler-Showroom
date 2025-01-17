package com.book.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.demo.entity.MyUser;

public interface MyUserRepo extends JpaRepository<MyUser, String>{

}