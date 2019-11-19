
public class App {

	public static void main(String[] args) {
		String[][] mat=new String[3][];
		
		mat[0]=new String[] {"A","B"};
		mat[1]=new String[] {"C"};
		mat[2]=new String[] {"D","E","F"};

		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
