package test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		System.out.println(solution("23"));
	}

    public static int solution(String S) {
    	
    	char[] charArr = S.toCharArray();
    	int count = 0;
    	int initialTotal = initialTotal(charArr);
    	List<String> listMem = new ArrayList<String>();
    	
        for (int i = 0; i < S.length(); i++) {
        	
        	int tempInitTotal = initialTotal - Integer.parseInt(String.valueOf(charArr[i]));
        	
			for(int j = 0; j < 10; j++) {
				
				String construct = S.substring(0, i) + String.valueOf(j) + S.substring(i+1, S.length());
				
				if ((tempInitTotal + j) % 3 == 0) {
					if (!search(listMem, construct)) {
						listMem.add(construct);
						count++;
					}
				}
			}
		}
        
        return count;
    }

	private static int initialTotal(char [] charArr) {
		
		int total = 0;
		
		for(char c: charArr) {
			total += Integer.parseInt(String.valueOf(c));
		}
		
		return total;
	}
	
	private static boolean search(List<String> strList, String sample) {
		for(String str: strList) {
			if (str.equals(sample)) {
				return true;
			}
		}
		return false;
	}
}
