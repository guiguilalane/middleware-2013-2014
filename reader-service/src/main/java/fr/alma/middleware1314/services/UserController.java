package fr.alma.middleware1314.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.alma.middleware1314.api.User;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping(value="connect", method=RequestMethod.GET)
	@ResponseBody
	public User connect(@RequestParam(value= "pseudo", required=false) String pseudo) {
		CassandraConnection cc = new CassandraConnection();
		cc.connect("127.0.0.1", 9160);
		cc.close();
		User u = new User();
		u.setPseudo(pseudo);
		return u;
	}

}