package dev.shreyaspatil.foodium.data.repository;

import java.lang.System;

/**
 * Singleton repository for fetching data from remote and storing it in database
 * for offline capability. This is Single source of data.
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/shreyaspatil/foodium/data/repository/DefaultPostRepository;", "Ldev/shreyaspatil/foodium/data/repository/PostRepository;", "postsDao", "Ldev/shreyaspatil/foodium/data/local/dao/PostsDao;", "foodiumService", "Ldev/shreyaspatil/foodium/data/remote/api/FoodiumService;", "(Ldev/shreyaspatil/foodium/data/local/dao/PostsDao;Ldev/shreyaspatil/foodium/data/remote/api/FoodiumService;)V", "getAllPosts", "Lkotlinx/coroutines/flow/Flow;", "Ldev/shreyaspatil/foodium/data/repository/Resource;", "", "Ldev/shreyaspatil/foodium/model/Post;", "getPostById", "postId", "", "app_debug"})
public final class DefaultPostRepository implements dev.shreyaspatil.foodium.data.repository.PostRepository {
    private final dev.shreyaspatil.foodium.data.local.dao.PostsDao postsDao = null;
    private final dev.shreyaspatil.foodium.data.remote.api.FoodiumService foodiumService = null;
    
    /**
     * Fetched the posts from network and stored it in database. At the end, data from persistence
     * storage is fetched and emitted.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<dev.shreyaspatil.foodium.data.repository.Resource<java.util.List<dev.shreyaspatil.foodium.model.Post>>> getAllPosts() {
        return null;
    }
    
    /**
     * Retrieves a post with specified [postId].
     * @param postId Unique id of a [Post].
     * @return [Post] data fetched from the database.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<dev.shreyaspatil.foodium.model.Post> getPostById(int postId) {
        return null;
    }
    
    @javax.inject.Inject()
    public DefaultPostRepository(@org.jetbrains.annotations.NotNull()
    dev.shreyaspatil.foodium.data.local.dao.PostsDao postsDao, @org.jetbrains.annotations.NotNull()
    dev.shreyaspatil.foodium.data.remote.api.FoodiumService foodiumService) {
        super();
    }
}