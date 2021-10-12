import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Cenas {

	public static void main(String[] args) throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		MediaType mediaType = MediaType.parse("application/json");
		@SuppressWarnings("deprecation")
		RequestBody body = RequestBody.create(mediaType,
				"{\r\n    \"name\": \"morpheus\",\r\n    \"job\": \"leader\"\r\n}");
		Request request = new Request.Builder().url("https://reqres.in/api/users").method("POST", body)
				.addHeader("Content-Type", "application/json").build();
		Response response = client.newCall(request).execute();

		System.out.println(response.body().string());
	}

}
