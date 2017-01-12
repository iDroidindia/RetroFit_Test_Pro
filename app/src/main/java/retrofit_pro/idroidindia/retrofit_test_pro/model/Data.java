package retrofit_pro.idroidindia.retrofit_test_pro.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Data {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("mobile_no")
    private String mobile_no;

    @SerializedName("email_id")
    private String email_id;
    @SerializedName("genre_ids")

    private List<Integer> genreIds = new ArrayList<Integer>();

    @SerializedName("query")
    private String query;

    @SerializedName("course_interested_in")
    private String course_interested_in;


    public Data(String id, String name, String mobile_no, String email_id, List<Integer> genreIds,
                String query, String course_interested_in) {

        this.id = id;
        this.name = name;
        this.mobile_no = mobile_no;
        this.email_id = email_id;

        this.genreIds = genreIds;

        this.query = query;
        this.course_interested_in = course_interested_in;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getCourse_interested_in() {
        return course_interested_in;
    }

    public void setCourse_interested_in(String course_interested_in) {
        this.course_interested_in = course_interested_in;
    }

}
