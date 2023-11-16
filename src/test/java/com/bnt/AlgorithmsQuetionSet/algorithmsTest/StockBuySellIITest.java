package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.StockBuySellII;

public class StockBuySellIITest {
	@Test
	    public void testStockBuyAndSell() {
	        int[] prices1 = { 3, 4, 1, 5 };
	        int n1 = prices1.length;
	        assertEquals(5, StockBuySellII.stockBuyAndSell(prices1, n1));
	}

}
