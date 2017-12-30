import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.Scrollable;
/*
 * 
 * This class is the JPanel class and allows drawing within the scrollable panel.
 * 
 */

public class ListPanel extends JPanel implements Scrollable
{

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.black);
		
		
		
	}
	@Override
	public Dimension getPreferredScrollableViewportSize() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getScrollableBlockIncrement(Rectangle arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean getScrollableTracksViewportHeight() {
		// TODO Auto-generated method stub
		//not really sure what this does, but the example online says it works
		return getPreferredSize().height
                <= getParent().getSize().height;
	}
	@Override
	public boolean getScrollableTracksViewportWidth() {
		// TODO Auto-generated method stub
		//not really sure what this does, but the example online says it works
		return getPreferredSize().width
                <= getParent().getSize().width;
	}
	@Override
	public int getScrollableUnitIncrement(Rectangle arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
