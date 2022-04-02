package patternprogramming;

public class p10 {
    public static void main(String[] args) {
        int n=5,k;
        for(int i=0;i<n;i++){
            for(k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(k+j+1);
            }
            System.out.println();
        }
    }
}
