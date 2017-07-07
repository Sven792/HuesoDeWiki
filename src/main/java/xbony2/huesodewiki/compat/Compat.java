package xbony2.huesodewiki.compat;

import net.minecraftforge.fml.common.Loader;
import xbony2.huesodewiki.compat.ic2.IC2Compat;
import xbony2.huesodewiki.compat.tesla.TeslaCompat;

public class Compat {
	public static void preInit(){
		if(Loader.isModLoaded("ic2"))
			IC2Compat.preInit();
		
		if(Loader.isModLoaded("tesla"))
			TeslaCompat.preInit();
	}
}
