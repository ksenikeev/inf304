package ru.itis.inf304.lab24.trade;

import java.math.BigDecimal;

public class Mane {
    public static void main(String[] args) {
        try {
            System.out.println(new TradeRequest(-10, new BigDecimal(1000)));
        } catch (InvalidAmountException e) {
            System.out.println("Amount should be greater than 0");
        }
    }
}
