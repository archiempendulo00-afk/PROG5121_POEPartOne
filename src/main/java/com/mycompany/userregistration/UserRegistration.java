/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.userregistration;

import java.util.Scanner;

/**
 *
 * @author archi
 */
public class UserRegistration {

    public static void main(String[] args) {
        // TODO code application logic here
        Login register = new Login();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n=====Register=====");

        System.out.println("Please enter your first name: ");
        String firstName = scan.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();
        
        System.out.println("Please enter the username: ");
        String name = scan.nextLine();
        
        System.out.println("Enter password");
        String password = scan.nextLine();
        
        System.out.println("Enter cellphone number");
        String cellphone = scan.nextLine();
        
        while(true){
            if (!register.CheckUserName(name)){
                System.out.println("Please try again.");
                System.out.println("Please enter the username: ");
                name = scan.nextLine();
                continue; // Retry username validation.
            }
            if (!register.checkPasswordComplexity(password)){
                System.out.println("Please try again.");
                System.out.println("Enter password");
                password = scan.nextLine();
                continue; // Retry password validation
            }
            if (!register.checkCellPhoneNumber(cellphone)){
                System.out.println("Please try again.");
                System.out.println("Enter cellphone number");
                cellphone = scan.nextLine();
                continue; // Retry cellphone number validation
            }
            System.out.println(register.registrationUser(firstName, lastName, name,
                password, cellphone));
            break; // Exit the loop after successful registration.
        }

        System.out.println("\n=====Login=====");
        System.out.println("Please enter your username: ");
        String loginName = scan.nextLine();
        System.out.println("Please enter your password: ");
        String loginPassword = scan.nextLine();
        System.out.println(register.returnLoginStatus(
                register.LoginUser(loginName, loginPassword)));
        scan.close(); // Close the scanner and release the input resource.
        
    }   
}