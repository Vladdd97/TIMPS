package com.company.company;

import com.company.job.Job;
import com.company.person.Person;

import java.util.List;
//Builder pattern
public class ITCompany {

    private String name;
    private List<Person> persons;
    private List<Job> jobs;

    private ITCompany(ITCompanyBuilder itCompanyBuilder){
        this.name = itCompanyBuilder.name;
        this.persons = itCompanyBuilder.persons;
        this.jobs = itCompanyBuilder.jobs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "ITCompany{" +
                "name='" + name + '\'' +
                ",\n persons=" + persons +
                ",\n jobs=" + jobs +
                '}';
    }

    //Builder Class
    public static class ITCompanyBuilder{
        private String name;
        private List<Person> persons;
        private List<Job> jobs;

        public ITCompanyBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ITCompanyBuilder setPersons(List<Person> persons) {
            this.persons = persons;
            return this;
        }

        public ITCompanyBuilder setJobs(List<Job> jobs) {
            this.jobs = jobs;
            return this;
        }

        public ITCompany build(){
            return new ITCompany(this);
        }
    }
}
