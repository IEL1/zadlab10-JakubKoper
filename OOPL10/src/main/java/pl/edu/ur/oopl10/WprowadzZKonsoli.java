/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {

    static void wprowadzInt(int sc){
        int a;
        try{
            a = sc;
        }catch(Exception e){
            System.out.println("Blad");
            
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        WprowadzZKonsoli.wprowadzInt(sc.nextInt());
        
    }
}
