package com.rest.jersey;

public class Response {
	public static enum Status {
		success, error
	}


	public Status status;
	public Object data;
	

	public Response(Status status, Object data) {
		this.status = status;
		this.data = data;
	}
	
	
}
