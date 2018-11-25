package sol3675.middleearththaumaturgy.helper;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import sol3675.middleearththaumaturgy.MiddleEarthResearch;
import sol3675.middleearththaumaturgy.MiddleEarthResearchItem;
import sol3675.middleearththaumaturgy.recipes.Recipes;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.research.ResearchPage;

public class ResearchHelper {
	
	//can add easy researches
	
	public static final byte GENERAL_CRAFTING = 0;
	public static final byte ARCANE_CRAFTING = 1;
	public static final byte CRUCIBLE = 2;
	public static final byte INFUSION = 3;
	
	private static final String RESEARCH_PREFIX = "middleearththaumaturgy.research_page.";
	
	public static MiddleEarthResearchItem add(String researchName, String category, AspectList list, ItemStack icon, int x, int y, int difficulty, int pageAmount, String[] parents, byte recipe, String recipeName, boolean secondary, boolean hidden, boolean concealed)
	{
		ResearchPage[] pages = new ResearchPage[pageAmount + 1];
		
		for(int i = 0; i<pageAmount; ++i)
		{
			pages[i] = new ResearchPage(RESEARCH_PREFIX + researchName + "." + String.valueOf(i));
		}
		
		switch (recipe)
		{
		case GENERAL_CRAFTING:
			pages[pageAmount] = new ResearchPage((IRecipe)MiddleEarthResearch.recipes.get(recipeName));
			break;
		case ARCANE_CRAFTING:
			pages[pageAmount] = new ResearchPage((IArcaneRecipe)MiddleEarthResearch.recipes.get(recipeName));
			break;
		case CRUCIBLE:
			pages[pageAmount] = new ResearchPage((CrucibleRecipe)MiddleEarthResearch.recipes.get(recipeName));
			break;
		case INFUSION:
			pages[pageAmount] = new ResearchPage((InfusionRecipe)MiddleEarthResearch.recipes.get(recipeName));
			break;
		}
		
		MiddleEarthResearchItem research = new MiddleEarthResearchItem(researchName, category, list, x, y, difficulty, icon);
		research.setPages(pages);
		research.setParents(parents);
		if(secondary)
		{
			research.setSecondary();
		}
		if(hidden)
		{
			research.setHidden();
		}
		if(concealed)
		{
			research.setConcealed();
		}
		research.registerResearchItem();
		return research;
	}
	
	public static MiddleEarthResearchItem add(String researchName, String category, AspectList list, ItemStack icon, int x, int y, int difficulty, int pageAmount, String[] parents, boolean secondary, boolean hidden, boolean concealed)
	{
		ResearchPage[] pages = new ResearchPage[pageAmount];
		
		for(int i = 0; i<pageAmount; ++i)
		{
			pages[i] = new ResearchPage(RESEARCH_PREFIX + researchName + "." + String.valueOf(i));
		}
		
		MiddleEarthResearchItem research = new MiddleEarthResearchItem(researchName, category, list, x, y, difficulty, icon);
		research.setPages(pages);
		research.setParents(parents);
		if(secondary)
		{
			research.setSecondary();
		}
		if(hidden)
		{
			research.setHidden();
		}
		if(concealed)
		{
			research.setConcealed();
		}
		research.registerResearchItem();
		return research;
	}

}
