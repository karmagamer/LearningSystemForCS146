// BinaryTreeNode Class
package com.company;

 class BinaryNode
 {    
     BinaryNode leftNode, rightNode;
     int data;
 
 
     public BinaryNode(){
      leftNode = null;
      rightNode = null;
      data = 0;
      }
  
     public BinaryNode(int x){
      leftNode = null;
      rightNode = null;
      data = x;
     }
   
     public void setleftNode(BinaryNode a){ //  set left node method
     leftNode = a;
     }
     
     public void setrightNode(BinaryNode b){//   set right node method
       rightNode = b;
     }
      
     public BinaryNode getleftNode(){ //  get left node method
       return leftNode;
     }
      
     public BinaryNode getrightNode(){ //    get right  node method
       return rightNode;
     }
      
     public void setData(int y){
       data = y;
     }
  
     public int getData() { 
       return data;
     }     
 }
 
 
 class BinaryTree
 {
    
	 private BinaryNode root;
 
     
     public BinaryTree(){
         root = null;
     } 
     public void insert(int data){ //insert method
        root = insert(root, data);
     }
      
     private BinaryNode insert(BinaryNode a, int data){ // using recursion method to insert
         if (a == null)
             a = new BinaryNode(data);
         else
         {
             if (a.getrightNode() == null)
                a.rightNode = insert(a.rightNode, data);
             else
                 a.leftNode = insert(a.leftNode, data);             
         }
         return a;
     }     
      
     public boolean search(int value){ //  search method 
            return search(root, value);
     }
      
     private boolean search(BinaryNode Nodex, int value){ // using recursion method to insert
         if (Nodex.getData() == value)
             return true;
         if (Nodex.getleftNode() != null)
             if (search(Nodex.getleftNode(), value))
                 return true;
         if (Nodex.getrightNode() != null)
             if (search(Nodex.getrightNode(), value))
                 return true;
         return false;         
     }
     
     public void inorder() // inorder traversal
     {
         inorder(root);
     }
     private void inorder(BinaryNode Nodex)
     {
         if (Nodex != null)
         {
             inorder(Nodex.getleftNode());
             System.out.print(Nodex.getData() +" ");
             inorder(Nodex.getrightNode());
         }
     }
      
     public void preorder(){ // preorder traversal
         preorder(root);
     }
     
     private void preorder(BinaryNode Nodex){
      if (Nodex!= null)
         {
             System.out.print(Nodex.getData() +" ");
             preorder(Nodex.getleftNode());             
             preorder(Nodex.getrightNode());
         }
     }
      
     public void postorder(){ // postorder traversal 
     
       postorder(root);
     }
     private void postorder(BinaryNode Nodex){
     
         if (Nodex != null)
         { postorder(Nodex.getleftNode());             
             postorder(Nodex.getrightNode());
             System.out.print(Nodex.getData() +" ");
         }
     }     
 }
 