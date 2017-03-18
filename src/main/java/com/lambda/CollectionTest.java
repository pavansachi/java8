package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		List<String> engines = Arrays.asList("google", "yahoo", "bing");
		
		Collections.sort(engines, (a, b) -> {
			return a.compareTo(b);
		} );
		
		System.out.format("Search engines asc: %s\n", engines);
		
		Collections.sort(engines, (a, b) -> {
			return b.compareTo(a);
		} );
		
		System.out.format("Search engines desc: %s\n", engines);
		
	}

}
