package dev.shreyaspatil.foodium.di.module;

import java.lang.System;

/**
 * Currently PostRepository is only used in ViewModels.
 * PostDetailsViewModel is not injected using @HiltViewModel so can't install in ViewModelComponent.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Ldev/shreyaspatil/foodium/di/module/PostRepositoryModule;", "", "()V", "bindPostRepository", "Ldev/shreyaspatil/foodium/data/repository/PostRepository;", "repository", "Ldev/shreyaspatil/foodium/data/repository/DefaultPostRepository;", "app_debug"})
@dagger.Module()
public abstract class PostRepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityRetainedScoped()
    @dagger.Binds()
    public abstract dev.shreyaspatil.foodium.data.repository.PostRepository bindPostRepository(@org.jetbrains.annotations.NotNull()
    dev.shreyaspatil.foodium.data.repository.DefaultPostRepository repository);
    
    public PostRepositoryModule() {
        super();
    }
}