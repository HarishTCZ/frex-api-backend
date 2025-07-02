package DAO;

import model.FrexModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


//CrudReopsitory - part of JPA, which provides CRUD operations
// if one wants to do crud operations, just create a interface and extend the crud repository
@Component
public interface FrexDAO extends CrudRepository<FrexModel, Integer> {
    // the interface consists of methods and functions that can be used to handle interaction between the db and spring
    //save()
    //findById()
    //deleteById()
}