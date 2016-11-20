package Model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

public class AuditoriaBhattacharyya {
  
  @Test
  public void test() {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    Bhattacharyya bat = new Bhattacharyya();
    
    Mat img1 = Highgui.imread("testData/1-hsv.png");
    Mat img2= Highgui.imread("testData/1-hsv.png");
    
    Frame frame1 = new Frame(img1);
    Frame frame2 = new Frame(img2);
    
    frame1.setNormHist();
    frame2.setNormHist();
    
    
    double result = bat.bhattacharyyaDistance(frame1.hist.normHist(), frame2.hist.normHist());
    //check if the there are the same images
    assertTrue(result<=0.01);
  }
  

  
}
