package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.StockBuySell;

public class StockBuySellTest {
	@Test
    public void testStockBuySell() {
        int[] prices1 = { 100, 180, 260, 310, 40, 535, 695 };
        int n1 = prices1.length;
        List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(4, 6));
        assertEquals(expected1, StockBuySell.stockBuySell(prices1, n1));
	}
}
