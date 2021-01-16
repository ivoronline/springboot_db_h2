package com.ivoronline.springboot_db_h2.repositories;

import com.ivoronline.springboot_db_h2.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
