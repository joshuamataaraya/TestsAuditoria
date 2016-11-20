package Model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuditoriaCutMedia {
  
  @Test
  public void test() {
    Video video = new Video();
    Cut  cuts  =   new Cut();
    video.setVideo("C:/Proyecto1Lenguajes/inputGroundTruth.avi");
    video.setFrames();
    cuts.setArrayDissimilarity(video.getListFrames());
    double result =cuts.mediaVec();
    assertTrue(result <0.05);
  } 
}
