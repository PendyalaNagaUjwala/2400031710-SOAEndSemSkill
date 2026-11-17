package com.klu.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.springmvc.entity.*;

public interface DataRepository extends JpaRepository<Data, Integer> {

}