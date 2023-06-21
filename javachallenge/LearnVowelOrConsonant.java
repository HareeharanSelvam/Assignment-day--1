package javachallenge;

public class LearnVowelOrConsonant {

	public static void main(String[] args) {
		char ch='d';
		if(ch>='A'&& ch<='Z'|| ch>='a'&&ch<='z') {
			if(ch=='A'|| ch=='E'||  ch=='I'|| ch=='O'||ch=='U'|| ch=='a'||ch=='e'|| ch=='i'||ch=='o'|| ch=='u') {
				System.out.println("Its a Vowel");
			}
			else {
				System.out.println("Its a consonant");
			}
		}

	}

}
