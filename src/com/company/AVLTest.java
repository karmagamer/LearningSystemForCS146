package com.company;
import java.util.Scanner;

 public class AVLTest
 {
     public static void main(String[] args)
    {            
        Scanner scan1 = new Scanner(System.in);
        AVLTree avlt = new AVLTree(); //AVL tree object
        System.out.println("AVL tree is balanced binary search tree. \n Sub trees differ in Height by Just 1 ndoes. \n " +
                "Every sub-tree is an AVL tree. ");

        System.out.println("AVL tree example\n");          
        char char1;
         
        do    
        {
            System.out.println("Options:");
            System.out.println("1. insert ");
            System.out.println("2. search");
            int choice = scan1.nextInt();            
            switch (choice)
            {
            case 1 : 
            System.out.println("Enter an integer  to insert");
            avlt.insert( scan1.nextInt() );                     
            break;                          
            case 2 : 
            System.out.println("Enter an integer to search");
            System.out.println("Search result : "+ avlt.search( scan1.nextInt() ));
            break;                                          
         
            default : 
                System.out.println("Invalid entry \n ");
                break;   
            }
            //post order, pre order, in order
            System.out.print("\nPost order : ");
            avlt.postorder();
            System.out.print("\nPre order : ");
            avlt.preorder();
            System.out.print("\nIn order : ");
            avlt.inorder();
            System.out.println("\n\nType y to continue \n");
            char1 = scan1.next().charAt(0);                        
        } while (char1 == 'Y'|| char1 == 'y');               
    }
 }