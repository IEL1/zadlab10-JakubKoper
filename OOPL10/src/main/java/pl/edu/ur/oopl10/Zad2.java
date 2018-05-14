/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

public class Zad2 {

    public static void main(String[] args) {
        int[] tab = new int[10];
        try {
            tab[10] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nieprawidłowy indeks tablicy,"
                    + " wyjątek: " + e);
        }
    }
}
