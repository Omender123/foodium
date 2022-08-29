package dev.shreyaspatil.foodium.data.repository;

import java.lang.System;

/**
 * A repository which provides resource from local database as well as remote end point.
 *
 * [RESULT] represents the type for database.
 * [REQUEST] represents the type for network.
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H%J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Ldev/shreyaspatil/foodium/data/repository/NetworkBoundRepository;", "RESULT", "REQUEST", "", "()V", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "Ldev/shreyaspatil/foodium/data/repository/Resource;", "fetchFromLocal", "fetchFromRemote", "Lretrofit2/Response;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRemoteData", "", "response", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class NetworkBoundRepository<RESULT extends java.lang.Object, REQUEST extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<dev.shreyaspatil.foodium.data.repository.Resource<RESULT>> asFlow() {
        return null;
    }
    
    /**
     * Saves retrieved from remote into the persistence storage.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    protected abstract java.lang.Object saveRemoteData(REQUEST response, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Retrieves all data from persistence storage.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract kotlinx.coroutines.flow.Flow<RESULT> fetchFromLocal();
    
    /**
     * Fetches [Response] from the remote end point.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.MainThread()
    protected abstract java.lang.Object fetchFromRemote(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<REQUEST>> p0);
    
    public NetworkBoundRepository() {
        super();
    }
}