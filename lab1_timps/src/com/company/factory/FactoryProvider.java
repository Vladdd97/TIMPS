package com.company.factory;


public class FactoryProvider {


    public static AbstractFactory getFactory(String choice){

        if("Person".equalsIgnoreCase(choice)){
            return PersonFactory.getInstance();
        } else if("Job".equalsIgnoreCase(choice)){
            return JobFactory.getInstance();
        }

        return null;
    }

}
