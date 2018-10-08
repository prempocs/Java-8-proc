package com.ps.new_java.oops.inheritence;

public class MultipleInheritenceExample implements InterfaceOne,InterfaceTwo {

	public static void main(String[] args) {
		InterfaceOne io = new MultipleInheritenceExample();
		
		io.interfaceOneMethodOne();
		((InterfaceTwo)io).interfaceTwoMethodOne();
		((MultipleInheritenceExample)io).interfaceOneMethodOne();
		((MultipleInheritenceExample)io).interfaceTwoMethodOne();

	}

	@Override
	public void interfaceTwoMethodOne() {
		System.out.println("MultipleInheritenceExample.interfaceTwoMethodOne called!!!!");
		
	}

	@Override
	public void interfaceOneMethodOne() {
		System.out.println("MultipleInheritenceExample.interfaceOneMethodOne called!!!!");
		
	}

}
