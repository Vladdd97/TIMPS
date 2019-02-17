package com.company.factory;

import com.company.job.JavaDeveloper;
import com.company.job.Job;
import com.company.job.PythonDeveloper;

//Singleton design pattern
//Factory design pattern
public class JobFactory implements AbstractFactory<Job> {

    private JobFactory(){};

    @Override
    public Job create(String animalType) {

        if ("JavaDeveloper".equalsIgnoreCase(animalType)) {
            return new JavaDeveloper();
        } else if ("PythonDeveloper".equalsIgnoreCase(animalType)) {
            return new PythonDeveloper();
        }

        return null;
    }

    private static class JobFactoryHelper{
        private static final JobFactory INSTANCE = new JobFactory();
    }

    public static JobFactory getInstance(){
        return JobFactoryHelper.INSTANCE;
    }

}
