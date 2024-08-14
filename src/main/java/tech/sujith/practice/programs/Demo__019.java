package tech.sujith.practice.programs;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo__019 {
	public static void main(String[] args) {
		// LCM of given inputs
		// 5, 15, 20
		List<Integer> list = Stream.of(5, 15, 20, 8).toList();
		int ans = 1;
		while (list.stream().anyMatch(f -> f > 1)) {

			Optional<Integer> findFirst = list.stream().filter(f -> f > 1).findFirst();

			if (findFirst.isEmpty()) {
				break;
			} else {
				Integer n = findFirst.get(); // 1,3,4
				System.out.println(n);
				ans *= n;
				list = list.stream().map(f -> {
					return (f % n == 0) ? f / n : f;
				}).toList();
			}
			System.out.println(list);
		}

		System.out.printf("LCM is %d %n%n", ans);

	}

	// 5 > 1, 3, 4
	// 3 > 1, 1, 4
	// 4 > 1, 1, 1

}
