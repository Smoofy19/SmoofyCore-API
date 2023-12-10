package de.smoofy.core.api.item;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import com.cryptomorin.xseries.XEnchantment;
import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import com.google.common.collect.Lists;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class ItemBuilder {

    private final ItemStack itemStack;
    private ItemMeta itemMeta;

    public ItemBuilder(ItemStack itemStack) {
        this.itemStack = itemStack;
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemBuilder(XMaterial xmaterial) {
        Material material = xmaterial.parseMaterial();
        if (material == null) {
            material = Material.AIR;
        }
        this.itemStack = new ItemStack(material);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemBuilder name(String name) {
        this.itemMeta.setDisplayName(name);
        return this;
    }

    public ItemBuilder amount(int amount) {
        this.itemStack.setAmount(amount);
        return this;
    }

    public ItemBuilder itemFlags(ItemFlag... itemFlags) {
        this.itemMeta.addItemFlags(itemFlags);
        return this;
    }

    public ItemBuilder unbreakable() {
        this.itemMeta.setUnbreakable(true);
        return this;
    }

    public ItemBuilder enchant(XEnchantment enchantment, int level) {
        if (enchantment.getEnchant() == null) {
            return this;
        }
        this.itemMeta.addEnchant(enchantment.getEnchant(), level, true);
        return this;
    }

    public ItemBuilder enchantUnsafe(XEnchantment enchantment, int level) {
        if (enchantment.getEnchant() == null) {
            return this;
        }
        this.itemStack.addUnsafeEnchantment(enchantment.getEnchant(), level);
        return this;
    }

    public ItemBuilder potionEffect(XPotion potion, int duration, int amplifier) {
        PotionEffect potionEffect = potion.buildPotionEffect(duration, amplifier);
        if (potionEffect == null) {
            return this;
        }
        PotionMeta potionMeta = (PotionMeta) this.itemMeta;
        potionMeta.setMainEffect(potionEffect.getType());
        this.itemMeta = potionMeta;
        return this;
    }

    public ItemBuilder lore(String... lore) {
        this.itemMeta.setLore(Arrays.asList(lore));
        return this;
    }

    public ItemBuilder lore(List<String> lore) {
        this.itemMeta.setLore(lore);
        return this;
    }

    public ItemBuilder removeLoreLine(String line) {
        if (!this.itemMeta.hasLore() || this.itemMeta.getLore() == null) {
            return this;
        }
        List<String> lore = Lists.newArrayList(this.itemMeta.getLore());
        if (!lore.contains(line)) return this;
        lore.remove(line);
        this.itemMeta.setLore(lore);
        return this;
    }

    public ItemBuilder removeLoreLine(int index) {
        if (!this.itemMeta.hasLore() || this.itemMeta.getLore() == null) {
            return this;
        }
        List<String> lore = Lists.newArrayList(this.itemMeta.getLore());
        if (index < 0 || index > lore.size()) return this;
        lore.remove(index);
        this.itemMeta.setLore(lore);
        return this;
    }

    public ItemBuilder addLoreLine(String line) {
        List<String> lore = Lists.newArrayList();
        if (this.itemMeta.hasLore() && this.itemMeta.getLore() != null)
            lore = Lists.newArrayList(this.itemMeta.getLore());
        lore.add(line);
        this.itemMeta.setLore(lore);
        return this;
    }

    public ItemBuilder addLoreLine(String line, int pos) {
        if (!this.itemMeta.hasLore() || this.itemMeta.getLore() == null) {
            return this;
        }
        List<String> lore = Lists.newArrayList(this.itemMeta.getLore());
        lore.set(pos, line);
        this.itemMeta.setLore(lore);
        return this;
    }

    public ItemStack build() {
        this.itemStack.setItemMeta(this.itemMeta);
        return this.itemStack;
    }
}
