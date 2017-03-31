package strategypatterndesigninpractice.main;

import java.util.ArrayList;
import java.util.List;

import strategypatterndesigninpractice.sorting.algorithms.BubbleSorting;
import strategypatterndesigninpractice.sorting.algorithms.QuickSorting;
import strategypatterndesigninpractice.sorting.algorithms.SortingSelector;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		List<Integer> source1 = new ArrayList<Integer>();
		source1.add(2);
		source1.add(5);
		source1.add(3);
		source1.add(9);
		source1.add(1);
		
		source1 = SortingSelector.sort(source1, new BubbleSorting<Integer>());
		System.out.println(source1);
		
		List<Double> source2 = new ArrayList<Double>();
		source2.add(22.1);
		source2.add(5.4);
		source2.add(3.0);
		source2.add(22.56);
		source2.add(1.5);
		
		source2 = SortingSelector.sort(source2, new QuickSorting<Double>());
		System.out.println(source2);
	}

}
