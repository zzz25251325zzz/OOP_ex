package Week3.Task1;

public class Week3Task1 {
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }

        if (a <= 2 || b <= 1) {
            return b;
        } else {

            if (a % b == 0) {
                System.out.print("UCLN is: ");
                System.out.println(b);
                return b;
            } else {
                int c = b;
                b = a%b;
                a = c;
                return gcd(b, a);
            }
        }
    }

    public int fibonaci(int n) {
        if (n < 0) {
            System.out.println("done");
        }

        if (n <=1) {
            return n;
        } else {
            return fibonaci(n -1) + fibonaci(n-2);
        }
    }

    public void sieveEratosthenes(int n){
        boolean ise = true;
        if (n <=2 && n > 0){ System.out.println("1 2");}
        else {
            for (int i = 2; i < n/2; i ++) {
                if ( n%i == 0) {
                    ise =  false;
                }
            }
            if (ise) {
                System.out.println(n);
            }

            sieveEratosthenes(n -1);
        };
    }
}
