package com.ps.new_java.oops;
@FunctionalInterface
public interface FunctionalInterfaceSample {

	default public void defaultMethod() { System.out.println(this.getClass().getSimpleName()+": Default method executed!!!!");}
	static public void staticMethod() { System.out.println(FunctionalInterfaceSample.class.getSimpleName()+": Static method executed!!!!");}
	public void onlyOneFunctionalMethod();
}
