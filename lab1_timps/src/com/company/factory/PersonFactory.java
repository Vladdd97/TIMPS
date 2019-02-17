package com.company.factory;

import com.company.person.Employee;
import com.company.person.Employer;
import com.company.person.Person;

//Singleton design pattern
//Factory design pattern
public class PersonFactory implements AbstractFactory<Person> {
    private PersonFactory(){};

    @Override
    public Person create(String personType) {

        if ("Employee".equalsIgnoreCase(personType)) {
            return new Employee();
        } else if ("Employer".equalsIgnoreCase(personType)) {
            return new Employer();
        }

        return null;
    }

    private static class PersonFactoryHelper{
        private static final PersonFactory INSTANCE = new PersonFactory();
    }

    public static PersonFactory getInstance(){
        return PersonFactoryHelper.INSTANCE;
    }
}
