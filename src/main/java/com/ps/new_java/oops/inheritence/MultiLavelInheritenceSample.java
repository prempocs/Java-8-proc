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
		System.out.println("MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!");

	}

}

public class MultiLavelInheritenceSample extends MultiLavelInheritence {
	@Override
	public void interfaceOneMethodOne() {
		System.out.println("MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!");

	}

	public static void main(String[] args) {
		InterfaceOne io = new MultiLavelInheritenceSample();
		io.interfaceOneMethodOne();// MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!

		AbstaractClass ac = (AbstaractClass) io;
		ac.interfaceOneMethodOne();// MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!

		MultiLavelInheritence mli = (MultiLavelInheritence) io;
		mli.interfaceOneMethodOne();// MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!

		MultiLavelInheritenceSample mlis = (MultiLavelInheritenceSample) io;
		mlis.interfaceOneMethodOne();// MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!

		io = new MultiLavelInheritence();
		io.interfaceOneMethodOne();// MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!

		ac = (AbstaractClass) io;
		ac.interfaceOneMethodOne();// MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!

		mli = (MultiLavelInheritence) io;
		mli.interfaceOneMethodOne();// MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!

		//mlis = (MultiLavelInheritenceSample) io;
		//mlis.interfaceOneMethodOne();// MultiLavelInheritenceSample.interfaceOneMethodOne called!!!!

	}
}
