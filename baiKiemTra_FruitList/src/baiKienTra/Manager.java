package baiKienTra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Manager implements IManager  {
	List<Fruit> fruitList = new ArrayList<>();
	@Override
	public void add(Fruit fruit) {
		// TODO Auto-generated method stub
		fruitList.add(fruit);
	}

//	@Override
//	public void delete(Fruit fruit) {
//		// TODO Auto-generated method stub
//		 fruitList.remove(fruit);
//	}


	@Override
	public void updateFruit(Fruit fruit, String newName, double newWeight, double newPrice) {
		// TODO Auto-generated method stub
		 fruit.setName(newName);
		fruit.setWeight(newWeight);
		   fruit.setPrice(newPrice);
		    System.out.println("Fruit updated successfully!");
	}
	
	@Override
	public List<Fruit> getAll() {
		// TODO Auto-generated method stub
		return fruitList;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		Collections.sort(fruitList, (f1, f2) -> f1.getName().compareTo(f2.getName()));
    }

	public void removeFruit(Fruit fruitToRemove) {
		// TODO Auto-generated method stub
		fruitList.remove(fruitToRemove);
	}



	
	
	
}
	