import java.util.List;
import java.util.ArrayList;

public class PrimeNumberList {

    public List<Integer> generatePrimes() {
        List<Integer> primeNumberList = new ArrayList<>(100);
        int count = 0;
        boolean isPrime = true;

        for (int i = 2; count < 100; i++) {
            isPrime = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                    primeNumberList.add(i);
                    count++;
                }
        }
        return primeNumberList;
    }


    public static void main(String[] args) {

        PrimeNumberList primeTime = new PrimeNumberList();
        List<Integer> primes = primeTime.generatePrimes();
        System.out.println(primes);
    }
}