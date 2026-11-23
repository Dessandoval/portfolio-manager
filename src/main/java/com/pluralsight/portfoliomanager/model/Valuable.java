package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public class Valuable {

    @Override
    public interface Valuable {
        BigDecimal getValue();
    }
}

