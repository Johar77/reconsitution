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
    private MemberLevel level;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args){

    }
}
