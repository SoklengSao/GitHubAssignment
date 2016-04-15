
package patternassignment;

import java.util.Scanner;


public class PatternAssignment {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = input.nextInt();        
        displayPattern(n);
        System.out.println("Please enter an integer: ");
        int k = input.nextInt();
        displayPattern2(k);
        
    }
    
    
    
    
    
    
    
    
    public static void displayPattern(int n){
    int i;
    for( i = 1; i <=n; i++){
        int m = i;
        while( m < n ){
            System.out.print("      ");
            m++;
        }
        for (int j = i; j > 0; j = j-1){
        System.out.printf("%6d", j);
        }
        System.out.println();
    }
    }
    
    
    public static void displayPattern2(int n){
        int i;
        int k = 1;
        for(i=1; i<=n ; i++){
            int m = i;
            while( m < n ){
                System.out.print("      ");
            m++;
            }
            int l;
            for(l=k; l < k+i; l+=1){
                System.out.printf("%6d", l);
            }
            k+=i;
            System.out.println();
        }      
    }
}
