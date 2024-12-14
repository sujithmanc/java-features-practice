package tech.sujith.features.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StreamFunctions {

	public void pracDistinct() {
		Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5, 6));
		set1.retainAll(set2);
		System.out.println(set1);
		System.out.println(set2);
	}

	public Set<String> getAllTags() {
		return Set.of("CPU", "Ghraphics", "Tree", "bad");
	}

    public Set<String> getFoundTags() {
        Set<String> tags = getAllTags();
        String quote = "BAD zone CPU That GhraphicsI written GaMe Tree ";

        // Pattern to match each tag with word boundaries
        StringBuilder patternBuilder = new StringBuilder();
        for (String tag : tags) {
            if (patternBuilder.length() > 0) {
                patternBuilder.append("|");
            }
            patternBuilder.append("\\b").append(Pattern.quote(tag)).append("\\b");
        }
        Pattern pattern = Pattern.compile(patternBuilder.toString(), Pattern.CASE_INSENSITIVE);

        // Matcher to find matches in the quote
        Matcher matcher = pattern.matcher(quote);

        // Set to store found tags
        Set<String> foundTags = new HashSet<>();

        // Find and add found tags to the set
        while (matcher.find()) {
            foundTags.add(matcher.group().toLowerCase()); // Store lowercased tags
        }

        return foundTags;
    }

	public void indexOfTest() {

		Set<String> tags = getAllTags();
		String quote = "zone That I written GaMe";

		String tag = "\\bgame\\b";
	

		Pattern pattern = Pattern.compile(tag, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(quote);

		if (matcher.find()) {
			System.out.println("Pattern found at index: " + matcher.start());
		} else {
			System.out.println("Pattern not found");
		}
	}
}
