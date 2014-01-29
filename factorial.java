/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class factorial {
    
    public static void main (String[] args){
        
        factorial tester = new factorial();
       // System.out.println(tester.factorialRecurr(12));
        // System.out.println(tester.factorialIterative(4));
        //System.out.println(tester.fibRecurr(4));
       // System.out.println(tester.hanoi(4));
        System.out.println(tester.pow(3,2));
    
    }
    
    public double factorialRecurr(double n){
        
        if (n == 1){
            return 1;
        } else {
            double answer = n* factorialRecurr(n-1);
            return answer;
        }
        
    }
    
    public double factorialIterative(int n){
        int answer;
        int result=0;
        
        for (int i= n; i>=0; i--){    
            answer =  n* n-1;
            result = result+answer;
        } return result;
    }
    
    public int fibRecurr(int n){
        if (n<=2) {
            return 1;}
        else {
            int result = fibRecurr(n-1)+fibRecurr(n-2);
            return result;
        }
    }
    
    public int hanoi(int n){
        if (n ==1){
            return 1;
        } 
        int result =hanoi(n-1)*2 +1;
        return result;}
    
    public int pow(int base, int exponent){
        if (exponent == 0){
            return 1;
        } else if (exponent == 1){
            return base;
        }
        else {
            int answer = base * (pow(base, exponent-1));
            return answer;
        }
    }
            
    }
    

