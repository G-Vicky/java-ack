//package com.vicky7274;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int ack (int m, int n) {
        int ans;
        if (m == 0) ans = n+1;
        else if (n == 0) ans = ack(m-1, 1);
        else ans = ack(m-1, ack(m, n-1));
        return ans;
    }
    public static void main( String[] args )
    {
        System.out.println( "Ackerman! in JAVA" );
        int n = 6;
        try {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("ackerman (%d, %d) is: %d\n", i , j, ack(i, j));
                }
            }
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
            e.printStackTrace();
        }
    }
}
