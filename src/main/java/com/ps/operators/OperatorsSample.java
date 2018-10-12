package com.ps.operators;

import java.util.Scanner;

public class OperatorsSample {

	public static void main(String[] args) {
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
		String x = "Thank", y = "You";

		// + and - operator
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));

		// + operator if used with strings
		// concatenates the given strings.
		System.out.println("x + y = " + x + y);

		// * and / operator
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));

		// modulo operator gives remainder
		// on dividing first operand with second
		System.out.println("a % b = " + (a % b));

		// if denominator is 0 in division
		// then Arithmetic exception is thrown.
		// uncommenting below line would throw
		// an exception
		// System.out.println(a/c);

		System.out.println("\n\n\n");

		boolean condition = true;

		// pre-increment operator
		// a = a+1 and then c = a;
		c = ++a;
		System.out.println("Value of c (++a) = " + c);

		// post increment operator
		// c=b then b=b+1
		c = b++;
		System.out.println("Value of c (b++) = " + c);

		// pre-decrement operator
		// d=d-1 then c=d
		c = --d;
		System.out.println("Value of c (--d) = " + c);

		// post-decrement operator
		// c=e then e=e-1
		c = --e;
		System.out.println("Value of c (--e) = " + c);
		// Logical not operator
		System.out.println("Value of !condition =" + !condition);
		System.out.println("\n\n\n");
		// simple assignment operator
		c = b;
		System.out.println("Value of c = " + c);

		// This following statement would throw an exception
		// as value of right operand must be initialised
		// before assignment, and the program would not
		// compile.
		// c = d;

		// instead of below statements,shorthand
		// assignment operators can be used to
		// provide same functionality.
		a = a + 1;
		b = b - 1;
		e = e * 2;
		f = f / 2;
		System.out.println("a,b,e,f = " + a + "," + b + "," + e + "," + f);
		a = a - 1;
		b = b + 1;
		e = e / 2;
		f = f * 2;

		// shorthand assignment operator
		a += 1;
		b -= 1;
		e *= 2;
		f /= 2;
		System.out.println("a,b,e,f (using shorthand operators)= " + a + "," + b + "," + e + "," + f);
		System.out.println("\n\n\n");
		x = "Thank";
		y = "Thank";
		int ar[] = { 1, 2, 3 };
		int br[] = { 1, 2, 3 };
		condition = true;

		// various conditional operators
		System.out.println("a == b :" + (a == b));
		System.out.println("a < b :" + (a < b));
		System.out.println("a <= b :" + (a <= b));
		System.out.println("a > b :" + (a > b));
		System.out.println("a >= b :" + (a >= b));
		System.out.println("a != b :" + (a != b));

		// Arrays cannot be compared with
		// relational operators because objects
		// store references not the value
		System.out.println("x == y : " + (ar == br));

		System.out.println("condition==true :" + (condition == true));
		System.out.println("\n\n\n");
		x = "Sher";
		y = "Locked";

		Scanner s = new Scanner(System.in);
		System.out.print("Enter username:");
		String uuid = s.next();
		System.out.print("Enter password:");
		String upwd = s.next();

		// Check if user-name and password match or not.
		if ((uuid.equals(x) && upwd.equals(y)) || (uuid.equals(y) && upwd.equals(x))) {
			System.out.println("Welcome user.");
		} else {
			System.out.println("Wrong uid or password");
		}
		System.out.println("\n\n\n");
		// result holds max of three
		// numbers
		int result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		System.out.println("Max of three numbers = " + result);
		System.out.println("\n\n\n");
		a = 0x0005;
		b = -10;

		// left shift operator
		// 0000 0101<<2 =0001 0100(20)
		// similar to 5*(2^2)
		System.out.println("a<<2 = " + (a << 2));

		// right shift operator
		// 0000 0101 >> 2 =0000 0001(1)
		// similar to 5/(2^2)
		System.out.println("a>>2 = " + (a >> 2));

		// unsigned right shift operator
		System.out.println("b>>>2 = " + (b >>> 2));
		System.out.println("\n\n\n");

		Person obj1 = new Person();
		Person obj2 = new Boy();

		// As obj is of type person, it is not an
		// instance of Boy or interface
		System.out.println("obj1 instanceof Person: " + (obj1 instanceof Person));
		System.out.println("obj1 instanceof Boy: " + (obj1 instanceof Boy));
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));

		// Since obj2 is of type boy, whose parent class is
		// person and it implements the interface Myinterface
		// it is instance of all of these classes
		System.out.println("obj2 instanceof Person: " + (obj2 instanceof Person));
		System.out.println("obj2 instanceof Boy: " + (obj2 instanceof Boy));
		System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));

		System.out.println("\n\n\n");
		// hexadecimal representation
		a = 0x0005;
		b = 0x0007;

		// bitwise and
		// 0101 & 0111=0101 = 5
		System.out.println("a&b = " + (a & b));

		// bitwise or
		// 0101 | 0111=0111 = 7
		System.out.println("a|b = " + (a | b));

		// bitwise xor
		// 0101 ^ 0111=0010 = 2
		System.out.println("a^b = " + (a ^ b));

		// bitwise and
		// ~0101=1010
		// will give 2's complement of 1010 = -6
		System.out.println("~a = " + ~a);

		// can also be combined with
		// assignment operator to provide shorthand
		// assignment
		// a=a&b
		a &= b;
		System.out.println("a= " + a);

		a = 20;
		b = 10;
		c = 0;
		d = 20;
		e = 40;
		f = 30;

		// precedence rules for arithmetic operators.
		// (* = / = %) > (+ = -)
		// prints a+(b/d)
		System.out.println("a+b/d = " + (a + b / d));

		// if same precendence then associative
		// rules are followed.
		// e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
		System.out.println("a+b*d-e/f = " + (a + b * d - e / f));

		System.out.println("\n\n\n");
		// a=b+++c is compiled as 
        // b++ +c 
        // a=b+c then b=b+1 
        a = b+++c; 
        System.out.println("Value of a(b+c),b(b+1),c = " + a + "," + b + "," + c); 
  
        // a=b+++++c is compiled as 
        // b++ ++ +c 
        // which gives error. 
        // a=b+++++c; 
        // System.out.println(b+++++c); 
         int xy = 5, yx = 8; 
        
        // concatenates x and y 
        // as first x is added to "concatenation (x+y) = " 
        // producing "concatenation (x+y) = 5" and then 8 is 
        // further concatenated. 
        System.out.println("Concatenation (x+y)= " + xy + yx); 
  
        // addition of x and y 
        System.out.println("Addition (x+y) = " + (xy + yx)); 
	}

}

class Person {

}

class Boy extends Person implements MyInterface {

}

interface MyInterface {

}