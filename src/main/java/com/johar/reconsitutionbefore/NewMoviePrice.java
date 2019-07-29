package com.johar.reconsitutionbefore;

/**
 * @ClassName: NewMoviePrice
 * @Description: TODO
 * @Auther: Johar
 * @Date: 2019/7/29 23:36
 * @Version: 1.0
 */
public class NewMoviePrice implements IPrice {

    @Override
    public boolean canHandler(Rental rental, Customer customer) {
        if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE){
            return true;
        }
        return false;
    }

    @Override
    public double getPrice(Rental rental, Customer customer) {
        return rental.getDayRented() * 3;
    }
}
