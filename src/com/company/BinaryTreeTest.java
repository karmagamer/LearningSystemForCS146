package com.company;
import java.util.Scanner;
 
 public class BinaryTreeTest{
 
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BinaryTree treex = new BinaryTree();  // binary tree object
        System.out.println("In binary tree, each node has at most two child nodes. \n For given node in a binary tree, the first child is referred to"+
                "as the left child, while the second child is referred to as right child. \n"+ "binary trees are used for binary heaps and binary search trees. Both of them"
                +"can be efficient searching and sorting algorithms");
        System.out.println("Binary Tree example:\n");          
        char char1;        
        do    
        {  System.out.println("Options:");
           System.out.println("1. insert ");
           System.out.println("2. search");
 
        
        int x = scan.nextInt();            
        switch (x)
            {
            case 1 : 
            System.out.println("Enter an integer  to insert");
            treex.insert( scan.nextInt() );                     
            break;                          
            case 2 : 
            System.out.println("Enter an integer to search");
            System.out.println("Search result : "+ treex.search( scan.nextInt() ));
            break;                                          
            default : 
            System.out.println("Wrong Entry \n ");
            break;   
            }
       
            // inorder, preorder and post order 
            System.out.print("\nPost order : ");
            treex.postorder();
            System.out.print("\nPre order : ");
            treex.preorder();
            System.out.print("\nIn order : ");
            treex.inorder();
            System.out.println("\n\nType y to continue \n");
            char1 = scan.next().charAt(0);                        
        } while (char1 == 'Y'|| char1 == 'y');               
    }
 }