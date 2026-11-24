package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable {

    private String name;
    private String owner;
    private List<Valuable> valuables = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable valuable) {
        if (valuable != null) {
            valuables.add(valuable);
        }
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal total = BigDecimal.ZERO;
        for (Valuable item : valuables) {
            total = total.add(item.getValue());
        }
        return total;
    }

    public Valuable getMostValuable() {
        if (valuables.isEmpty()) {
            return null;
        }
        Valuable bestSoFar = valuables.get(0);
        for (Valuable item : valuables) {
            if (item.getValue().compareTo(bestSoFar.getValue()) > 0) {
                bestSoFar = item;
            }
        }
        return bestSoFar;
    }

    public Valuable getLeastValuable() {
        if (valuables.isEmpty()) {
            return null;
        }
        Valuable leastSoFar = valuables.get(0);
        for (Valuable item : valuables) {
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

    public List<Valuable> getValuables() {
        return valuables;
    }
}
