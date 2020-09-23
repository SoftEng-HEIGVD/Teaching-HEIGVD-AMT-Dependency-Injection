package ch.heigvd.amt.fishing;

import ch.heigvd.amt.fishing.equipment.Bait;
import ch.heigvd.amt.fishing.equipment.Boat;
import ch.heigvd.amt.fishing.equipment.Boots;
import ch.heigvd.amt.fishing.equipment.FishingRod;

public class Fisherman {

  private Boots boots;
  private FishingRod fishingRod;
  private Bait bait;
  private Boat boat;

  public void equipSelf() {
    this.boots = new Boots();
    this.fishingRod = new FishingRod();
    this.bait = new Bait();
    this.boat = new Boat();
  }

  public Fish goGetFish() {
    boots.wear();
    boat.putOnWater();
    boat.startEngine();
    bait.putOnHook();
    fishingRod.moveUpTheAir();
    Fish fish = fishingRod.pullOutOfWater();
    return fish;
  }

}
