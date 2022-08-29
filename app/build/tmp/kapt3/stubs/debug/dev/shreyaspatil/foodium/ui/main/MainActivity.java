package dev.shreyaspatil.foodium.ui.main;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\rH\u0014J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00028TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006&"}, d2 = {"Ldev/shreyaspatil/foodium/ui/main/MainActivity;", "Ldev/shreyaspatil/foodium/ui/base/BaseActivity;", "Ldev/shreyaspatil/foodium/ui/main/MainViewModel;", "Ldev/shreyaspatil/foodium/databinding/ActivityMainBinding;", "()V", "mAdapter", "Ldev/shreyaspatil/foodium/ui/main/adapter/PostListAdapter;", "mViewModel", "getMViewModel", "()Ldev/shreyaspatil/foodium/ui/main/MainViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "getPosts", "", "getViewBinding", "handleNetworkChanges", "initView", "observePosts", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onItemClicked", "post", "Ldev/shreyaspatil/foodium/model/Post;", "imageView", "Landroid/widget/ImageView;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "showLoading", "isLoading", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends dev.shreyaspatil.foodium.ui.base.BaseActivity<dev.shreyaspatil.foodium.ui.main.MainViewModel, dev.shreyaspatil.foodium.databinding.ActivityMainBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    private final dev.shreyaspatil.foodium.ui.main.adapter.PostListAdapter mAdapter = null;
    public static final long ANIMATION_DURATION = 1000L;
    @org.jetbrains.annotations.NotNull()
    public static final dev.shreyaspatil.foodium.ui.main.MainActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dev.shreyaspatil.foodium.ui.main.MainViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void initView() {
    }
    
    private final void observePosts() {
    }
    
    private final void getPosts() {
    }
    
    private final void showLoading(boolean isLoading) {
    }
    
    /**
     * Observe network changes i.e. Internet Connectivity
     */
    private final void handleNetworkChanges() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dev.shreyaspatil.foodium.databinding.ActivityMainBinding getViewBinding() {
        return null;
    }
    
    private final void onItemClicked(dev.shreyaspatil.foodium.model.Post post, android.widget.ImageView imageView) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldev/shreyaspatil/foodium/ui/main/MainActivity$Companion;", "", "()V", "ANIMATION_DURATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}