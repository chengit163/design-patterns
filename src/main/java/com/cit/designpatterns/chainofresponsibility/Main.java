package com.cit.designpatterns.chainofresponsibility;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        PriceHandler priceHandler = PriceHandlerFactory.createPriceHandler();

        Random rand = new Random();
        for (int i = 1; i <= 5; i++)
        {
            System.out.print(i + ":");
            priceHandler.processDiscount(rand.nextFloat());
        }
    }
}
