package dev.shreyaspatil.foodium.ui.main.adapter;

import java.lang.System;

/**
 * Adapter class [RecyclerView.Adapter] for [RecyclerView] which binds [Post] along with [PostViewHolder]
 * @param onItemClicked which will receive callback when item is clicked.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldev/shreyaspatil/foodium/ui/main/adapter/PostListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Ldev/shreyaspatil/foodium/model/Post;", "Ldev/shreyaspatil/foodium/ui/main/viewholder/PostViewHolder;", "onItemClicked", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class PostListAdapter extends androidx.recyclerview.widget.ListAdapter<dev.shreyaspatil.foodium.model.Post, dev.shreyaspatil.foodium.ui.main.viewholder.PostViewHolder> {
    private final kotlin.jvm.functions.Function2<dev.shreyaspatil.foodium.model.Post, android.widget.ImageView, kotlin.Unit> onItemClicked = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<dev.shreyaspatil.foodium.model.Post> DIFF_CALLBACK = null;
    @org.jetbrains.annotations.NotNull()
    public static final dev.shreyaspatil.foodium.ui.main.adapter.PostListAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dev.shreyaspatil.foodium.ui.main.viewholder.PostViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    dev.shreyaspatil.foodium.ui.main.viewholder.PostViewHolder holder, int position) {
    }
    
    public PostListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super dev.shreyaspatil.foodium.model.Post, ? super android.widget.ImageView, kotlin.Unit> onItemClicked) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldev/shreyaspatil/foodium/ui/main/adapter/PostListAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Ldev/shreyaspatil/foodium/model/Post;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}