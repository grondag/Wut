package grondag.wut;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import grondag.exotic_matter.IGrondagMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(   modid = Wut.MODID, 
        name = Wut.MODNAME,
        version = Wut.VERSION,
        acceptedMinecraftVersions = "[1.12]",
        dependencies = "after:theoneprobe; after:exotic_matter")

@SuppressWarnings("null")
public class Wut  implements IGrondagMod
{
	public static final String MODID = "wut";
	public static final String MODNAME = "Wut";
	public static final String VERSION = "0.0.1";
	
	@Instance
	public static Wut INSTANCE = new Wut();


    @SidedProxy(clientSide = "grondag.wut.ClientProxy", serverSide = "grondag.wut.ServerProxy")
	public static CommonProxy proxy;

    private @Nullable static Logger log;

    @Override
    public @Nonnull Logger getLog()
    {
        // allow access to log during unit testing or other debug scenarios
        Logger result = log;
        if(result == null)
        {
            result = LogManager.getLogger();
            log = result;
        }
        return result;
    }

    public static void setLog(Logger lOG)
    {
        Wut.log = lOG;
    }

    @Override
    public String modID()
    {
        return MODID;
    }
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}