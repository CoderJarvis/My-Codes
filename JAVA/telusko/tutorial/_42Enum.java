package JavaTelusko;	//enum ia a datatype which contains a fixed no of constraints

enum Mobile42
{
	SAMSUNG,IPHONE,REDMI,REALME,NOKIA,MICROMAX; 
}

public class _42Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile42 ob=Mobile42.REDMI; //input
		
		switch(ob)
		{
		
		case SAMSUNG :
			System.out.println("samsung is the best durable phone");
			break;
			
		case IPHONE:
			System.out.println("iphne is the most costly");
			break;
		case REDMI:
			System.out.println("redmi it the chipest phone phone with similar prformance");
			break;
		case REALME:
			System.out.println("realme is the camera phone");
		case NOKIA:
			System.out.println("nokia phoes are stable phones");
			break;
		case MICROMAX:
			System.out.println("micromax is the indian phone");
			break;
	
		}
		
		System.out.println(4.1/2);
		

		
		}
		

	}


