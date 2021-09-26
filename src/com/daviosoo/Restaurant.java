package com.daviosoo;

import java.util.Scanner;

public class Restaurant {

    int[] order ;

    public void getOrder(int size){

        Scanner input = new Scanner(System.in);

        order = new int[size];

        System.out.println();
        System.out.println("Menu");
        System.out.println();
        System.out.println("1. Hamburger   10.000");
        System.out.println("2. Hot Dog   8.000");
        System.out.println("3. Sausage   7.000");
        System.out.println("4. French fries   6.000");
        System.out.println();

        for (int i = 0 ; i< order.length ; i++)
        {
            System.out.println("Select the option for the person "+ (i+1) );

            order[i] = input.nextInt();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        getPriceOrder(order);
    }

    public void showOrder(int[] order){
        for (int i = 0 ; i< order.length ; i++)
        {
            System.out.println(order[i]);
        }
    }

    public void getPriceOrder (int[] order){

        double totalPrice = 0;
        for (int i = 0 ; i< order.length ; i++)
        {
            if (order[i] == 1)
            {
                totalPrice += 10000;
            }
            else if (order[i] == 2)
            {
                totalPrice += 8000;
            }
            else if (order[i] == 3)
            {
                totalPrice += 7000;
            }
            else if (order[i] == 4)
            {
                totalPrice += 6000;
            }
            else
            {
                System.out.println("Invalid option");
            }
        }
        getDiscount(totalPrice);
    }

    public void getDiscount(double totalPrice){
        if (totalPrice >= 20000)
        {
            System.out.println("You will have a discount of 10% due order is larger than 20000");
            System.out.println();
            totalPrice -= totalPrice*0.1;
        }
        else
        {
            System.out.println("You doesn't have discount");
            System.out.println();
        }
        getTip(totalPrice);
    }

    public void getTip(double totalPrice){

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to give a tip? [y/n]");
        char tip = input.next().charAt(0);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        if (tip == 'y')
        {
            totalPrice += totalPrice*0.1;
        }
        else if (tip == 'n')
        {
            totalPrice = totalPrice;
        }
        else
        {
            System.out.println("Invalid character");
        }

        showOrderPrice(totalPrice);
    }

    public void showOrderPrice(double totalPrice){
        System.out.println("You're gonna pay " + totalPrice);
    }
}
