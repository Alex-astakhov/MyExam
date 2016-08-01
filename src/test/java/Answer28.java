import answers.JsonModel;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer28 {
    Gson gson = new Gson();

    @Test
    public void getRequest() throws IOException {
        HttpResponse httpResponse = Request.Get("http://jsonplaceholder.typicode.com/posts").execute().returnResponse();
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        HttpEntity entity = httpResponse.getEntity();
        String respJson = EntityUtils.toString(entity);
        System.out.println(respJson);
        Assert.assertEquals(statusCode, 200);
        JsonModel[] postModels = gson.fromJson(respJson, JsonModel[].class);
        System.out.println(Arrays.toString(postModels));
    }

    @Test
    public void javaClassToJson(){
        JsonModel jsonModel = new JsonModel();
        jsonModel.id = 111;
        jsonModel.userId = 333;
        jsonModel.title = "alala";
        jsonModel.body = "alala - body";
        String newJson = gson.toJson(jsonModel);
        System.out.println(newJson);
    }
}
