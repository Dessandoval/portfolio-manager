package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable {

    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable valuable) {
        if (valuable != null) {
            assets.add(valuable);
        }
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal total = BigDecimal.ZERO;
        for (Valuable item : assets) {
            total = total.add(item.getValue());
        }
        return total;
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) {
            return null;
        }
        Valuable bestSoFar = assets.get(0);
        for (Valuable item : assets) {
            if (item.getValue().compareTo(bestSoFar.getValue()) > 0) {
                bestSoFar = item;
            }
        }
        return bestSoFar;
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) {
            return null;
        }
        Valuable leastSoFar = assets.get(0);
        for (Valuable item : assets) {
            if (item.getValue().compareTo(leastSoFar.getValue()) < 0) {
                leastSoFar = item;
            }
        }
        return leastSoFar;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }
}