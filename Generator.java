package fractalmaker;

public class Generator{
  int max_iterations = 7;
  private int starting_x_squared;
  private int starting_y_squared;
  private int[][] mat;
  int width;
  int height;
  int threshold;

  public Generator(int width, int height, int threshold, int starting_x, int starting_y){
    max_iterations = 255;
    starting_x_squared = starting_x*starting_x-(starting_y*starting_y);
    starting_y_squared = 2*starting_x*starting_y;
    mat = new int[width][height];
    this.threshold = threshold;
    this.height = height;
    this.width = width;
  }

  public int[][] gen(){
    for(int row = 0; row<height; row++){
      for(int col = 0; col<width; col++){
        int iter = 0;
        double ca = (col-width/2.0)*4.0/width;
        double cb = (row-(int)height/2.0)*4.0/width;
        double a=0,b=0;
        while(iter<max_iterations&&a*a+b*b<=threshold){//recommended threshold 4
          double aa = a*a;
          double bb = -(b*b);
          b = 2*a*b;
          a = aa+bb;
          a+=ca;
          b+=cb;
          iter++;
        }
        mat[row][col]=iter;
      }
    }
    return mat;
  }
    

  private double mod(double a, double b){
    return Math.sqrt(a*a + b*b);
  }

}
