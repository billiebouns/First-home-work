package com.company;

public class Cat extends Animal {

    private int claws;

    public Cat(int age, int paws, String name) {
        super(age, paws, name);
    }

    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
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
        return "Cat{" + " Имя = " +getName()+" Лапы = "+getPaws()+
                " Когтей = " + getClaws()+ " Возвраст = "+ getAge()+
                '}';
    }
}


