package de.smoofy.core.api.item;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 20.12.2023 - 21:41
 */

import com.cryptomorin.xseries.XMaterial;

/**
 *
 */
public class ItemConverter {

    private final XMaterial material;

    public ItemConverter(XMaterial material) {
        this.material = material;
    }

    public String getIdAndData() {
        switch (material) {
            case STONE -> {
                return "1:0";
            }
            case GRANITE -> {
                return "1:1";
            }
            case POLISHED_GRANITE -> {
                return "1:2";
            }
            case DIORITE -> {
                return "1:3";
            }
            case POLISHED_DIORITE -> {
                return "1:4";
            }
            case ANDESITE -> {
                return "1:5";
            }
            case POLISHED_ANDESITE -> {
                return "1:6";
            }
            case GRASS_BLOCK -> {
                return "2:0";
            }
            case DIRT -> {
                return "3:0";
            }
            case COARSE_DIRT -> {
                return "3:1";
            }
            case PODZOL -> {
                return "3:2";
            }
            case COBBLESTONE -> {
                return "4:0";
            }
            case OAK_PLANKS -> {
                return "5:0";
            }
            case SPRUCE_PLANKS -> {
                return "5:1";
            }
            case BIRCH_PLANKS -> {
                return "5:2";
            }
            case JUNGLE_PLANKS -> {
                return "5:3";
            }
            case ACACIA_PLANKS -> {
                return "5:4";
            }
            case DARK_OAK_PLANKS -> {
                return "5:5";
            }
            case OAK_SAPLING -> {
                return "6:0";
            }
            case SPRUCE_SAPLING -> {
                return "6:1";
            }
            case BIRCH_SAPLING -> {
                return "6:2";
            }
            case JUNGLE_SAPLING -> {
                return "6:3";
            }
            case ACACIA_SAPLING -> {
                return "6:4";
            }
            case DARK_OAK_SAPLING -> {
                return "6:5";
            }
            case BEDROCK -> {
                return "7:0";
            }
            case WATER -> {
                return "8:0";
            }
            case LAVA -> {
                return "10:0";
            }
            case SAND -> {
                return "12:0";
            }
            case RED_SAND -> {
                return "12:1";
            }
            case GRAVEL -> {
                return "13:0";
            }
            case GOLD_ORE -> {
                return "14:0";
            }
            case IRON_ORE -> {
                return "15:0";
            }
            case COAL_ORE -> {
                return "16:0";
            }
            case OAK_LOG -> {
                return "17:0";
            }
            case SPRUCE_LOG -> {
                return "17:1";
            }
            case BIRCH_LOG -> {
                return "17:2";
            }
            case JUNGLE_LOG -> {
                return "17:3";
            }
            case OAK_LEAVES -> {
                return "18:0";
            }
            case SPRUCE_LEAVES -> {
                return "18:1";
            }
            case BIRCH_LEAVES -> {
                return "18:2";
            }
            case JUNGLE_LEAVES -> {
                return "18:3";
            }
            case SPONGE -> {
                return "19:0";
            }
            case WET_SPONGE -> {
                return "19:1";
            }
            case GLASS -> {
                return "20:0";
            }
            case LAPIS_ORE -> {
                return "21:0";
            }
            case LAPIS_BLOCK -> {
                return "22:0";
            }
            case DISPENSER -> {
                return "23:0";
            }
            case SANDSTONE -> {
                return "24:0";
            }
            case CHISELED_SANDSTONE -> {
                return "24:1";
            }
            case SMOOTH_SANDSTONE -> {
                return "24:2";
            }
            case NOTE_BLOCK -> {
                return "25:0";
            }
            case BLACK_BED, BLUE_BED, BROWN_BED, CYAN_BED, GRAY_BED, GREEN_BED, LIGHT_BLUE_BED, LIGHT_GRAY_BED, LIME_BED,
                    MAGENTA_BED, ORANGE_BED, PINK_BED, PURPLE_BED, RED_BED, WHITE_BED, YELLOW_BED -> {
                return "26:0";
            }
            case POWERED_RAIL -> {
                return "27:0";
            }
            case DETECTOR_RAIL -> {
                return "28:0";
            }
            case STICKY_PISTON -> {
                return "29:0";
            }
            case COBWEB -> {
                return "30:0";
            }
            case TALL_GRASS -> {
                return "31:1";
            }
            case FERN -> {
                return "31:2";
            }
            case DEAD_BUSH -> {
                return "32:0";
            }
            case PISTON -> {
                return "33:0";
            }
            case PISTON_HEAD -> {
                return "34:0";
            }
            case WHITE_WOOL -> {
                return "35:0";
            }
            case ORANGE_WOOL -> {
                return "35:1";
            }
            case MAGENTA_WOOL -> {
                return "35:2";
            }
            case LIGHT_BLUE_WOOL -> {
                return "35:3";
            }
            case YELLOW_WOOL -> {
                return "35:4";
            }
            case LIME_WOOL -> {
                return "35:5";
            }
            case PINK_WOOL -> {
                return "35:6";
            }
            case GRAY_WOOL -> {
                return "35:7";
            }
            case LIGHT_GRAY_WOOL -> {
                return "35:8";
            }
            case CYAN_WOOL -> {
                return "35:9";
            }
            case PURPLE_WOOL -> {
                return "35:10";
            }
            case BLUE_WOOL -> {
                return "35:11";
            }
            case BROWN_WOOL -> {
                return "35:12";
            }
            case GREEN_WOOL -> {
                return "35:13";
            }
            case RED_WOOL -> {
                return "35:14";
            }
            case BLACK_WOOL -> {
                return "35:15";
            }
            case DANDELION -> {
                return "37:0";
            }
            case POPPY -> {
                return "38:0";
            }
            case BLUE_ORCHID -> {
                return "38:1";
            }
            case ALLIUM -> {
                return "38:2";
            }
            case AZURE_BLUET -> {
                return "38:3";
            }
            case RED_TULIP -> {
                return "38:4";
            }
            case ORANGE_TULIP -> {
                return "38:5";
            }
            case WHITE_TULIP -> {
                return "38:6";
            }
            case PINK_TULIP -> {
                return "38:7";
            }
            case OXEYE_DAISY -> {
                return "38:8";
            }
            case BROWN_MUSHROOM -> {
                return "39:0";
            }
            case RED_MUSHROOM -> {
                return "40:0";
            }
            case GOLD_BLOCK -> {
                return "41:0";
            }
            case IRON_BLOCK -> {
                return "42:0";
            }
            case STONE_SLAB -> {
                return "44:0";
            }
            case SANDSTONE_SLAB -> {
                return "44:1";
            }
            case COBBLESTONE_SLAB -> {
                return "44:3";
            }
            case BRICK_SLAB -> {
                return "44:4";
            }
            case STONE_BRICK_SLAB -> {
                return "44:5";
            }
            case NETHER_BRICK_SLAB -> {
                return "44:6";
            }
            case QUARTZ_SLAB -> {
                return "44:7";
            }
            case BRICKS -> {
                return "45:0";
            }
            case TNT -> {
                return "46:0";
            }
            case BOOKSHELF -> {
                return "47:0";
            }
            case MOSSY_COBBLESTONE -> {
                return "48:0";
            }
            case OBSIDIAN -> {
                return "49:0";
            }
            case TORCH -> {
                return "50:0";
            }
            case FIRE -> {
                return "51:0";
            }
            case SPAWNER -> {
                return "52:0";
            }
            case OAK_STAIRS -> {
                return "53:0";
            }
            case CHEST -> {
                return "54:0";
            }
            case REDSTONE_WIRE -> {
                return "55:0";
            }
            case DIAMOND_ORE -> {
                return "56:0";
            }
            case DIAMOND_BLOCK -> {
                return "57:0";
            }
            case CRAFTING_TABLE -> {
                return "58:0";
            }
            case FARMLAND -> {
                return "60:0";
            }
            case FURNACE -> {
                return "61:0";
            }
            case OAK_SIGN -> {
                return "63:0";
            }
            case LADDER -> {
                return "65:0";
            }
            case RAIL -> {
                return "66:0";
            }
            case COBBLESTONE_STAIRS -> {
                return "67:0";
            }
            case OAK_WALL_SIGN -> {
                return "68:0";
            }
            case LEVER -> {
                return "69:0";
            }
            case STONE_PRESSURE_PLATE -> {
                return "70:0";
            }
            case OAK_PRESSURE_PLATE -> {
                return "72:0";
            }
            case REDSTONE_ORE -> {
                return "73:0";
            }
            case REDSTONE_TORCH -> {
                return "76:0";
            }
            case STONE_BUTTON -> {
                return "77:0";
            }
            case SNOW -> {
                return "78:0";
            }
            case ICE -> {
                return "79:0";
            }
            case SNOW_BLOCK -> {
                return "80:0";
            }
            case CACTUS -> {
                return "81:0";
            }
            case CLAY -> {
                return "82:0";
            }
            case SUGAR_CANE -> {
                return "83:0";
            }
            case JUKEBOX -> {
                return "84:0";
            }
            case OAK_FENCE -> {
                return "85:0";
            }
            case PUMPKIN -> {
                return "86:0";
            }
            case NETHERRACK -> {
                return "87:0";
            }
            case SOUL_SAND -> {
                return "88:0";
            }
            case GLOWSTONE -> {
                return "89:0";
            }
            case NETHER_PORTAL -> {
                return "90:0";
            }
            case CAKE -> {
                return "92:0";
            }
            case REPEATER -> {
                return "93:0";
            }
            case WHITE_STAINED_GLASS -> {
                return "95:0";
            }
            case ORANGE_STAINED_GLASS -> {
                return "95:1";
            }
            case MAGENTA_STAINED_GLASS -> {
                return "95:2";
            }
            case LIGHT_BLUE_STAINED_GLASS -> {
                return "95:3";
            }
            case YELLOW_STAINED_GLASS -> {
                return "95:4";
            }
            case LIME_STAINED_GLASS -> {
                return "95:5";
            }
            case PINK_STAINED_GLASS -> {
                return "95:6";
            }
            case GRAY_STAINED_GLASS -> {
                return "95:7";
            }
            case LIGHT_GRAY_STAINED_GLASS -> {
                return "95:8";
            }
            case CYAN_STAINED_GLASS -> {
                return "95:9";
            }
            case PURPLE_STAINED_GLASS -> {
                return "95:10";
            }
            case BLUE_STAINED_GLASS -> {
                return "95:11";
            }
            case BROWN_STAINED_GLASS -> {
                return "95:12";
            }
            case GREEN_STAINED_GLASS -> {
                return "95:13";
            }
            case RED_STAINED_GLASS -> {
                return "95:14";
            }
            case BLACK_STAINED_GLASS -> {
                return "95:15";
            }
            case OAK_TRAPDOOR -> {
                return "96:0";
            }
            case STONE_BRICKS -> {
                return "98:0";
            }
            case MOSSY_STONE_BRICKS -> {
                return "98:1";
            }
            case CRACKED_STONE_BRICKS -> {
                return "98:2";
            }
            case CHISELED_STONE_BRICKS -> {
                return "98:3";
            }
            case BROWN_MUSHROOM_BLOCK -> {
                return "99:0";
            }
            case RED_MUSHROOM_BLOCK -> {
                return "100:0";
            }
            case IRON_BARS -> {
                return "101:0";
            }
            case GLASS_PANE -> {
                return "102:0";
            }
            case MELON -> {
                return "103:0";
            }
            case VINE -> {
                return "106:0";
            }
            case OAK_FENCE_GATE -> {
                return "107:0";
            }
            case BRICK_STAIRS -> {
                return "108:0";
            }
            case STONE_BRICK_STAIRS -> {
                return "109:0";
            }
            case MYCELIUM -> {
                return "110:0";
            }
            case LILY_PAD -> {
                return "111:0";
            }
            case NETHER_BRICKS -> {
                return "112:0";
            }
            case NETHER_BRICK_FENCE -> {
                return "113:0";
            }
            case NETHER_BRICK_STAIRS -> {
                return "114:0";
            }
            case NETHER_WART -> {
                return "115:0";
            }
            case ENCHANTING_TABLE -> {
                return "116:0";
            }
            case BREWING_STAND -> {
                return "117:0";
            }
            case CAULDRON -> {
                return "118:0";
            }
            case END_PORTAL -> {
                return "119:0";
            }
            case END_PORTAL_FRAME -> {
                return "120:0";
            }
            case END_STONE -> {
                return "121:0";
            }
            case DRAGON_EGG -> {
                return "122:0";
            }
            case REDSTONE_LAMP -> {
                return "123:0";
            }
            case OAK_SLAB -> {
                return "126:0";
            }
            case SPRUCE_SLAB -> {
                return "126:1";
            }
            case BIRCH_SLAB -> {
                return "126:2";
            }
            case JUNGLE_SLAB -> {
                return "126:3";
            }
            case ACACIA_SLAB -> {
                return "126:4";
            }
            case DARK_OAK_SLAB -> {
                return "126:5";
            }
            case COCOA -> {
                return "127:0";
            }
            case SANDSTONE_STAIRS -> {
                return "128:0";
            }
            case EMERALD_ORE -> {
                return "129:0";
            }
            case ENDER_CHEST -> {
                return "130:0";
            }
            case TRIPWIRE_HOOK -> {
                return "131:0";
            }
            case TRIPWIRE -> {
                return "132:0";
            }
            case EMERALD_BLOCK -> {
                return "133:0";
            }
            case SPRUCE_STAIRS -> {
                return "134:0";
            }
            case BIRCH_STAIRS -> {
                return "135:0";
            }
            case JUNGLE_STAIRS -> {
                return "136:0";
            }
            case COMMAND_BLOCK -> {
                return "137:0";
            }
            case BEACON -> {
                return "138:0";
            }
            case COBBLESTONE_WALL -> {
                return "139:0";
            }
            case MOSSY_COBBLESTONE_WALL -> {
                return "139:1";
            }
            case FLOWER_POT -> {
                return "140:0";
            }
            case CARROTS -> {
                return "141:0";
            }
            case POTATOES -> {
                return "142:0";
            }
            case OAK_BUTTON -> {
                return "143:0";
            }
            case SKELETON_SKULL -> {
                return "144:0";
            }
            case WITHER_SKELETON_SKULL -> {
                return "144:1";
            }
            case ZOMBIE_HEAD -> {
                return "144:2";
            }
            case PLAYER_HEAD -> {
                return "144:3";
            }
            case CREEPER_HEAD -> {
                return "144:4";
            }
            case ANVIL -> {
                return "145:0";
            }
            case CHIPPED_ANVIL -> {
                return "145:1";
            }
            case DAMAGED_ANVIL -> {
                return "145:2";
            }
            case TRAPPED_CHEST -> {
                return "146:0";
            }
            case LIGHT_WEIGHTED_PRESSURE_PLATE -> {
                return "147:0";
            }
            case HEAVY_WEIGHTED_PRESSURE_PLATE -> {
                return "148:0";
            }
            case COMPARATOR -> {
                return "149:0";
            }
            case DAYLIGHT_DETECTOR -> {
                return "151:0";
            }
            case REDSTONE_BLOCK -> {
                return "152:0";
            }
            case NETHER_QUARTZ_ORE -> {
                return "153:0";
            }
            case HOPPER -> {
                return "154:0";
            }
            case QUARTZ_BLOCK -> {
                return "155:0";
            }
            case CHISELED_QUARTZ_BLOCK -> {
                return "155:1";
            }
            case QUARTZ_PILLAR -> {
                return "155:2";
            }
            case QUARTZ_STAIRS -> {
                return "156:0";
            }
            case ACTIVATOR_RAIL -> {
                return "157:0";
            }
            case DROPPER -> {
                return "158:0";
            }
            case WHITE_TERRACOTTA -> {
                return "159:0";
            }
            case ORANGE_TERRACOTTA -> {
                return "159:1";
            }
            case MAGENTA_TERRACOTTA -> {
                return "159:2";
            }
            case LIGHT_BLUE_TERRACOTTA -> {
                return "159:3";
            }
            case YELLOW_TERRACOTTA -> {
                return "159:4";
            }
            case LIME_TERRACOTTA -> {
                return "159:5";
            }
            case PINK_TERRACOTTA -> {
                return "159:6";
            }
            case GRAY_TERRACOTTA -> {
                return "159:7";
            }
            case LIGHT_GRAY_TERRACOTTA -> {
                return "159:8";
            }
            case CYAN_TERRACOTTA -> {
                return "159:9";
            }
            case PURPLE_TERRACOTTA -> {
                return "159:10";
            }
            case BLUE_TERRACOTTA -> {
                return "159:11";
            }
            case BROWN_TERRACOTTA -> {
                return "159:12";
            }
            case GREEN_TERRACOTTA -> {
                return "159:13";
            }
            case RED_TERRACOTTA -> {
                return "159:14";
            }
            case BLACK_TERRACOTTA -> {
                return "159:15";
            }
            case WHITE_STAINED_GLASS_PANE -> {
                return "160:0";
            }
            case ORANGE_STAINED_GLASS_PANE -> {
                return "160:1";
            }
            case MAGENTA_STAINED_GLASS_PANE -> {
                return "160:2";
            }
            case LIGHT_BLUE_STAINED_GLASS_PANE -> {
                return "160:3";
            }
            case YELLOW_STAINED_GLASS_PANE -> {
                return "160:4";
            }
            case LIME_STAINED_GLASS_PANE -> {
                return "160:5";
            }
            case PINK_STAINED_GLASS_PANE -> {
                return "160:6";
            }
            case GRAY_STAINED_GLASS_PANE -> {
                return "160:7";
            }
            case LIGHT_GRAY_STAINED_GLASS_PANE -> {
                return "160:8";
            }
            case CYAN_STAINED_GLASS_PANE -> {
                return "160:9";
            }
            case PURPLE_STAINED_GLASS_PANE -> {
                return "160:10";
            }
            case BLUE_STAINED_GLASS_PANE -> {
                return "160:11";
            }
            case BROWN_STAINED_GLASS_PANE -> {
                return "160:12";
            }
            case GREEN_STAINED_GLASS_PANE -> {
                return "160:13";
            }
            case RED_STAINED_GLASS_PANE -> {
                return "160:14";
            }
            case BLACK_STAINED_GLASS_PANE -> {
                return "160:15";
            }
            case ACACIA_LEAVES -> {
                return "161:0";
            }
            case DARK_OAK_LEAVES -> {
                return "161:1";
            }
            case ACACIA_LOG -> {
                return "162:0";
            }
            case DARK_OAK_LOG -> {
                return "162:1";
            }
            case ACACIA_STAIRS -> {
                return "163:0";
            }
            case DARK_OAK_STAIRS -> {
                return "164:0";
            }
            case SLIME_BLOCK -> {
                return "165:0";
            }
            case BARRIER -> {
                return "166:0";
            }
            case IRON_TRAPDOOR -> {
                return "167:0";
            }
            case PRISMARINE -> {
                return "168:0";
            }
            case PRISMARINE_BRICKS -> {
                return "168:1";
            }
            case DARK_PRISMARINE -> {
                return "168:2";
            }
            case SEA_LANTERN -> {
                return "169:0";
            }
            case HAY_BLOCK -> {
                return "170:0";
            }
            case WHITE_CARPET -> {
                return "171:0";
            }
            case ORANGE_CARPET -> {
                return "171:1";
            }
            case MAGENTA_CARPET -> {
                return "171:2";
            }
            case LIGHT_BLUE_CARPET -> {
                return "171:3";
            }
            case YELLOW_CARPET -> {
                return "171:4";
            }
            case LIME_CARPET -> {
                return "171:5";
            }
            case PINK_CARPET -> {
                return "171:6";
            }
            case GRAY_CARPET -> {
                return "171:7";
            }
            case LIGHT_GRAY_CARPET -> {
                return "171:8";
            }
            case CYAN_CARPET -> {
                return "171:9";
            }
            case PURPLE_CARPET -> {
                return "171:10";
            }
            case BLUE_CARPET -> {
                return "171:11";
            }
            case BROWN_CARPET -> {
                return "171:12";
            }
            case GREEN_CARPET -> {
                return "171:13";
            }
            case RED_CARPET -> {
                return "171:14";
            }
            case BLACK_CARPET -> {
                return "171:15";
            }
            case TERRACOTTA -> {
                return "172:0";
            }
            case COAL_BLOCK -> {
                return "173:0";
            }
            case PACKED_ICE -> {
                return "174:0";
            }
            case SUNFLOWER -> {
                return "175:0";
            }
            case LILAC -> {
                return "175:1";
            }
            case ROSE_BUSH -> {
                return "175:4";
            }
            case PEONY -> {
                return "175:5";
            }
            case LARGE_FERN -> {
                return "175:3";
            }
            case RED_SANDSTONE -> {
                return "179:0";
            }
            case CHISELED_RED_SANDSTONE -> {
                return "179:1";
            }
            case CUT_RED_SANDSTONE -> {
                return "179:2";
            }
            case RED_SANDSTONE_STAIRS -> {
                return "180:0";
            }
            case RED_SANDSTONE_SLAB -> {
                return "182:0";
            }
            case SPRUCE_FENCE_GATE -> {
                return "183:0";
            }
            case BIRCH_FENCE_GATE -> {
                return "184:0";
            }
            case JUNGLE_FENCE_GATE -> {
                return "185:0";
            }
            case DARK_OAK_FENCE_GATE -> {
                return "186:0";
            }
            case ACACIA_FENCE_GATE -> {
                return "187:0";
            }
            case SPRUCE_FENCE -> {
                return "188:0";
            }
            case BIRCH_FENCE -> {
                return "189:0";
            }
            case JUNGLE_FENCE -> {
                return "190:0";
            }
            case DARK_OAK_FENCE -> {
                return "191:0";
            }
            case ACACIA_FENCE -> {
                return "192:0";
            }
            case SPRUCE_DOOR -> {
                return "193:0";
            }
            case BIRCH_DOOR -> {
                return "194:0";
            }
            case JUNGLE_DOOR -> {
                return "195:0";
            }
            case ACACIA_DOOR -> {
                return "196:0";
            }
            case DARK_OAK_DOOR -> {
                return "197:0";
            }
            case END_ROD -> {
                return "198:0";
            }
            case CHORUS_PLANT -> {
                return "199:0";
            }
            case CHORUS_FLOWER -> {
                return "200:0";
            }
            case PURPUR_BLOCK -> {
                return "201:0";
            }
            case PURPUR_PILLAR -> {
                return "202:0";
            }
            case PURPUR_STAIRS -> {
                return "203:0";
            }
            case PURPUR_SLAB -> {
                return "205:0";
            }
            case END_STONE_BRICKS -> {
                return "206:0";
            }
            case DIRT_PATH -> {
                return "208:0";
            }
            case END_GATEWAY -> {
                return "209:0";
            }
            case FROSTED_ICE -> {
                return "212:0";
            }
            case MAGMA_BLOCK -> {
                return "213:0";
            }
            case NETHER_WART_BLOCK -> {
                return "214:0";
            }
            case RED_NETHER_BRICKS -> {
                return "215:0";
            }
            case BONE_BLOCK -> {
                return "216:0";
            }
            case OBSERVER -> {
                return "218:0";
            }
            case SHULKER_BOX, BLACK_SHULKER_BOX, BLUE_SHULKER_BOX, BROWN_SHULKER_BOX, CYAN_SHULKER_BOX, GRAY_SHULKER_BOX,
                    GREEN_SHULKER_BOX, LIGHT_BLUE_SHULKER_BOX, LIGHT_GRAY_SHULKER_BOX, LIME_SHULKER_BOX, MAGENTA_SHULKER_BOX,
                    ORANGE_SHULKER_BOX, PINK_SHULKER_BOX, PURPLE_SHULKER_BOX, RED_SHULKER_BOX, WHITE_SHULKER_BOX, YELLOW_SHULKER_BOX -> {
                return "219:0";
            }
            case STRUCTURE_BLOCK -> {
                return "255:0";
            }
            case STRING -> {
                return "287:0";
            }
            case WHEAT_SEEDS -> {
                return "295:0";
            }
            case WHEAT -> {
                return "296:0";
            }
            case PAINTING -> {
                return "321:0";
            }
            case OAK_HANGING_SIGN -> {
                return "323:0";
            }
            case OAK_DOOR -> {
                return "324:0";
            }
            case MINECART -> {
                return "328:0";
            }
            case IRON_DOOR -> {
                return "330:0";
            }
            case REDSTONE -> {
                return "331:0";
            }
            case BIRCH_BOAT, ACACIA_BOAT, CHERRY_BOAT, DARK_OAK_BOAT, JUNGLE_BOAT, MANGROVE_BOAT, OAK_BOAT, SPRUCE_BOAT -> {
                return "333:0";
            }
            case BLACK_BANNER -> {
                return "425:0";
            }
            case RED_BANNER -> {
                return "425:1";
            }
            case GREEN_BANNER -> {
                return "425:2";
            }
            case BROWN_BANNER -> {
                return "425:3";
            }
            case BLUE_BANNER -> {
                return "425:4";
            }
            case PURPLE_BANNER -> {
                return "425:5";
            }
            case CYAN_BANNER -> {
                return "425:6";
            }
            case LIGHT_GRAY_BANNER -> {
                return "425:7";
            }
            case GRAY_BANNER -> {
                return "425:8";
            }
            case PINK_BANNER -> {
                return "425:9";
            }
            case LIME_BANNER -> {
                return "425:10";
            }
            case YELLOW_BANNER -> {
                return "425:11";
            }
            case LIGHT_BLUE_BANNER -> {
                return "425:12";
            }
            case MAGENTA_BANNER -> {
                return "425:13";
            }
            case ORANGE_BANNER -> {
                return "425:14";
            }
            case WHITE_BANNER -> {
                return "425:15";
            }
            case END_CRYSTAL -> {
                return "426:0";
            }
//            case SPRUCE_DOOR -> {
//                return "427:0";
//            }
//            case BIRCH_DOOR -> {
//                return "428:0";
//            }
//            case JUNGLE_DOOR -> {
//                return "429:0";
//            }
//            case ACACIA_DOOR -> {
//                return "430:0";
//            }
//            case DARK_OAK_DOOR -> {
//                return "431:0";
//            }
            default -> {
                return "0:0";
            }
        }
    }
}
