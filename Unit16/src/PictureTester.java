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
    Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** begin exercises and modifications */
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  beach.zeroGreen();
	  beach.zeroRed();
	  beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  beach.zeroBlue();
	  beach.zeroGreen();
	  beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  { 
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  beach.zeroBlue();
	  beach.zeroRed();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  beach.negate();
	  beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\water.jpg");
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  beach.grayscale();
	  beach.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  beach.mirrorVerticalRightToLeft();
	  beach.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  beach.mirrorHorizontal();
	  beach.explore();  
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  beach.mirrorHorizontalBotToTop();
	  beach.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\snowman.jpg");
	  snowman.mirrorArms();
	  snowman.explore();
  }
 
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\seagull.jpg");
	  seagull.mirrorGull();
	  seagull.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  public static void testCopy()
  {
	  Picture canvas = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\femaleLionAndHall.jpg");
	  canvas.copy(new Picture ("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\koala.jpg"), 89, 45);
	  canvas.copy((new Picture ("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\water.jpg")), 234, 394);
	  canvas.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testFixUnderwater();
    //testGrayscale();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
	//testMirrorDiagonal(); 
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
	  
	  
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}