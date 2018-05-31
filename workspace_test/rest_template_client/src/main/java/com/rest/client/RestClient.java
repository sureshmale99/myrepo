package com.rest.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestClient {
		public static void main(String[] args) throws JsonProcessingException{
			RestTemplate  restTemplate = new RestTemplate();
			PartyDTO dto = new PartyDTO();
			dto.setFirstName("Suresh");
			dto.setLastName("Male");
			dto.setPartyId(Long.valueOf(2322));
			dto.setCustomerNumber(Long.valueOf(22224));
			
			//Approach - 1 - start
			restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
			restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
			String result = restTemplate.postForObject("http://localhost:8080/jaxrs/rest/FCService/data", dto, String.class);
			// End
			
			// Approach - 2 - Start
			ObjectMapper mapper = new ObjectMapper();
			String requestJson = mapper.writeValueAsString(dto);
			System.out.println("request Json: " + requestJson);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
			//ResponseEntity<String> responseDTO = restTemplate.exchange("http://localhost:8080/jaxrs/rest/FCService/data", HttpMethod.POST, entity, String.class);
			//System.out.println("result : " + responseDTO.getBody());	
			//End
			
			System.out.println(result);
		}
}
