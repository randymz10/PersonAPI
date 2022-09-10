package com.person.Person.controller;

import com.person.Person.model.Person;
import com.person.Person.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class PersonController {
    
    @Autowired
    PersonRepository personRepository;
    
    @GetMapping("")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }
    
    @GetMapping("{id}")
    public Optional<Person> getPersonById(@PathVariable int id){
        return personRepository.findById(id);
    }
    
    @PostMapping("")
    public Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }
    
    @PutMapping("{id}")
    public Person updatePerson(@PathVariable int id, @RequestBody Person person){
        Person personFromDb = personRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);
        
        personFromDb.setFirstName(person.getFirstName());
        personFromDb.setLastName(person.getLastName());
        personFromDb.setAge(person.getAge());
        
        return personRepository.save(personFromDb);
    }
    
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Person person = personRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);
        
        personRepository.delete(person);
    }
    
}
