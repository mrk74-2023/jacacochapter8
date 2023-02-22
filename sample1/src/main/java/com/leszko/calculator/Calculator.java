package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
        final static int UMNUMBER = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
