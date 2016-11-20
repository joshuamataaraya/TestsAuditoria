package Model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Core;
import org.opencv.core.Mat;

public class AuditoriaBhattacharyyaIntegracion {
  
  @Test
  public void test2(){
  System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    Video video = new Video();
    Cut  cuts  =   new Cut();
    video.setVideo("C:/Proyecto1Lenguajes/inputGroundTruth.avi");
    video.setFrames();
    video.getListFrames().elementAt(1).setNormHist();
//    video.getListFrames().elementAt(1).setNormHist();
    Mat hist1 = new Mat();
    hist1 = video.getListFrames().elementAt(1).hist.normHist();
    Mat hist2 = new Mat();
    hist2 = video.getListFrames().elementAt(1).hist.normHist();
    double result =cuts.getBhattacharyyaDistance(hist1, hist2) ;
    assertTrue(result<=0.01);
  }
  
}
