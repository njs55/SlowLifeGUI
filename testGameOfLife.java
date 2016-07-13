import static org.junit.Assert.*;

//import java.lang.reflect.Method;

import org.junit.Test;

public class testGameOfLife {

  //*******************************
  //Pinning Tests for Cell.toString
  //*******************************
  //Ensure ToString returns "X" when alive
  @Test
  public void testCellToStringAlive() {
    Cell tCell = new Cell();
    tCell.setText("X");
    assertEquals(tCell.toString(),"X");
  }
  
  //Ensure ToString returns "." when dead
  @Test
  public void testCellToStringDead() {
    Cell tCell = new Cell();
    tCell.setText(" ");
    assertEquals(tCell.toString(),".");
  }
  
  //Ensure ToString returns "X" with multiple Cells
  @Test
  public void testCellToStringMultiple() {
    Cell[][] tCell = new Cell[5][5];
    for (int i=0; i < 5; i++){
      for (int k=0; k<5; k++){
        tCell[i][k]= new Cell();        
        tCell[i][k].setText(" ");
      }
    }
    tCell[2][2].setText("X");
    assertEquals(tCell[2][2].toString(),"X");
  }
  
  //Ensure ToString returns "." with multiple Cells
  @Test
  public void testCellToStringMultiple2() {
    Cell[][] tCell = new Cell[5][5];
    for (int i=0; i < 5; i++){
      for (int k=0; k<5; k++){
        tCell[i][k]= new Cell();        
        tCell[i][k].setText(" ");
      }
    }
    tCell[1][2].setText("X");
    tCell[2][3].setText("X");
    tCell[3][2].setText("X");
    assertEquals(tCell[2][2].toString(),".");
  }
  
  //*******************************
  //Pinning Tests for MainPanel.convertToInt()
  //*******************************
  //this was tested manually
  /*@Test
  public void testConvertToInt() {
    MainPanel testPanel = new MainPanel(20);
    Method method = testPanel.getClass().getDeclaredMethod("convertToInt");
    method.setAccessible(true);
    //Object r = method.invoke(object);
    assertEquals(method.invoke(2),2);
  }*/
  
  //*******************************
  //Pinning Tests for MainPanel.convertToInt()
  //*******************************

}
