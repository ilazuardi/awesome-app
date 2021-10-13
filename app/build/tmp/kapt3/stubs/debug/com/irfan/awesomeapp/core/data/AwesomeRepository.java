package com.irfan.awesomeapp.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/irfan/awesomeapp/core/data/AwesomeRepository;", "Lcom/irfan/awesomeapp/core/domain/repository/IAwesomeRepository;", "remoteDataSource", "Lcom/irfan/awesomeapp/core/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/irfan/awesomeapp/core/data/source/local/LocalDataSource;", "appExecutors", "Lcom/irfan/awesomeapp/core/utils/AppExecutors;", "(Lcom/irfan/awesomeapp/core/data/source/remote/RemoteDataSource;Lcom/irfan/awesomeapp/core/data/source/local/LocalDataSource;Lcom/irfan/awesomeapp/core/utils/AppExecutors;)V", "getAllPhoto", "Landroidx/lifecycle/LiveData;", "Lcom/irfan/awesomeapp/core/data/Resource;", "", "Lcom/irfan/awesomeapp/core/domain/model/Photo;", "Companion", "app_debug"})
public final class AwesomeRepository implements com.irfan.awesomeapp.core.domain.repository.IAwesomeRepository {
    private final com.irfan.awesomeapp.core.data.source.remote.RemoteDataSource remoteDataSource = null;
    private final com.irfan.awesomeapp.core.data.source.local.LocalDataSource localDataSource = null;
    private final com.irfan.awesomeapp.core.utils.AppExecutors appExecutors = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.irfan.awesomeapp.core.data.AwesomeRepository.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.irfan.awesomeapp.core.data.AwesomeRepository instance;
    
    private AwesomeRepository(com.irfan.awesomeapp.core.data.source.remote.RemoteDataSource remoteDataSource, com.irfan.awesomeapp.core.data.source.local.LocalDataSource localDataSource, com.irfan.awesomeapp.core.utils.AppExecutors appExecutors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.irfan.awesomeapp.core.data.Resource<java.util.List<com.irfan.awesomeapp.core.domain.model.Photo>>> getAllPhoto() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/irfan/awesomeapp/core/data/AwesomeRepository$Companion;", "", "()V", "instance", "Lcom/irfan/awesomeapp/core/data/AwesomeRepository;", "getInstance", "remoteData", "Lcom/irfan/awesomeapp/core/data/source/remote/RemoteDataSource;", "localData", "Lcom/irfan/awesomeapp/core/data/source/local/LocalDataSource;", "appExecutors", "Lcom/irfan/awesomeapp/core/utils/AppExecutors;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.irfan.awesomeapp.core.data.AwesomeRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.irfan.awesomeapp.core.data.source.remote.RemoteDataSource remoteData, @org.jetbrains.annotations.NotNull()
        com.irfan.awesomeapp.core.data.source.local.LocalDataSource localData, @org.jetbrains.annotations.NotNull()
        com.irfan.awesomeapp.core.utils.AppExecutors appExecutors) {
            return null;
        }
    }
}