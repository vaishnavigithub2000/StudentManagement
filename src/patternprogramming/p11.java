
package patternprogramming;

public class p11 {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){
            for(int k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }
            int count=5;
            for (int j=0;j<=i;j++){

                System.out.print(count--);
            }
            System.out.println();
        }
    }
}
