package dev.shreyaspatil.foodium.data.remote.api;

import java.lang.System;

/**
 * Service to fetch Foodium posts using dummy end point [FOODIUM_API_URL].
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Ldev/shreyaspatil/foodium/data/remote/api/FoodiumService;", "", "getPosts", "Lretrofit2/Response;", "", "Ldev/shreyaspatil/foodium/model/Post;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface FoodiumService {
    @org.jetbrains.annotations.NotNull()
    public static final dev.shreyaspatil.foodium.data.remote.api.FoodiumService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FOODIUM_API_URL = "https://patilshreyas.github.io/";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/DummyFoodiumApi/api/posts/")
    public abstract java.lang.Object getPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<dev.shreyaspatil.foodium.model.Post>>> p0);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldev/shreyaspatil/foodium/data/remote/api/FoodiumService$Companion;", "", "()V", "FOODIUM_API_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FOODIUM_API_URL = "https://patilshreyas.github.io/";
        
        private Companion() {
            super();
        }
    }
}