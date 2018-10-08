package com.ps.new_java.oops.inheritence;

public class InheritanceMultipleExample implements InterfaceOne,InterfaceTwo {

	public static void main(String[] args) {
		InterfaceOne io = new InheritanceMultipleExample();
		
		io.interfaceOneMethodOne();
		((InterfaceTwo)io).interfaceTwoMethodOne();
		((InheritanceMultipleExample)io).interfaceOneMethodOne();
		((InheritanceMultipleExample)io).interfaceTwoMethodOne();

	}

	@Override
	public void interfaceTwoMethodOne() {
		System.out.println("InheritanceMultipleExample.interfaceTwoMethodOne called!!!!");
		
	}

	@Override
	public void interfaceOneMethodOne() {
		System.out.println("InheritanceMultipleExample.interfaceOneMethodOne called!!!!");
		
	}

}
