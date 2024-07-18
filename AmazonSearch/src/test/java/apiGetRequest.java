import io.restassured.*;
public class apiGetRequest {

	public static void test(){
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		
		RestAssured.when().get().then().assertThat().log().all().statusCode(200);
	}

}
