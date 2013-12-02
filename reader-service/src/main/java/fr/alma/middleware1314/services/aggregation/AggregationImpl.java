package fr.alma.middleware1314.services.aggregation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.alma.middleware1314.api.RSSFeed;
import fr.alma.middleware1314.api.aggregation.Aggregation;

public class AggregationImpl implements Aggregation {
	
	private Map<String, RSSFeed> aggregation = new HashMap<String, RSSFeed>();
	
	public AggregationImpl() {
	}

	@Override
	public void initialiseAggregation(Set<RSSFeed> listFlux) {
		for(RSSFeed feed: listFlux) {
			aggregation.put(Sha1Gen.sha1(feed.toString()), feed);
		}
	}

	@Override
	public void addRSS(RSSFeed flux) {
		// TODO Auto-generated method stub
		aggregation.put(Sha1Gen.sha1(flux.toString()), flux);
	}

	@Override
	public void addManyRSS(List<RSSFeed> listFlux) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(RSSFeed flux) {
		// TODO Auto-generated method stub

	}

}
