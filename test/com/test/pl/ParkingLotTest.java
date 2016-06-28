package com.test.pl;


import com.src.pl.ParkingLot;
import com.src.pl.Token;
import com.src.pl.exception.InvalidToken;
import com.src.pl.exception.ParkingLotFullException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bhupendrakumar Piprava on 6/28/16.
 */
public class ParkingLotTest {

//    @Test
//    public void shouldAbleToParkCar() {
//        Car car = new Car();
//        Assert.assertTrue(car.park());
//    }

    @Test
    public void shouldGetParkingTokenOnceParked() throws ParkingLotFullException {
        ParkingLot parkingLot = new ParkingLot(10);
        Assert.assertTrue(parkingLot.park() instanceof Token);
    }

    @Test(expected = ParkingLotFullException.class)
    public void shouldNotGetParkingTokenIfSlotFull() throws ParkingLotFullException {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park();
        Assert.assertNull(parkingLot.park());
    }
    public void shouldBeAbleToUnparkIfHaveToken() throws ParkingLotFullException, InvalidToken {

        ParkingLot parkingLot = new ParkingLot(1);
        Token token = parkingLot.park();
        parkingLot.unPark(token);

    }

    @Test(expected =  InvalidToken.class)
    public void shouldNotAllowToUnParkIfEmptyToken() throws ParkingLotFullException, InvalidToken {
        ParkingLot parkingLot = new ParkingLot(1);
        Token token = parkingLot.park();
        parkingLot.unPark(null);
    }


}
