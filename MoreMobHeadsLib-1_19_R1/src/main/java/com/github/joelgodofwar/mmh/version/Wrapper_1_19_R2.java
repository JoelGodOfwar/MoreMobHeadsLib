package com.github.joelgodofwar.mmh.version;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Frog;

import com.github.joelgodofwar.mmh.VersionWrapper;

public final class Wrapper_1_19_R2 implements VersionWrapper {
	public final static Logger logger = Logger.getLogger("Minecraft");
	
	public String getName(String name, Entity entity) {
		switch (name) {
		case "FROG":
			Frog daFrog = (Frog) entity;
			String daFrogVariant = daFrog.getVariant().toString();
			
			return name + "_" + daFrogVariant;
		}
		return null;
	}
	
	public void log(String string) {
		log(Level.INFO, string);
	}
	
	public	void log(Level level, String dalog){// TODO: log
		logger.log(level, ChatColor.YELLOW + "MoreMobHeadsLib v" + ChatColor.RESET + " " + dalog );
	}
}