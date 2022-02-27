// Generated by Dagger (https://dagger.dev).
package uk.endclothing.task.core.di.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOKHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

  public NetworkModule_ProvideOKHttpClientFactory(NetworkModule module,
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    this.module = module;
    this.loggingInterceptorProvider = loggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOKHttpClient(module, loggingInterceptorProvider.get());
  }

  public static NetworkModule_ProvideOKHttpClientFactory create(NetworkModule module,
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    return new NetworkModule_ProvideOKHttpClientFactory(module, loggingInterceptorProvider);
  }

  public static OkHttpClient provideOKHttpClient(NetworkModule instance,
      HttpLoggingInterceptor loggingInterceptor) {
    return Preconditions.checkNotNullFromProvides(instance.provideOKHttpClient(loggingInterceptor));
  }
}