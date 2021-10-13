package com.irfan.awesomeapp.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/irfan/awesomeapp/core/di/Injection;", "", "()V", "provideAwesomeUseCase", "Lcom/irfan/awesomeapp/core/domain/usecase/AwesomeUseCase;", "context", "Landroid/content/Context;", "provideRepository", "Lcom/irfan/awesomeapp/core/data/AwesomeRepository;", "app_debug"})
public final class Injection {
    @org.jetbrains.annotations.NotNull()
    public static final com.irfan.awesomeapp.core.di.Injection INSTANCE = null;
    
    private Injection() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.irfan.awesomeapp.core.data.AwesomeRepository provideRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.irfan.awesomeapp.core.domain.usecase.AwesomeUseCase provideAwesomeUseCase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}