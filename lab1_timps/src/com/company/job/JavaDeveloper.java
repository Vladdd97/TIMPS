package com.company.job;

//Prototype pattern
public class JavaDeveloper extends Job{

    public JavaDeveloper() {
    }

    public JavaDeveloper(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void getJobDescription() {
        System.out.println("Develop software using Java programing language");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new JavaDeveloper(this.getName(),this.getSalary());
    }
}
