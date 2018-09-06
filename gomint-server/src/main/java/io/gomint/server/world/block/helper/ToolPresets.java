package io.gomint.server.world.block.helper;

import io.gomint.inventory.item.*;

/**
 * @author geNAZt
 * @version 1.0
 */
public final class ToolPresets {

    private ToolPresets() {

    }

    public static final Class<? extends ItemStack>[] AXE = new Class[]{
        ItemDiamondAxe.class,
        ItemGoldenAxe.class,
        ItemIronAxe.class,
        ItemStoneAxe.class,
        ItemWoodenAxe.class
    };

    public static final Class<? extends ItemStack>[] PICKAXE = new Class[]{
        ItemDiamondPickaxe.class,
        ItemGoldenPickaxe.class,
        ItemIronPickaxe.class,
        ItemStonePickaxe.class,
        ItemWoodenPickaxe.class
    };

    public static final Class<? extends ItemStack>[] SHOVEL = new Class[]{
        ItemWoodenShovel.class,
        ItemIronShovel.class,
        ItemDiamondShovel.class,
        ItemGoldenShovel.class,
        ItemStoneShovel.class
    };

    public static final Class<? extends ItemStack>[] SWORD = new Class[]{
        ItemDiamondSword.class,
        ItemIronSword.class,
        ItemGoldenSword.class,
        ItemStoneSword.class,
        ItemWoodenSword.class
    };

}