package net.brcdev.myeconomy;

import net.brcdev.myeconomy.command.MyEconomyCommand;
import net.brcdev.myeconomy.provider.MyEconomyProvider;
import net.brcdev.shopgui.ShopGuiPlusApi;
import org.bukkit.plugin.java.JavaPlugin;

public class MyEconomyPlugin extends JavaPlugin {

  private MyEconomyProvider myEconomyProvider;

  @Override
  public void onEnable() {
    getCommand("myeconomy").setExecutor(new MyEconomyCommand(this));
    hookIntoShopGui();
  }

  private void hookIntoShopGui() {
    this.myEconomyProvider = new MyEconomyProvider();
    ShopGuiPlusApi.registerEconomyProvider(myEconomyProvider);
  }

  public MyEconomyProvider getMyEconomyProvider() {
    return myEconomyProvider;
  }
}
