package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		//Selection Sort
		Sort algo = new Sort();

		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);

		//Insertion Sort

		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//By following above, Continue for rest of the Sorting Algorithm.....

		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Insertion_sort", "SortingNumbers");
		List<String> numbers1 = connectToSqlDB.readDataBase("Insertion_sort", "SortingNumbers");
		printValue(numbers);
		int n1 = num.length;
		randomize (num, n1);

       //Bubble sort

		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_Sort", "SortingNumbers");
		List<String> numbers2 = connectToSqlDB.readDataBase("bubble_Sort", "SortingNumbers");
		printValue(numbers);
		int n2 = num.length;
		randomize (num, n2);

		//merge sort

		//algo.mergeSort(num);
		long mergeSort = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		List<String> numbers3 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		printValue(numbers);
		int n3 = num.length;
		randomize (num, n3);

		//quick sort

		algo.quickSort(num);
		long quickSort = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		List<String> numbers4 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		printValue(numbers);
		int n4 = num.length;
		randomize (num, n4);

		//heap sort
		algo.heapSort(num);
		long heapSort = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		List<String> numbers5 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		printValue(numbers);
		int n5 = num.length;
		randomize (num, n5);

		//bucket sort

		/*algo.bucketSort(num);
		long bucketSort = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		List<String> numbers6 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		printValue(numbers);
		int n6 = num.length;
		randomize (num, n6);*/

		//shell sort
		algo.shellSort(num);
		long shellSort = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		List<String> numbers7 = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		printValue(numbers);
		int n7 = num.length;
		randomize (num, n7);




		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
