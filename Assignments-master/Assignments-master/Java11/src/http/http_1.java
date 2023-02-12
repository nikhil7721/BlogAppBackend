package http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
//import org.testng.annotations.Test;
public class http {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		
		    

		        String getEndpoint = "https://github.com/himanahu108";

		        var request = HttpRequest.newBuilder()
		            .uri(URI.create(getEndpoint))
		            .GET()
		            .build();

		        var client = HttpClient.newHttpClient();

		        HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		        System.out.println("Status Code: " + response.statusCode());
		        System.out.println("Response: " + response.body());


		    }
		
		
	
		
	}

