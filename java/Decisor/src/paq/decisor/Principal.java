package paq.decisor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		for(int i=0;i<10;i++) {
		a=(int) Math.floor(Math.random()*101);
		b=(int) Math.floor(Math.random()*101);
		c=(int) Math.floor(Math.random()*101);
		System.out.println("Los valores son: "+a+" "+b+" "+c);
			if(a>b && a>c) 
			{
				System.out.println("a es el mayor "+a);
			}else if(b>c)
			{
				System.out.println("b es el mayor "+b);
			}
			else 
			{
				System.out.println("c es el mayor "+c);
			}
		}
		
	}

}
