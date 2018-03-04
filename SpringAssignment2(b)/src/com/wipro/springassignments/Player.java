package com.wipro.springassignments;

public class Player {

	private String playerId;
	private String playerName;
	private Country country;
	
	
public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


public void displayInfo(){
	
	System.out.println("Player Id:"+playerId);
	System.out.println("Player Name:"+playerName);
	System.out.println("Country Details:"+country);
}

@Override
public String toString() {
	return "Player [playerId=" + playerId + ", playerName=" + playerName
			+ ", country=" + country + "]";
}


}
