package Model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Core;

public class AuditoriaVideo {
  
  @Test
  public void test() {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    Video vid = new Video();
    assertTrue(vid.setVideo("C:/Proyecto1Lenguajes/inputGroundTruth.avi"));
  }
  
}
