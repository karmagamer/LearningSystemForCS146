// AVL tree example
package com.company;
class AVLNode
 {    
     AVLNode leftNode, rightNode;
     int data;
     int heightOfTree;
 
    
     public AVLNode(){
         leftNode = null; rightNode = null; data = 0; heightOfTree = 0;
     }
      
     public AVLNode(int a){
         leftNode = null; rightNode = null; data = a; heightOfTree = 0;
     }     
 }
 
 
 class AVLTree
 {   private AVLNode rootOfTree;     
 
      
     public AVLTree(){
      rootOfTree = null;
     }
 
     public void insert(int data){ // insert method
      rootOfTree = insert(data, rootOfTree);
      }
     
     private int heightOfTree(AVLNode y ){ // get heightOfTree 
      return y == null ? -1 : y.heightOfTree;
      }
     
     private int max(int lhs, int rhs){ // get max 
      return lhs > rhs ? lhs : rhs;
      }
    
     private AVLNode insert(int b, AVLNode y){ //recursion method for insert a integer 
         if (y == null)
             y = new AVLNode(b);
         else if (b < y.data){
           y.leftNode = insert( b, y.leftNode );
             if( heightOfTree( y.leftNode ) - heightOfTree( y.rightNode ) == 2 )
                 if( b < y.leftNode.data )
                     y = rotateWithleftNodeChild( y );
                 else
                     y = doubleWithleftNodeChild( y );
         }
         else if( b > y.data ){
             y.rightNode = insert( b, y.rightNode );
             if( heightOfTree( y.rightNode ) - heightOfTree( y.leftNode ) == 2 )
                 if( b > y.rightNode.data)
                     y = rotateWithrightNodeChild( y );
                 else
                     y = doubleWithrightNodeChild( y );
         }
         else
           ; 
         y.heightOfTree = max( heightOfTree( y.leftNode ), heightOfTree( y.rightNode ) ) + 1;
         return y;
     }
     private AVLNode rotateWithleftNodeChild(AVLNode node2){//rotate with left
         AVLNode node1 = node2.leftNode;
         node2.leftNode = node1.rightNode;
         node1.rightNode = node2;
         node2.heightOfTree = max( heightOfTree( node2.leftNode ), heightOfTree( node2.rightNode ) ) + 1;
         node1.heightOfTree = max( heightOfTree( node1.leftNode ), node2.heightOfTree ) + 1;
         return node1;
     }
      private AVLNode rotateWithrightNodeChild(AVLNode node1){// rotate with right
         AVLNode node2 = node1.rightNode;
         node1.rightNode = node2.leftNode;
         node2.leftNode = node1;
         node1.heightOfTree = max( heightOfTree( node1.leftNode ), heightOfTree( node1.rightNode ) ) + 1;
         node2.heightOfTree = max( heightOfTree( node2.rightNode ), node1.heightOfTree ) + 1;
         return node2;
     }
      
     private AVLNode doubleWithleftNodeChild(AVLNode node3){ //doubleWithleftNodeChild 
         node3.leftNode = rotateWithrightNodeChild( node3.leftNode );
         return rotateWithleftNodeChild( node3 );
     }
          
     private AVLNode doubleWithrightNodeChild(AVLNode node1){ //doubleWithrightNodeChild
         node1.rightNode = rotateWithleftNodeChild( node1.rightNode );
         return rotateWithrightNodeChild( node1 );
     }    
 
      
     public boolean search(int value){ //method to search for a specific integer 
       return search(rootOfTree, value);
     }
   private boolean search(AVLNode nodeX, int value){
         boolean found = false;
         while ((nodeX != null) && !found)
         {
             int nodevalue = nodeX.data;
             if (value < nodevalue)
                 nodeX = nodeX.leftNode;
             else if (value > nodevalue)
                 nodeX = nodeX.rightNode;
             else
             {
                 found = true;
                 break;
             }
             found = search(nodeX, value);
         }
         return found;
     }
      
     public void inorder(){ //inorder traversal method
      inorder(rootOfTree);
     }
     private void inorder(AVLNode nodeX){
    
         if (nodeX != null){
             inorder(nodeX.leftNode);
             System.out.print(nodeX.data +" ");
             inorder(nodeX.rightNode);
         }
     }
     
     public void preorder(){//preorder traversal method
       preorder(rootOfTree);
     }
     private void preorder(AVLNode nodeX){
     
         if (nodeX != null){
             System.out.print(nodeX.data +" ");
             preorder(nodeX.leftNode);             
             preorder(nodeX.rightNode);
         }
     }
      
     public void postorder(){//postorder traversal method
     
         postorder(rootOfTree);
     }
     private void postorder(AVLNode nodeX){
     
         if (nodeX != null){
             postorder(nodeX.leftNode);             
             postorder(nodeX.rightNode);
             System.out.print(nodeX.data +" ");
         }
     }     
 }
 
 