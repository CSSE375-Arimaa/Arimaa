package testing;

import static org.junit.Assert.*;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import game.ImagePanel;

public class TestImagePanel {
	
	ImagePanel testPanel;

	@Before
	public void setUp() throws Exception {
		this.testPanel = new ImagePanel(new ImageIcon("resources/BoardStoneBig.jpg").getImage());
	}

	@After
	public void tearDown() throws Exception {
		this.testPanel = null;
	}

	@Test
	public void testInitializes() {
		assertNotNull(testPanel);
	}
	
	@Test
	public void testGetRow() {
		assertTrue(testPanel.getRow() == 0);
	}
	
	@Test
	public void testSetRow() {
		assertTrue(testPanel.getRow() == 0);
		this.testPanel.setRow(3);
		assertTrue(testPanel.getRow() == 3);
	}
	
	@Test
	public void testGetColumn() {
		assertTrue(testPanel.getColumn() == 0);
	}
	
	@Test
	public void testSetColumn() {
		assertTrue(testPanel.getColumn() == 0);
		this.testPanel.setColumn(3);
		assertTrue(testPanel.getColumn() == 3);
	}
	
	@Test
	public void testGetPixelX(){
		this.testPanel.setColumn(5);
		assertTrue(this.testPanel.getPixelX() == 410);
	}
	
	@Test
	public void testGetPixelX2(){
		this.testPanel.setColumn(0);
		assertTrue(this.testPanel.getPixelX() == 10);
	}
	
	@Test
	public void testGetPixelX3(){
		this.testPanel.setColumn(8);
		assertTrue(this.testPanel.getPixelX() == 650);
	}

}
