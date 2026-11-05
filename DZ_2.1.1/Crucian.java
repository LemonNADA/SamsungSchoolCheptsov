class Crucian extends Animal {
    private double swimSpeed;

    public Crucian(int age, double weight, double swimSpeed) {
        super(age, weight);
        this.swimSpeed = swimSpeed;
    }

    public void hide() {
        System.out.println("Карась спрятался в ил");
    }

    @Override
    public void move() {
        System.out.println("Карась уплыл");
    }
    @Override
    public void eat() {
        System.out.println("Карась вкусно покушал");
    }
}
