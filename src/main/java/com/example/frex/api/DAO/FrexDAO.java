package com.example.frex.api.DAO;

import com.example.frex.api.model.FrexModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


//CrudReopsitory - part of JPA, which provides CRUD operations
// if one wants to do crud operations, just create a interface and extend the crud repository
@Component
public interface FrexDAO extends JpaRepository<FrexModel, Integer> {
    // the interface consists of methods and functions that can be used to handle interaction between the db and spring
    //save()
    //findById()
    //deleteById()
}