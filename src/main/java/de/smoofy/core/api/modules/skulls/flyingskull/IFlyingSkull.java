package de.smoofy.core.api.modules.skulls.flyingskull;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:10
 */

import de.smoofy.core.api.player.ICorePlayer;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 *
 */
public interface IFlyingSkull {

    void initArmorStands();

    void display(ICorePlayer player);

    void destroy(ICorePlayer player);

    void updateEquipment(ICorePlayer player, Object slot, ItemStack itemStack);
    //void updateEquipment(Player player, EnumItemSlot slot, ItemStack itemStack);

    Location location();

    Object armorStand();

    List<ICorePlayer> updateList();
}
