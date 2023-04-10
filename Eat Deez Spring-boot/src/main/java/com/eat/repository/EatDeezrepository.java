package com.eat.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eat.model.EatDeeztable;

public interface EatDeezrepository extends JpaRepository<EatDeeztable,Integer> {

}
