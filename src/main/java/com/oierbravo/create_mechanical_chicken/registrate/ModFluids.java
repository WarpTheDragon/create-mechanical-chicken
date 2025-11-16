package com.oierbravo.create_mechanical_chicken.registrate;

import com.oierbravo.create_mechanical_chicken.CreateMechanicalChicken;
import com.oierbravo.mechanicals.register.fluid.MechanicalSolidRenderedPlaceableFluidType;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import static com.oierbravo.create_mechanical_chicken.CreateMechanicalChicken.commonFluidTag;
import static com.oierbravo.create_mechanical_chicken.CreateMechanicalChicken.commonItemTag;

public class ModFluids {
    public static final CreateRegistrate REGISTRATE = CreateMechanicalChicken.registrate();
    public static final FluidEntry<BaseFlowingFluid.Flowing> CHICKEN_NUTRIENT =
            REGISTRATE.standardFluid("chicken_nutrient",
                            MechanicalSolidRenderedPlaceableFluidType.create(0x88A000,
                                    () -> 1f / 8f *0.5f))
                    .lang("Chicken nutrient")
                    .properties(b -> b.viscosity(2000)
                            .density(1400))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(25)
                            .slopeFindDistance(3)
                            .explosionResistance(100f))
                    .tag(commonFluidTag("chicken_nutrient"))
                    .source(BaseFlowingFluid.Source::new) // TODO: remove when Registrate fixes FluidBuilder
                    .bucket()
                    .tag(commonItemTag("buckets/chicken_nutrient"))
                    .build()
                    .register();
    public static void register() {}

}
