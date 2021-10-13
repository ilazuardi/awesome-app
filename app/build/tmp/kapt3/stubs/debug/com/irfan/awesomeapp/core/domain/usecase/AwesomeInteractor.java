package com.irfan.awesomeapp.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/irfan/awesomeapp/core/domain/usecase/AwesomeInteractor;", "Lcom/irfan/awesomeapp/core/domain/usecase/AwesomeUseCase;", "awesomeRepository", "Lcom/irfan/awesomeapp/core/domain/repository/IAwesomeRepository;", "(Lcom/irfan/awesomeapp/core/domain/repository/IAwesomeRepository;)V", "getAllPhoto", "Landroidx/lifecycle/LiveData;", "Lcom/irfan/awesomeapp/core/data/Resource;", "", "Lcom/irfan/awesomeapp/core/domain/model/Photo;", "app_debug"})
public final class AwesomeInteractor implements com.irfan.awesomeapp.core.domain.usecase.AwesomeUseCase {
    private final com.irfan.awesomeapp.core.domain.repository.IAwesomeRepository awesomeRepository = null;
    
    public AwesomeInteractor(@org.jetbrains.annotations.NotNull()
    com.irfan.awesomeapp.core.domain.repository.IAwesomeRepository awesomeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.irfan.awesomeapp.core.data.Resource<java.util.List<com.irfan.awesomeapp.core.domain.model.Photo>>> getAllPhoto() {
        return null;
    }
}