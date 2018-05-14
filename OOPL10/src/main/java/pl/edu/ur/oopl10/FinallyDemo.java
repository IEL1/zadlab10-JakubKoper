/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class FinallyDemo {

    static void procA() {
        try {
            System.out.println("wewnatrz procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA: finally");
        }
    }

    static void procB() {
        try {
            System.out.println("wewnatrz procB");
            return;
        } finally {
            System.out.println("procB: finally");
        }
    }

    static void procC() {
        try {
            System.out.println("wewnatrz procC");
        } finally {
            System.out.println("procC: finally");
        }
    }

    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Wyjatek zlapany");
        }
        procB();
        procC();
    }
}
