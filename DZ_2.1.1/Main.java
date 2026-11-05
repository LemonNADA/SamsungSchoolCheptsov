public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Kangaroo(3, 45.5, 30.0),
            new Elephant(12, 3500.0, 1.8),
            new Crucian(1, 0.4, 7.0)
        };
        
        for(int i = 0; i < animals.length; i++) {
            animals[i].move();
            animals[i].eat();
        }
    }
}