// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.lang.reflect.Array;
import java.util.ArrayList;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import io.github.pseudoresonance.pixy2api.Pixy2;
import io.github.pseudoresonance.pixy2api.Pixy2CCC.Block;
import io.github.pseudoresonance.pixy2api.links.SPILink;

public class Vision extends SubsystemBase {
    private final Pixy2 pixy;
    private static final int blockSig = 1;
    private Block largestBlock = null;
  /** Creates a new Vision. */
  public Vision() {
    pixy = Pixy2.createInstance(new SPILink());
    pixy.init();
  }


  public ArrayList<Double> getPixy2X(){
    ArrayList<Double> getXY = new ArrayList<Double>();
    ArrayList<Block> blocks = pixy.getCCC().getBlockCache();
   // Block largestBlock = null;
    for (Block block : blocks){
      if(block.getSignature() == blockSig){
        if(largestBlock == null){
          largestBlock = block;
        }
        else if (block.getWidth() > largestBlock.getWidth()){
          largestBlock = block;
        }
      }
    }

    getXY.add((double) largestBlock.getX());
    getXY.add((double) largestBlock.getY());
    largestBlock.getAngle();
    return getXY;
  }

  public Pixy2 getPixy2(){
    return pixy;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
