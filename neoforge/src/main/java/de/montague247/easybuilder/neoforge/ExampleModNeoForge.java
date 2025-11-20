package de.montague247.easybuilder.neoforge;

import net.neoforged.fml.common.Mod;

import de.montague247.easybuilder.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
