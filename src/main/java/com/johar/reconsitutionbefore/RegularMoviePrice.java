package com.johar.reconsitutionbefore;

/**
 * @ClassName: RegularMoviePrice
 * @Description: TODO
 * @Auther: Johar
 * @Date: 2019/7/29 23:40
 * @Version: 1.0
 */
public class RegularMoviePrice implements IPrice {
    @Override
    public boolean canHandler(Rental rental, Customer customer) {
        if (rental.getMovie().getPriceCode() == Movie.REGULAR){
            return true;
        }
        return false;
    }

    @Override
    public double getPrice(Rental rental, Customer customer) {
        double result = 2;
        if (rental.getDayRented() > 2){
            result += (rental.getDayRented() -2) * 1.5;
        }
        return result;
    }
}
