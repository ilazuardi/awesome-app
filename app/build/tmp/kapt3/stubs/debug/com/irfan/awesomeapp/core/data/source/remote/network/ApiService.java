package com.irfan.awesomeapp.core.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/irfan/awesomeapp/core/data/source/remote/network/ApiService;", "", "getListPhoto", "Lretrofit2/Call;", "Lcom/irfan/awesomeapp/core/data/source/remote/response/ListPhotoResponse;", "token", "", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "curated")
    public abstract retrofit2.Call<com.irfan.awesomeapp.core.data.source.remote.response.ListPhotoResponse> getListPhoto(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
}