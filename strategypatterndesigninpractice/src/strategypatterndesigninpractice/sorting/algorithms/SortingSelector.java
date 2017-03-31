package strategypatterndesigninpractice.sorting.algorithms;

import java.util.List;

public class SortingSelector {

	public static <T extends Number> List<T> sort(List<T> source, Sorting<T> sorting) {
		return sorting.sort(source);
	}
	
}
