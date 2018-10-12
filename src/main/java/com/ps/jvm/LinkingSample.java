package com.ps.jvm;
/**
 * 
 * @author PremRohan
 * Linking : Performs verification, preparation, and (optionally) resolution.
 * Verification : 
 * 		It ensures the correctness of .class file i.e. 
 * 		it check whether this file is properly formatted and generated by valid compiler or not. 
 * 		If verification fails, we get run-time exception java.lang.VerifyError.
 * Preparation : 
 * 		JVM allocates memory for class variables and initializing the memory to default values.
 * Resolution : 
 * 		It is the process of replacing symbolic references from the type with direct references. 
 * 		It is done by searching into method area to locate the referenced entity.
 * Initialization : 
 * 		In this phase, all static variables are assigned with their values defined in the code and static block(if any). 
 * 		This is executed from top to bottom in a class and from parent to child in class hierarchy.
 * In general, there are three class loaders :
 * 	Bootstrap class loader : 
 * 		Every JVM implementation must have a bootstrap class loader, capable of loading trusted classes. 
 * 		It loads core java API classes present in JAVA_HOME/jre/lib directory. 
 * 		This path is popularly known as bootstrap path. 
 * 		It is implemented in native languages like C, C++.
 * Extension class loader : 
 * 		It is child of bootstrap class loader. 
 * 		It loads the classes present in the extensions directories JAVA_HOME/jre/lib/ext(Extension path) or any other directory specified by the java.ext.dirs system property. 
 * 		It is implemented in java by the sun.misc.Launcher$ExtClassLoader class.
 * System/Application class loader : 
 * 		It is child of extension class loader. 
 * 		It is responsible to load classes from application class path. 
 * 		It internally uses Environment Variable which mapped to java.class.path. 
 * 		It is also implemented in Java by the sun.misc.Launcher$AppClassLoader class.
 * 
 */
//Java code to demonstrate Class Loader subsystem 
public class LinkingSample {
	public static void main(String[] args) {
		// String class is loaded by bootstrap loader, and
		// bootstrap loader is not Java object, hence null
		System.out.println(String.class.getClassLoader());

		// Test class is loaded by Application loader
		System.out.println(LinkingSample.class.getClassLoader());
	}
}