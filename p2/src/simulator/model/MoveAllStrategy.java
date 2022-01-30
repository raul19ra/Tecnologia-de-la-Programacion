package simulator.model;


import java.util.ArrayList;
import java.util.List;

public class MoveAllStrategy implements DequeuingStrategy {

	@Override
	public List<Vehicle> dequeue(List<Vehicle> q) {
		List<Vehicle> aux = new ArrayList<>();//null;
		for(Vehicle i: q) {
			aux.add(i);
		}
		return aux;
	}
}
