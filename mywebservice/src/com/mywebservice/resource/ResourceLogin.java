package com.mywebservice.resource;

import java.util.ArrayList;

import com.mywebservice.model.Login;

public class ResourceLogin {

	public static ResourceLogin instance;

	public static ResourceLogin getInstance(){

		if(instance == null)
			instance = new ResourceLogin();

		return instance;
	}
	
	public ArrayList<Login> getLogin( String email, String senha){
		
		ArrayList<Login> login = new ArrayList<Login>();
		Login dados = new Login();
		
		System.out.println(email);
		
		if( email.equals("teste@teste.com") && senha.equals("teste@teste")	){
		
		dados.setResult("Welcome!!!");
		dados.setStatus("ok");
		
		login.add(dados);
		
		}else{
			
			dados.setResult("Fail Login");
			dados.setStatus("error");
			
			login.add(dados);
			
		}
		
		
		return login;
	}
	
}
