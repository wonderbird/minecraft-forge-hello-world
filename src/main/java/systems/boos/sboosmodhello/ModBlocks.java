package systems.boos.sboosmodhello;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "sboosmodhello");
    public static final RegistryObject<Block> HELLO_BLOCK = BLOCKS.register("hello_block", () -> new Block(Block.Properties.create(Material.ROCK)));
}
