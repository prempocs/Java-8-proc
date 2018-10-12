package com.ps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class ObjectCreationSample implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7203973974080940720L;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		ObjectCreationSample ocs = new ObjectCreationSample();

		System.out.println("Thrugh new:-"+ocs);
		/**
		 * 2) Using New Instance : If we know the name of the class & if it has a public
		 * default constructor we can create an object –Class.forName. We can use it to
		 * create the Object of a Class. Class.forName actually loads the Class in Java
		 * but doesn’t create any Object. To Create an Object of the Class you have to
		 * use the new Instance Method of the Class.
		 */
		try {
			Class cls = Class.forName("com.ps.ObjectCreationSample");
			ocs = (ObjectCreationSample) cls.newInstance();
			System.out.println("Thrugh Class.forName:-"+ocs);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		/**
		 * 3) Using clone() method: Whenever clone() is called on any object, the JVM
		 * actually creates a new object and copies all content of the previous object
		 * into it. Creating an object using the clone method does not invoke any
		 * constructor. To use clone() method on an object we need to implement
		 * Cloneable and define the clone() method in it.
		 */
		try {
			ocs = (ObjectCreationSample) ocs.clone();
			System.out.println("Thrugh Clone:-"+ocs);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		/**
		 * 4) Using deserialization : Whenever we serialize and then deserialize an
		 * object, JVM creates a separate object. In deserialization, JVM doesn’t use
		 * any constructor to create the object. To deserialize an object we need to
		 * implement the Serializable interface in the class.
		 */
		try {
			FileOutputStream f = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(f);
			oos.writeObject(ocs);
			oos.close();
			f.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream f = new FileInputStream("file.txt");
			ObjectInputStream oos = new ObjectInputStream(f);
			ocs = (ObjectCreationSample) oos.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("SerializationDeserialization:-"+ocs);
		/**
		 * 5) Using newInstance() method of Constructor class : This is similar to the
		 * newInstance() method of a class. There is one newInstance() method in the
		 * java.lang.reflect.Constructor class which we can use to create objects. It
		 * can also call parameterized constructor, and private constructor by using
		 * this newInstance() method.
		 * 
		 * Both newInstance() methods are known as reflective ways to create objects. In
		 * fact newInstance() method of Class internally uses newInstance() method of
		 * Constructor class.
		 */
		try {
			Constructor<ObjectCreationSample> constructor = ObjectCreationSample.class.getDeclaredConstructor();
			ocs = constructor.newInstance();

			System.out.println("Thrugh newInstance():-"+ocs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
