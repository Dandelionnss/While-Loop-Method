

package com.mycompany.practice005;

import java.util.Scanner;

public class Practice005 {

    private String name;
    private int choice;
    
    
    void getName(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter your Desire Name: ");
        name = scan.nextLine();
    }
    
    void display(){
        System.out.println("You entered name is '" + name);
    }
    
    int getChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want this name as your permanent name? ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Enter your Choice: ");
        choice = scan.nextInt();
        return choice;
    }
    
    void ReadUser(){
        
        getName();
        display();
        getChoice();
        process();
    }
    
    void process(){
        if (choice == 1) {
            System.out.println("You Confirm '" + name + "' as your Permanent name");
           System.exit(0);
            }else if (choice == 2){
            System.out.println("You Entered previous name '" + name);
            System.out.println("You can try again");
        }else {
                System.out.println("Invalid input");
                System.exit(0);
            }
    }
    
    public static void main(String[] args) {
        
        Practice005 object = new Practice005();
        
        
        while (true){
        object.ReadUser();
        }
    }
}
