package com.irfan.awesomeapp.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u000bJ\u001e\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e0\r0\u000bH$J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH$J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\u001a\u0010\u0015\u001a\u00020\u00112\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH$J\u0017\u0010\u0017\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H$\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/irfan/awesomeapp/core/data/NetworkBoundResource;", "ResultType", "RequestType", "", "mExecutors", "Lcom/irfan/awesomeapp/core/utils/AppExecutors;", "(Lcom/irfan/awesomeapp/core/utils/AppExecutors;)V", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/irfan/awesomeapp/core/data/Resource;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCall", "Lcom/irfan/awesomeapp/core/data/source/remote/network/ApiResponse;", "", "Lcom/irfan/awesomeapp/core/data/source/remote/response/PhotosItem;", "fetchFromNetwork", "", "dbSource", "loadFromDB", "onFetchFailed", "saveCallResult", "data", "shouldFetch", "", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final com.irfan.awesomeapp.core.utils.AppExecutors mExecutors = null;
    private final androidx.lifecycle.MediatorLiveData<com.irfan.awesomeapp.core.data.Resource<ResultType>> result = null;
    
    public NetworkBoundResource(@org.jetbrains.annotations.NotNull()
    com.irfan.awesomeapp.core.utils.AppExecutors mExecutors) {
        super();
    }
    
    protected void onFetchFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.LiveData<ResultType> loadFromDB();
    
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.LiveData<com.irfan.awesomeapp.core.data.source.remote.network.ApiResponse<java.util.List<com.irfan.awesomeapp.core.data.source.remote.response.PhotosItem>>> createCall();
    
    protected abstract void saveCallResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.irfan.awesomeapp.core.data.source.remote.response.PhotosItem> data);
    
    private final void fetchFromNetwork(androidx.lifecycle.LiveData<ResultType> dbSource) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.irfan.awesomeapp.core.data.Resource<ResultType>> asLiveData() {
        return null;
    }
}