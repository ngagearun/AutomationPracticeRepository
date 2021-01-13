
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String countries[]=new String[5];
		countries[0]="India";
		countries[1]="US";
		countries[2]="UK";
		countries[3]="Singapore";
		countries[4]="NZ";
		for(int i=0;i<countries.length;i++){
		System.out.println(countries[i]);
		}
		
		
	int data[][]={  {100,300,400},
			        {400,500,600,234},
			        {700,800,590}
	};
	
	
	for(int row=0;row<data.length;row++){
		
		for(int col=0;col<data.length;col++){
			System.out.println(data[row][col]);
		}
		
	}
	}

}
