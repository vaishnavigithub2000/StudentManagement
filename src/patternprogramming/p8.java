package patternprogramming;

public class p8 {

        public static void main(String[] args) {
            int n=5;
            int count=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(j==i){
                        System.out.print(count++);
                    }else
                    {
                        System.out.print(0);
                    }
                }
                System.out.println();
            }

        }
    }




