package com.company;

public class Cat extends Animal {

    private int claws;

    public Cat(int age, int paws, String name) {
        super(age, paws, name);
        setClaws(20);
    }

    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;

    }

    @Override
    public String toString() {
        return "Cat{" + " Имя = " +getName()+" Лапы = "+getPaws()+
                " Когтей = " + getClaws()+ " Возвраст = "+ getAge()+
                '}';
    }
}


