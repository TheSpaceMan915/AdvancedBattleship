package com.company;
import java.util.Scanner;   //to use keyboard input
import java.util.Random;    //to use random generator

public class Main
{
    public static int arr_size = 3;
    public static void main(String[] args)
    {
        //user inputs guesses with keyboard till there's no ship
        final int[] arr_cells = new Random().ints(0,6).distinct().limit(3).toArray();
        //create an array of 3 different integers in range [0,6]

        for (int cell : arr_cells)
        {
            System.out.println(cell);
        }

        Scanner console = new Scanner(System.in);   //create the object to read input with keyboard

        Simple_Dot_Com Game = new Simple_Dot_Com(arr_cells);
        do {
            System.out.println("Enter your guess");
            String str;
            str = console.nextLine();               //use nextLine method to read symbols

            System.out.println(Game.CheckYourself(str));
        } while (Game.GetNumOfHits() != 3);
    }

}

