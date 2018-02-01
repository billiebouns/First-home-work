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
    public int getPaws() {
        return paws;
    }
    public String getName() {
        return name;
    }

    public static void main(String[]args){
     Animal cat = new Cat(2,4,"Tor");
     Animal dog = new Dog(7,4,"Elbrus");
     System.out.println(cat);
     System.out.println(dog);
    }

}


