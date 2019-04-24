package com.example.mx.com.myproject.appclarovideo.retrofit;


import com.example.mx.com.myproject.appclarovideo.common.pojo.ResponseMovie;
import com.example.mx.com.myproject.appclarovideo.common.pojo.ResposeInfoMovie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    @GET("list?")
    Call<ResponseMovie> getSeccionMovie(@Query("api_version") String api_version,
                                   @Query("authpn") String authpn,
                                   @Query("authpt") String authpt,
                                   @Query("format") String format,
                                   @Query("region") String region,
                                   @Query("device_id") String device_id,
                                   @Query("device_category") String device_category,
                                   @Query("device_model") String device_model,
                                   @Query("device_type") String device_type,
                                   @Query("device_so") String device_so,
                                   @Query("device_manufacturer") String device_manufacturer,
                                   @Query("HKS") String HKS,
                                   @Query("quantity") int quantity,
                                   @Query("order_way") String order_way,
                                   @Query("order_id") int order_id,
                                   @Query("level_id") String level_id,
                                   @Query("from") int from,
                                   @Query("node_id") int node_id);


    @GET("data?")
    Call<ResposeInfoMovie> getInfoMovie(@Query("device_id") String device_id,
                                        @Query("device_category") String device_category,
                                        @Query("device_model") String device_model,
                                        @Query("device_type") String device_type,
                                        @Query("format") String format,
                                        @Query("device_manufacturer") String device_manufacturer,
                                        @Query("authpn") String authpn,
                                        @Query("authpt") String authpt,
                                        @Query("api_version") String api_version,
                                        @Query("region") String region,
                                        @Query("HKS") String HKS,
                                        @Query("group_id") String group_id);


}
