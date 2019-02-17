package com.company.job;

//Prototype pattern
public class PythonDeveloper extends Job {
    public PythonDeveloper() {
    }

    public PythonDeveloper(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void getJobDescription() {
        System.out.println("Develop software using Python programing language");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new PythonDeveloper(this.getName(),this.getSalary());
    }
}
