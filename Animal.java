package com.company;

public abstract class Animal {
    private int age;
    private int paws;
    private String name;

 public Animal(int age, int paws, String name){
     this.age = age;
     this.paws = paws;
     this.name = name;
 }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPaws() {
        return paws;
    }
    public void setPaws(int paws) {
        this.paws = paws;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[]args){

     Cat cat = new Cat(2,4,"Tor");
     cat.setClaws(20);
     System.out.println(cat);

     Dog dog = new Dog(7,4,"Elbrus");
     dog.setAgressive(true);
     System.out.println(dog);

    }
}


