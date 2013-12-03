package fr.alma.middleware1314.services;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;

public class CassandraConnection {
	
	private Cluster cluster;
	
	public void connect(String node, int port) {
		cluster = Cluster.builder().addContactPoint(node).withPort(port).build();
		System.out.println(cluster);
		cluster.connect("AuthDB");
		System.out.println(cluster);
		Metadata metatdata = cluster.getMetadata();
		System.out.printf("connect to cluster : %s\n", metatdata.getClusterName());
		for(Host host : metatdata.getAllHosts()) {
			System.out.printf("Datacenter: %s Host: %s; Rack: %s\n",
         host.getDatacenter(), host.getAddress(), host.getRack());
		}
	}
	
	public void close() {
		cluster.shutdown();
	}

}
