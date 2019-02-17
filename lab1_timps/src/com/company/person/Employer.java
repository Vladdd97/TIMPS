package com.company.person;

//Prototype pattern
public class Employer extends Person {

    public Employer() {
    }

    public Employer(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void sayHi() {
        System.out.println("Hi from employer");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Employer(this.getName(),this.getSurname(), this.getAge());
    }
}
