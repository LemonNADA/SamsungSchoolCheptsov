class Kangaroo extends Animal {
    private double jumpForce;

    public Kangaroo(int age, double weight, double jumpForce) {
        super(age, weight);
        this.jumpForce = jumpForce;
    }

    public void jump() {
        System.out.println("Кенгуру прыгнул с силой прыжка " + this.jumpForce);
    }

    @Override
    public void move() {
        System.out.println("Кенгуру упрыгал");
    }
    @Override
    public void eat() {
        System.out.println("Кенгуру вкусно покушал");
    }
}
