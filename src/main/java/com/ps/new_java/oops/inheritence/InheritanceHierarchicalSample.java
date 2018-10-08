package com.ps.new_java.oops.inheritence;

class HierarchicalInheritenceClassOne implements InterfaceOne{
	@Override
	public void interfaceOneMethodOne() {
		System.out.println("HierarchicalInheritenceClassOne.interfaceOneMethodOne called!!!");
		
	}
	
	
}

class HierarchicalInheritenceClassTwo implements InterfaceOne{

	@Override
	public void interfaceOneMethodOne() {
		System.out.println("HierarchicalInheritenceClassTwo.interfaceOneMethodOne called!!!");
		
	}
	
}

public class InheritanceHierarchicalSample {

	public static void main(String[] args) {
		InterfaceOne io = new HierarchicalInheritenceClassOne();
		io.interfaceOneMethodOne();
		io= new HierarchicalInheritenceClassTwo();
		io.interfaceOneMethodOne();

	}

}
