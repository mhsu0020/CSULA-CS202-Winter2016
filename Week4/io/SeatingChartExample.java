package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 1. Save seating chart to file
 *
 * 2. Read seating chart from file
 *
 */
public class SeatingChartExample {

	public static void writeSeatingChartToFile(String[][] seatingChart, String filename) {
		Charset charset = Charset.forName("UTF-8");
		Path path = Paths.get(filename);
		// This opens or creates an existing file
		try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
			for (int i = 0; i < seatingChart.length; i++) {
				String row = "";
				for (int j = 0; j < seatingChart[i].length; j++) {
					row += seatingChart[i][j] + ",";
				}
				writer.write(row);
				writer.newLine();
			}

		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

	}

	public static String[][] readSeatingChartFromFile(String fileName) {
		Charset charset = Charset.forName("US-ASCII");
		List<String> allLinesInFile = new ArrayList<String>();
		Path path = Paths.get(fileName);
		try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
			allLinesInFile = Files.readAllLines(path, charset);
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

		String[][] seatingChart = new String[2][2];
		for (int i = 0; i < allLinesInFile.size(); i++) {
			seatingChart[i] = allLinesInFile.get(i).split(",");
		}

		return seatingChart;
	}

	public static void main(String[] args) {


		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<String>();

		int numberOfDuplicates = 0;

		for (int i = 0; i < list1.size(); i++) {
			String list1String = list1.get(i);
			for (int j = 0; j < list2.size(); j++) {
				String list2String = list2.get(j);
				if(list1String.equals(list2String)){
					System.out.println("duplicate");
					numberOfDuplicates++;
					break;
				}
			}

		}

		String[][] seatingChart = new String[2][2];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first row: ");
		seatingChart[0] = scanner.nextLine().split(",");
		System.out.println("Enter second row: ");
		seatingChart[1] = scanner.nextLine().split(",");
		writeSeatingChartToFile(seatingChart, "savedSeatingchart.txt");
		String[][] savedSeatingChart = readSeatingChartFromFile("savedSeatingchart.txt");
		for (int i = 0; i < savedSeatingChart.length; i++) {
			for (int j = 0; j < savedSeatingChart.length; j++) {
				System.out.print(savedSeatingChart[i][j]+" ");
			}
			System.out.println();
		}

	}

}
