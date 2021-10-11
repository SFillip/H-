package net.htlgkr.sfillip19.Ho2.Bsp4;

import net.htlgkr.sfillip19.Ho2.Bsp4.AbstractCalculator;
import net.htlgkr.sfillip19.Ho2.Bsp4.Number;

public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator{
        this.add=((Number a,Number b) -> {Number res=new Number();
        res.x=a.x +b.x;
        res.y=a.y+b.y;
        return res;
        });

    }

    @Override
    public net.htlgkr.sfillip19.Ho2.Bsp4.Number add(net.htlgkr.sfillip19.Ho2.Bsp4.Number a, net.htlgkr.sfillip19.Ho2.Bsp4.Number b) {
        return add(a,b);
    }

    @Override
    public net.htlgkr.sfillip19.Ho2.Bsp4.Number sub(net.htlgkr.sfillip19.Ho2.Bsp4.Number a, net.htlgkr.sfillip19.Ho2.Bsp4.Number b) {
        return null;
    }

    @Override
    public net.htlgkr.sfillip19.Ho2.Bsp4.Number multiply(net.htlgkr.sfillip19.Ho2.Bsp4.Number a, net.htlgkr.sfillip19.Ho2.Bsp4.Number b) {
        return null;
    }

    @Override
    public net.htlgkr.sfillip19.Ho2.Bsp4.Number divide(net.htlgkr.sfillip19.Ho2.Bsp4.Number a, net.htlgkr.sfillip19.Ho2.Bsp4.Number b) {
        return null;
    }
}
