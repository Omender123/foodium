package dev.shreyaspatil.foodium.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Ldev/shreyaspatil/foodium/data/repository/PostRepository;", "", "getAllPosts", "Lkotlinx/coroutines/flow/Flow;", "Ldev/shreyaspatil/foodium/data/repository/Resource;", "", "Ldev/shreyaspatil/foodium/model/Post;", "getPostById", "postId", "", "app_debug"})
public abstract interface PostRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<dev.shreyaspatil.foodium.data.repository.Resource<java.util.List<dev.shreyaspatil.foodium.model.Post>>> getAllPosts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<dev.shreyaspatil.foodium.model.Post> getPostById(int postId);
}