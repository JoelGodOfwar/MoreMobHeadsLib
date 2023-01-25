package com.github.joelgodofwar.mmh;

import org.bukkit.entity.Entity;

import com.github.joelgodofwar.mmh.version.VersionMatcher;

public class MoreMobHeadsLib {
	private static VersionWrapper WRAPPER = new VersionMatcher().match();
	public static String getName(String name, Entity entity) {
		return WRAPPER.getName(name, entity);
	}
}
