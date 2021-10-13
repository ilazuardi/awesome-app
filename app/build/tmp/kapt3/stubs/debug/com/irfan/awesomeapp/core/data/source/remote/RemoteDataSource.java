package com.irfan.awesomeapp.core.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/irfan/awesomeapp/core/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/irfan/awesomeapp/core/data/source/remote/network/ApiService;", "(Lcom/irfan/awesomeapp/core/data/source/remote/network/ApiService;)V", "getAllPhoto", "Landroidx/lifecycle/LiveData;", "Lcom/irfan/awesomeapp/core/data/source/remote/network/ApiResponse;", "", "Lcom/irfan/awesomeapp/core/data/source/remote/response/PhotosItem;", "Companion", "app_debug"})
public final class RemoteDataSource {
    private final com.irfan.awesomeapp.core.data.source.remote.network.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.irfan.awesomeapp.core.data.source.remote.RemoteDataSource.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String tokenApi = "563492ad6f91700001000001f010d7b7b3454a949a7dc0d6f811e03f";
    @kotlin.jvm.Volatile()
    private static volatile com.irfan.awesomeapp.core.data.source.remote.RemoteDataSource instance;
    
    private RemoteDataSource(com.irfan.awesomeapp.core.data.source.remote.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.irfan.awesomeapp.core.data.source.remote.network.ApiResponse<java.util.List<com.irfan.awesomeapp.core.data.source.remote.response.PhotosItem>>> getAllPhoto() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/irfan/awesomeapp/core/data/source/remote/RemoteDataSource$Companion;", "", "()V", "instance", "Lcom/irfan/awesomeapp/core/data/source/remote/RemoteDataSource;", "tokenApi", "", "getInstance", "service", "Lcom/irfan/awesomeapp/core/data/source/remote/network/ApiService;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.irfan.awesomeapp.core.data.source.remote.RemoteDataSource getInstance(@org.jetbrains.annotations.NotNull()
        com.irfan.awesomeapp.core.data.source.remote.network.ApiService service) {
            return null;
        }
    }
}