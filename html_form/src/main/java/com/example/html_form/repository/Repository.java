package com.example.html_form.repository;

import com.example.html_form.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Long> {

}