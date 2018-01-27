public class Dog extends Animal {

    private boolean aggressive;

    public void setName(String name) {
        this.name = name;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    public String getName() {
        return name;
    }

    public boolean getAggressive() {
        return aggressive;
    }

    @Override
    public String toString() {
        return  this.name +" " +
                "aggressive= " + aggressive  ;
    }
}
