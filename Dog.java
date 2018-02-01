package com.company;

public class Dog extends Animal {

    private boolean agressive;

    public Dog(int age, int paws, String name) {
        super(age, paws, name);
        setAgressive(true);
    }

    public boolean isAgressive() {
        return agressive;
    }

    public void setAgressive(boolean agressive) {
        this.agressive = agressive;
    }

    @Override
    public String toString() {
        return "Dog{" + " Имя = "+getName()+ " Лапы = " + getPaws() + " Возвраст = " + getAge()+
                " Агресивность = " + isAgressive() +
                '}';
    }
}
