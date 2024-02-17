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

    private Order(OrderBuilder builder) {
        this.client = builder.client;
        this.cook = builder.cook;
        this.pizza = builder.pizza;
        this.orderStatus = builder.orderStatus;
        this.orderNumber = builder.orderNumber;
        this.date = builder.date;
    }

    public static OrderBuilder getBuilder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder {
        private Client client;
        private Cook cook;
        private Pizza pizza;
        private OrderStatus orderStatus;
        private Integer orderNumber;
        private String date;

        public OrderBuilder client(Client client) {
            this.client = client;
            return this;
        }
        public OrderBuilder cook(Cook cook) {
            this.cook = cook;
            return this;
        }
        public OrderBuilder pizza(Pizza pizza) {
            this.pizza = pizza;
            return this;
        }
        public OrderBuilder orderStatus(OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public OrderBuilder orderNumber(Integer orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public OrderBuilder date(String date) {
            this.date = date;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
