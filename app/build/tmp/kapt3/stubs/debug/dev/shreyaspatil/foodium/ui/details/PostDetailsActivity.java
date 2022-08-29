package dev.shreyaspatil.foodium.ui.details;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0014J\b\u0010\u001e\u001a\u00020\u0012H\u0002R\u001b\u0010\u0005\u001a\u00020\u00028TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Ldev/shreyaspatil/foodium/ui/details/PostDetailsActivity;", "Ldev/shreyaspatil/foodium/ui/base/BaseActivity;", "Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel;", "Ldev/shreyaspatil/foodium/databinding/ActivityPostDetailsBinding;", "()V", "mViewModel", "getMViewModel", "()Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel$PostDetailsViewModelFactory;", "getViewModelFactory", "()Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel$PostDetailsViewModelFactory;", "setViewModelFactory", "(Ldev/shreyaspatil/foodium/ui/details/PostDetailsViewModel$PostDetailsViewModelFactory;)V", "getViewBinding", "initPost", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "share", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PostDetailsActivity extends dev.shreyaspatil.foodium.ui.base.BaseActivity<dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel, dev.shreyaspatil.foodium.databinding.ActivityPostDetailsBinding> {
    @javax.inject.Inject()
    public dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel.PostDetailsViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    private static final java.lang.String KEY_POST_ID = "postId";
    @org.jetbrains.annotations.NotNull()
    public static final dev.shreyaspatil.foodium.ui.details.PostDetailsActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel.PostDetailsViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel.PostDetailsViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void initPost() {
    }
    
    private final void share() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dev.shreyaspatil.foodium.databinding.ActivityPostDetailsBinding getViewBinding() {
        return null;
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
    
    public PostDetailsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ldev/shreyaspatil/foodium/ui/details/PostDetailsActivity$Companion;", "", "()V", "KEY_POST_ID", "", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "postId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getStartIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int postId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}