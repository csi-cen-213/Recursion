public class LoopReview{
  
  public void wLoop(int i) {
    while (true) {
      System.out.print(i + " ");
      i++;
    }
  }
  
  public void fLoop(int i) {
    for (; true; i++) {
      System.out.print(i + " ");
    }
  }
      
  public void rLoop(int i) {
    System.out.print(i + " " );
    rLoop(i+1);
  }
  
  public static void main(String [ ] args) {
    LoopReview looper = new LoopReview();
    
    looper.rLoop(0);
  }
}