package com.ps.new_java;

public class AccessingFieldsAndStaticVariablesMain {
	 static int outerStaticNum;
	    int outerNum;
	    //In constrast to local variables we have both read and write access to instance fields and static variables from within lambda expressions. This behaviour is well known from anonymous objects.
	    void testScopes() {
	        Converter<Integer, String> stringConverter1 = (from) -> {
	            outerNum = 23;
	            return String.valueOf(from);
	        };
	        System.out.println(stringConverter1.convert(71));
	        Converter<Integer, String> stringConverter2 = (from) -> {
	            outerStaticNum = 72; // can access static variable
	            return String.valueOf(from);
	        };
	        outerStaticNum=43;
	        System.out.println(stringConverter2.convert(71));
	    }

	public static void main(String[] args) {
		AccessingFieldsAndStaticVariablesMain a = new AccessingFieldsAndStaticVariablesMain();
		a.testScopes();

	}

}
