package edu.co.icesi.demo.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.co.icesi.demo.models.RoleModel;

@Repository
public interface RoleRepository  extends CrudRepository<RoleModel, Long> {

   
}
    

