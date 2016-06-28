package com.src.pl;

/**
 * Created by Bhupendrakumar Piprava on 6/28/16.
 */
public class Token {

    private String tokenNumber;

    public Token() {
        this.tokenNumber = "#"+System.currentTimeMillis();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return tokenNumber != null ? tokenNumber.equals(token.tokenNumber) : token.tokenNumber == null;

    }

    @Override
    public int hashCode() {
        return tokenNumber != null ? tokenNumber.hashCode() : 0;
    }
}
