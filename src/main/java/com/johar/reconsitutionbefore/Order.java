package com.johar.reconsitutionbefore;

import lombok.Builder;
import lombok.Data;

import java.util.Vector;

/**
 * @ClassName: Order
 * @Description: TODO
 * @Auther: Johar
 * @Date: 2019/7/29 23:29
 * @Version: 1.0
 */
@Data
@Builder
public class Order {
    private Vector<Rental> rentals = new Vector<>();
    private Customer customer;
    private double totalCharge;

    public void addRental(Rental rental){
        rentals.add(rental);
    }

    public void removeRental(Rental rental){
        rentals.remove(rental);
    }
}
