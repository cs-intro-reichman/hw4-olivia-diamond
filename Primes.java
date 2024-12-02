public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n+1];
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i < n + 1; i++) {
            arr[i] = true;
        }

        int i = 2;
        while (i <= n) {
            if (arr[i] == true) {
                //get multiples of i, not including i.
                for (int x = ( i * 2 ); x < ( n + 1); x+=i) {
                    arr[x] = false;
                }
            }
            i++;
        }

        System.out.println("Prime numbers up to " + n + ":");
        
        int counter = 0;
       
        for (int j = 0; j < (n + 1); j++) {
            if (arr[j] == true) {
                counter ++;
                System.out.println(j);
            }
        }
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (int)(((double)counter/n)*100) + "% are primes)");


    }
}