package com.pluralsight.portfoliomanager.model;

import java.util.List;

public class Portfolio implements Valuable {

    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner, List<Valuable> valuables) {
        this.name = name;
        this.owner = owner;
        this.valuables = valuables;
    }

    public void add(Valuable valuable) {
        if (valuable != null) {
            valuable.add(valuable);
        }
    }


}
