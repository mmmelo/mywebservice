package com.mywebservice.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.mywebservice.model.Login;

@Path("")
public class webservice {

	
	@GET
	@Path("/login")
	@Produces("application/json")
	public ArrayList<Login> login(@QueryParam(value = "email") String email,
								  @QueryParam(value = "pwd") String pwd){
		
		
		return ResourceLogin.getInstance().getLogin(email, pwd);
	}
}
