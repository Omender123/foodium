package dev.shreyaspatil.foodium.ui.main;

import java.lang.System;

/**
 * ViewModel for [MainActivity]
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\u000eR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Ldev/shreyaspatil/foodium/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "postRepository", "Ldev/shreyaspatil/foodium/data/repository/PostRepository;", "(Ldev/shreyaspatil/foodium/data/repository/PostRepository;)V", "_posts", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ldev/shreyaspatil/foodium/model/State;", "", "Ldev/shreyaspatil/foodium/model/Post;", "posts", "Lkotlinx/coroutines/flow/StateFlow;", "getPosts", "()Lkotlinx/coroutines/flow/StateFlow;", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<dev.shreyaspatil.foodium.model.State<java.util.List<dev.shreyaspatil.foodium.model.Post>>> _posts = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<dev.shreyaspatil.foodium.model.State<java.util.List<dev.shreyaspatil.foodium.model.Post>>> posts = null;
    private final dev.shreyaspatil.foodium.data.repository.PostRepository postRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<dev.shreyaspatil.foodium.model.State<java.util.List<dev.shreyaspatil.foodium.model.Post>>> getPosts() {
        return null;
    }
    
    public final void getPosts() {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    dev.shreyaspatil.foodium.data.repository.PostRepository postRepository) {
        super();
    }
}