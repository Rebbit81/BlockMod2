package tbu.blockmod.init;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;

public class DimensionInit{


    public Identifier getDimensionType(DimensionType dimensionType) {
        return new Identifier("data", "dimension_type/the_ares.json");
    }

        public static void init(){

            RegistryKey<DimensionOptions> THE_ARES = RegistryKey.of(Registry.DIMENSION_KEY,
                    new Identifier("blockmod", "the_ares"));
        }
}
