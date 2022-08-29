package dev.shreyaspatil.foodium;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = FoodiumApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface FoodiumApp_GeneratedInjector {
  void injectFoodiumApp(FoodiumApp foodiumApp);
}
