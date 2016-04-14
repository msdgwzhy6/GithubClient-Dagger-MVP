package com.droidcoding.githubclient.di;

import android.content.Context;
import com.droidcoding.githubclient.App;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class AppModule {

  private final App app;

  public AppModule(App app) {
    this.app = app;
  }

  @Provides
  @Singleton Context provideAppContext() {
    return app;
  }
}
