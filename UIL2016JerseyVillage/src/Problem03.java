/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class Problem03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE DIAMETER OF THE PIZZA: ");
        double diameter = input.nextInt();
        double area = (Math.PI * Math.pow((diameter / 2), 2));
        double sliceArea =  area / 8.0;
        int calories = (int) Math.round(15 * sliceArea);
        System.out.println("ONE SLICE OF A " + diameter + " INCH PIZZA CONTAINS "
                + calories + " CALORIES.");
    }
}
