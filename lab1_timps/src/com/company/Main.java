package com.company;


import com.company.company.ITCompany;
import com.company.factory.FactoryProvider;
import com.company.factory.JobFactory;
import com.company.factory.PersonFactory;
import com.company.job.Job;
import com.company.job.PythonDeveloper;
import com.company.person.Employee;
import com.company.person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //get person and job factory (abstract factory design pattern)
        PersonFactory personFactory = (PersonFactory) FactoryProvider.getFactory("Person");
        JobFactory jobFactory = (JobFactory) FactoryProvider.getFactory("Job");

        List<Person> persons = createPersons(personFactory);
        List<Job> jobs = createJobs(jobFactory);

        persons.forEach(person -> person.sayHi());
        jobs.forEach(job -> job.getJobDescription());

        ITCompany googleITCompany = new ITCompany
                .ITCompanyBuilder()
                .setName("Google")
                .setPersons(persons)
                .setJobs(jobs)
                .build();

        System.out.println(googleITCompany);

    }

    public static List<Person> createPersons(PersonFactory personFactory) {
        List<Person> personList = new ArrayList<>();

        //create employer and employee using person factory (factory design pattern)
        Person employer = personFactory.create("Employer");
        Person employee1 = personFactory.create("Employee");
        Person employee2 = null;

        employee1.setName("Alexandru");
        employee1.setSurname("Dragutan");
        employee1.setAge(24);

        try {
            //create employee2 with clone() method (prototype design pattern)
            //here we need to cast Person  to an Employee to use clone() method
            //after that we need to cast Object to Person
            employee2 = (Person) ((Employee) employee1).clone();
            employee2.setSurname("Cazacu");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        personList.addAll(Arrays.asList(employer, employee1, employee2));
        return personList;
    }


    public static List<Job> createJobs(JobFactory jobFactory) {
        List<Job> jobList = new ArrayList<>();

        //create javaDeveloper and pythonDeveloper using person factory (factory design pattern)
        Job javaDeveloper = jobFactory.create("JavaDeveloper");
        Job pythonDeveloper1 = jobFactory.create("PythonDeveloper");
        Job pythonDeveloper2 = null;

        pythonDeveloper1.setName("Python Software Developer");
        pythonDeveloper1.setSalary(800);

        try {
            //create pythonDeveloper2 with clone() method (prototype design pattern)
            //here we need to cast Job  to a PythonDeveloper to use clone() method
            //after that we need to cast Object to Job
            pythonDeveloper2 = (Job) ((PythonDeveloper) pythonDeveloper1).clone();
            pythonDeveloper2.setSalary(750);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        jobList.addAll(Arrays.asList(javaDeveloper, pythonDeveloper1, pythonDeveloper2));

        return jobList;
    }


}
