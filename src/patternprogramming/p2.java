package patternprogramming;

public class p2 {
    public static void main(String[] args) {
        int n=5;

        for (int i=1;i<=n;i++){
            int count=1;
            for(int j=1;j<=n;j++){
                if(j<=i) {
                    System.out.print(count++);
                }else {
                    System.out.print(1);
                }
            }
            System.out.println();

        }

    }
}
