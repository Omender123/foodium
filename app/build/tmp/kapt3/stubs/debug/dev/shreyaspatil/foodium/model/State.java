package dev.shreyaspatil.foodium.model;

import java.lang.System;

/**
 * State Management for UI & Data.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\b\t\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005\u0082\u0001\u0003\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Ldev/shreyaspatil/foodium/model/State;", "T", "", "()V", "isFailed", "", "isLoading", "isSuccessful", "Companion", "Error", "Loading", "Success", "Ldev/shreyaspatil/foodium/model/State$Loading;", "Ldev/shreyaspatil/foodium/model/State$Success;", "Ldev/shreyaspatil/foodium/model/State$Error;", "app_debug"})
public abstract class State<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    public static final dev.shreyaspatil.foodium.model.State.Companion Companion = null;
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isSuccessful() {
        return false;
    }
    
    public final boolean isFailed() {
        return false;
    }
    
    private State() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Ldev/shreyaspatil/foodium/model/State$Loading;", "T", "Ldev/shreyaspatil/foodium/model/State;", "()V", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends dev.shreyaspatil.foodium.model.State<T> {
        
        public Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Ldev/shreyaspatil/foodium/model/State$Success;", "T", "Ldev/shreyaspatil/foodium/model/State;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Ldev/shreyaspatil/foodium/model/State$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends dev.shreyaspatil.foodium.model.State<T> {
        private final T data = null;
        
        public final T getData() {
            return null;
        }
        
        public Success(T data) {
            super();
        }
        
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.shreyaspatil.foodium.model.State.Success<T> copy(T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004H\u00c6\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Ldev/shreyaspatil/foodium/model/State$Error;", "T", "Ldev/shreyaspatil/foodium/model/State;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends dev.shreyaspatil.foodium.model.State<T> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.shreyaspatil.foodium.model.State.Error<T> copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t\"\u0004\b\u0001\u0010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000bJ\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\r\"\u0004\b\u0001\u0010\u0005J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000f\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0010\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Ldev/shreyaspatil/foodium/model/State$Companion;", "", "()V", "error", "Ldev/shreyaspatil/foodium/model/State$Error;", "T", "message", "", "fromResource", "Ldev/shreyaspatil/foodium/model/State;", "resource", "Ldev/shreyaspatil/foodium/data/repository/Resource;", "loading", "Ldev/shreyaspatil/foodium/model/State$Loading;", "success", "Ldev/shreyaspatil/foodium/model/State$Success;", "data", "(Ljava/lang/Object;)Ldev/shreyaspatil/foodium/model/State$Success;", "app_debug"})
    public static final class Companion {
        
        /**
         * Returns [State.Loading] instance.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>dev.shreyaspatil.foodium.model.State.Loading<T> loading() {
            return null;
        }
        
        /**
         * Returns [State.Success] instance.
         * @param data Data to emit with status.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>dev.shreyaspatil.foodium.model.State.Success<T> success(T data) {
            return null;
        }
        
        /**
         * Returns [State.Error] instance.
         * @param message Description of failure.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>dev.shreyaspatil.foodium.model.State.Error<T> error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        /**
         * Returns [State] from [Resource]
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>dev.shreyaspatil.foodium.model.State<T> fromResource(@org.jetbrains.annotations.NotNull()
        dev.shreyaspatil.foodium.data.repository.Resource<T> resource) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}