import com.sun.org.apache.bcel.internal.classfile.Constant;

public abstract class Animal {
    protected int age;
    protected String name = "No name";
    protected String voice = "Don't have Voice";


public static void main(String[]args){
   Cat tor = new Cat();
    tor.setName("Тор");
    tor.setAge(2);
    tor.setVoice("MEOWWWWWW");
    tor.setPaws(4);

    //System.out.println(tor);

    System.out.println(tor.getName()+" ему "+tor.getAge()+" года.");
    System.out.println("Если разозлить кота, будет плохо: "+ tor.getVoice() +" !!!!!");
    System.out.println("У  кота "+ tor.getPaws() + " ноги ");

//////////////////////////////////////////////////////////////////////////////////////////////
    Dog elbrus  = new Dog();
    elbrus.setName("Elbrus");
    elbrus.setAggressive(true);


    //System.out.println(elbrus);

    System.out.println(elbrus.getName() + " Агресивный? " + elbrus.getAggressive());

}


}



