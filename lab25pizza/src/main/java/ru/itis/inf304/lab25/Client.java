package ru.itis.inf304.lab25;

public class Client extends Person {

    private Discount discount;
    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;

        if (gender == Gender.Female) discount = Discount.Female;
    }

    public Client(String name, Gender gender, Discount discount) {
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }
}
