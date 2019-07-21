package com.example.qingqiu;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MyServer {
    public String Url = "https://gank.io/api/data/";

    @GET("%E7%A6%8F%E5%88%A9/20/1")
    Observable<bean> getData();

}
