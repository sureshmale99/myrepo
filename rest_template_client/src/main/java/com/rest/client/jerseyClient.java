package com.rest.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class jerseyClient {
	public static void main(String[] args) throws JsonProcessingException{
		
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/jaxrs/rest/FCService/data");
		
		
		PartyDTO dto = new PartyDTO();
		dto.setFirstName("Suresh");
		dto.setLastName("Male");
		dto.setPartyId(Long.valueOf(2322));
		dto.setCustomerNumber(Long.valueOf(22224));
		String requestJson = new ObjectMapper().writeValueAsString(dto);
		
		ClientResponse response = resource.type(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(ClientResponse.class, requestJson);
		System.out.println(response.getEntity(String.class));
		
	}
}
