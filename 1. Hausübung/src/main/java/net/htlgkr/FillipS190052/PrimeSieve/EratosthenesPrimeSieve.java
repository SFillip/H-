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
        return false;
    }

    @Override
    public void printPrimes() {

    }

    public boolean[]getAllPrimes(){
        boolean[]primes=new boolean[upperBorder];

        for(int i=1;i<primes.length;i++)
        {
            primes[i]=true;
        }

        for(int i=1;i<primes.length;i++)
        {
            if(primes[i]==false){

            }else{
                for(int j=i*i;i<primes.length;j+j)
                {
                    primes[j]=false;
                }
            }

        }

    }
}
