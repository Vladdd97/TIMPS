package com.company.person;

//Prototype pattern
public class Employee extends Person {

    public Employee() {
    }

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void sayHi() {
        System.out.println("Hi from Employee");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Employee(this.getName(), this.getSurname(), this.getAge());
    }
}
