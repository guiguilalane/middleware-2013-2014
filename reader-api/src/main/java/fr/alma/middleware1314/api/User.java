package fr.alma.middleware1314.api;

import java.util.List;

import fr.alma.middleware1314.api.aggregation.Aggregation;

public class User {

	private String pseudo;
	private String password;
	private List<Aggregation> listAggregation;
	
	
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Aggregation> getListAggregation() {
		return listAggregation;
	}
	public void setListAggregation(List<Aggregation> listAggregation) {
		this.listAggregation = listAggregation;
	}
	
	
}
