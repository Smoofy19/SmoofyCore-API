package de.smoofy.core.api.modules.skulls;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:10
 */

import de.smoofy.core.api.modules.skulls.flyingskull.IFlyingSkull;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 *
 */
public interface ISkullHandler {

    IFlyingSkull create(Location location, ItemStack itemStack, boolean smallHead);

    IFlyingSkull create(Location location, boolean smallHead);

    ItemStack skull(Player player);

    ItemStack skull(String skinUrl);

    ItemStack skull(String skinUrl, String displayName);

    boolean setBlock(Player player, String skinUrl);

    Object blockPositionFor(int x, int y, int z);
}
