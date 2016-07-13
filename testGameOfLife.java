import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
  //When calling the convertToInt()
  //we want to see if it can return '0' when passed '0'
  @Test
  public void testConvertToInt() {
    Method method;
    try {
      Class[] argTypes = new Class[] { int.class };
      method = MainPanel.class.getDeclaredMethod("convertToInt", argTypes);
      method.setAccessible(true);
      MainPanel testPanel = new MainPanel(20);
      //invoke the convertToInt method
      Object returnValue = method.invoke(testPanel, 0);
      int result = ((Integer) returnValue).intValue();
      assertEquals(0, result);
      
    } catch (NoSuchMethodException e) {
        fail(e.getMessage());
    } catch (InvocationTargetException e) {
        fail(e.getMessage());
    } catch (IllegalAccessException e) {
        fail(e.getMessage());
    }
  }
  
  //When calling the convertToInt()
  //we want to see if it can return the number greater than zero passed to it
  @Test
  public void testConvertToIntPositive() {
    Method method;
    try {
      Class[] argTypes = new Class[] { int.class };
      method = MainPanel.class.getDeclaredMethod("convertToInt", argTypes);
      method.setAccessible(true);
      MainPanel testPanel = new MainPanel(20);
      //invoke the convertToInt method
      Object returnValue = method.invoke(testPanel, 3);
      int result = ((Integer) returnValue).intValue();
      assertEquals(3, result);
      
    } catch (NoSuchMethodException e) {
        fail(e.getMessage());
    } catch (InvocationTargetException e) {
        fail(e.getMessage());
    } catch (IllegalAccessException e) {
        fail(e.getMessage());
    }
  }
  
  //When calling the convertToInt()
  //we want to see if it can handle negatives with an exception
  @Test
  public void testConvertToIntNegative() {
    Method method;
    try {
      Class[] argTypes = new Class[] { int.class };
      method = MainPanel.class.getDeclaredMethod("convertToInt", argTypes);
      method.setAccessible(true);
      MainPanel testPanel = new MainPanel(20);
      //invoke the convertToInt method
      Object returnValue = method.invoke(testPanel, -1);
      int result = ((Integer) returnValue).intValue();
      
      //this is on purpose
      fail("Function fails to account for negative numbers");
      
    } catch (NoSuchMethodException e) {
        fail(e.getMessage());
    } catch (InvocationTargetException e) {
        fail(e.getMessage());
    } catch (IllegalAccessException e) {
        fail(e.getMessage());
    }
  }

  //*******************************
  //Tests for MainPanel.runContinuous() were performed manually
  //*******************************

}
