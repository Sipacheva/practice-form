package guru.qa;

public class Dog {

    String name;
    int age;
    String breed;
    String gender;
    int weight;
    int growth;
    boolean hasAnOwner;
    String color;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getBreed() {
        return breed;
    }

    String getGender() {
        return gender;
    }

    int getWeight() {
        return weight;
    }

    int getGrowth() {
        return growth;
    }

    String getColor() {
        return color;
    }

    boolean getHasAnOwner() {
        return hasAnOwner;
    }

    public Dog(String name, int age, String breed, String gender, int weight, int growth, boolean hasAnOwner, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
        this.weight = weight;
        this.growth = growth;
        this.hasAnOwner = hasAnOwner;
        this.color = color;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public void dogInfo() {
        System.out.println("Кличка: " + this.getName() + ", возраст: " + this.getAge() + ", порода: "
                + this.getBreed() + ", пол: " + this.getGender() + ", вес: " + this.getWeight()
                + ", рост: " + this.getGrowth() + ", окрас: " + this.getColor());

        if (!this.getHasAnOwner()) {
            System.out.println("Собака ищет хозяина");
        } else {
            System.out.println("У собаки есть хозяин!");
        }
        System.out.println();
    }
}
