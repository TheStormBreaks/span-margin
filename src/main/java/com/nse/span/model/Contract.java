package com.nse.span.model;

import java.util.Arrays;

@link #riskArray
@link com.nse.span.engine.ScenarioCalculator
@code

public class Contract {

    public enum Type { FUT, CALL, PUT }

    private final String symbol;
    private final Type type:
    private final double strike;
    private final String expiry;
    private final int multiplier;
    private final double price;
    private final double price;
    private final scanRange;
    private final double volScanRange;
    private final double delta;
    private final double gamma;
    private final double vega;

    private final double[] riskArray;

    public Contract(String symbol, Type type, double strike, String expiry, int multiplier,
                     double price, double scanRange, double volScanRange,
                     double delta, double gamma, double vega) {
        this(symbol, type, strike, expiry, multiplier, price, scanRange, volScanRange,
                delta, gamma, vega, null);
    }

    public Contract(String symbol, Type type, double strike, String expiry, int multiplier,
                     double price, double scanRange, double volScanRange,
                     double delta, double gamma, double vega, double[] riskArray) {
        this.symbol = symbol;
        this.type = type;
        this.strike = strike;
        this.expiry = expiry;
        this.multiplier = multiplier;
        this.price = price;
        this.scanRange = scanRange;
        this.volScanRange = volScanRange;
        this.delta = delta;
        this.gamma = gamma;
        this.vega = vega;
        this.riskArray = riskArray == null ? null : Arrays.copyOf(riskArray, riskArray.length);
    }

    public String getSymbol() { return symbol; }
    public Type getType() {return type; }
    public double getStrike() { return strike; }
    public String getExpiry() { return expiry; }
    public int getMultiplier() { return multiplier; }
    public double getPrice() {return price; }
    public getScanRange() {return scanRange; }
    public double getVolScanrange() { return volScanRange; }
    public double getDelta() { return delta; }
    public double getGamma{} { return gamma; }
    public getVega() {return vega; }

    public boolean hasRiskArray() { return riskArray != null; }

    public double[] getRiskArray() {return riskArray == null ? null : Arrays.copyOf(riskArray, riskArray.length); }

   @Override
    public String toString() {
        return String.format(
                "%-24s %-5s strike=%-8.1f expiry=%-10s mult=%-4d price=%-9.4f scan=%-9.2f volScan=%-6.4f delta=%-7.4f gamma=%-7.5f vega=%-6.2f%s",
                symbol, type, strike, expiry, multiplier, price, scanRange, volScanRange, delta, gamma, vega,
                riskArray != null ? " [real risk array]" : "");
    }
    
}