import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\flower1.jpg");
    Picture flower2 = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /** begin exercises and modifications */
  public void zeroGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  public void zeroRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(0);
		  }
	  }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel y : rowArray)
		  {
			  y.setRed(255-y.getRed());
			  y.setGreen(255-y.getGreen());
			  y.setBlue(255-y.getBlue());
		  }
	  
	  }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray:pixels)
	  {
		  for (Pixel y : rowArray)
		  {
			  int avg = ( y.getRed() + y.getGreen() + y.getBlue() ) / 3;
			  y.setRed(avg);
			  y.setGreen(avg);
			  y.setBlue(avg);
		  }
	  }
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
	  Pixel[][] a = this.getPixels2D();
	  Pixel top = null;
	  Pixel bottom = null;
	  for (int i = 0; i < a.length/2; i++)
	  {
		 for (int j = 0; j < a[0].length; j++)
			 {
			 	top = a[i][j];
			 	bottom = a[a.length-i-1][j];
			 	bottom.setColor(top.getColor());
			 }
		  
	  }
  }
  
  public void mirrorHorizontalBotToTop()
  {
	  Pixel[][] a = this.getPixels2D();
	  Pixel top = null;
	  Pixel bottom = null;
	  for (int i = 0; i < a.length/2; i++)
	  {
		 for (int j = 0; j < a[0].length; j++)
			 {
			 	top = a[i][j];
			 	bottom = a[a.length-i-1][j];
			 	top.setColor(bottom.getColor());
			 }
		  
	  }
  }
  
  public void mirrorArms()
  {
	  int mirror = 194;
	  Pixel[][] a = this.getPixels2D();
	  Pixel top = null;
	  Pixel bottom = null;
	  for (int i = 159; i<mirror; i++)
	  {
		  for (int y = 103; y<170; y++)
		  {
			  top = a[i][y];
			  bottom = a[mirror - i + mirror] [y];
			  bottom.setColor(top.getColor());
		  }
	  }
	  
	  int mirror2 = 196;
	  Pixel top2 = null;
	  Pixel bottom2 = null;
	  for (int i = 171; i<mirror2; i++)
	  {
		  for (int y = 239; y < 295 ; y++)
		  {
		  
		  top2 = a[i][y];
		  bottom2 = a[mirror2 - i + mirror2][y];
		  bottom2.setColor(top2.getColor());
		  }
	  }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 340;
	    Pixel rightPixel = null;
	    Pixel leftPixel = null;
	    Pixel[][] pixels = this.getPixels2D();   
	   
	    for (int row = 235; row < 323; row++)
	    {
	      for (int col = 238; col < mirrorPoint; col++)
	      {
	        rightPixel = pixels[row][col];      
	        leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    }
  }
  public void copy(Picture fromPic, int startRow, int startCol, int startRBound, int startCBound, int endRBound, int endCBound)
  {
	Pixel fromPixel = null;
	Pixel toPixel = null;
	Pixel[][] toPixels = this.getPixels2D();
	Pixel[][] fromPixels = fromPic.getPixels2D();
	for (int fromRow = startRBound, toRow = startRow; 
	  fromRow < endRBound &&
	  toRow < toPixels.length; 
	  fromRow++, toRow++)
	{
	for (int fromCol = startCBound, toCol = startCol; 
	    fromCol < endCBound &&
	    toCol < toPixels[0].length;  
	    fromCol++, toCol++)
	{
	 fromPixel = fromPixels[fromRow][fromCol];
	 toPixel = toPixels[toRow][toCol];
	 toPixel.setColor(fromPixel.getColor());
	}
	}   
  }
  
  
  public void myCollage()
  {
	  Picture flower = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\flower1.jpg");
	  Picture beach = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\beach.jpg");
	  Picture water = new Picture("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\water.jpg");
	    
	    this.copy(beach,100,100,0, 50, 100, 100);
	    this.copy(flower,0,0, 0, 50, 100, 100);
	    this.copy(flower,50,0, 0, 50, 100, 100);
	    this.copy(flower,75,0, 0, 50, 100, 100);
	    this.copy(water,200,200, 0, 50, 100, 300);
	    Picture flowerNoBlue = new Picture(beach);
	    flowerNoBlue.zeroBlue();
	    this.copy(flowerNoBlue,300,300, 0, 100, 100, 75);
	    this.copy(flower,400,400, 0, 50, 100, 75);
	    this.copy(beach,500,500, 0, 50, 100, 75);
	    this.copy(water, 200,200, 0, 50, 100, 75);
	    this.mirrorVertical();
	    this.write("C:\\Users\\lucky\\Documents\\GitHub\\huang_luke_apcsa-p3\\Unit16\\src\\images\\collage.jpg");
  }
  
  public void mirrorDiagonal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel first = null;
	  Pixel second = null;
	  
	  int width = pixels[0].length;
	  int height = pixels.length;
	  
	  if (width > height)
	  {
		  width = (height-1);
	  }
	  else if (width < pixels.length)
	  {
		  height = (width - 1);
	  }
	  
	  for (int row = 0; row < height; row++)
	  {
		  for (int col = 0; col < width; col++)
		  {
			  first = pixels[col][row];
			  second = pixels[row][col];
			  second.setColor(first.getColor());
		  }
	  }
  }
  
  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel up = null;
    Pixel down = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color downColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
    	up = pixels[row][col];
    	if((row+1) == pixels.length)
    	{
    		down = pixels[row][col];
    	}
    	else
    	{
    	down = pixels[row+1][col];
    	}
    	downColor = down.getColor();
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist || up.colorDistance(downColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }

  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				if (pixelObj.getRed() < 24 && pixelObj.getBlue() > 155)
				{
					 pixelObj.setRed(3*pixelObj.getRed()/2);
					 pixelObj.setBlue(3*pixelObj.getBlue()/2);
					 pixelObj.setGreen(3*pixelObj.getGreen()/2);
				}
			}
		}
  }

  public void encode(Picture messagePict)
  {
    Pixel[][] messagePixels = messagePict.getPixels2D();
    Pixel[][] currPixels = this.getPixels2D();
    Pixel currPixel = null;
    Pixel messagePixel = null;
    for (Pixel[] row: currPixels)
    {
        for (Pixel p: row)
        {
          if (p.getRed() % 2 != 0)
          {
            p.setRed(p.getRed() + 1);
          }
        }
    }
    for (int row = 0; row < messagePixels.length; row++)
    {
      for (int col = 0; col < messagePixels[0].length; col++)
      {
        if (messagePixels[row][col].colorDistance(Color.BLACK) < 50)
        {
          currPixels[row][col].setRed(currPixels[row][col].getRed() + 1);
        }
      }
    }
    this.write("encoded.bmp");
    /** Your code here */
  }
 
  public void decode()
  {
    Pixel[][] pixels = this.getPixels2D();
    int height = this.getHeight();
    int width = this.getWidth();
    Pixel currPixel = null;
    Pixel messagePixel = null;
    Picture messagePicture = new Picture(height,width);
    Pixel[][] messagePixels = messagePicture.getPixels2D();
    for (Pixel[] row: pixels)
    {
        for (Pixel p: row)
        {
          if (p.getRed() % 2 == 1)
          {
            p.setColor(Color.BLACK);
          }
          else
          {
            p.setColor(Color.WHITE);
          }
        }
    }
    this.write("decoded.bmp");
    /** your code here */
 
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
