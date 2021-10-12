import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Cenas2 {

	public static void main(String[] args) throws UnirestException  {
		Unirest.setTimeouts(0, 0);
		HttpResponse<String> response = Unirest.post("https://reqres.in/api/users")
		  .header("Content-Type", "application/json")
		  .body("{\r\n    \"name\": \"morpheus\",\r\n    \"job\": \"leader\"\r\n}")
		  .asString();


		System.out.println(response.getBody());
	}

}
