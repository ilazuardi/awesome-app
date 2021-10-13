package com.irfan.awesomeapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/irfan/awesomeapp/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "awesomeUseCase", "Lcom/irfan/awesomeapp/core/domain/usecase/AwesomeUseCase;", "(Lcom/irfan/awesomeapp/core/domain/usecase/AwesomeUseCase;)V", "photo", "Landroidx/lifecycle/LiveData;", "Lcom/irfan/awesomeapp/core/data/Resource;", "", "Lcom/irfan/awesomeapp/core/domain/model/Photo;", "getPhoto", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.irfan.awesomeapp.core.data.Resource<java.util.List<com.irfan.awesomeapp.core.domain.model.Photo>>> photo = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.irfan.awesomeapp.core.domain.usecase.AwesomeUseCase awesomeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.irfan.awesomeapp.core.data.Resource<java.util.List<com.irfan.awesomeapp.core.domain.model.Photo>>> getPhoto() {
        return null;
    }
}