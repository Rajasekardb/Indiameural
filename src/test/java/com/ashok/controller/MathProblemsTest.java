package com.ashok.controller;

import org.junit.Assert;
import org.junit.Test;

public class MathProblemsTest {
	
	@Test
	public void Addition() {
		MathProblems test = new MathProblems();
		Assert.assertEquals("Expected value: 2", 2, test.addition(1, 1));
	}
	
	@Test
	public void Subtraction() {
		MathProblems test = new MathProblems();
		Assert.assertEquals("Expected value: 1", 1, test.subtraction(3, 2));
	}
	
	@Test
	public void Multiplication() {
		MathProblems test = new MathProblems();
		Assert.assertEquals("Expected value: 1", 1, test.multiplication(1, 1));
	}
	

}
