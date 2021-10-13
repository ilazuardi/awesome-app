package com.irfan.awesomeapp.core.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/irfan/awesomeapp/core/data/source/local/LocalDataSource;", "", "photoDao", "Lcom/irfan/awesomeapp/core/data/source/local/room/PhotoDao;", "(Lcom/irfan/awesomeapp/core/data/source/local/room/PhotoDao;)V", "getAllPhoto", "Landroidx/lifecycle/LiveData;", "", "Lcom/irfan/awesomeapp/core/data/source/local/entity/PhotoEntity;", "insertPhoto", "", "photoList", "Companion", "app_debug"})
public final class LocalDataSource {
    private final com.irfan.awesomeapp.core.data.source.local.room.PhotoDao photoDao = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.irfan.awesomeapp.core.data.source.local.LocalDataSource.Companion Companion = null;
    private static com.irfan.awesomeapp.core.data.source.local.LocalDataSource instance;
    
    private LocalDataSource(com.irfan.awesomeapp.core.data.source.local.room.PhotoDao photoDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity>> getAllPhoto() {
        return null;
    }
    
    public final void insertPhoto(@org.jetbrains.annotations.NotNull()
    java.util.List<com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity> photoList) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/irfan/awesomeapp/core/data/source/local/LocalDataSource$Companion;", "", "()V", "instance", "Lcom/irfan/awesomeapp/core/data/source/local/LocalDataSource;", "getInstance", "photoDao", "Lcom/irfan/awesomeapp/core/data/source/local/room/PhotoDao;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.irfan.awesomeapp.core.data.source.local.LocalDataSource getInstance(@org.jetbrains.annotations.NotNull()
        com.irfan.awesomeapp.core.data.source.local.room.PhotoDao photoDao) {
            return null;
        }
    }
}