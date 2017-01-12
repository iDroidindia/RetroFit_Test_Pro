package retrofit_pro.idroidindia.retrofit_test_pro.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit_pro.idroidindia.retrofit_test_pro.R;
import retrofit_pro.idroidindia.retrofit_test_pro.adapter.DataAdapter;
import retrofit_pro.idroidindia.retrofit_test_pro.model.Data;
import retrofit_pro.idroidindia.retrofit_test_pro.model.DataResponse;
import retrofit_pro.idroidindia.retrofit_test_pro.rest.ApiClient_Data;
import retrofit_pro.idroidindia.retrofit_test_pro.rest.ApiInterface_Data;

public class MainActivity_Data extends AppCompatActivity {

    private static final String TAG = MainActivity_Data.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY from themoviedb.org first!", Toast.LENGTH_LONG).show();
            return;
        }*/

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.data_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface_Data apiService_data =
                ApiClient_Data.getClient().create(ApiInterface_Data.class);

        Call<DataResponse> call = apiService_data.getData();
        call.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                int statusCode = response.code();
                List<Data> usr_data = response.body().getResults();
                recyclerView.setAdapter(new DataAdapter(usr_data, R.layout.list_item_data, getApplicationContext()));
            }


            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }
}
