package com.johar.reconsitutionbefore;

/**
 * @ClassName: ChildrenMoivePrice
 * @Description: TODO
 * @Auther: Johar
 * @Date: 2019/7/29 23:42
 * @Version: 1.0
 */
public class ChildrenMoivePrice implements IPrice {
    @Override
    public boolean canHandler(Rental rental, Customer customer) {
        if (rental.getMovie().getPriceCode() == Movie.CHILDRENS){
            return true;
        }
        return false;
    }

    @Override
    public double getPrice(Rental rental, Customer customer) {
        double result = 1.5;
        if (rental.getDayRented() > 3){
            result += (rental.getDayRented() -3)* 1.5;
        }
        return result;
    }
}
