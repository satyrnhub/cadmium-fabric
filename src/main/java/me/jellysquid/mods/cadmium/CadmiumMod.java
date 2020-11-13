package me.jellysquid.mods.cadmium;

import net.devtech.grossfabrichacks.GrossFabricHacks;
import net.devtech.grossfabrichacks.jarboot.JarBooter;
import net.fabricmc.api.ModInitializer;


public class CadmiumMod implements ModInitializer {
    @Override
    public void onInitialize() {
        JarBooter.addUrl(GrossFabricHacks.class.getResource("/META-INF/jars/datafixerupper-cadmium-4.0.0-SNAPSHOT.jar"));
    }
}
