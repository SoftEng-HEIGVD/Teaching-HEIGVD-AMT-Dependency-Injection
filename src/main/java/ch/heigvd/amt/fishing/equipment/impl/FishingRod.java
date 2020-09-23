package ch.heigvd.amt.fishing.equipment.impl;

import ch.heigvd.amt.fishing.Fish;
import ch.heigvd.amt.fishing.equipment.api.IFishingRod;

public class FishingRod implements IFishingRod {

  public void moveUpTheAir() {

  }

  public Fish pullOutOfWater() {
    return new Fish();
  }

}
