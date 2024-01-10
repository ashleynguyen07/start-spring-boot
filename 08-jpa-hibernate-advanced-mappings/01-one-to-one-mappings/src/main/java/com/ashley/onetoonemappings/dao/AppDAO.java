package com.ashley.onetoonemappings.dao;

import com.ashley.onetoonemappings.entity.Instructor;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findById(Integer id);
    void deleteById(Integer id);
}
