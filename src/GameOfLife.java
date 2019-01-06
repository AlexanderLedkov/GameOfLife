import java.util.Arrays;

public class GameOfLife {
	public static Cell[] cells;
	public static int imax,xmax,ymax;
	
	public static void initCells()
	{
		xmax=10;
		ymax=10;
		imax=xmax*ymax;
		cells=new Cell[imax];
	}
	
	public static void iterrate(){
		cells[0].makeLiveCell();
		Cell[] newcells;
		newcells=cells;
	}	
	
	public static void main(String[] args)
	{
		//Создаем игровое поле
		initCells();
		iterrate();
		for (int i=0; i<imax; i++){
			cells[i]=new Cell();
	        cells[i].makeLiveCell();	        
	        System.out.println("i="+i+" cell="+cells[i].isAlive);
		}
		Cell myCell=new Cell();
		myCell.makeLiveCell();
        System.out.println(myCell.isAlive);		
	}
	

}
