package retrofit_pro.idroidindia.retrofit_test_pro.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class DataResponse {

    @SerializedName("users")
    private List<Data> users;

    public List<Data> getResults() {
        return users;
    }

    public void setResults(List<Data> results) {
        this.users = users;
    }

}
