package edu.atria.Oops.Collection;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stream<Integer>	str=Stream.of(10,32,40,50);
   /* Stream<Integer> strone=str.map(num->num+2);
	strone.forEach(System.out::println);*/
	
	//the above two line in one single code
	
	str.map(num->num+2).forEach(System.out::println);
	
	//integer array to get a stream of data    ,  Stream is a method from array class
	
	Integer[] values = new Integer[] {11,12,12,13,15};
	Arrays.stream(values).map(num->num*num).forEach(System.out::println);
	//for limit only for 2 elements
	Arrays.stream(values).map(num->num*num).limit(2).forEach(System.out::println);
	//it gives only the distinct elments
	Arrays.stream(values).map(num->num*num).limit(2).distinct().forEach(System.out::println);
	
	
	}

}
