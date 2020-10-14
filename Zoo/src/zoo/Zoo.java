package zoo;

import java.util.Iterator;
import java.util.Vector;

public class Zoo {
	private Vector<Animal> animals;

	public Zoo() {
		this.animals = new Vector<Animal>();
	}

	public boolean addAnimal(Animal animal) {
		if (!this.animals.contains(animal)) {
			this.animals.add(animal);
			return true;
		}
		return false;
	}

	public Animal isTwoSame() {
		Iterator<Animal> itr = animals.iterator();
		while (itr.hasNext()) {
			Animal animal1 = itr.next();
			Iterator<Animal> secondItr = animals.iterator();
			secondItr.next();
			int counter = 0;
			while (secondItr.hasNext()) {
				Animal animal2 = secondItr.next();
				if (animal1.equals(animal2)) {
					counter++;
				}
			}
			if (counter > 1) {
				return animal1;
			}
		}
		return null;
	}
}
