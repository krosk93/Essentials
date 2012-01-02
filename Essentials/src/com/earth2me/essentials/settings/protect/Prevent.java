package com.earth2me.essentials.settings.protect;

import com.earth2me.essentials.storage.Comment;
import com.earth2me.essentials.storage.ListType;
import com.earth2me.essentials.storage.MapKeyType;
import com.earth2me.essentials.storage.MapValueType;
import com.earth2me.essentials.storage.StorageObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bukkit.Material;
import org.bukkit.entity.CreatureType;


@Data
@EqualsAndHashCode(callSuper = false)
public class Prevent implements StorageObject
{
	@Comment("Which blocks should a piston not be able to push?")
	@ListType(Material.class)
	private Set<Material> pistonPush = new HashSet<Material>();
	private boolean lavaFlow = false;
	private boolean waterFlow = false;
	private boolean waterbucketFlow = false;
	private boolean firespread = true;
	private boolean lavaFirespread = true;
	private boolean flintfire = false;
	private boolean lightningFirespread = true;
	private boolean portalCreation = false;
	private boolean tntExplosion = false;
	private boolean tntPlayerdamage = false;
	private boolean fireballExplosion = false;
	private boolean fireballFire = false;
	private boolean fireballPlayerdamage = false;
	private boolean creeperExplosion = false;
	private boolean creeperPlayerdamage = false;
	private boolean creeperBlockdamage = false;
	private boolean enderdragonBlockdamage = false;
	private boolean endermanPickup = false;
	private boolean villagerDeath = false;
	@Comment(
	{
		"Monsters won't follow players",
		"permission essentials.protect.entitytarget.bypass disables this"
	})
	private boolean entitytarget = false;
	@MapKeyType(CreatureType.class)
	@MapValueType(Boolean.class)
	private Map<CreatureType, Boolean> spawn = new HashMap<CreatureType, Boolean>();
}