package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.MaximumAreaRectangle;

public class MaximumAreaRectangleTest {
	@Test
	public void testCalculateAreaExample1() {
		MaximumAreaRectangle.Rectangle[] rect = { new MaximumAreaRectangle.Rectangle(1, 2),
				new MaximumAreaRectangle.Rectangle(3, 4), new MaximumAreaRectangle.Rectangle(5, 6) };
		int N = rect.length;
		assertEquals(30, MaximumAreaRectangle.calculateArea(rect, N));
	}

}
