import java.util.Arrays;

public class Practice2 {
	public String run() {
		int max = -1;
		for (int n = 2; n <= 9; n++) {
			for (int i = 1; i < pow(10, 9 / n); i++) {
				String concat = "";
				for (int j = 1; j <= n; j++)
					concat += i * j;
				if (isPandigital(concat))
					max = Math.max(Integer.parseInt(concat), max);
			}
		}
		return Integer.toString(max);
	}

	public static int pow(int x, int y) {
		
        int z = 1;
		for (int i = 0; i < y; i++) {
			
			z *= x;
		}
		return z;
	}
	
	private static boolean isPandigital(String s) {
		if (s.length() != 9)
			return false;
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp).equals("123456789");
	}

	public static void main(String[] args) {
                Practice2 solution = new Practice2();
		System.out.println(solution.run());
	}	
	
			

}
