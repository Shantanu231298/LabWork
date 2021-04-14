package com.capg.lab6;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ex2CountCharacter {
	public static HashMap<Character, Integer> countChars(char[] arr){
		HashMap<Character, Integer> charcount=new HashMap<Character, Integer>();
		for(char ch:arr) {
			if(charcount.containsKey(ch)) {
				charcount.put(ch, charcount.get(ch)+1);
			}
			else
			{
				charcount.put(ch, 1);
			}
		}
		return charcount;
	}

	public static void main(String[] args) {
		String s= "Capgemini India Training";
		char[] ch= s.toCharArray();
		HashMap<Character, Integer> map= countChars(ch);
		for(Entry<Character, Integer> values:map.entrySet()) {
			System.out.println(values.getKey()+" "+values.getValue());
		}

	}

}
