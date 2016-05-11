package com.company;
import java.util.Scanner;

public class  ExpressionTreeTest
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Expression trees are specifi types of tree. \n Expression tree are used for representing expressions");
        System.out.println("Expression Tree example");
        ExpressionTree x = new ExpressionTree(); //expression tree object
 
        System.out.println("\nEnter equation in prefix form:");
        x.createTree(scan1.next());
		
		//prefix, infix, postfix
        System.out.print("\nPrefix : ");
        x.prefix();
        System.out.print("\n\nInfix: ");
        x.infix();
        System.out.print("\n\nPostfix: ");
        x.postfix();
       
    }
}