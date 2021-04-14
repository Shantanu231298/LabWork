package com.capg.lab6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex6VotingCrteria {
	public static ArrayList<String> votersList(HashMap<String,String> voter){
		ArrayList<String> list= new ArrayList<String>();
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for(Entry<String, String> entry: voter.entrySet()) {
		LocalDate localdateofbirth= LocalDate.parse(entry.getValue(), formatter);
		LocalDate ld=LocalDate.now();
		Period p=Period.between(localdateofbirth, ld);
		if(p.getYears()>=18) {
			list.add(entry.getKey());
		}
		}
		return list;
	}
	public static void main(String[] args) {
		HashMap<String, String> voter = new HashMap<>();
	     /* voter.put("1","23/12/1998");
	      voter.put("2","15/4/2010");
	      voter.put("3","30/3/1994");
	      voter.put("4","02/6/2012");*/
		System.out.println("Enter no of Person");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter Person ID and Date of Birth in dd/MM/yyyy format");
		for(int i=0; i<n;i++) {
			voter.put(sc.next(),sc.next());
		}
		sc.close();
	      ArrayList<String> list= votersList(voter);
			for(String s: list)
	      System.out.println(s);

	}

}
