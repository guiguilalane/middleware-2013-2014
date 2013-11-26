package main.java.fr.alma.middleware1314.api.aggregation;

import java.util.List;
import java.util.Set;

import main.java.fr.alma.middleware1314.api.RSSFeed;

public interface Aggregation {

	public void addRSS(RSSFeed flux);
	
	public void addManyRSS(List<RSSFeed> listFlux);
	
	public void remove(RSSFeed flux);

	public void initialiseAggregation(Set<RSSFeed> listFlux);
	
}
