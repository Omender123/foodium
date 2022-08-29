package dev.shreyaspatil.foodium.data.local.dao;

import java.lang.System;

/**
 * Data Access Object (DAO) for [dev.shreyaspatil.foodium.data.local.FoodiumPostsDatabase]
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000bH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\u000eH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Ldev/shreyaspatil/foodium/data/local/dao/PostsDao;", "", "addPosts", "", "posts", "", "Ldev/shreyaspatil/foodium/model/Post;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllPosts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPosts", "Lkotlinx/coroutines/flow/Flow;", "getPostById", "postId", "", "app_debug"})
public abstract interface PostsDao {
    
    /**
     * Inserts [posts] into the [Post.TABLE_NAME] table.
     * Duplicate values are replaced in the table.
     * @param posts Posts
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object addPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.shreyaspatil.foodium.model.Post> posts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Deletes all the posts from the [Post.TABLE_NAME] table.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM foodium_posts")
    public abstract java.lang.Object deleteAllPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    /**
     * Fetches the post from the [Post.TABLE_NAME] table whose id is [postId].
     * @param postId Unique ID of [Post]
     * @return [Flow] of [Post] from database table.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM foodium_posts WHERE ID = :postId")
    public abstract kotlinx.coroutines.flow.Flow<dev.shreyaspatil.foodium.model.Post> getPostById(int postId);
    
    /**
     * Fetches all the posts from the [Post.TABLE_NAME] table.
     * @return [Flow]
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM foodium_posts")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<dev.shreyaspatil.foodium.model.Post>> getAllPosts();
}