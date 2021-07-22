package guru.qa;

public class Main {

    public static void main(String[] args) {
        Dog Deny = new Dog("Дени", 2, "Курцхаар", "m", 30, 66, true, "черный");
        Dog Vita = new Dog("Вита", 6, "Дворняга", "f", 25, 50, true, "рыжий");

        Deny.setWeight(32);
        Deny.setWeight(33);

        Deny.dogInfo();
        Vita.dogInfo();

    }
}
