package dev.shreyaspatil.foodium.ui.details;

import java.lang.System;

/**
 * ViewModel for [PostDetailsActivity]
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "postRepository", "Ldev/shreyaspatil/foodium/data/repository/PostRepository;", "postId", "", "(Ldev/shreyaspatil/foodium/data/repository/PostRepository;I)V", "post", "Landroidx/lifecycle/LiveData;", "Ldev/shreyaspatil/foodium/model/Post;", "getPost", "()Landroidx/lifecycle/LiveData;", "Companion", "PostDetailsViewModelFactory", "app_debug"})
public final class PostDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<dev.shreyaspatil.foodium.model.Post> post = null;
    @org.jetbrains.annotations.NotNull()
    public static final dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<dev.shreyaspatil.foodium.model.Post> getPost() {
        return null;
    }
    
    @dagger.assisted.AssistedInject()
    public PostDetailsViewModel(@org.jetbrains.annotations.NotNull()
    dev.shreyaspatil.foodium.data.repository.PostRepository postRepository, @dagger.assisted.Assisted()
    int postId) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel$PostDetailsViewModelFactory;", "", "create", "Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel;", "postId", "", "app_debug"})
    @dagger.assisted.AssistedFactory()
    public static abstract interface PostDetailsViewModelFactory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel create(int postId);
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel$Companion;", "", "()V", "provideFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "assistedFactory", "Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel$PostDetailsViewModelFactory;", "postId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.ViewModelProvider.Factory provideFactory(@org.jetbrains.annotations.NotNull()
        dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel.PostDetailsViewModelFactory assistedFactory, int postId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}