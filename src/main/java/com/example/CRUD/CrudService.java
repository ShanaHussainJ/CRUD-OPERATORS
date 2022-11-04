package com.example.CRUD;



import org.springframework.stereotype.Component;

@Component
public class CrudService implements ServiceInterface {
    
    public String getResult(){
        return "Get Mapping";
    }
    
    public Employeee postResult(Employeee employee){
        //System.out.println(name);
        return employee;
    }

    public String putResult(Object name){
        System.out.println(name);
        return "Put Mapping";
    }

    public String DltResult(Object id){
        System.out.println(id);
        return "Dlt Mapping";
    }

    
}
