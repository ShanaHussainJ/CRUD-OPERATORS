package com.example.CRUD;


interface ServiceInterface {
    abstract String getResult();
    // abstract Map<String,Integer> getAllData();
    abstract Employeee postResult(Employeee employee);
    abstract String putResult(Object name);
    abstract String DltResult(Object id);
}
