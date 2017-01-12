package retrofit_pro.idroidindia.retrofit_test_pro.rest;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit_pro.idroidindia.retrofit_test_pro.model.DataResponse;


public interface ApiInterface_Data {

    @POST(".")
    Call<DataResponse> getData();
}
