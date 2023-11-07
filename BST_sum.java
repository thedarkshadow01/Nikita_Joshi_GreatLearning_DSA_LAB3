/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl;

import java.util.*;

/**
 *
 * @author Nikita
 */
public class BST_sum {
    static class node{
        int data;
        node left, right;
    };
    
    static node newnode(int data){
        node temp= new node();
        temp.data= data;
        temp.left= null;
        temp.right= null;
        return temp;
    }
    
    static node insert (node root, int key){
        if(root== null)
            return newnode(key);
        if(key< root.data)
            root.left= insert(root.left, key);
        else
            root.right= insert(root.right,key);
        return root;
    }
    
     static boolean pair(node root, int sum, HashSet<Integer> set){
        if (root == null) 
            return false;
        if (pair(root.left, sum, set)) 
            return true; 
        if (set.contains(sum - root.data)){
            System.out.println("Pair is (" + (sum - root.data) + ", " + root.data + ")");
            return true;
        }
        else set.add(root.data); 
        return pair(root.right, sum, set);
    }
    
    static void Pair(node root, int sum){
        HashSet<Integer> set = new HashSet<Integer>();
        if (!pair(root, sum, set))
            System.out.print("Nodes are not found \n");
    }    
}
