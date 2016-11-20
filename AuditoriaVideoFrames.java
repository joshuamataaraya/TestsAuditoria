package Model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Core;

public class AuditoriaVideoFrames {
  
  @Test
  public void test() {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    Video vid = new Video();
    vid.setVideo("C:/Proyecto1Lenguajes/inputGroundTruth.avi");
    vid.setFrames();
    int frames = vid.getListFrames().size();
    assertTrue(frames == 155);
    
  }
  
}
