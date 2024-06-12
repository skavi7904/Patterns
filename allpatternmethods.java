public class allpatternmethods {
    public static void main(String[] args) {
        n1(7);
        System.out.println("-------------------------------------------------------------------");
        n2(7);
        System.out.println("-------------------------------------------------------------------");
        n3(7);
        System.out.println("-------------------------------------------------------------------");
        n4(7);
        System.out.println("-------------------------------------------------------------------");
        n5(7);
        System.out.println("-------------------------------------------------------------------");
        n6(7);
        System.out.println("-------------------------------------------------------------------");
        n7(7);
        System.out.println("-------------------------------------------------------------------");
        n8(7);
        System.out.println("-------------------------------------------------------------------");
        n9(1);
        System.out.println("-------------------------------------------------------------------");
        n10(7);
        System.out.println("-------------------------------------------------------------------");
        n11(7);
        System.out.println("-------------------------------------------------------------------");
        n12(3);
        System.out.println("-------------------------------------------------------------------");
        n14(7);
        n15(7);
        n16(7);





    }
    static void n1(int n) {
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void n2(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void n3(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void n4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void n5(int n) {
        for(int i=0;i<n;i++){
            for(int j=0; j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void n6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void n7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void n8(int n) {
        for(int i=0; i<n; i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void n9(int n){
        n7(n);
        n8(n);
    }

    static void n10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i > n) {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void n11(int n) {
        for(int i=1;i<=n;i++){
            int zero = 0;
            if(i%2!=0) zero=1;
            for(int j=1;j<=i;j++){
                System.out.print(zero+" ");
                zero = 1-zero;
            }
            System.out.println();
        }
    }

    static void n12(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+1-j+" ");
            }
            System.out.println();
        }
    }
    static void n13(int n) {
        int c = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    static void n14(int n) {
        for(int i=1;i<=n;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void n15(int n) {
        for(int i=1;i<=n;i++){
            for(char j='A';j<'A'+(n-i+1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//    static void n16(int n) {
//        char x = 'A';
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(x+" ");
//            }
//            x = (char)(x+1);
//            System.out.println();
//        }
//    }

    static void n16(int n) {
        // char x = 'A';
        for(int i=0;i<n;i++){
            char ch = (char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            // x = (char)(x+1);
            System.out.println();
        }
    }




}
