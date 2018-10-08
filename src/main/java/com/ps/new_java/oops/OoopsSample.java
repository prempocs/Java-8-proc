package com.ps.new_java.oops;

public class OoopsSample {

	public static void main(String[] args) {
		//System.out.println("KRIS");
		//System.out.println("ISHI");
		FunctionalInterfaceSample.staticMethod();
		SampleInterface.staticMethod();
		FunctionalInterfaceSample fis = new FunctionalInterfaceSample() {
			@Override
			public void onlyOneFunctionalMethod() {
				System.out.println(this.getClass().getSimpleName()+": Instance method executed!!!!");
			}
			
		};
		fis.defaultMethod();
		fis.onlyOneFunctionalMethod();
		//Java 8 Functional object instanciate
		fis = ()->System.out.println("Instance method executed!!!!"); 
		fis.defaultMethod();
		fis.onlyOneFunctionalMethod();
		
		SampleInterface si = new SampleInterface() {
			public void simpleMethod() {
				System.out.println("Simple Method called!!!!");
			}
			public void abstaractMethod() {
				System.out.println("Abstaract method called!!!!");
			}
			public void onlyOneFunctionalMethod() {
				System.out.println("OnlyOneFunctionalMethod method called from instance!!!!");
				
			}
		};
		//si.abstaractMethod();
		si.defaultMethod();
		//si.simpleMethod();
		si.onlyOneFunctionalMethod();
		//si = ()->System.out.println(/*this.getClass().getSimpleName()+*/":Instance method executed!!!!"); //this keyword will not work.
		si.defaultMethod();
		si.onlyOneFunctionalMethod();
		
		//si = ()-> {si.defaultMethod();};//default method can't call in lambda expression 
		si.defaultMethod();
		si.onlyOneFunctionalMethod();
		//void v= si::onlyOneFunctionalMethod;
	}

}
