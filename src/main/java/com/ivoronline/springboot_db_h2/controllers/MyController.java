package com.ivoronline.springboot_db_h2.controllers;

import com.ivoronline.springboot_db_h2.entities.PersonEntity;
import com.ivoronline.springboot_db_h2.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired
  PersonRepository personRepository;

  @ResponseBody
  @RequestMapping("/addPerson")
  public String addPerson() {

    //CREATE PERSON
    PersonEntity personEntity = new PersonEntity();
                 personEntity.setName("John");
                 personEntity.setAge(20);

    //STORE PERSON
    personRepository.save(personEntity);

    //RETURN SOMETHING
    return "Hello " + personEntity.getName();
  }

}
