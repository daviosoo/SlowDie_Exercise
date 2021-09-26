package com.daviosoo;

import java.util.Scanner;

public class Restaurant {

    int[] order ;

    public void getOrder(int size){

        Scanner input = new Scanner(System.in);

        order = new int[size];

        for (int i = 0 ; i<size ; i++)
        {
            System.out.println("Menu");
            System.out.println();
            System.out.println("1. Hamburger   10.000");
            System.out.println("2. Hot Dog   8.000");
            System.out.println("3. Sausage   7.000");
            System.out.println("4. French fries   6.000");
            System.out.println();
            System.out.println("Select the option for the person "+ (i+1) );

            order[i] = input.nextInt();


        }

        showOrder(order);
    }

    public void showOrder(int[] order){
        for (int i = 0 ; i< order.length ; i++)
        {
            System.out.println(order[i]);
        }
    }

}
