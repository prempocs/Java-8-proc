package com.ps.new_java.oops.inheritence;

interface Hybrid {

}

interface HybridNextOne extends Hybrid {

}

interface HybridNextTwo extends Hybrid {

}

public class InheritanceHybridSample implements HybridNextOne, HybridNextTwo {

	public static void main(String[] args) {
		InheritanceHybridSample his = new InheritanceHybridSample();
		HybridNextTwo hnt = his;
		HybridNextOne hno = his;
		Hybrid h = his;
		h = hnt;
		h = hno;

	}

}
