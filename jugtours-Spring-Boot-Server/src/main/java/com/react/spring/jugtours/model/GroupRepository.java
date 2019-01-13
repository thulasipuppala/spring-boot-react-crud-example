package com.react.spring.jugtours.model;

import com.react.spring.jugtours.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
      Group findByName(String name);
}