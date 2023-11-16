package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.ConfusedPappu;

public class ConfusedPappuTest {
	
	 @Test
	    public void testFindDiffNoModification() {
	        assertEquals(0, ConfusedPappu.findDiff(123));
	    }
}
