public class Cat extends Animal {
    
    private int paws;
    

    public static void main(String[]args){

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge( ) {
        return age;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getPaws() {
        return paws;
    }

    @Override
    public String toString() {
        return  this.name + " " + this.age + " year  old, " + this.voice + " his voice "
                 + paws + " Paws";
    }

}
