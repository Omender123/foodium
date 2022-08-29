package dev.shreyaspatil.foodium.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Ldev/shreyaspatil/foodium/di/module/FoodiumDatabaseModule;", "", "()V", "provideDatabase", "Ldev/shreyaspatil/foodium/data/local/FoodiumPostsDatabase;", "application", "Landroid/app/Application;", "providePostsDao", "Ldev/shreyaspatil/foodium/data/local/dao/PostsDao;", "database", "app_debug"})
@dagger.Module()
public final class FoodiumDatabaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final dev.shreyaspatil.foodium.data.local.FoodiumPostsDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final dev.shreyaspatil.foodium.data.local.dao.PostsDao providePostsDao(@org.jetbrains.annotations.NotNull()
    dev.shreyaspatil.foodium.data.local.FoodiumPostsDatabase database) {
        return null;
    }
    
    public FoodiumDatabaseModule() {
        super();
    }
}