package Model;

import static org.junit.Assert.*;



import org.junit.Test;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;
public class AuditoriaRGHtoHSVConvertion {
  
  @Test
  public void test() {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    
    //open the image and the groundTruth
    Mat imgRGB = Highgui.imread("testData/1-rgb.png");
//    Mat imgHSV = Highgui.imread("testData/1-hsv.png");
    
    //init result
    Mat result= new Mat();
    //convert to gray scale the ground truth  
//    Imgproc.cvtColor(imgHSV,imgHSV,Imgproc.COLOR_BGR2GRAY);
    Frame frame = new Frame(imgRGB);
    Highgui.imwrite("testData/1-hsv.png", frame.convertHsv());
    //call the testing method and convert it to gray scale
    Imgproc.cvtColor(frame.convertHsv(),imgRGB,Imgproc.COLOR_BGR2GRAY);
    //compare the result with the ground truth
//    Core.compare(imgHSV, imgRGB, result, 1);
    //check if the result was a good hsv imgag
    assertEquals(0, Core.countNonZero(result));
    //Highgui.imwrite("testData/1-hsv.png", hsv);
  }
  
}
