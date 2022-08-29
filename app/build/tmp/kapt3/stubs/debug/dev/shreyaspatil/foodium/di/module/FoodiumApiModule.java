package dev.shreyaspatil.foodium.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Ldev/shreyaspatil/foodium/di/module/FoodiumApiModule;", "", "()V", "provideRetrofitService", "Ldev/shreyaspatil/foodium/data/remote/api/FoodiumService;", "app_debug"})
@dagger.Module()
public final class FoodiumApiModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final dev.shreyaspatil.foodium.data.remote.api.FoodiumService provideRetrofitService() {
        return null;
    }
    
    public FoodiumApiModule() {
        super();
    }
}