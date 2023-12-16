package ru.itis.inf304.lab25;

import java.util.Date;

public class Order {

    private Client client;
    private Cook cook;
    private Pizza pizza;
    private OrderStatus orderStatus;
    private Integer orderNumber;
    private String date;

    public Order(Client client, Cook cook, Pizza pizza, OrderStatus orderStatus, Integer orderNumber, String date) {
        this.client = client;
        this.cook = cook;
        this.pizza = pizza;
        this.orderStatus = orderStatus;
        this.orderNumber = orderNumber;
        this.date = date;
    }
}
