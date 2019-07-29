package com.johar.reconsitutionbefore;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Taximeter
 * @Description: TODO
 * @Auther: Johar
 * @Date: 2019/7/29 23:34
 * @Version: 1.0
 */
public class Taximeter {

    private List<IPrice> priceList = new ArrayList<>();

    private void addPrice(IPrice price){
        priceList.add(price);
    }

    private void removePrice(IPrice price){
        priceList.remove(price);
    }

    public void getCharge(Order order){
        if (order == null){
            return;
        }

        if (order.getRentals().isEmpty()){
            return;
        }

        double totalAmout = 0;
        for (Rental rental : order.getRentals()){
            for (IPrice price : priceList){
                if (price.canHandler(rental, order.getCustomer())){
                    totalAmout += price.getPrice(rental, order.getCustomer());
                    continue;
                }
            }
        }

        order.setTotalCharge(totalAmout);
    }
}
