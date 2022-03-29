// Generated by Dagger (https://dagger.dev).
package usa.overplay.task.features.player.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import usa.overplay.task.commons.ui.base.BaseFragment_MembersInjector;
import usa.overplay.task.core.di.CoreComponent;
import usa.overplay.task.features.player.FragmentPlayer;
import usa.overplay.task.features.player.PlayerViewModel;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerPlayerComponent implements PlayerComponent {
  private final DaggerPlayerComponent playerComponent = this;

  private Provider<PlayerViewModel> provideViewModelProvider;

  private DaggerPlayerComponent(PlayersModule playersModuleParam,
      CoreComponent coreComponentParam) {

    initialize(playersModuleParam, coreComponentParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final PlayersModule playersModuleParam,
      final CoreComponent coreComponentParam) {
    this.provideViewModelProvider = DoubleCheck.provider(PlayersModule_ProvideViewModelFactory.create(playersModuleParam));
  }

  @Override
  public void inject(FragmentPlayer fragment) {
    injectFragmentPlayer(fragment);
  }

  private FragmentPlayer injectFragmentPlayer(FragmentPlayer instance) {
    BaseFragment_MembersInjector.injectViewModel(instance, provideViewModelProvider.get());
    return instance;
  }

  public static final class Builder {
    private PlayersModule playersModule;

    private CoreComponent coreComponent;

    private Builder() {
    }

    public Builder playersModule(PlayersModule playersModule) {
      this.playersModule = Preconditions.checkNotNull(playersModule);
      return this;
    }

    public Builder coreComponent(CoreComponent coreComponent) {
      this.coreComponent = Preconditions.checkNotNull(coreComponent);
      return this;
    }

    public PlayerComponent build() {
      Preconditions.checkBuilderRequirement(playersModule, PlayersModule.class);
      Preconditions.checkBuilderRequirement(coreComponent, CoreComponent.class);
      return new DaggerPlayerComponent(playersModule, coreComponent);
    }
  }
}
