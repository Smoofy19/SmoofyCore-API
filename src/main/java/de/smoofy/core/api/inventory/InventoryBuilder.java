package de.smoofy.core.api.inventory;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 14.12.2023 - 23:23
 */

import de.smoofy.core.api.item.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

/**
 *
 */
public class InventoryBuilder {

    private final Inventory inventory;

    public InventoryBuilder(Inventory inventory) {
        this.inventory = inventory;
    }

    public InventoryBuilder(String title, int lines) {
        this.inventory = Bukkit.createInventory(null, lines*9, title);
    }

    public InventoryBuilder(String title, InventoryType inventoryType) {
        this.inventory = Bukkit.createInventory(null, inventoryType, title);
    }

    public InventoryBuilder(InventoryHolder inventoryHolder, int size, String title) {
        this.inventory = Bukkit.createInventory(inventoryHolder, size, title);
    }

    public InventoryBuilder fill(ItemBuilder itemBuilder) {
        for (int i = 0; i < this.inventory.getSize(); i++) this.inventory.setItem(i, itemBuilder.build());

        return this;
    }

    public InventoryBuilder set(ItemBuilder itemBuilder, int... slots) {
        for (int slot : slots) this.inventory.setItem(slot, itemBuilder.build());

        return this;
    }

    public InventoryBuilder set(int row, int line, ItemStack itemStack) {
        int slot = (row - 1) * 9 + line - 1;
        this.set(new ItemBuilder(itemStack), slot);

        return this;
    }

    public InventoryBuilder add(ItemBuilder itemBuilder) {
        this.inventory.addItem(itemBuilder.build());

        return this;
    }

    public Inventory build() {
        return this.inventory;
    }
}
