package com.felight.String1;

public class String1 {
	// 2. accepts a string as argument and returns the first letter of every
	// word clubbed into a string
	public static void everyWord() {
		String s = new String("Felight Rocks");
		char v = ' ';
		int i = 0;
		String result = "";
		for (i = 0; i < s.length(); i++) {
			v = s.charAt(i);
			if (v == ' ') {
				i++;
				v = s.charAt(i);
				result = result + v;
			} else if (i == 0) {
				result = result + v;
			}
		}
		System.out.println("First letter of every word clubbed into a string");
		for (int j = 0; j < result.length(); j++) {
			char s1 = result.charAt(j);
			System.out.print(s1);
		}
		System.out.println(" ");
	}

	// 3. reverse a string
	public static void reverse() {
		String s = new String("Felight");
		int i = 0;
		char v = ' ';
		String result = "";
		for (i = s.length() - 1; i >= 0; i--) {
			result = result + s.charAt(i);
		}
		System.out.println("Reverse of a string");
		for (int k = 0; k < result.length(); k++) {
			v = result.charAt(k);
			System.out.print(v);
		}
		System.out.println(" ");
	}

	// 4. return true if the email address is valid
	public static boolean isValid() {
		String s = new String("rcneelanjana@gmail.com");
		System.out.println("Checking if email address is valid:	");
		if (s.contains("@") && (s.contains(".com") || s.contains(".co.in") || s.contains(".in")))
			return true;
		else
			return false;
	}

	// 5. rating of a movie
	public static void movieRating() {
		String s = new String(
				"The script of the movie is good but the acting is not good. Direction is awesome but the producer is worst.Songs are nice ");
		int count = 5;
		String result = " ";

		result = s.replaceAll("awesome", "good");
		result = result.replaceAll("nice", "good");
		result = result.replaceAll("not good", "bad");
		result = result.replaceAll("worst", "bad");
		String[] words = result.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("good"))
				count++;
			else if (words[i].equals("bad"))
				count--;
			else
				continue;
		}
		if (count > 10)
			System.out.println("Rate of movie is: 4");
		else if (count >= 5)
			System.out.println("Rate of movie is: 3");
		else if (count >= 2)
			System.out.println("Rate of movie is: 2");
		else
			System.out.println("Rate of movie is: 1");

	}

	// 6. sorted array
	public static void sortedString() {
		String s = new String("AFBECD");
		byte[] b = s.getBytes();
		for (int j = 1; j < b.length; j++) {
			for (int i = b.length - 1; i >= j; i--) {
				if (b[i - 1] > b[i]) {
					byte temp = b[i - 1];
					b[i - 1] = b[i];
					b[i] = temp;
				}
			}
		}
		System.out.println("Print Sorted Array: ");
		for (int k = 0; k < b.length; k++) {
			char result = (char) b[k];
			System.out.print(result);
		}
		System.out.println();
	}

	// 7. palindrome
	public static void palindrome() {
		String s = new String("MADAM");
		int i = 0;
		String result = "";
		System.out.println("Palindrome or not: ");
		for (i = s.length() - 1; i >= 0; i--) {
			result = result + "" + s.charAt(i);
		}
		Boolean s1 = s.equals(result);
		if (s1 == true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

	// 8. Anagram
	public static void isAnagram(String first, String second) {

		boolean status = false;
		String copyOfFirst = first.replaceAll("\\s", "");
		String copyOfSecond = second.replaceAll("\\s", "");
		System.out.println(copyOfFirst);
		System.out.println(copyOfSecond);
		if (copyOfFirst.length() != copyOfSecond.length()) {
			status = false;
		} else {
			char[] firstArray = copyOfFirst.toLowerCase().toCharArray();
			char[] secondArray = copyOfSecond.toLowerCase().toCharArray();

			java.util.Arrays.sort(firstArray);
			java.util.Arrays.sort(secondArray);

			status = java.util.Arrays.equals(firstArray, secondArray);
		}

		if (status)
			System.out.println("First and Second are Anagrams");
		else
			System.out.println("First and Second are not Anagrams");
	}

	// 9. remove(String word, char remove this)
	public static String remove(String word, char remove) {
		boolean status = false;
		status = word.isEmpty();
		if (status == true) {
			System.out.println("The string is empty");
			return word;
		} else {
			int index = word.indexOf(remove);
			if (index == -1)
				return word;
			else {
				String front = word.substring(0, index);
				System.out.println("Front: " + front);
				String back = word.substring(index + 1, word.length());
				System.out.println("Back: " + back);
				return front + back;
			}
		}

	}

	// 10. split
	public static void splitString() {
		System.out.println();
		String s = "Neel,Roy";
		String[] words = s.split(",");
		System.out.println("Split the words: ");
		for (String w : words) {
			System.out.println(w);
		}
	}

	// 11. Permutation
	public static void permutation(String string) {
		printPermutation(string, "");
	}

	public static void printPermutation(String string, String permutation) {
		if (string.length() == 0) {
			System.out.println(permutation);
		}
		for (int i = 0; i < string.length(); i++) {
			char toAppendToPermutation = string.charAt(i);
			String remaining = string.substring(0, i) + string.substring(i + 1);
			printPermutation(remaining, permutation + toAppendToPermutation);
		}
	}

	// 12. return string as many times as the integer
	public static void returnString(String s1, int count) {
		System.out.println();
		for (int i = 0; i <= count; i++)
			System.out.println(s1);

	}

	// 13. Important methods in string builder and string buffer
	public static void methods() {
		StringBuffer str1 = new StringBuffer("Felight");
		StringBuffer str2 = new StringBuffer("Neel");
		StringBuffer str3 = new StringBuffer("Neelanjana");
		StringBuffer str4 = new StringBuffer("Nel");
		StringBuffer str5 = new StringBuffer("Neelanjana");

		System.out.println();
		System.out.print("Append: ");
		System.out.print(str1.append("Rocks"));

		System.out.println();
		System.out.print("Reverse: ");
		System.out.print(str2.reverse());

		System.out.println();
		System.out.print("Delete: ");
		System.out.print(str3.delete(0, 4));

		System.out.println();
		System.out.print("Insert: ");
		System.out.print(str4.insert(1, "e"));

		System.out.println();
		System.out.print("Replace: ");
		System.out.print(str5.replace(5, 9, " Neel"));

	}

	// 14. time consumed by both String Buffer and String Builder
	public static void stringBenchmark() {
		int n = 1000000;
		int i = 0;

		StringBuffer s = new StringBuffer();
		long startTime = System.currentTimeMillis();
		for (i = n; i > 0; i--) {
			s.append("");
		}
		System.out.println();
		System.out.println("String Buffer: " + (System.currentTimeMillis() - startTime));

		StringBuilder s1 = new StringBuilder();
		long startTime1 = System.currentTimeMillis();
		for (i = n; i > 0; i--) {
			s1.append("");
		}
		System.out.println("String Builder: " + (System.currentTimeMillis() - startTime1));
	}
}

class Test {
	public static void main(String[] args) {
		String1.everyWord();
		System.out.println();
		String1.reverse();
		System.out.println();
		System.out.println(String1.isValid());
		System.out.println();
		String1.movieRating();
		System.out.println();
		String1.sortedString();
		System.out.println();
		String1.palindrome();
		System.out.println();
		String s1 = new String("Silent Cat");
		String s2 = new String("Listen Act");
		String1.isAnagram(s1, s2);
		System.out.println();
		System.out.print("Removing the character: ");
		System.out.println(String1.remove("Felight", 'i'));
		System.out.println();
		String1.splitString();
		System.out.println();
		String s = new String("ABCD");
		String1.permutation(s);
		System.out.println();
		System.out.println("Return the string as many times as the integer");
		String1.returnString("Neel", 5);
		String1.methods();
		System.out.println();
		String1.stringBenchmark();

	}
}
