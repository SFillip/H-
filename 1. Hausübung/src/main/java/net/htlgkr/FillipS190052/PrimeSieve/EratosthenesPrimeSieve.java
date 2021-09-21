package net.htlgkr.FillipS190052.PrimeSieve;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve {
    private int upperBorder;

    public EratosthenesPrimeSieve(int upperBorder) {
        this.upperBorder = upperBorder;
    }

    @Override
    public boolean isPrime(int p) {
        boolean[] primes = getAllPrimes();

        if (primes[p] == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printPrimes() {
        boolean[] primes = getAllPrimes();

        for (int i = 0; i < primes.length; i++) {
            if (primes[i] == true) {
                System.out.println(i);
            }
        }
    }

    public void PrintEvenNumbers() {
        boolean[] primes = getAllPrimes();

        for (int i = 2; i < upperBorder; i++) {
            if (primes[i] = true) {
                for(int j=i;j<=upperBorder;i++)
                {
                    if(primes[j]==true){
                        System.out.println(i+j+" summe: "+ i+j +" "+i +" + "+ j);
                        break;
                    }

                }
            }
        }
    }

    private boolean[] getAllPrimes() {
        boolean[] primes = new boolean[upperBorder];

        for (int i = 1; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 1; i < primes.length; i++) {
            if (primes[i] == false) {

            } else {
                for (int j = i * i; i < primes.length; j + j) {
                    primes[j] = false;
                }
            }

        }
        return primes;
    }
}
