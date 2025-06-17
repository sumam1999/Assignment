package JavaBasic;

public class CountVowels {

	    public static void main(String[] args) {
	        String str1 = "hello how are you doing today";
	        int vowelCount = countVowels(str1);
	        System.out.println("Total number of vowels: " + vowelCount);
	    }

	    public static int countVowels(String str) {
	        int count = 0;
	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	}