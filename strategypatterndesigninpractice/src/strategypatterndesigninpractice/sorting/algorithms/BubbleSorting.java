package strategypatterndesigninpractice.sorting.algorithms;

import java.util.List;

public class BubbleSorting <T extends Number> implements Sorting<T> {

	@Override
	public List<T> sort(List<T> source) {
		
		T temp;
	    for (int i = 1; i < source.size(); i++) {
	        for(int j = 0; j < source.size() - i; j++) {
	            if (source.get(j).doubleValue() > source.get(j+1).doubleValue()) {
	                temp = source.get(j);
	                source.set(j, source.get(j+1));
	                source.set(j+1, temp);
	            }
	        }
	    }
		return source;
	}
	
}
