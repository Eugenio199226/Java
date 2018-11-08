package random;

public class random {
	//Advertencia: Puede quemar el ordenador
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado=0;
		int a,b,c,i,j;
		String[] valores= new String[3];
		valores[0]="|";
		valores[1]="/";
		valores[2]="\";
		i=0;
		j=0;
		do{
			resultado=0;
			a=(int) Math.floor(Math.random()*10);
			b=(int) Math.floor(Math.random()*10);
			c=(int) Math.floor(Math.random()*10);
			resultado=a+b+c;
			i++;
			
			System.out.println(a+" + "+b+" + "+c+" = "+resultado+" vuelta nº: "+i+" "+valores[j]);
			j++;
			if (j==3){j=0;}
		}while(resultado!=0);
	}

}
