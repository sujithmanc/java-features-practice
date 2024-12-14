package tech.sujith.features.java08;

import java.util.Base64;

public class Base64EncodeDecode {

	public static void main(String[] args) {
		// pracURLEncodingAndDecoding();
		pracBasicAndDecoding();
	}

	public static void pracURLEncodingAndDecoding() {
		// Getting encoder
		Base64.Encoder encoder = Base64.getUrlEncoder();
		// Encoding URL
		String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
		System.out.println("Encoded URL: " + eStr);
		// Getting decoder
		Base64.Decoder decoder = Base64.getUrlDecoder();
		// Decoding URl
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded URL: " + dStr);
	}

	public static void pracBasicAndDecoding() {
		// Getting encoder
		Base64.Encoder encoder = Base64.getEncoder();
		// Encoding string
		String str = encoder.encodeToString("JavaTpoint".getBytes());
		System.out.println("Encoded string: " + str);
		// Getting decoder
		Base64.Decoder decoder = Base64.getDecoder();
		// Decoding string
		String dStr = new String(decoder.decode(str));
		System.out.println("Decoded string: " + dStr);
	}
}
