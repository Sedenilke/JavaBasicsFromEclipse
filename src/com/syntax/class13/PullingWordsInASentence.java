package com.syntax.class13;

import java.util.Arrays;

public class PullingWordsInASentence {

	public static void main(String[] args) {
		String text = "Batch 14 is really good";
		//it takes a regular expression and divide the sentence into words based on space
		//anytime it sees a space it will put the next word into the new index.
		String [] textArray = text.split(" "); 
		// space icin ayni zamanda \s komentini de kullanabilirdik. regular expression tablosundan:
		// String [] textArray = text.split("\s");
		System.out.println(Arrays.toString(textArray));
		System.out.println(textArray[0]); //first element in index one is Batch
		 
		
		String text2 = "Today is Sunday.Sunday is a good day.Java is also good.";
		String [] text2Array = text2.split("[.]"); //regular expression oldugu icin koseli parantezin icine yazdim.
		System.out.println(Arrays.toString(text2Array));

		}

}
