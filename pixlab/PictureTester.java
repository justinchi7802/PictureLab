/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
   }
   
  public static void testMirrorGull()
  {
    Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
   }
   
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
      Picture beach = new Picture("beach.jpg");
      Picture snowman = new Picture("snowman.jpg");
      beach.copy(snowman,180,240,60,160,180,230);
      Picture flower = new Picture("flower1.jpg");
      beach.copy(flower,400,300);
      beach.explore();
    }
    
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture beach = new Picture("beach.jpg");
    beach.edgeDetection(10);
    beach.explore();
    Picture motorcycle = new Picture("redMotorcycle.jpg");
    motorcycle.edgeDetection(10);
    motorcycle.explore();
  }
  
  /*
   * My changes
   */
  
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      
      beach.keepOnlyBlue();
      beach.explore();
    }
    
  public static void testKeepOnlyRed()
  {
      Picture beach = new Picture("beach.jpg");
      
      beach.keepOnlyRed();
      beach.explore();
    }
    
  public static void testKeepOnlyGreen()
  {
      Picture beach = new Picture("beach.jpg");
      
      beach.keepOnlyGreen();
      beach.explore();
    }
    
  public static void testNegate()
  {
      Picture beach = new Picture("beach.jpg");
      
      beach.negate();
      beach.explore();
    }
    
  public static void testGrayscale() 
  {
      Picture beach = new Picture("beach.jpg");
      
      beach.grayscale();
      beach.explore();
    }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
    }
    
  public static void testMirrorHorizontal()
  {
    Picture motorcycle = new Picture("redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
    }
  
  public static void testMirrorHorizontalBotToTop()
  {
      Picture motorcycle = new Picture("redMotorcycle.jpg");
      motorcycle.explore();
      motorcycle.mirrorHorizontalBotToTop();
      motorcycle.explore();
    }
    
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("beach.jpg");
    beach.mirrorDiagonal();
    beach.explore();
    }
    
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    testKeepOnlyRed();
    testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMirrorDiagonal();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testCollage();
    testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}