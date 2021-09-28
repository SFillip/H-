package net.htlgkr.FillipS190052.PrimeSieve;

public class Main {
    public static void main(String[]args)
    {
        EratosthenesPrimeSieve sieve=new EratosthenesPrimeSieve(100);

        sieve.printPrimes();

        System.out.println();

        sieve.printEvenNumbers();

    }

}

