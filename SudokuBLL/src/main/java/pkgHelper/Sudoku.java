package pkgHelper;
import java.util.Arrays;
import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare{

	private int iSize;
	private int iSqrtSize;
	public Sudoku (){
		super();
	}
	public Sudoku(int[][] latinSquare) {
		super(latinSquare);
	}
	protected int[][] getPuzzle()
	{
		return super.getLatinSquare();
	}
	protected int[] getRegion(int r) {
		return null;
	}
	protected int[] getRegion(int iCol, int iRow) {
		return null;
	}
	protected boolean isSudoku() {
		return false;
	}
	protected boolean isPartialSudoku() {
		return false;
	}
	protected boolean isValidValue(int iCol, int iRow, int iValue) 
	{
		return false;
	}
	
}
