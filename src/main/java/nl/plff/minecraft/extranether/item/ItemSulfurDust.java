package nl.plff.minecraft.extranether.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSulfurDust extends Item {

    public ItemSulfurDust() {
        setCreativeTab(CreativeTabs.MATERIALS);
        setMaxDamage(0);
        setMaxStackSize(64);
        setNoRepair();
        setUnlocalizedName("sulfur_dust");
    }

}
