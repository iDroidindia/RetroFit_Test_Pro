package retrofit_pro.idroidindia.retrofit_test_pro.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import retrofit_pro.idroidindia.retrofit_test_pro.R;
import retrofit_pro.idroidindia.retrofit_test_pro.model.Data;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    private List<Data> data;
    private int rowLayout;
    private Context context;

    public static class DataViewHolder extends RecyclerView.ViewHolder {
        LinearLayout dataLayout;
        TextView id;
        TextView name;
        TextView mobile_no;
        TextView email_id;
        TextView course_interested_in;


        public DataViewHolder(View v) {
            super(v);
            dataLayout = (LinearLayout) v.findViewById(R.id.details_layout);
            id = (TextView) v.findViewById(R.id.usr_id);
            name = (TextView) v.findViewById(R.id.usr_name);
            mobile_no = (TextView) v.findViewById(R.id.usr_mobile_no);
            email_id = (TextView) v.findViewById(R.id.usr_email_id);
            course_interested_in = (TextView) v.findViewById(R.id.usr_course_interested_in);
        }
    }

    public DataAdapter(List<Data> data, int rowLayout, Context context) {
        this.data = data;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new DataViewHolder(view);
    }


    @Override
    public void onBindViewHolder(DataViewHolder holder, final int position) {
        holder.id.setText(data.get(position).getId());
        holder.name.setText(data.get(position).getName());
        holder.mobile_no.setText(data.get(position).getMobile_no());
        holder.email_id.setText(data.get(position).getEmail_id());
        holder.course_interested_in.setText(data.get(position).getCourse_interested_in());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}