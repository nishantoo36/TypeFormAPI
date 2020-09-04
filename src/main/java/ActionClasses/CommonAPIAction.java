package ActionClasses;

import io.restassured.response.Response;
import utility.RestUtility;

public class CommonAPIAction extends RestUtility {
    static Response response;

    public void setEndPoint(String endPoint){
        response = getData(endPoint);
    }

}
