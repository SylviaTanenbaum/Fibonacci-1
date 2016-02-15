/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author luismanuelmansilla
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        for(int i=1; i <= n; i++){
            System.out.println( i + ": " + fib(i));
        }
    }
    
    public static long fib(int n){
        if(n <= 1){
            return n;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
    
}
