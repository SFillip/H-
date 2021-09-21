package net.htlgkr.FillipS190052.PrimeSieve;

public class EratosthenesPrimeSieve implements PrimeSieve {
    private int upperBorder;

    public EratosthenesPrimeSieve(int upperBorder)
    {
        this.upperBorder=upperBorder;
    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    @Override
    public void printPrimes() {
    
    }
}
