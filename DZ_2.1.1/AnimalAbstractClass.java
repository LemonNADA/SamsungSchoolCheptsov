abstract class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return this.age;
    }
    public double getWeight() {
        return this.weight;
    }
    
    public abstract void move();
    public abstract void eat();
}
