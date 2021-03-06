package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	
	public void testSmallestIntIsA(){
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
		assertEquals(new App().mySearch(arr, arr, arr, 0),0);
	}
	
	public void testEmptyList(){
		ArrayList<Integer> arr1 = new ArrayList<>();
		assertEquals(new App().mySearch(arr1, arr1, arr1, 10),0);	
	}
	
	public void testDiffSizeList(){
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(10,22,53,14));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(19,12,38,40,55,98));
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(15,2,3,41,23));
		assertEquals(new App().mySearch(arr1, arr2, arr3, 20),7);
	}
	
	public void testNull1(){
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(19,12,38,40,55,98));
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(15,2,3,41,23));
		assertEquals(new App().mySearch(null, arr2, arr3, 5),0);
	}
	public void testNull2(){
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(19,12,38,40,55,98));
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(15,2,3,41,23));
		assertEquals(new App().mySearch(arr2, null, arr3, 5),0);
	}
	public void testNull3(){
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(19,12,38,40,55,98));
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(15,2,3,41,23));
		assertEquals(new App().mySearch(arr3, arr2, null, 5),0);
	}



  /*
    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, 4));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 5));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1));
    } */

}
