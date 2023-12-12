package ru.itis.inf304.lab24.trade;

import java.math.BigDecimal;

public class TradeRequest {
    private int amount;// кол-во товара
    private BigDecimal total; // полная стоимость

    public TradeRequest(int amount, BigDecimal total) throws InvalidAmountException {
        setAmount(amount);
        this.total = total;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) throws InvalidAmountException {
        if (amount <= 0){
            throw new InvalidAmountException();
        }
        this.amount = amount;

    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "TradeRequest{" +
                "amount=" + amount +
                ", total=" + total +
                '}';
    }

}
