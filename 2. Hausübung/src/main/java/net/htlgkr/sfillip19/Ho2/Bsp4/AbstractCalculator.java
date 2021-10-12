package net.htlgkr.sfillip19.Ho2.Bsp4;

public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public abstract Number add(Number a, Number b)

    public abstract Number sub(Number a, Number b);

    public abstract Number multiply(Number a, Number b);

    public abstract Number divide(Number a, Number b);


}