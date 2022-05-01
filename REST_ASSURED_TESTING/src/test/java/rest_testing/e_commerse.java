package rest_testing;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
public class e_commerse {
	public static String baseurl="https://ecommerceservice.herokuapp.com/";
	@Test(priority=0)
	public void creatuser() {
		RestAssured.baseURI=baseurl;
		String Requestbody= "{\r\n"
				+ "	\"email\": \"mohankrishna176@gmail.com\",\r\n"
				+ "	\"password\": \"krishna@123\"\r\n"
				+ "}\r\n"
				+ ""

	}
}
