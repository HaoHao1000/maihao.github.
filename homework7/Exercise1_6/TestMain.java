package Exercise1_6;

public class TestMain {
    public static void main(String[] args) {
        Cat c1 = new Cat("Huc");
        c1.greets();
        Dog d1 = new Dog("Dau");
        d1.greets();
        BigDog bD1 = new BigDog("Sua");

        Animal a1 = new Cat("Tra");
        a1.greets();
        Animal a2 = new Dog("Dao");
        a2.greets();
        Animal a3 = new BigDog("Pon");
        a3.greets();

        Dog d2 = (Dog) a2;
        BigDog bD2 = (BigDog) a3;
        Dog d3 = (Dog) a3;

        d2.greets(d3);
        d3.greets(d2);

        d2.greets(bD2);
        bD2.greets(d2);

        bD2.greets(bD1);
        bD1.greets(bD2);
    }
}
