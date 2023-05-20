package baiKienTra;

import java.util.List;

public interface IManager {
	void add (Fruit fruit);
	void delete (Fruit fruit);
	void updateFruit(Fruit fruit, String newName, double newWeight, double newPrice);
	List<Fruit> getAll ();
	void sort ();
	
}
