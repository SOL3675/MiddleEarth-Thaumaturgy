package sol3675.middleearththaumaturgy.references;

import java.util.ArrayList;
import java.util.List;

import lotr.common.entity.npc.*;
import lotr.common.fac.LOTRFaction;
import net.minecraft.util.WeightedRandom;
import sol3675.middleearththaumaturgy.config.MeetCfg;

public enum SummonList
{
	GONDOR(LOTRFaction.GONDOR),
	HOBBIT(LOTRFaction.HOBBIT),
	RANGER_NORTH(LOTRFaction.RANGER_NORTH),
	BLUE_MOUNTAINS(LOTRFaction.BLUE_MOUNTAINS),
	HIGH_ELF(LOTRFaction.HIGH_ELF),
	GUNDABAD(LOTRFaction.GUNDABAD),
	ANGMAR(LOTRFaction.ANGMAR),
	WOOD_ELF(LOTRFaction.WOOD_ELF),
	DOL_GULDUR(LOTRFaction.DOL_GULDUR),
	DALE(LOTRFaction.DALE),
	DWARF(LOTRFaction.DURINS_FOLK),
	GALADHRIM(LOTRFaction.LOTHLORIEN),
	DUNLAND(LOTRFaction.DUNLAND),
	URUK_HAI(LOTRFaction.ISENGARD),
	FANGORN(LOTRFaction.FANGORN),
	ROHAN(LOTRFaction.ROHAN),
	MORDOR(LOTRFaction.MORDOR),
	DORWINION(LOTRFaction.DORWINION),
	RHUN(LOTRFaction.RHUDEL),
	NEAR_HARAD(LOTRFaction.NEAR_HARAD),
	MOREDAIN(LOTRFaction.MORWAITH),
	TAUREDAIN(LOTRFaction.TAURETHRIM),
	HALF_TROLL(LOTRFaction.HALF_TROLL),
	BREE(LOTRFaction.BREE);
	
	public final LOTRFaction faction;
	public List<SummonSpawnEntry> MobsTier1 = new ArrayList();
	public List<SummonSpawnEntry> MobsTier2 = new ArrayList();
	
	private SummonList(LOTRFaction faction)
	{
		this.faction = faction;
	}
	
	public static void createMobLists()
	{
		GONDOR.MobsTier1.add(new SummonSpawnEntry(LOTREntityGondorSoldier.class, 10));
		GONDOR.MobsTier1.add(new SummonSpawnEntry(LOTREntityGondorArcher.class, 5));
		initTier2(GONDOR);
		GONDOR.MobsTier2.add(new SummonSpawnEntry(LOTREntityGondorBannerBearer.class, 2));
		
		HOBBIT.MobsTier1.add(new SummonSpawnEntry(LOTREntityHobbitShirriff.class, 15));
		initTier2(HOBBIT);
		
		RANGER_NORTH.MobsTier1.add(new SummonSpawnEntry(LOTREntityRangerNorth.class, 15));
		initTier2(RANGER_NORTH);
		RANGER_NORTH.MobsTier2.add(new SummonSpawnEntry(LOTREntityRangerNorthBannerBearer.class, 2));
		
		BLUE_MOUNTAINS.MobsTier1.add(new SummonSpawnEntry(LOTREntityBlueDwarfWarrior.class, 10));
		BLUE_MOUNTAINS.MobsTier1.add(new SummonSpawnEntry(LOTREntityBlueDwarfAxeThrower.class, 5));
		initTier2(BLUE_MOUNTAINS);
		BLUE_MOUNTAINS.MobsTier2.add(new SummonSpawnEntry(LOTREntityBlueDwarfBannerBearer.class, 2));
		
		HIGH_ELF.MobsTier1.add(new SummonSpawnEntry(LOTREntityHighElfWarrior.class, 10));
		HIGH_ELF.MobsTier1.add(new SummonSpawnEntry(LOTREntityRivendellWarrior.class, 5));
		initTier2(HIGH_ELF);
		HIGH_ELF.MobsTier2.add(new SummonSpawnEntry(LOTREntityHighElfBannerBearer.class, 2));
		
		GUNDABAD.MobsTier1.add(new SummonSpawnEntry(LOTREntityGundabadOrc.class, 10));
		GUNDABAD.MobsTier1.add(new SummonSpawnEntry(LOTREntityGundabadOrcArcher.class, 5));
		GUNDABAD.MobsTier1.add(new SummonSpawnEntry(LOTREntityGundabadWarg.class, 10));
		initTier2(GUNDABAD);
		GUNDABAD.MobsTier2.add(new SummonSpawnEntry(LOTREntityGundabadBannerBearer.class, 2));
		GUNDABAD.MobsTier2.add(new SummonSpawnEntry(LOTREntityGundabadUruk.class, 4));
		GUNDABAD.MobsTier2.add(new SummonSpawnEntry(LOTREntityGundabadUrukArcher.class, 2));
		
		ANGMAR.MobsTier1.add(new SummonSpawnEntry(LOTREntityAngmarOrc.class, 10));
		ANGMAR.MobsTier1.add(new SummonSpawnEntry(LOTREntityAngmarOrcArcher.class, 5));
		ANGMAR.MobsTier1.add(new SummonSpawnEntry(LOTREntityAngmarHillman.class, 10));
		ANGMAR.MobsTier1.add(new SummonSpawnEntry(LOTREntityAngmarHillmanAxeThrower.class, 5));
		if(MeetCfg.focusCanSpawnBombardier)
			ANGMAR.MobsTier1.add(new SummonSpawnEntry(LOTREntityAngmarOrcBombardier.class, 2));
		initTier2(ANGMAR);
		ANGMAR.MobsTier2.add(new SummonSpawnEntry(LOTREntityAngmarBannerBearer.class, 2));
		if(MeetCfg.focusCanSpawnBombardier)
			ANGMAR.MobsTier2.add(new SummonSpawnEntry(LOTREntityAngmarWargBombardier.class, 1));
		
		WOOD_ELF.MobsTier1.add(new SummonSpawnEntry(LOTREntityWoodElfWarrior.class, 10));
		WOOD_ELF.MobsTier1.add(new SummonSpawnEntry(LOTREntityWoodElfScout.class, 5));
		initTier2(WOOD_ELF);
		WOOD_ELF.MobsTier2.add(new SummonSpawnEntry(LOTREntityWoodElfBannerBearer.class, 2));
		
		DOL_GULDUR.MobsTier1.add(new SummonSpawnEntry(LOTREntityDolGuldurOrc.class, 10));
		DOL_GULDUR.MobsTier1.add(new SummonSpawnEntry(LOTREntityMirkwoodSpider.class, 10));
		DOL_GULDUR.MobsTier1.add(new SummonSpawnEntry(LOTREntityDolGuldurOrcArcher.class, 5));
		initTier2(DOL_GULDUR);
		DOL_GULDUR.MobsTier2.add(new SummonSpawnEntry(LOTREntityDolGuldurBannerBearer.class, 2));
		DOL_GULDUR.MobsTier2.add(new SummonSpawnEntry(LOTREntityMirkTroll.class, 3));
		
		DALE.MobsTier1.add(new SummonSpawnEntry(LOTREntityDaleSoldier.class, 10));
		DALE.MobsTier1.add(new SummonSpawnEntry(LOTREntityDaleArcher.class, 5));
		initTier2(DALE);
		DALE.MobsTier2.add(new SummonSpawnEntry(LOTREntityDaleBannerBearer.class, 1));
		DALE.MobsTier2.add(new SummonSpawnEntry(LOTREntityEsgarothBannerBearer.class, 1));
		
		DWARF.MobsTier1.add(new SummonSpawnEntry(LOTREntityDwarfWarrior.class, 10));
		DWARF.MobsTier1.add(new SummonSpawnEntry(LOTREntityDwarfAxeThrower.class, 5));
		initTier2(DWARF);
		DWARF.MobsTier2.add(new SummonSpawnEntry(LOTREntityDwarfBannerBearer.class, 2));
		
		GALADHRIM.MobsTier1.add(new SummonSpawnEntry(LOTREntityGaladhrimWarrior.class, 15));
		initTier2(GALADHRIM);
		GALADHRIM.MobsTier2.add(new SummonSpawnEntry(LOTREntityGaladhrimBannerBearer.class, 2));
		
		DUNLAND.MobsTier1.add(new SummonSpawnEntry(LOTREntityDunlendingWarrior.class, 10));
		DUNLAND.MobsTier1.add(new SummonSpawnEntry(LOTREntityDunlendingArcher.class, 3));
		DUNLAND.MobsTier1.add(new SummonSpawnEntry(LOTREntityDunlendingAxeThrower.class, 2));
		initTier2(DUNLAND);
		DUNLAND.MobsTier2.add(new SummonSpawnEntry(LOTREntityDunlendingBerserker.class, 2));
		DUNLAND.MobsTier2.add(new SummonSpawnEntry(LOTREntityDunlendingBannerBearer.class, 2));
		
		URUK_HAI.MobsTier1.add(new SummonSpawnEntry(LOTREntityUrukHai.class, 10));
		URUK_HAI.MobsTier1.add(new SummonSpawnEntry(LOTREntityIsengardSnaga.class, 10));
		URUK_HAI.MobsTier1.add(new SummonSpawnEntry(LOTREntityUrukHaiCrossbower.class, 5));
		URUK_HAI.MobsTier1.add(new SummonSpawnEntry(LOTREntityIsengardSnagaArcher.class, 5));
		URUK_HAI.MobsTier1.add(new SummonSpawnEntry(LOTREntityUrukWarg.class, 10));
		if(MeetCfg.focusCanSpawnBombardier)
			URUK_HAI.MobsTier1.add(new SummonSpawnEntry(LOTREntityUrukHaiSapper.class, 3));
		initTier2(URUK_HAI);
		URUK_HAI.MobsTier2.add(new SummonSpawnEntry(LOTREntityUrukHaiBerserker.class, 5));
		URUK_HAI.MobsTier2.add(new SummonSpawnEntry(LOTREntityUrukHaiBannerBearer.class, 2));
		if(MeetCfg.focusCanSpawnBombardier)
			URUK_HAI.MobsTier2.add(new SummonSpawnEntry(LOTREntityUrukWargBombardier.class, 1));
		
		FANGORN.MobsTier1.add(new SummonSpawnEntry(LOTREntityEnt.class, 10));
		FANGORN.MobsTier1.add(new SummonSpawnEntry(LOTREntityHuorn.class, 20));
		initTier2(FANGORN);
		
		ROHAN.MobsTier1.add(new SummonSpawnEntry(LOTREntityRohirrimWarrior.class, 10));
		ROHAN.MobsTier1.add(new SummonSpawnEntry(LOTREntityRohirrimArcher.class, 5));
		initTier2(ROHAN);
		ROHAN.MobsTier2.add(new SummonSpawnEntry(LOTREntityRohanBannerBearer.class, 2));
		
		MORDOR.MobsTier1.add(new SummonSpawnEntry(LOTREntityMordorOrc.class, 10));
		MORDOR.MobsTier1.add(new SummonSpawnEntry(LOTREntityMordorOrcArcher.class, 5));
		MORDOR.MobsTier1.add(new SummonSpawnEntry(LOTREntityMordorWarg.class, 10));
		if(MeetCfg.focusCanSpawnBombardier)
			MORDOR.MobsTier1.add(new SummonSpawnEntry(LOTREntityMordorOrcBombardier.class, 2));
		initTier2(MORDOR);
		MORDOR.MobsTier2.add(new SummonSpawnEntry(LOTREntityMordorBannerBearer.class, 2));
		MORDOR.MobsTier2.add(new SummonSpawnEntry(LOTREntityBlackUrukBannerBearer.class, 1));
		MORDOR.MobsTier2.add(new SummonSpawnEntry(LOTREntityBlackUruk.class, 10));
		MORDOR.MobsTier2.add(new SummonSpawnEntry(LOTREntityBlackUrukArcher.class, 5));
		MORDOR.MobsTier2.add(new SummonSpawnEntry(LOTREntityOlogHai.class, 3));
		if(MeetCfg.focusCanSpawnBombardier)
			MORDOR.MobsTier2.add(new SummonSpawnEntry(LOTREntityMordorWargBombardier.class, 1));
		
		DORWINION.MobsTier1.add(new SummonSpawnEntry(LOTREntityDorwinionGuard.class, 10));
		DORWINION.MobsTier1.add(new SummonSpawnEntry(LOTREntityDorwinionCrossbower.class, 5));
		DORWINION.MobsTier1.add(new SummonSpawnEntry(LOTREntityDorwinionElfWarrior.class, 10));
		DORWINION.MobsTier1.add(new SummonSpawnEntry(LOTREntityDorwinionElfArcher.class, 5));
		initTier2(DORWINION);
		DORWINION.MobsTier2.add(new SummonSpawnEntry(LOTREntityDorwinionBannerBearer.class, 2));
		DORWINION.MobsTier2.add(new SummonSpawnEntry(LOTREntityDorwinionElfBannerBearer.class, 2));
		
		RHUN.MobsTier1.add(new SummonSpawnEntry(LOTREntityEasterlingWarrior.class, 10));
		RHUN.MobsTier1.add(new SummonSpawnEntry(LOTREntityEasterlingArcher.class, 5));
		initTier2(RHUN);
		RHUN.MobsTier2.add(new SummonSpawnEntry(LOTREntityEasterlingGoldWarrior.class, 5));
		RHUN.MobsTier2.add(new SummonSpawnEntry(LOTREntityEasterlingFireThrower.class, 3));
		RHUN.MobsTier2.add(new SummonSpawnEntry(LOTREntityEasterlingBannerBearer.class, 2));
		
		NEAR_HARAD.MobsTier1.add(new SummonSpawnEntry(LOTREntityNearHaradrimWarrior.class, 10));
		NEAR_HARAD.MobsTier1.add(new SummonSpawnEntry(LOTREntityNearHaradrimArcher.class, 5));
		initTier2(NEAR_HARAD);
		NEAR_HARAD.MobsTier2.add(new SummonSpawnEntry(LOTREntityNearHaradBannerBearer.class, 2));
		NEAR_HARAD.MobsTier2.add(new SummonSpawnEntry(LOTREntitySouthronChampion.class, 2));
		
		MOREDAIN.MobsTier1.add(new SummonSpawnEntry(LOTREntityMoredainWarrior.class, 15));
		initTier2(MOREDAIN);
		MOREDAIN.MobsTier2.add(new SummonSpawnEntry(LOTREntityMoredainBannerBearer.class, 2));
		
		TAUREDAIN.MobsTier1.add(new SummonSpawnEntry(LOTREntityTauredainWarrior.class, 10));
		TAUREDAIN.MobsTier1.add(new SummonSpawnEntry(LOTREntityTauredainBlowgunner.class, 5));
		initTier2(TAUREDAIN);
		TAUREDAIN.MobsTier2.add(new SummonSpawnEntry(LOTREntityTauredainBannerBearer.class, 2));
		
		HALF_TROLL.MobsTier1.add(new SummonSpawnEntry(LOTREntityHalfTrollWarrior.class, 15));
		initTier2(HALF_TROLL);
		HALF_TROLL.MobsTier2.add(new SummonSpawnEntry(LOTREntityHalfTrollBannerBearer.class, 2));
		
		BREE.MobsTier1.add(new SummonSpawnEntry(lotr.common.entity.npc.LOTREntityBreeGuard.class, 15));
		initTier2(BREE);
		BREE.MobsTier2.add(new SummonSpawnEntry(lotr.common.entity.npc.LOTREntityBreeBannerBearer.class, 2));
	}
	
	public static class SummonSpawnEntry extends WeightedRandom.Item
	{
		private Class entityClass;
		
		public SummonSpawnEntry(Class<? extends LOTREntityNPC> c, int chance)
		{
			super(chance);
			this.entityClass = c;
		}
		
		public Class getEntityClass()
		{
			return this.entityClass;
		}
	}
	
	private static void initTier2(SummonList sl)
	{
		for(SummonSpawnEntry e : sl.MobsTier1)
		{
			sl.MobsTier2.add(e);
		}
	}
	
	public static SummonList getFromID(int ID)
	{
		for(SummonList i : SummonList.values())
		{
			if(i.ordinal() == ID)
			{
				return i;
			}
		}
		return null;
	}
}
