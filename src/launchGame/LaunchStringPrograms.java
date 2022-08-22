package launchGame;

public class LaunchStringPrograms {

	/*
	 * 1. WAPto reverse a String. Input: “iNeuron” Output: “norueNi” 
	 * 2. WAP to reverse a sentence while preserving the position. Input : “Think Twice” Output :“kniht eciwt” 
	 * 3. WAP to check if the String is Anagram or not. 
	 * 4. WAP to check if the String is a Pangram or not. 
	 * 5. WAP to print repeatedly occurring characters in the given String. 
	 * 6. WAP to sort a String Alphabetically. 
	 * 7. WAP to count the number of Vowels and Consonants of a String value. 
	 * 8. WAP to count number of special characters.
	 */
	public static void main(String[] args) {
		//1. WAPto reverse a String. Input: “iNeuron” Output: “norueNi” 
		System.out.println(revStr("iNeuron"));
		//2. WAP to reverse a sentence while preserving the position. Input : “Think Twice” Output :“kniht eciwt”
		System.out.println(revStrWord("Think Twice"));
		//3. WAP to check if the String is Anagram or not.
		//6. WAP to sort a String Alphabetically==>> Bubble short logic used in the checkAnagram program
		checkAnagram("noma", "MOna");
		//4. WAP to check if the String is a Pangram or not.
		checkPangram("The quick brown fox jumps over the lazy doG12");
		//WAP to print repeatedly occurring characters in the given String. 
		findDuplicateChar("Abhijeet Singh");
//		/7. WAP to count the number of Vowels and Consonants of a String value.
		countAlphaConsonant("Abhijeet123");
		//8. WAP to count number of special characters.
		countSpecialChar("ab12AA@#$ ");
		
		
	}

	// Method to reverse a String. Input: “iNeuron” Output: “norueNi”
	public static String revStr(String str) {

		String finalString = "";

		for (int i = str.length() - 1; i >= 00; i--) {
			finalString = finalString + str.charAt(i);

		}

		// System.out.print(finalString);

		return finalString;
	}

	// reverse a sentence while preserving the position. Input : “Think Twice”
	// Output :“kniht eciwt”

	public static String revStrWord(String str) {
		String finalString = "";
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {

			finalString = finalString + revStr(strArray[i]) + " ";

		}

		return finalString;
	}
	//	/ WAP to check if the String is Anagram or not. 
	public static void checkAnagram(String str1,String str2) {

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		if(arr1.length!=arr2.length){
			System.out.println("Given Strings are not anagram");
		}
		else{

			
			for(int i=0;i<arr1.length;i++){
				for(int j=i+1;j<arr1.length-1;j++){
					if(arr1[i]>arr1[j]){
						char temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}

					if(arr2[i]>arr2[j]){
						char temp=arr2[i];
						arr2[i]=arr2[j];
						arr2[j]=temp;
					}

				}
			}

			
			String str3=String.valueOf(arr1);
			String str4=String.valueOf(arr2);


			if(str3.equals(str4)){
				System.out.println("Given strings are  anagram");
			}
			else{
				System.out.println("Given strings are not an anagram");
			}
		}


	}
	
	
	//WAP to check if the String is a Pangram or not. 
	public static void checkPangram(String str) {
		
		 str=str.toLowerCase();
		boolean[] bolArr = new boolean[26]; 
		int index = 0;
		int flag = 1;
		for (int i = 0; i < str.length(); i++) 
		{
			if( str.charAt(i) >= 97 &&  str.charAt(i) <= 122) 
			{
				index = str.charAt(i) - 97; 
			}
			bolArr[index] = true; 
		}
		for (int i = 0; i <= 25; i++) 
		{
			if (bolArr[i] == false)
			flag = 0;
		}
		if (flag == 1)
			System.out.print("Given String is a Pangram String.");
		else
			System.out.print("Given String is not a Pangram String.");
		
		
	}
	
	//WAP to print repeatedly occurring characters in the given String. 
	public static void findDuplicateChar(String str) {
		char [] arr= str.toCharArray();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+" : The character is duplicate");
					break;
				}
				
			}
			
		}
		
		
	}
	
	//WAP to count the number of Vowels and Consonants of a String value.
	public static void countAlphaConsonant(String str) {

		str=str.toLowerCase();
		int vow=0, con=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>=95 && str.charAt(i)<=122) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
					vow++;
				else
					con++;


			}

		}
		System.out.println("Number of Vowels = " + vow + "\nNumber of Consonants = "+ con);

	}
	
	public static void countSpecialChar(String str) {
		str=str.replaceAll("[a-z,A-Z,0-9,\s]", "");
		System.out.println("Toatal special char  count: "+ str.length());
		
		
	}

}
