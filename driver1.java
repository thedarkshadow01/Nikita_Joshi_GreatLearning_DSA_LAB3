/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl;
import java.util.*;
import static gl.BST_sum.Pair;
import static gl.BST_sum.insert;
import gl.BST_sum.node;

/**
 *
 * @author Nikita
 */
public class driver1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num=0, sum=0;
        System.out.println("Enter Tree Level");
        int n= s.nextInt(); 
        int nodes= 2*(n+1)-1;
        node root = null;
        System.out.println("Enter node values");
        for(int i=0;i<nodes;i++){
            num= s.nextInt();
            root = insert(root, num);
        }
        System.out.println("Enter required sum");
        sum= s.nextInt();
        Pair(root, sum);
    }
}
