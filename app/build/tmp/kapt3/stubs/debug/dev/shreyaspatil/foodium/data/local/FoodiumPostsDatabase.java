package dev.shreyaspatil.foodium.data.local;

import java.lang.System;

/**
 * Abstract Foodium database.
 * It provides DAO [PostsDao] by using method [getPostsDao].
 */
@androidx.room.Database(entities = {dev.shreyaspatil.foodium.model.Post.class}, version = 2)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Ldev/shreyaspatil/foodium/data/local/FoodiumPostsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getPostsDao", "Ldev/shreyaspatil/foodium/data/local/dao/PostsDao;", "Companion", "app_debug"})
public abstract class FoodiumPostsDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DB_NAME = "foodium_database";
    private static volatile dev.shreyaspatil.foodium.data.local.FoodiumPostsDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final dev.shreyaspatil.foodium.data.local.FoodiumPostsDatabase.Companion Companion = null;
    
    /**
     * @return [PostsDao] Foodium Posts Data Access Object.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract dev.shreyaspatil.foodium.data.local.dao.PostsDao getPostsDao();
    
    public FoodiumPostsDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/shreyaspatil/foodium/data/local/FoodiumPostsDatabase$Companion;", "", "()V", "DB_NAME", "", "INSTANCE", "Ldev/shreyaspatil/foodium/data/local/FoodiumPostsDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final dev.shreyaspatil.foodium.data.local.FoodiumPostsDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}