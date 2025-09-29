package TD_7.affichage;

import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Ecran extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;
    
    private final int largeurEnPixels;
    private final int hauteurEnPixels;
    private final BufferedImage source;
    
    private final JFrame cadre;

	public Ecran (int largeurEnPixels, int hauteurEnPixels) throws IllegalArgumentException {
		
		if (largeurEnPixels <= 0)
			throw new IllegalArgumentException ("Impossible de créer un écran de largeur " + largeurEnPixels);
		
		if (hauteurEnPixels <= 0)
			throw new IllegalArgumentException ("Impossible de créer un écran de hauteur " + hauteurEnPixels);

		this.largeurEnPixels = largeurEnPixels;
		this.hauteurEnPixels = hauteurEnPixels;
        this.source = new BufferedImage (largeurEnPixels, hauteurEnPixels, BufferedImage.TYPE_4BYTE_ABGR);
        
        ImageIcon icone = new ImageIcon (this.source);
        JLabel label = new JLabel (icone);
        this.add (label);
    	
        for (int x = 0; x < largeurEnPixels; x++) {

        	for (int y = 0; y < hauteurEnPixels; y++) {
            	
                Color noir = new Color (0, 0, 0, 0);
                this.source.setRGB (x, y, noir.getRGB ());
                
            }
        	
        }
        
        this.cadre = new JFrame ("Window " + this.largeurEnPixels + "x" + this.hauteurEnPixels);
        
    }
	
	@Override
	public int getWidth() {
		
		return this.largeurEnPixels;
		
	}
	
	@Override
	public int getHeight() {
		
		return this.hauteurEnPixels;
		
	}
	
	public void run () {
		
		this.cadre.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.cadre.add (this);
        this.cadre.setLocationByPlatform (true);
        this.cadre.pack ();
        this.cadre.setVisible (true);
		
	}
	
	private Color convertitEnAWTColor (Couleur color) {
		
		float r = Math.min (Math.max ((float)color.getRouge (), 0), 1);
		float g = Math.min (Math.max ((float)color.getVert (), 0), 1);
		float b = Math.min (Math.max ((float)color.getBleu (), 0), 1);
		
		return new Color (r, g, b);
		
	}
	
	public void setPixel (int x, int y, Couleur couleur) throws ArrayIndexOutOfBoundsException {
		
		if (x < 0 || x >= this.largeurEnPixels || y < 0 || y >= this.hauteurEnPixels)
			throw new ArrayIndexOutOfBoundsException ("Pixel (" + x + ", " + y + ") is out of bounds for a " + this.getWidth () + "x" + this.getHeight () + " screen.");
		
		this.source.setRGB (x, y, this.convertitEnAWTColor (couleur).getRGB ());
		
	}
    
}