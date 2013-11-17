package ichunmod.items;

import ichunmod.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public enum EnumToolNyan {
    NYAN(0, 666, 7.0F, 0.0F, 15);


    private final int harvestLevel;

    private final int maxUses;

    private final float efficiencyOnProperMaterial;

    private final float damageVsEntity;

    private final int enchantability;

    public Item customCraftingMaterial = null;

    private EnumToolNyan(int par3, int par4, float par5, float par6, int par7)
    {
        this.harvestLevel = par3;
        this.maxUses = par4;
        this.efficiencyOnProperMaterial = par5;
        this.damageVsEntity = par6;
        this.enchantability = par7;
    }

    public int getMaxUses()
    {
        return this.maxUses;
    }

    public float getEfficiencyOnProperMaterial()
    {
        return this.efficiencyOnProperMaterial;
    }

    public float getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    public int getEnchantability()
    {
        return this.enchantability;
    }

    public int getToolCraftingMaterial()
    {
        switch (this)
        {
            case NYAN:
            	return Blocks.nyan.blockID;
            default:
            	return (customCraftingMaterial == null ? 0 : customCraftingMaterial.itemID);
        }
    }
}
