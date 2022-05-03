package PatternProblems;

import java.util.Scanner;

/*

for n = 5
*	*	*	*	*
*	*	*	*
*	*	*
*	*
*

 */

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n = sc.nextInt();
        for (int i=n;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
