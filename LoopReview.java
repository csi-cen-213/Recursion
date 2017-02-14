public class LoopReview{
  
  public void wLoop(int i, int stop) {
    while (i < stop) {
      System.out.print(i + " ");
      i++;
    }
  }
  
  public void fLoop(int i, int stop) {
    for (; i < stop; i++) {
      System.out.print(i + " ");
    }
  }
      
  public void rLoop(int i, int stop) {
    System.out.print(i + " " );
    if (i < stop-1) {
      rLoop(i + 1, stop);
    }
  }
  
  public void strRLoop(int i, int stop) {
    System.out.print(strRLoop("", i, stop));
  }
  
  public String strRLoop(String s, int i, int stop) {
    if (i < stop) {
      return strRLoop(s + i + " ", ++i, stop);
    }
    else 
      return s;
  }
  
  public static void main(String [ ] args) {
    LoopReview looper = new LoopReview();
    
    looper.rLoop(0,10000);
  }
}