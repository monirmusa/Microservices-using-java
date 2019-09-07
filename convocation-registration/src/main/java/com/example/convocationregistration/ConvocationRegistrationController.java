package com.example.convocationregistration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/graduateStudents")

public class ConvocationRegistrationController {
   @Autowired
    private ConvocationRegistrationRepository convocationRegistrationRepository;
    public ConvocationRegistrationController() {
    }
    @GetMapping("/{id}")
    public ConvocationRegistration getGraduateByID(@PathVariable long id){
        return convocationRegistrationRepository.findById(id).get();
    }

    @GetMapping("/findByName/{name}")
    public List<ConvocationRegistration> getGraduateByName(@PathVariable String name){
        return convocationRegistrationRepository.findAllByName(name);
    }

    @GetMapping("")
    public List<ConvocationRegistration> getAllGraduates(){
        List<ConvocationRegistration>studentList=new ArrayList<>();
        convocationRegistrationRepository.findAll().forEach(studentList::add);
        return studentList;
    }

    @PostMapping("")
    public ConvocationRegistration insertGraduate(ConvocationRegistration convocationRegistration){
               return convocationRegistrationRepository.save(convocationRegistration);
    }

    @DeleteMapping("/{id}")
    public void deleteGraduate(@PathVariable long id){
       convocationRegistrationRepository.deleteById(id);
    }

    @PutMapping("updatePerson/{id}")
    @ResponseBody
    public ConvocationRegistration updateGraduate(@PathVariable long id,@RequestBody ConvocationRegistration convocationRegistration){
        return convocationRegistrationRepository.save(convocationRegistration);
    }



}
