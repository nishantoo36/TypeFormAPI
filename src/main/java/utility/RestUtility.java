package utility;

import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import manager.FileReaderManager;

import java.util.List;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


public class RestUtility  {
    public static FilterableRequestSpecification httpRequest = null;

    public RestUtility() {
        baseURI = FileReaderManager.getInstance().getConfigReader().getBaseURL();
        httpRequest = (FilterableRequestSpecification) given();
    }

    public Response getData(String url) {
        return httpRequest.get(url);
    }

    public int getStatusCode(Response response){
      return response.statusCode();
    }

    public String getFieldValue(Response response,String path){
        return response.jsonPath().get(path);
    }

    public List getFieldValues(Response response, String path){
        return response.jsonPath().getList(path);

    }
}
