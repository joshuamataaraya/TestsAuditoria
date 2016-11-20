package Model;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

public class AuditoriaNormalizeH {
  
  @Test
  public void test() {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    //open the image and the groundTruth
    Mat imgHSVNorm = Highgui.imread("testData/1-hsvNorm.png");
    Mat imgHSV = Highgui.imread("testData/1-hsv.png");
    
    //init result
    Mat result= new Mat();
    //convert to gray scale the ground truth  
    Frame frame = new Frame(imgHSV);
    Frame frameGT = new Frame(imgHSVNorm);

//    Highgui.imwrite("testData/1-hsvNorm.png", frame.normalizeH());
    //Get H channel ground truth
    Vector<Mat> channels = frameGT.convertChannels();
    
    Core.compare(channels.elementAt(0), frame.normalizeH(), result, 1);
    
    //check if the result was a good hsv image
    assertEquals(0, Core.countNonZero(result));
  }
  
}
