/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class fibRecur {
    
    public static int fib(int n){
//static methods do not modify fields they have few side effects
        if ((n==1)|| (n==2)){
            return 1;
        }else {
            int result = fib(n-1)+fib(n-2);
            return result;
        }
    }
    
    private int[] alreadyCalcd = null;
    
    public int fibRecurMemo(int n){
        if (alreadyCalcd == null){
            alreadyCalcd = new int[n];
            for (int i = 0; i < alreadyCalcd.length; i++){
                alreadyCalcd[i] = -1;//to indicate not calculated yet
            }
        }
        if ((n==1)||(n==2)) {
            return 1;
        } else {
            if (alreadyCalcd[n-1]!= -1){
                return alreadyCalcd[n-1];
            } else {
                int result = fibRecurMemo(n-1) + fibRecurMemo(n-2);
                alreadyCalcd[n-1] = result;
                return result;
            }
        }
        
   
    
    }
    
}
