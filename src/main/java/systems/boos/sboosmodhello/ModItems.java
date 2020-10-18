package systems.boos.sboosmodhello;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "sboosmodhello");
    public static final RegistryObject<Item> HELLO_NOTE = ITEMS.register("hello_note", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> HELLO_BLOCK = ITEMS.register("hello_block", () -> new BlockItem(ModBlocks.HELLO_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
