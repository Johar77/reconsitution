package com.johar.reconsitutionbefore;

public interface IPrice {
    boolean canHandler(Rental rental, Customer customer);

    double getPrice(Rental rental, Customer customer);
}
