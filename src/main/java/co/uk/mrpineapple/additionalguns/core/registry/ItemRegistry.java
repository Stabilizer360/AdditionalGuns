package co.uk.mrpineapple.additionalguns.core.registry;

import co.uk.mrpineapple.additionalguns.core.AdditionalGuns;
import com.mrcrayfish.guns.GunMod;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.GunItem;
import com.mrcrayfish.guns.item.ScopeItem;
import com.mrcrayfish.guns.item.StockItem;
import com.mrcrayfish.guns.item.UnderBarrelItem;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//CLASS FOR REGISTERING GUNS
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalGuns.ID);

    /* Guns */
    public static final RegistryObject<Item> MAMMOTH = ITEMS.register("mammoth", () -> new GunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
    public static final RegistryObject<Item> VECTOR = ITEMS.register("vector", () -> new GunItem(new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));

    /* Scope Attachments */
    public static final RegistryObject<Item> HOLO_SCOPE = ITEMS.register("holo_scope", () -> new ScopeItem(Scope.create(0.25F, 1.625F, GunModifiers.SLOW_ADS).viewFinderOffset(0.3), new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));

    /* Stock Attachments */
    public static final RegistryObject<Item> BASIC_STOCK = ITEMS.register("basic_stock", () -> new StockItem(Stock.create(GunModifiers.SLOW_ADS), new Item.Properties().maxStackSize(1).group(GunMod.GROUP), false));

    /* Under Barrel Attachments */
    public static final RegistryObject<Item> ANGLED_GRIP = ITEMS.register("angled_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.LIGHT_RECOIL), new Item.Properties().maxStackSize(1).group(GunMod.GROUP)));
}