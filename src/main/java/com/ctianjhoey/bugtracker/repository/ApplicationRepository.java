package com.ctianjhoey.bugtracker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ctianjhoey.bugtracker.entity.Application;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long>{

}
