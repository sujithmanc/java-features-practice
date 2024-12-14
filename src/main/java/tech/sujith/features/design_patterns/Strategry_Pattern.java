package tech.sujith.features.design_patterns;

public class Strategry_Pattern {
	public static void main(String[] args) {
		SortContext sortContext = new SortContext(new QuickSort());
		int[] arr = { 5, 6, 7, 6, 5, 6, 6, 9 };
		sortContext.performSort(arr);
	}
}

class SortContext {
	private SortStrategry sortStrategry;

	public SortContext(SortStrategry sortStrategry) {
		super();
		this.sortStrategry = sortStrategry;
	}

	public void setSortStrategry(SortStrategry sortStrategry) {
		this.sortStrategry = sortStrategry;
	}

	public void performSort(int[] arr) {
		this.sortStrategry.sort(arr);
	}
}

interface SortStrategry {
	public void sort(int[] arr);
}

class MergetSort implements SortStrategry {

	@Override
	public void sort(int[] arr) {
		System.out.println("Performing Merge Sort");
	}
}

class QuickSort implements SortStrategry {

	@Override
	public void sort(int[] arr) {
		System.out.println("Performing Quick Sort");
	}
}

class InsertionSort implements SortStrategry {

	@Override
	public void sort(int[] arr) {
		System.out.println("Performing Insertion Sort");
	}
}