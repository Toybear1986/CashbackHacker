package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void checkRemainIfAmount900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        assertEquals(service.remain(900), expected);
    }

    @Test
    public void checkRemainIfAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        assertEquals(service.remain(0), expected);
    }

    @Test
    public void checkRemainIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(1000), expected);
    }

    @Test
    public void checkRemainIfAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(1001), expected);
    }

    @Test
    public void checkRemainIfAmountIsNegative() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(-100), expected);
    }

}