package grondag.wut;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		Wut.setLog(event.getModLog());
	}

	public void init(FMLInitializationEvent event) 
	{
	    
	}

    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
