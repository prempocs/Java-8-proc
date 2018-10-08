package com.ps.new_java.oops;

public interface SampleInterface  extends FunctionalInterfaceSample{
	default public void defaultMethod() { System.out.println(this.getClass().getSimpleName()+": Default method executed!!!!");}
	static public void staticMethod() { System.out.println(SampleInterface.class.getSimpleName()+": Static method executed!!!!");}
	 public void simpleMethod();
	 public void abstaractMethod();

}
