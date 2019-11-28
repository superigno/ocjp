package com.superigno.generics;

import java.util.ArrayList;
import java.util.List;

public class App {

	public void checkAnimals(List<Animal> animals) {
		for (Animal a : animals) {
			a.checkup();
		}
		
		//works
		animals.add(new Dog());
		animals.add(new Cat());
	}
	
	public void checkAnimals2(List<? extends Animal> animals) {
		for (Animal a : animals) {
			a.checkup();
		}
		
		//does not work
		//animals.add(new Dog());
		//animals.add(new Cat());
	}
	
	public void checkAnimals3(List<? super Animal> animals) {
		//does not work
		//for (Animal a : animals) {
		//	a.checkup();
		//}
		
		//works
		animals.add(new Dog());
		animals.add(new Cat());
	}
	
	public void checkAnimals4(List<?> animals) {
		//does not work
		//for (Animal a : animals) {
		//	a.checkup();
		//}
		
		//does not work
		//animals.add(new Dog());
		//animals.add(new Cat());
	}

	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		cats.add(new Cat());
		
		App doc = new App();
		
		//works only when using arrays instead of ArrayLists
		//doc.checkAnimals(dogs);
		//doc.checkAnimals(cats);
		
		//works
		doc.checkAnimals2(dogs);
		doc.checkAnimals2(cats);
		
		//works for types of Animal or higher
		doc.checkAnimals3(new ArrayList<Animal>());
		doc.checkAnimals3(new ArrayList<Object>());
		
		//works for any types!
		doc.checkAnimals4(dogs);
		doc.checkAnimals4(cats);
		doc.checkAnimals4(new ArrayList<Animal>());
		doc.checkAnimals4(new ArrayList<Object>());
	}

}
