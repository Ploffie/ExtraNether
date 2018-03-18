package nl.plff.minecraft.extranether;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.plff.minecraft.extranether.item.ItemSulfur;
import nl.plff.minecraft.extranether.item.ItemSulfurDust;

public class Items { // TODO: Maybe convert this to singleton instance?

    public static final Item sulfurDustItem = new ItemSulfurDust();
    public static final Item jadeiteItem = new Item().setUnlocalizedName("jadeite").setCreativeTab(CreativeTabs.MATERIALS).setMaxDamage(0).setMaxStackSize(64).setNoRepair();
    public static final Item kyaniteChunkItem = new Item().setUnlocalizedName("kyanite_chunk").setCreativeTab(CreativeTabs.MATERIALS).setMaxDamage(0).setMaxStackSize(64).setNoRepair();

    static final Item sulfurItem = new ItemSulfur();
    static final Item jadeItem = new Item().setUnlocalizedName("extranether:jade").setCreativeTab(CreativeTabs.MATERIALS).setMaxDamage(0).setMaxStackSize(64).setNoRepair();

}
