package edu.atria.Oops.Collection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display{
	
	static void show(String s) {
	System.out.println("*******"+s+"***********");
}
}


public class UsingFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Consumer<String> consumer = Display::show;
		consumer.accept("Amit");
		
		Supplier<String> supplier =() ->  "Hello from supplier!";
		consumer.accept(supplier.get());
		
		//positive/negative test num
		Predicate<Integer> predicate = num->num>0;
		System.out.println(predicate.test(25));
		System.out.println(predicate.test(-25));
		
		//max test
		BiFunction<Integer ,Integer ,Integer> maxfunction = (x,y)->x>y?x:y;
		System.out.println(maxfunction.apply(25,14));
		
		BiFunction<String,Integer,String> printFunction = (name,num)->name+num;
		System.out.println(printFunction.apply("Good morning ", 3));
	}

}
