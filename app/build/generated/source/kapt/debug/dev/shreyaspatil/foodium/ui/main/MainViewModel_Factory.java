// Generated by Dagger (https://dagger.dev).
package dev.shreyaspatil.foodium.ui.main;

import dagger.internal.Factory;
import dev.shreyaspatil.foodium.data.repository.PostRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<PostRepository> postRepositoryProvider;

  public MainViewModel_Factory(Provider<PostRepository> postRepositoryProvider) {
    this.postRepositoryProvider = postRepositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(postRepositoryProvider.get());
  }

  public static MainViewModel_Factory create(Provider<PostRepository> postRepositoryProvider) {
    return new MainViewModel_Factory(postRepositoryProvider);
  }

  public static MainViewModel newInstance(PostRepository postRepository) {
    return new MainViewModel(postRepository);
  }
}
