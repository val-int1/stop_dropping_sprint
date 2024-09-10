package val_int1.stop_dropping_sprint.init;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.option.StickyKeyBinding;

@Environment(EnvType.CLIENT)
public class StopDroppingSprint {

	public static StickyKeyBinding LAST_PRESSED = null;

}
