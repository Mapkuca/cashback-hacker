package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldFindUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        assertEquals(service.remain(999), expected);
    }

    @Test
    public void shouldFindOverBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(1001), expected);
    }

    @Test
    public void shouldFindBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(1000), expected);
    }

}