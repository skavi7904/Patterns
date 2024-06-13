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
        n9(7);
        System.out.println("-------------------------------------------------------------------");
        n10(7);
        System.out.println("-------------------------------------------------------------------");
        n11(7);
        System.out.println("-------------------------------------------------------------------");
        n12(7);
        System.out.println("-------------------------------------------------------------------");
        n13(7);
        System.out.println("-------------------------------------------------------------------");
        n14(7);
        System.out.println("-------------------------------------------------------------------");
        n15(7);
        System.out.println("-------------------------------------------------------------------");
        n16(7);
        System.out.println("-------------------------------------------------------------------");
        n17(7);
        System.out.println("-------------------------------------------------------------------");
        n18(7);
        System.out.println("-------------------------------------------------------------------");
        n19(7);
        System.out.println("-------------------------------------------------------------------");
        n20(7);
        System.out.println("-------------------------------------------------------------------");
        n21(7);
        System.out.println("-------------------------------------------------------------------");
        n22(7);
        System.out.println("-------------------------------------------------------------------");



    }

    static void n1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void n2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void n3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void n4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void n5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void n6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void n7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void n8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void n9(int n) {
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
        for (int i = 1; i <= n; i++) {
            int zero = 0;
            if (i % 2 != 0) zero = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(zero + " ");
                zero = 1 - zero;
            }
            System.out.println();
        }
    }

    static void n12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + 1 - j + " ");
            }
            System.out.println();
        }
    }

    static void n13(int n) {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }

    static void n14(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void n15(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + (n - i + 1); j++) {
                System.out.print(j + " ");
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
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            // x = (char)(x+1);
            System.out.println();
        }
    }

//    static void n17(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < (n - i - 1); j++) {
//                System.out.print("  ");
//            }
//            int x = 65;
//            int fk = (2 * i + 1) / 2;
//            for (int j = 1; j <= 2 * i + 1; j++) {
//                System.out.print((char) x + " ");
//                if (j <= fk) x++;
//                else x--;
//            }
//            for (int j = 0; j < (n - i - 1); j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//
//
//        }
//    }

    static void n17(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print("  ");
            }
            int x = 65;
            int fk = (2*i)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print((char)x+" ");
                if(j<fk) x++;
                else x--;
            }
            for(int j=0;j<(n-i-1);j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

//    static void n17(int n) {
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<(n-i);j++){
//                System.out.print("  ");
//            }
//            int x = 65;
//            // int fk = (2*i)/2;
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print((char)x+" ");
//                if(j<i) x++;
//                else x--;
//            }
//            for(int j=0;j<(n-i);j++){
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }

    static void n18(int n) {
        for(int i=0;i<n;i++){
            int x = (int)'A'+(n-1);
            for(char j = 0;j<=i;j++){
                System.out.print((char)x+" ");
                x--;
            }
            System.out.println();
        }
    }

    static void n19(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<2*i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<(n-i);j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

    static void n20(int n) {
        for(int i=0;i<2*n-1;i++){
            int stars;
            if (i<n){
                stars=i+1;
            }
            else{
                stars=2*n-i-1;
            }
            int count = 2*n-2;
            for(int j=0;j<stars;j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<count;j++){
                System.out.print("  ");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            if(i>=n-i){
                count+=2;
            }
            else count-=2;
        }
    }

    static void n21(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void n22(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int bottom = 2*n-i-2;
                int right = 2*n-j-2;
                int tb = Math.min(top,bottom);
                int lr = Math.min(left,right);
                int x = Math.min(tb,lr);
                System.out.print(n-x);
            }
            System.out.println();
        }
    }
}

