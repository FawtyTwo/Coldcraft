package com.fawtytwo.coldcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "coldcraft";
    public static final String MODNAME = "Coldcraft Survival Mod";
    public static final String VERSION = "0.1.0";

    @Instance
    public static Main instance = new Main();

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	System.out.println("Called method: Preinit");
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	System.out.println("Called method: init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	System.out.println("Called method: Postinit");
    }
}