package main;

import java.awt.dnd.DragGestureEvent;
import java.time.ZonedDateTime;
import java.util.Scanner;

import zoo.CareBear;
import zoo.CareBearSign;
import zoo.Dinosaur;
import zoo.Dragon;
import zoo.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"ZOO MENU\n" + "Choose an operation:\n" + "1 - Add a Dinosaur\n" + "2 - Add a Dragon\n" + "3 - Add a Care Bear\n"
						+ "4 - Check if 2 animals are the same\n" + "5 - Print Care Bear Signs\n" + "-1 - Exit");
		int animalChoice = scanner.nextInt();
		while (animalChoice != -1) {
			switch (animalChoice) {
			case 1:
				System.out.println("ADDING A DINOSAUR: ");
				Dinosaur dinosaur = inputDinosaur();
				if (zoo.addAnimal(dinosaur)) {
					System.out.println("The animal has been added!");
				} else {
					System.out.println("The animal has not been added!");
				}
				break;
			case 2:
				System.out.println("ADDING A DRAGON: ");
				Dragon dragon = inputDragon();
				if (zoo.addAnimal(dragon)) {
					System.out.println("The animal has been added!");
				} else {
					System.out.println("The animal has not been added!");
				}
				break;
			case 3:
				System.out.println("ADDING A CARE BEAR: ");
				CareBear careBear = inputCareBear();
				if (zoo.addAnimal(careBear)) {
					System.out.println("The animal has been added!");
				} else {
					System.out.println("The animal has not been added!");
				}
				break;
			case 4:
				System.out.println("CHECKING IF TWO ARE THE SAME: ");
				if (zoo.isTwoSame() != null) {
					System.out.println(zoo.isTwoSame());
				} else {
					System.out.println("Not found!");
				}
				break;
			case 5:
				System.out.println("PRINTING SIGNS: ");
				for (CareBearSign sign : CareBearSign.values()) {
					System.out.println(sign);
				}
				break;
			default:
				break;
			}
			System.out.println(
					"Choose an operation:" + "1 - Add a Dinosaur\n" + "2 - Add a Dragon\n" + "3 - Add a Care Bear\n"
							+ "4 - Check if 2 animals are the same\n" + "5 - Print Care Bear Signs\n" + "-1 - Exit");
			animalChoice = scanner.nextInt();
		}
		System.out.println("EXITED ZOO OS");

	}

	public static Dinosaur inputDinosaur() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the Dinosaur: ");
		String name = scanner.next();
		System.out.println("Enter the height of the Dinosaur: ");
		int height = scanner.nextInt();
		return new Dinosaur(name, height);
	}

	public static Dragon inputDragon() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the Dragon: ");
		String name = scanner.next();
		System.out.println("Enter the flame distance of the Dragon: ");
		double flameDistance = scanner.nextDouble();
		System.out.println("Enter the number of heads of the Dragon: ");
		int numOfHeads = scanner.nextInt();
		return new Dragon(name, flameDistance, numOfHeads);
	}

	public static CareBear inputCareBear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the Care Bear: ");
		String name = scanner.next();
		System.out.println(
				"Enter the sign of the Care Bear: \n" + "1 - Heart\n" + "2 - Club\n" + "3 - Sun\n" + "4 - Rain");
		int sign = scanner.nextInt();
		switch (sign) {
		case 1:
			return new CareBear(name, CareBearSign.HEART);
		case 2:
			return new CareBear(name, CareBearSign.CLUB);
		case 3:
			return new CareBear(name, CareBearSign.SUN);
		case 4:
			return new CareBear(name, CareBearSign.RAIN);
		default:
			return new CareBear(name, CareBearSign.HEART);
		}
	}

}
