/*

 Author: Elman I.
 Email: elmanislam123@gmail.com

 Creation Date: 2024-10-15 15:45:44
 Last Modification Date: 2024-10-15 15:50:05

 

*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeNumbers implements Iterable<Integer> {
   private List<Integer> primes = new ArrayList<Integer>();

   public PrimeNumbers() {
      // Constructor logic (if any)
   }

   public void computePrimes(int n) {
      Boolean[] isPrime = new Boolean[n + 1];
      for (int i = 2; i <= n; i++) {
         isPrime[i] = true;
      }

      for (int factor = 2; factor * factor <= n; factor++) {
         if (isPrime[factor]) {
            for (int j = factor; factor * j <= n; j++) {
               isPrime[factor * j] = false;

            }
         }
      }

      for (int i = 2; i <= n; i++)
         if (isPrime[i] && (i % 10 != 9)) {
            primes.add(i);
         }
   }

   @Override
   public Iterator<Integer> iterator() {
      return primes.iterator();
   }

   @Override
   public String toString() {
      return primes.toString();
   }
}