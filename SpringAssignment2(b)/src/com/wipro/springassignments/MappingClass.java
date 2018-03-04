package com.wipro.springassignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MappingClass {

	private Map<Country,List<Player>> mappp;

		
	public Map<Country, List<Player>> getMappp() {
		return mappp;
	}


	public void setMappp(Map<Country, List<Player>> mappp) {
		this.mappp = mappp;
	}


	public void displayPlayerNames(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country name: I(India) or S(South Africa)");
		char c=sc.next().charAt(0);
		List<String> list=new ArrayList<String>();
		if(c=='I'){
			// indian player names
			
			Set<Country> name=mappp.keySet();
		Iterator itr=name.iterator();
		while(itr.hasNext()){
		
			//String playerNames=
		}
			
		}
		else{
			//south african player names
			
			List<Player> name=mappp.get("South Africa");
			Iterator<Player> itr=name.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			
			
		}
		
	}
	
}
