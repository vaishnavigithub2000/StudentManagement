package patternprogramming;
public class p5 {
        public static void main(String[] args) {
            int n=5;
            for (int i=1;i<=n;i++){
                int count=5;
                for(int j=1;j<=n;j++){
                    System.out.print(count--);
                }
                System.out.println();
            }
        }
    }

