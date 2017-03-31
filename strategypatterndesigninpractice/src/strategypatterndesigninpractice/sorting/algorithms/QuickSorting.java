package strategypatterndesigninpractice.sorting.algorithms;

import java.util.List;

public class QuickSorting <T extends Number> implements Sorting<T> {

	private void quickSort(List<T> source, int start, int end) {
        
		int i = start;
        int k = end;

        if (end - start >= 1) {
            double pivot = source.get(start).doubleValue();
            while (k > i) {
                while (source.get(i).doubleValue() <= pivot && i <= end && k > i) { i++; }                                    // element greater than the pivot
                while (source.get(k).doubleValue() > pivot && k >= start && k >= i) { k--; }                                        // element not greater than the pivot
                if (k > i) {
                	swap(source, i, k);
                }
            }
            swap(source, start, k);
            quickSort(source, start, k - 1);
            quickSort(source, k + 1, end);
        }
        else { return; }
	}
	
	private void swap(List<T> source, int index1, int index2) 
	{
		T temp = source.get(index1);
		source.set(index1, source.get(index2));
		source.set(index2, temp);
	}

	@Override
	public List<T> sort(List<T> source) {
		quickSort(source, 0, source.size() - 1);
		return source;
	}
	
}
