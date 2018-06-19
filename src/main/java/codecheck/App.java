package codecheck;

public class App {
	public static void main(String[] args) {
		int m = 0; // 文字列変換対象数値
		StringBuilder result = new StringBuilder(); // 結果格納文字列

		m = Integer.parseInt(args[args.length]);

		for (int i = 0, l = args.length - 1; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
			result = result.append(fizzbuzz(m, args[i]));
		}

		// どれも割り切れなければmを返す
		if(result.length() == 0) {
			System.out.println(String.valueOf(m));
		} else {
			System.out.println(result.toString());
		}
	}

	static String fizzbuzz(int num, String input) {
		String[] split = input.split(":");
		int cut = Integer.parseInt(split[0]);
		if (num % cut == 0)
			return split[1];
		return "";
	}
}
