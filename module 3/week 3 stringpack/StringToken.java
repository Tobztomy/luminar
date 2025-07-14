package stringpack;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Luminar technolab kakkand kochi", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		StringTokenizer sc = new StringTokenizer("Luminar:technolab:kakkand:kochi");// like csv file
		while (sc.hasMoreTokens()) {
			System.out.println(sc.nextToken(":"));// given loop others also come

		}
	}

}
