package com.rest.jersey;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



import org.json.JSONObject;



@Path("/FCService")
public class FCService {
	@POST	
	@Path("/data")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<PartyDTO> getFCService(PartyDTO dto, @Context HttpServletRequest request, @Context HttpServletResponse response){
		JSONObject jsonObject = new JSONObject();
		
		System.out.println("party Id ::: " + dto.getPartyId());
		List<PartyDTO> list = new ArrayList<PartyDTO>();	
//		FCModel fc = new FCModel();
//		fc.setAccountName("suresh");
//		fc.setAccountNum(1412);
		
		list.add(dto);
		return list;
	}
}
