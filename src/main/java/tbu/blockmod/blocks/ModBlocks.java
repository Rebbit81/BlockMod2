package tbu.blockmod.blocks;

import com.sun.source.util.Trees;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import tbu.blockmod.Blockmod;
import tbu.blockmod.worldgen.trees.BlockmodSaplingBlock;
import tbu.blockmod.worldgen.trees.BlockmodSaplingGenerator;

import java.util.HashMap;
import java.util.Map;

import static tbu.blockmod.worldgen.Trees.*;

public class ModBlocks {

    private static final Map<Identifier, BlockItem> ITEMS = new HashMap<>();
    private static final Map<Identifier, Block> BLOCKS = new HashMap<>();


    // Cherry Wood
    public static final Block CHERRY_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG));
    public static final Block CHERRY_WOOD_PLANKS = add("cherry_wood_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), Blockmod.BM_GROUP);
    public static final Block CHERRY_WOOD_LEAVES = add("cherry_wood_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), Blockmod.BM_GROUP);

    // Leaves for vanilla trees
    public static final Block ORANGE_WOOD_LEAVES = add("orange_wood_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), Blockmod.BM_GROUP);
    public static final Block YELLOW_WOOD_LEAVES = add("yellow_wood_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), Blockmod.BM_GROUP);

    // Saplings
    public static final Block CHERRY_SAPLING_BLOCK = add("cherry_wood_sapling", new BlockmodSaplingBlock(new BlockmodSaplingGenerator(TREE_CHERRY), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block YELLOW_TREE_SAPLING_BLOCK = add("yellow_tree_sapling", new BlockmodSaplingBlock(new BlockmodSaplingGenerator(TREE_YELLOW), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block ORANGE_TREE_SAPLING_BLOCK = add("orange_tree_sapling", new BlockmodSaplingBlock(new BlockmodSaplingGenerator(TREE_ORANGE), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    // Palladium related stuff
    public static final Block PALLADIUM_BLOCK = add("palladium_block", new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block PALLADIUM_ORE_BLOCK =add("palladium_ore_block", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 4)));


















    private static PillarBlock createLogBlock() {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    }

    private static LeavesBlock createLeavesBlock(BlockSoundGroup soundGroup) {
        return new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(soundGroup).nonOpaque());
    }

    private static <B extends Block> B add(String name, B block, ItemGroup tab) {
        return add(name, block, new BlockItem(block, new Item.Settings().group(tab)));
    }

    private static <B extends Block> B add(String name, B block, BlockItem item) {
        add(name, block);
        if (item != null) {
            item.appendBlocks(Item.BLOCK_ITEMS, item);
            ITEMS.put(new Identifier(Blockmod.MOD_ID, name), item);
        }
        return block;
    }

    private static <B extends Block> B add(String name, B block) {
        BLOCKS.put(new Identifier(Blockmod.MOD_ID, name), block);
        return block;
    }

    private static <I extends BlockItem> I add(String name, I item) {
        item.appendBlocks(Item.BLOCK_ITEMS, item);
        ITEMS.put(new Identifier(Blockmod.MOD_ID, name), item);
        return item;
    }

    public static void init() {
        for (Identifier id : ITEMS.keySet()) {
            Registry.register(Registry.ITEM, id, ITEMS.get(id));
        }
        for (Identifier id : BLOCKS.keySet()) {
            Registry.register(Registry.BLOCK, id, BLOCKS.get(id));
        }
        addFuels();
        addFlammables();
    }

    private static void addFuels() {
        FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;
        // Add Fuels here
    }

    private static void addFlammables() {
        FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();
        // Add Flammables here
        flammableRegistry.add(CHERRY_WOOD_PLANKS, 5, 20);
    }


    private static PillarBlock createLog() {
        return new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    }

    public static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public static Boolean canSpawnOnLeaves(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return type == EntityType.OCELOT || type == EntityType.PARROT;
    }


}
