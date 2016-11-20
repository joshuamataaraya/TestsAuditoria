package Model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuditoriaCut {
  
  @Test
  public void test() {
    Video video = new Video();
    Cut  cuts  =   new Cut();
    video.setVideo("C:/Proyecto1Lenguajes/inputGroundTruth.avi");
    video.setFrames();
    cuts.setArrayDissimilarity(video.getListFrames());
    int result =cuts.Dissimilaritysize();
    assertTrue(154 == result);
  }
  
}
