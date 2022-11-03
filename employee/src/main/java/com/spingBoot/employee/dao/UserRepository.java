package com.spingBoot.employee.dao;

import com.spingBoot.employee.entities.User;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Integer> {

}
