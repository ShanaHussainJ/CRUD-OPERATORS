package com.example.CRUD;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
public class CrudController {
    @Autowired
    CrudService service;

    

    @GetMapping("/requestparam")
    public String getmap(@RequestParam String name){
        System.out.println(name);
        return name;
    }

    @GetMapping("/pathvariable/{id}")
    public Integer map(@PathVariable("id") Integer id){
        System.out.println(id);
        return id;
    }


    @GetMapping("/getmapping")
    public String getString(){
        return service.getResult();

    }

    @PostMapping("/postMapping")
    public Object PostValues(@RequestBody Employeee employee) {
        return service.postResult(employee);
    }
    

    @PutMapping("/putmapping")
    public Object PutValues(@RequestBody Object name){
        return service.putResult(name);

    }

    @DeleteMapping("/deletemapping")
    public Object DltValues(@RequestBody Object id){
        return service.DltResult(id);

    }

    
}
