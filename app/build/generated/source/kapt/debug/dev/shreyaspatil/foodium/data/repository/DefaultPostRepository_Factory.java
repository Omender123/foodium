// Generated by Dagger (https://dagger.dev).
package dev.shreyaspatil.foodium.data.repository;

import dagger.internal.Factory;
import dev.shreyaspatil.foodium.data.local.dao.PostsDao;
import dev.shreyaspatil.foodium.data.remote.api.FoodiumService;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DefaultPostRepository_Factory implements Factory<DefaultPostRepository> {
  private final Provider<PostsDao> postsDaoProvider;

  private final Provider<FoodiumService> foodiumServiceProvider;

  public DefaultPostRepository_Factory(Provider<PostsDao> postsDaoProvider,
      Provider<FoodiumService> foodiumServiceProvider) {
    this.postsDaoProvider = postsDaoProvider;
    this.foodiumServiceProvider = foodiumServiceProvider;
  }

  @Override
  public DefaultPostRepository get() {
    return newInstance(postsDaoProvider.get(), foodiumServiceProvider.get());
  }

  public static DefaultPostRepository_Factory create(Provider<PostsDao> postsDaoProvider,
      Provider<FoodiumService> foodiumServiceProvider) {
    return new DefaultPostRepository_Factory(postsDaoProvider, foodiumServiceProvider);
  }

  public static DefaultPostRepository newInstance(PostsDao postsDao,
      FoodiumService foodiumService) {
    return new DefaultPostRepository(postsDao, foodiumService);
  }
}