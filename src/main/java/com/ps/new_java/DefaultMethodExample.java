package com.ps.new_java;
@FunctionalInterface
interface DefaultMethodInterface{
	double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
public class DefaultMethodExample {

	public static void main(String[] args) {
		DefaultMethodInterface dmi = new DefaultMethodInterface() {
			@Override
			public double calculate(int a) {
				return sqrt(a *100);
			}
		};
		//DefaultMethodInterface defaultMethodInterface = (a) -> sqrt( a * 100);
		dmi.calculate(100);
		dmi.sqrt(40);
	}

}
