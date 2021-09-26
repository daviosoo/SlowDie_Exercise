package com.daviosoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Restaurant restaurant = new Restaurant();

        System.out.println("Enter the group size");
        int size = input.nextInt();

        restaurant.getOrder(size);
    }
}
