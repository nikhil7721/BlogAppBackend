package practice.p1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Statistics {
	public static void main(String[] args) {
		List<Integer>stat=Arrays.asList(11,23,11,44,55,34,55,6,6,77,53);
		IntSummaryStatistics stats=stat.stream().mapToInt((x)->x).summaryStatistics();
	}

}
