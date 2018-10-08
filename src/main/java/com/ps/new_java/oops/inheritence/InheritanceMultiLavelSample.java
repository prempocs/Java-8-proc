package com.ps.new_java.oops.inheritence;

abstract class AbstaractClass implements InterfaceOne {
	@Override
	public void interfaceOneMethodOne() {
		System.out.println("AbstaractClass.interfaceOneMethodOne called!!!!");

	}
}

class MultiLavelInheritence extends AbstaractClass {

	@Override
	public void interfaceOneMethodOne() {
		System.out.println("InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!");

	}

}

public class InheritanceMultiLavelSample extends MultiLavelInheritence {
	@Override
	public void interfaceOneMethodOne() {
		System.out.println("InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!");

	}

	public static void main(String[] args) {
		InterfaceOne io = new InheritanceMultiLavelSample();
		io.interfaceOneMethodOne();// InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!

		AbstaractClass ac = (AbstaractClass) io;
		ac.interfaceOneMethodOne();// InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!

		MultiLavelInheritence mli = (MultiLavelInheritence) io;
		mli.interfaceOneMethodOne();// InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!

		InheritanceMultiLavelSample mlis = (InheritanceMultiLavelSample) io;
		mlis.interfaceOneMethodOne();// InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!

		io = new MultiLavelInheritence();
		io.interfaceOneMethodOne();// InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!

		ac = (AbstaractClass) io;
		ac.interfaceOneMethodOne();// InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!

		mli = (MultiLavelInheritence) io;
		mli.interfaceOneMethodOne();// InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!

		//mlis = (InheritanceMultiLavelSample) io;
		//mlis.interfaceOneMethodOne();// InheritanceMultiLavelSample.interfaceOneMethodOne called!!!!

	}
}
