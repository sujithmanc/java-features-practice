package tech.sujith.features.java15;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

// Java 12
public class TeelingMethod {

	public void practTeeingMethod() {

		List<Integer> list = List.of(45, 12, 39, 23, 9, 51);
		Long collect = list.stream().collect(Collectors.counting());
		IntSummaryStatistics collect2 = list.stream().collect(Collectors.summarizingInt(i -> i));
		Integer collect3 = list.stream().collect(Collectors.summingInt(i -> i));
		DoubleSummaryStatistics collect4 = list.stream().collect(Collectors.summarizingDouble(i -> i));

		System.out.println(collect);
		System.out.println(collect2);
		System.out.println(collect3);
		System.out.println(collect4);

		Long average = list.stream()
				.collect(Collectors.teeing(Collectors.summingInt(i -> i), Collectors.counting(), (i, j) -> i / j));
		System.out.println(average);
	}
}
