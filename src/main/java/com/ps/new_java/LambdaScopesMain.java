package com.ps.new_java;

public class LambdaScopesMain {

	public static void main(String[] args) {
		//We can read final local variables from the outer scope of lambda expressions:
		final int num = 1;
		Converter<Integer, String> stringConverter =
		        (from) -> String.valueOf(from + num);

		stringConverter.convert(2);     // 3
		//However num must be implicitly final for the code to compile. The following code does not compile: if try to assign again.
		int num1 = 1;
		Converter<Integer, String> stringConverter1 =
		        (from) -> String.valueOf(from + num1);
		//num1 =33; Not assign again ,
		stringConverter1.convert(2);    
	}

}
