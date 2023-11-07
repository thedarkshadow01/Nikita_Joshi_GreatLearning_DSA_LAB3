/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl;

/**
 *
 * @author Nikita
 */
import java.util.*;
public class Balance_brackets {
    static boolean balance(String x){
        Deque<Character> stack= new ArrayDeque<Character>();
        for(int i=0;i<x.length();i++){
            char a= x.charAt(i);
            if(a=='(' || a=='[' || a== '{'){
                stack.push(a);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char c;
            switch(a){
                case ')':
                    c= stack.pop();
                    if(c== '{' || c== '[')
                        return false;
                    break;
                
                case '}':
                    c= stack.pop();
                    if(c== '(' || c== '[')
                        return false;
                    break;
                
                case ']':
                    c= stack.pop();
                    if(c== '(' || c== '{')
                        return false;
                    break;
            }
        }
        return true;
    }
}
