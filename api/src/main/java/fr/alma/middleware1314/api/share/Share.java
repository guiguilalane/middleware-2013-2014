package main.java.fr.alma.middleware1314.api.share;

import main.java.fr.alma.middleware1314.api.aggregation.Aggregation;

public interface Share {
	
	public void share( Aggregation aggregation, Visibility visibility );
	
}
