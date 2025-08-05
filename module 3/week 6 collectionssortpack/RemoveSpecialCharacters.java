package collectionssortpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String words = new String("She said, \"Life is short; enjoy every moment: laugh, love, and live.\"");
		StringTokenizer st = new StringTokenizer(words, " ,.;:\"");

		List<String> wordList = new ArrayList<String>();

		while (st.hasMoreTokens()) {
			String temp = st.nextToken().toLowerCase();
			if (!wordList.contains(temp)) {
				wordList.add(temp);
			}
		}

		Collections.sort(wordList);

		for (String str : wordList) {
			System.out.println(str);
		}
	}

}
