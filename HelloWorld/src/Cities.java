
public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cities = new String[]{"Dalls","Pleasanton","Ongole"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);

		String[] cities1 = new String[3];
		cities1[0] = "Dallas";
		cities1[1] = "Dallas1";
		cities1[2] = "Dallas2";
		
		//System.out.println(cities[0]);
		
		for (int i=0; i< cities1.length;i++)
		{
			System.out.println(cities1[i]);
					
		}
		System.out.println("State Found or not\n");
		boolean stateFound = false;
		int i1 =0;
		while(!stateFound)
		{
			
			System.out.println(cities1[i1]);
			if (cities1[i1].equals("Dallas"))
			{
				
				stateFound = true;
				System.out.println(stateFound);
				
			}
			i1++;
		}
		
		
	}

}
