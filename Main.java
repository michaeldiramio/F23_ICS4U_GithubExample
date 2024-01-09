import java.util.ArrayList;

public class Main {


	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();

		animals.add(new Dog());
		animals.add(new Chicken());
		animals.add(new Duck());
		animals.add(new Cow());
  animals.add(new Owl());
  animals.add(new Cat());

		/*for(int i = 0; i < animals.size(); i++) {
			animals.get(i).makeNoise();
		}*/

		// a "for each" loop
		for(Animal a : animals) {
			a.makeNoise();
		}

	}

}