package pack;

import java.util.Scanner;

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
					CarryBear careBear = inputCarryBear();
					if (zoo.addAnimal(careBear)) {
						System.out.println("The animal has been added!");
					} else {
						System.out.println("The animal has not been added!");
					}
					break;
				case 4:
					System.out.println("CHECKING IF TWO ARE THE SAME: ");
					if (zoo.resembleAnimal() != null) {
						System.out.println(zoo.resembleAnimal());
					} else {
						System.out.println("Not found!");
					}
					break;
				case 5:
					System.out.println("PRINTING SIGNS: ");
					for (Sign sign : Sign.values()) {
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
			int flameDistance = scanner.nextInt();
			System.out.println("Enter the number of heads of the Dragon: ");
			int numOfHeads = scanner.nextInt();
			return new Dragon(name, flameDistance, numOfHeads);
		}
		public static CarryBear inputCarryBear() {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the name of the Care Bear: ");
			String name = scanner.next();
			System.out.println(
					"Enter the sign of the Care Bear: \n" + "1 - Heart\n" + "2 - Tiltan\n" + "3 - Sun\n" + "4 - rainbow\n" + "5 - Moon\n");
			int sign = scanner.nextInt();
			switch (sign) {
			case 1:
				return new CarryBear(name, Sign.heart);
			case 2:
				return new CarryBear(name, Sign.tiltan);
			case 3:
				return new CarryBear(name, Sign.sun);
			case 4:
				return new CarryBear(name, Sign.rainbow);
			default:
				return new CarryBear(name, Sign.moon);
			}
		}

	}