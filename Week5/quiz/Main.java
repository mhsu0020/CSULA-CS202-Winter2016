package quiz;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

	public static void writeAnimalsToFile(ArrayList<Animal> animals, String fileName) {
		Path path = Paths.get(fileName);
		Charset charset = Charset.forName("US-ASCII");
		//This opens or creates an existing file
		try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
			for(Animal animal : animals){
				writer.write(animal.toString());
				writer.newLine();
			}


		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}


	}

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<>();
		Animal animalOne = new Animal();
		animalOne.name = "mike";
		animalOne.type = "human";
		animals.add(animalOne);

		Animal animalTwo = new Animal();
		animalTwo.name = "mike";
		animalTwo.type = "human";
		animals.add(animalTwo);

		Main.writeAnimalsToFile(animals, "quizAnimals.txt");


	}

}
