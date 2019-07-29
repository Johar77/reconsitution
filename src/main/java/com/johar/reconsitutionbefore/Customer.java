package com.johar.reconsitutionbefore;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName: Customer
 * @Description: TODO
 * @Auther: Johar
 * @Date: 2019/7/27 08:09
 * @Version: 1.0
 */
@Data
@Getter
public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental){
        rentals.add(rental);
    }

    public String statement(){
        double totalAmout = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentalList = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalList.hasMoreElements()){
            double thisAmout = 0;
            Rental each = rentalList.nextElement();
            switch (each.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    thisAmout += 2;
                    if (each.getDayRented() > 2){
                        thisAmout += (each.getDayRented() -2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmout += each.getDayRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmout += 1.5;
                    if (each.getDayRented() > 3){
                        thisAmout += (each.getDayRented() -3)* 1.5;
                    }
                    break;
            }

            frequentRenterPoints++;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1){
                frequentRenterPoints++;
            }

            result += "\t" + each.getMovie().getTitle() + "\t" + thisAmout + "\n";
            totalAmout += thisAmout;
        }

        result += "Amount owed is " + totalAmout + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";

        return result;
    }

    public static void main(String[] args){

    }
}
