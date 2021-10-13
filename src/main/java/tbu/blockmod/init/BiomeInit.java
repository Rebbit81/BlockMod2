package tbu.blockmod.init;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeCreator;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;


public class BiomeInit {
    public static final RegistryKey<Biome> ARES_PLAINS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("blockmod", "ares_plains"));

    public Identifier getBiome(Biome biome) {
        return new Identifier("data", "worldgen/biome/ares_plains.json");
    }

    public static void init(){

        Registry.register(BuiltinRegistries.BIOME, new Identifier("blockmod", "ares_plains"), DefaultBiomeCreator.createTheVoid());

    }

}
