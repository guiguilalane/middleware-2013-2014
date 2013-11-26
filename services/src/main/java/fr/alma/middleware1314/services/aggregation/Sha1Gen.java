package main.java.fr.alma.middleware1314.services.aggregation;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


class Sha1Gen {
	
	static String sha1(String input) {
		
		String s = input;
		try {
			MessageDigest mDigest = MessageDigest.getInstance("SHA1");
			byte[] result = mDigest.digest(input.getBytes());
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < result.length; ++i) {
				sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
			}
			s = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}

}
