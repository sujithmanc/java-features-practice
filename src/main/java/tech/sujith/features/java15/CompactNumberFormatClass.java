package tech.sujith.features.java15;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatClass {
	public void pracCompactNumberFormat() {
		NumberFormat numberInstance = CompactNumberFormat.getNumberInstance();
		String format = numberInstance.format(12312312);
		System.out.println(format);
		NumberFormat compactNumberInstance = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		String format2 = compactNumberInstance.format(1232L);
		System.out.println(format2);
	}
}
