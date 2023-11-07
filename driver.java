/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl;
import gl.Balance_brackets;
import static gl.Balance_brackets.balance;
import java.util.*;
/**
 *
 * @author Nikita
 */
public class driver {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Bracket String");
        String z= s.nextLine();
        if(balance(z)){
            System.out.println("The entered String has Balanced Brackets");
        }
        else{
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}
