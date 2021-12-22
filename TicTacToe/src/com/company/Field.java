package com.company;

public enum Field{

    PLAYERX("x"),
    PLAYERO("O"),
    EMPTY("_");

    private String symbol;

    Field(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
