package com.src.pl;

import com.src.pl.exception.InvalidToken;
import com.src.pl.exception.ParkingLotFullException;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Bhupendrakumar Piprava on 6/28/16.
 */
public class ParkingLot {


    private final int capacity;
    private Set<Token> issuedTokens;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.issuedTokens = new HashSet<Token>(this.capacity);
    }

    public Token park() throws ParkingLotFullException {
        if (issuedTokens.size() >= capacity)
            throw new ParkingLotFullException("No slotes available for parking.");

        Token token = new Token();
        issuedTokens.add(token);
        return token;
    }

    public void unPark(final Token token) throws InvalidToken {
        if(token == null || !issuedTokens.remove(token)){
            throw  new InvalidToken("Token is not valid.");
        }
    }
}
