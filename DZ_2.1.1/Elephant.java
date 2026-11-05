class Elephant extends Animal {
    private double trunkLength;

    public Elephant(int age, double weight, double trunkLength) {
        super(age, weight);
        this.trunkLength = trunkLength;
    }

    public void washYourself() {
        System.out.println("Слон помылся из хобота");
    }

    @Override
    public void move() {
        System.out.println("Слон утопал");
    }
    @Override
    public void eat() {
        System.out.println("Слон вкусно покушал");
    }
}
