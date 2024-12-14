package tech.sujith.features.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PaginationUsingStreams {

	public static void main(String[] args) {
		List<Integer> list = Collections.nCopies(10, 100);

		List<Integer> numbersList = IntStream.range(1, 100).mapToObj(Integer::valueOf).collect(Collectors.toList());
		System.out.println(numbersList);

		var pageNo = 4;
		var pageSize = 10;
		List<Integer> content = numbersList.stream().skip(pageNo * pageSize).limit(pageSize).toList();
		System.out.println("Content: " + content);
	}

}
