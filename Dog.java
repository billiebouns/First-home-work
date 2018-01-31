package com.company;

public class Dog extends Animal {

    private boolean agressive;

    public Dog(int age, int paws, String name) {
        super(age, paws, name);
    }

    public boolean isAgressive() {
        return agressive;
    }

    public void setAgressive(boolean agressive) {
        this.agressive = agressive;
    }
    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getPaws() {
        return super.getPaws();
    }

    @Override
    public void setPaws(int paws) {
        super.setPaws(paws);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Dog{" + " Имя = "+getName()+ " Лапы = " + getPaws() + " Возвраст = " + getAge()+
                " Агресивность = " + isAgressive() +
                '}';
    }
}
