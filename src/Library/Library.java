/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author thaip
 */
public class Library {
    public static int inputNumInt() {
        Scanner sc = new Scanner(System.in);
         while (true) {
            try {
                int a = sc.nextInt();
                return a;
             } catch (InputMismatchException | NumberFormatException e) {
               System.out.println("Please input valid number.");
               sc = new Scanner(System.in);
                
            }
        }
     }
    public static double inputNumDou() {
        Scanner sc = new Scanner(System.in);
         while (true) {
            try {
                double a = sc.nextDouble();
                return a;
             } catch (InputMismatchException | NumberFormatException e) {
               System.out.println("Please input valid number.");
               sc = new Scanner(System.in);
                
            }
        }
     }
    
    public static boolean isValidPhoneNumber(String phone) {
        String regex = "^(\\d{10}|\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}|\\(\\d{3}\\)-\\d{3}-\\d{4})$";
        return Pattern.matches(regex, phone);
    }
}
