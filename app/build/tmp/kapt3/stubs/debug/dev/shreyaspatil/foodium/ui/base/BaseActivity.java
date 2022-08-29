package dev.shreyaspatil.foodium.ui.base;

import java.lang.System;

/**
 * Abstract Activity which binds [ViewModel] [VM] and [ViewBinding] [VB]
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\u0010\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u001c\u0010\u0007\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\r\u001a\u00028\u0000X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Ldev/shreyaspatil/foodium/ui/base/BaseActivity;", "VM", "Landroidx/lifecycle/ViewModel;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mViewBinding", "getMViewBinding", "()Landroidx/viewbinding/ViewBinding;", "setMViewBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "mViewModel", "getMViewModel", "()Landroidx/lifecycle/ViewModel;", "getViewBinding", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity<VM extends androidx.lifecycle.ViewModel, VB extends androidx.viewbinding.ViewBinding> extends androidx.appcompat.app.AppCompatActivity {
    protected VB mViewBinding;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract VM getMViewModel();
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getMViewBinding() {
        return null;
    }
    
    protected final void setMViewBinding(@org.jetbrains.annotations.NotNull()
    VB p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * It returns [VB] which is assigned to [mViewBinding] and used in [onCreate]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract VB getViewBinding();
    
    public BaseActivity() {
        super();
    }
}