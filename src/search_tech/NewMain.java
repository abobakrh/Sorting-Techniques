package search_tech;

public class NewMain {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		BubbleHeapSortImplementation BubbleHeapSortImp = new BubbleHeapSortImplementation();
		HeapSortImplementation HeapSortImp = new HeapSortImplementation();
		QuickSortImplementation QuickSortImp = new QuickSortImplementation();
		QuickSortImplementationPivotAsFirst QuickSortImpFirst = new QuickSortImplementationPivotAsFirst();
		InsertionSortImplementation InsertionSortImp = new InsertionSortImplementation();
		MergeSort MergeSortImp = new MergeSort();
		Selection SelectionImp = new Selection();

		System.out.println("=======================================");
		System.out.println("enter your choice ");
		System.out.println("1- show exuation time for each sort ");
		System.out.println("2- show  each sort with limited elemts of array  ");
		System.out.println("Note  : first choice , array will be filled automatically ");
		int choice;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		choice = scan.nextInt();
		if (choice == 2) {
			System.out.println("enter number of elements");
			int NumberOfElements = scan.nextInt();

			int[] limitedarray = new int[NumberOfElements];
			System.out.println("enter elements");
			for (int i = 0; i < limitedarray.length; i++)

			{

				limitedarray[i] = scan.nextInt();

			}
			int[] temp1 = limitedarray;
			int[] temp2 = limitedarray;
			int[] temp3 = limitedarray;
			int[] temp4 = limitedarray;
			int[] temp5 = limitedarray;
			int[] temp6 = limitedarray;
			int[] temp7 = limitedarray;

			BubbleHeapSortImp.BubbleSort(temp1);

			QuickSortImp.quick(temp2, 0, temp2.length - 1);

			QuickSortImpFirst.quick(temp3, 0, temp3.length - 1);

			InsertionSortImp.InsertionSort(temp4);

			HeapSortImp.HeapSort(temp5);
			int saveArrayFromMergeSort[];
			saveArrayFromMergeSort = MergeSortImp.Divide(temp6);
			int saveArrayFromSelectionSort[] = SelectionImp.SelectionSort(temp7);

			System.out.println("Heap sort:");

			PrintArray(temp1);
			System.out.println("QuickSort with last pivot");
			PrintArray(temp2);
			System.out.println("QuickSort with First pivot");

			PrintArray(temp3);
			System.out.println("Insertion Sort");

			PrintArray(temp4);
			System.out.println("Heap  Sort");

			PrintArray(temp5);
			System.out.println("Merge sort");
			PrintArray(saveArrayFromMergeSort);
			PrintArray(temp5);
			System.out.println("Selection sort");
			PrintArray(saveArrayFromSelectionSort);

		}
		if (choice == 1) {
			
			long[] TimeInterval = new long[7];
			FillArray(1000);

			int[] temp1 =FillArray(1000);
			int[] temp2 = FillArray(1000);
			int[] temp3 = FillArray(1000);
			int[] temp4 =FillArray(1000);
			int[] temp5 =FillArray(1000);
			int[] temp6 = FillArray(1000);
			TimeInterval[0] = System.nanoTime();
			
			BubbleHeapSortImp.BubbleSort(temp1);
			TimeInterval[1] = System.nanoTime();
			int saveArrayFromMergeSort[] = MergeSortImp.Divide(temp2);
			TimeInterval[2] = System.nanoTime();
			QuickSortImpFirst.quick(temp3, 0, temp3.length - 1);
			TimeInterval[3] = System.nanoTime();

			InsertionSortImp.InsertionSort(temp4);
			TimeInterval[4] = System.nanoTime();

			HeapSortImp.HeapSort(temp5);

			TimeInterval[5] = System.nanoTime();

			int saveArrayFromSelectionSort[] = SelectionImp.SelectionSort(temp6);
			TimeInterval[6] = System.nanoTime();

			SpecialShowArrayForTimeExu(TimeInterval);

		}

	}

	public static void printarray(long arr[]) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}

	public static int[]  FillArray(int length) {
		int[] randomnumber_array = new int[length];
		for (int i = 0; i < length; i++) {
			randomnumber_array [i] = (int) (Math.random() * 50);
		}
			return randomnumber_array  ;
	}

	public static void SpecialShowArrayForTimeExu(long[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1] - arr[i];

		}
		System.out.println();
		System.out.println("Bubble sort: " + arr[0] / 1000000.0 + " milli second");
		System.out.println("merge sort: " + arr[1] / 1000000.0 + " milli second");
		System.out.println("quick sort: " + arr[2] / 1000000.0 + " milli second");
		System.out.println("insertion sort: " + arr[3] / 1000000.0 + " milli second");
		System.out.println("heap sort: " + arr[4] / 1000000.0 + " milli second");
		System.out.println("selection sort: " + arr[5] / 1000000.0 + " milli second");

	}

	public static void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
