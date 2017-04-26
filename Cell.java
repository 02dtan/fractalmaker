package fractalmaker;

import java.awt.*;

public class Cell extends Label{
	public Cell(int numRounds){
	    Color color1 = new Color(66, 30, 15);
	    Color color2 = new Color(25, 7, 26);
	    Color color3 = new Color(9, 1, 47);
	    Color color4 = new Color(4, 4, 73);
	    Color color5 = new Color(0, 7, 100);
	    Color color6 = new Color(12, 44, 138);
	    Color color7 = new Color(24, 82, 177);
	    Color color8 = new Color(57, 125, 209);
	    Color color9 = new Color(134, 181, 229);
	    Color color10 = new Color(211, 236, 248);
	    Color color11 = new Color(241, 233, 191);
	    Color color12 = new Color(248, 201, 95);
	    Color color13 = new Color(255, 170, 0);
	    Color color14 = new Color(204, 128, 0);
	    Color color15 = new Color(153, 87, 0);
	    Color color16 = new Color(106, 52, 3);
	    switch(numRounds%16){
	    case 1: 
	    	setBackground(color1);
	    	break;
	    case 2:
	    	setBackground(color2);
	    	break;
	    case 3:
	    	setBackground(color3);
	    	break;
	    case 4:
	    	setBackground(color4);
	    	break;
	    case 5:
	    	setBackground(color5);
	    	break;
	    case 6:
	    	setBackground(color6);
	    	break;
	    case 7: 
	    	setBackground(color7);
	    	break;
	    case 8:
	    	setBackground(color8);
	    	break;
	    case 9:
	    	setBackground(color9);
	    	break;
	    case 10: 
	    	setBackground(color10);
	    	break;
	    case 11:
	    	setBackground(color11);
	    	break;
	    case 12:
	    	setBackground(color12);
	    	break;
	    case 13:
	    	setBackground(color13);
	    	break;
	    case 14:
	    	setBackground(color14);
	    	break;
	    case 15:
	    	setBackground(color15);
	    	break;
	    case 16:
	    	setBackground(color16);
	    	break;
	    default:
	    	break;
	    }
	}
}
