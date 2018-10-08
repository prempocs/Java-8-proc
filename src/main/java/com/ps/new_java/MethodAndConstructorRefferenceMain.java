package com.ps.new_java;
class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}



interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}

public class MethodAndConstructorRefferenceMain {

	public static void main(String[] args) {
		//Method reference
		Converter<String, String> converter = new Something()::startsWith;
		String converted = converter.convert("Java");
		System.out.println(converted);    // "J"
		
		
		//constructor reference
		//We create a reference to the Person constructor via Person::new. 
		//The Java compiler automatically chooses the right constructor by matching the signature of PersonFactory.create.
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker");

	}

}
