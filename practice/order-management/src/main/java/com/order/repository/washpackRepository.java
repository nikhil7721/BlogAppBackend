package com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.entity.washpacks;

@Repository
public interface washpackRepository extends JpaRepository<washpacks,Integer> {

}
