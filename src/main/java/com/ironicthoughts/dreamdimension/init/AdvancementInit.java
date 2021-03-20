package com.ironicthoughts.dreamdimension.init;

import java.util.Map;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.util.ResourceLocation;

public class AdvancementInit extends Advancement {

	public AdvancementInit(ResourceLocation id, Advancement parentIn, DisplayInfo displayIn,AdvancementRewards rewardsIn, Map<String, Criterion> criteriaIn, String[][] requirementsIn) {
		super(id, parentIn, displayIn, rewardsIn, criteriaIn, requirementsIn);
	}
	
	
}
