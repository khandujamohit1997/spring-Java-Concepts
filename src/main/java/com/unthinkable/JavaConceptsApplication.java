package com.unthinkable;

import com.unthinkable.core.Java.date.DateOperations;
import com.unthinkable.core.Java.functional.stream.StreamOperations;
import com.unthinkable.core.Java.operators.Operators;
import com.unthinkable.core.Java.singleton.OneInstance;
import com.unthinkable.core.Java.string.StringOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Method;

@SpringBootApplication
public class JavaConceptsApplication implements CommandLineRunner {

	@Autowired
	Operators operators;

	@Autowired
	StringOperations stringOperations;

	public static void main(String[] args) {
		SpringApplication.run(JavaConceptsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		long start = System.currentTimeMillis();
		//Operators
		operators.operatorsFunctions();

		//String
		stringOperations.operateOnString();
		long end = System.currentTimeMillis();

		System.out.println(end - start);

		Class c = Class.forName("com.unthinkable.core.Java.string.StringOperations");
		StringOperations stringOperations1 = (StringOperations) c.newInstance();

		Method method = c.getDeclaredMethod("reflectionDemo", null);
		method.setAccessible(true);
		method.invoke(stringOperations1, null);

		//Singleton
		/*OneInstance ref1 = new OneInstance();*/
		OneInstance ref1 = OneInstance.getInstance();
		ref1.show();

		//StreamAPI
		StreamOperations.Operations();

		//DateAPI
		DateOperations.operations();
	}
}
