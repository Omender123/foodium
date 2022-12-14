// Generated by Dagger (https://dagger.dev).
package dev.shreyaspatil.foodium.ui.details;

import dev.shreyaspatil.foodium.data.repository.PostRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostDetailsViewModel_Factory {
  private final Provider<PostRepository> postRepositoryProvider;

  public PostDetailsViewModel_Factory(Provider<PostRepository> postRepositoryProvider) {
    this.postRepositoryProvider = postRepositoryProvider;
  }

  public PostDetailsViewModel get(int postId) {
    return newInstance(postRepositoryProvider.get(), postId);
  }

  public static PostDetailsViewModel_Factory create(
      Provider<PostRepository> postRepositoryProvider) {
    return new PostDetailsViewModel_Factory(postRepositoryProvider);
  }

  public static PostDetailsViewModel newInstance(PostRepository postRepository, int postId) {
    return new PostDetailsViewModel(postRepository, postId);
  }
}
