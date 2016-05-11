 //ExpresionTree example 
 package com.company;
 class ExpressionTree
{
    class TreeNode{
        char data;
        TreeNode leftNode, rightNode;
 
         
        public TreeNode(char data){// new constructor
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    } 
      
     // using stacks for the data
    class Stack{
        TreeNode treeNode;
        Stack next;
     public Stack(TreeNode treeNode){// Constructor for stack node 
           this.treeNode = treeNode;
            next = null;
        }
    }
 
    private static Stack top;
    public ExpressionTree(){ 
       top = null;
    }
    public void startAgain(){  // method to clear
       top = null;
    }
    private void push(TreeNode node1){ //method to push node on stack
    
        if (top == null)
            top = new Stack(node1);
        else{
        
            Stack nnode1 = new Stack(node1);
            nnode1.next = top;
            top = nnode1;
        }
    }
    private TreeNode pop(){//method to pop node from stack 
    
        if (top == null)
            throw new RuntimeException("Underflow");
        else{
            TreeNode node1 = top.treeNode;
            top = top.next;
            return node1;
        }
    }
    private TreeNode peek(){   //method to get the top node
        return top.treeNode;
    }
 
   private void insert(char value){ //method for insertion
    
        try{
            if (isDigit(value))
              {
                TreeNode nnode1 = new TreeNode(value);
                push(nnode1);
             }
             else if (isOperator(value))
              {
                TreeNode nnode1 = new TreeNode(value);
                nnode1.leftNode = pop();
                nnode1.rightNode = pop();
                push(nnode1);
               }
        }
        catch (Exception e){
              System.out.println("Invalueid input ");
        }
    }
    private boolean isDigit(char ch){ //method to check integers
        return ch >= '0' && ch <= '9';
    }
    private boolean isOperator(char ch){ //method to check +,-,*,/
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    private int toDigit(char ch) {
        return ch - '0';
    }
    public void createTree(String eqn){ // create new tree
        for (int i = eqn.length() - 1; i >= 0; i--)
            insert(eqn.charAt(i));
    } 
    
    
    
    public void postfix() { //postfix method
       postOrder(peek());
    }
 
    private void postOrder(TreeNode node1){
       if (node1 != null){
            postOrder(node1.leftNode);            
            postOrder(node1.rightNode);
            System.out.print(node1.data);            
        }    
    }

    
    public void infix(){ //infix method
      inOrder(peek());
    }
    private void inOrder(TreeNode node1){
       if (node1 != null){
            inOrder(node1.leftNode);
            System.out.print(node1.data);
            inOrder(node1.rightNode);            
        }    
    }
 
   
    
    
    public void prefix(){ // prefix method 
       preOrder(peek());
    }
 
    private void preOrder(TreeNode node1){
       if (node1 != null){
            System.out.print(node1.data);
            preOrder(node1.leftNode);
            preOrder(node1.rightNode);            
        }    
    }
}