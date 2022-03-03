package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Integer>taknum = new ArrayList<>();
        ArrayList<Integer>jupnum = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < 50; i++) {
                int counter = (random.nextInt(50));
                if (counter % 2 != 0) {
                    taknum.add(counter);
                }
                if (counter % 2 == 0) {
                    jupnum.add(counter);
                }
            }

        System.out.println("Odd number: " + taknum);
        System.out.println("An even number: " + jupnum);

        }

    }



