package grondag.wut;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		Wut.setLog(event.getModLog());
		
		EntityRegistry.registerModEntity(
				new ResourceLocation("wut:blerb"), 
				EntityBlerb.class, 
				"wut:blerb", 
				400, 
				Wut.INSTANCE, 
				64,
				10,
				true, 
				0xFFFFFF, 
				0x926AF4);
		
	}

	public void init(FMLInitializationEvent event) 
	{
	    
	}

    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
