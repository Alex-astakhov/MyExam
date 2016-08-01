package answers;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class JsonModel {
    public int userId;
    public int id;
    @SerializedName("title")  // если переменная в джейсонее называется так, как не может называться в Java
    public String title;
    public String body;


    @Override
    public String toString(){
        return "PostModel [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
    }
}
