package nl.plff.minecraft.extranether;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExtraNether.MODID, name = ExtraNether.NAME, version = ExtraNether.VERSION, acceptedMinecraftVersions = "1.12.2")
@Mod.EventBusSubscriber(modid = ExtraNether.MODID)
public class ExtraNether {

    static final String MODID = "extranether";
    static final String NAME = "Extra Nether";
    static final String VERSION = "0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) { // FIXME: These aren't fired??
        final Block[] blocks = {
                Blocks.sulfurBlock,
                Blocks.sulfurOre,
                Blocks.kyaniteBlock,
                Blocks.kyaniteOre
        };

        final IForgeRegistry<Block> reg = event.getRegistry();
        reg.registerAll(blocks);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) { // FIXME: These aren't fired??
        final Item[] items = {
                Items.sulfurDustItem,
                Items.sulfurItem,
                Items.jadeiteItem,
                Items.jadeItem,
                Items.kyaniteChunkItem
        };

        final IForgeRegistry<Item> reg = event.getRegistry();
        reg.registerAll(items);
    }

}
