/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayselfpractice;

import java.util.Arrays;

/**
 *
 * @author 92019179
 */
public class Array {

    public static void main(String args[]) {
        //first array
        int i;
        String test[] = {"blue", "red", "black", "White"};
        for (i = 0; i < 4; i++) {
            System.out.println(test[i]);
        }
//Second Array
        int a;
        String test2[] = {"hello", "bye", "me", "17", "340", "clock"};
        for (a = 0; a < 6; a++) {
            System.out.println(test2[a]);
        }

        System.out.println(test[0] + ",");
        System.out.println(test[2]);
        System.out.println(test2[5]);
        System.out.println(Arrays.toString(test));

        // here Im deleteing a element from the array with creating a new one
        test2[2] = test2[test2.length - 1];
        String[] newTest2 = new String[test2.length - 1];

        for (int d = 0; d < newTest2.length; d++) {
            newTest2[d] = test2[d];
        }
        System.out.println(Arrays.toString(newTest2));
    }
}
