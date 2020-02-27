package prueba_grupal;

import java.util.ArrayList;

public class Tablero 
{
	Carro [] carros = new Carro [18];//LISTA 18 OBJETOS TIPO CARRO
	ArrayList<Huevo> arrayhuevo = new ArrayList<Huevo>();//creamos el objeto lista
	
	int [] a=new int[]{1,3,2,4,2,3,4,1,2,1,10,15,12,16,20,1960,1990,1985};// 18 ENTEROS atributos particulares
	private int [] c=new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	String [] b=new String []{"juanito", "juanito", "juanito", "juanito", "juanito", "juanito", "juanito", "juanito", "juanito", "juanito", "rojo", "rojo", "rojo", "rojo", "rojo", "BMW", "BMW", "BMW"}; //18 STRINGS atributos particulares
	private String [] d=new String []{"16/05/2001","14/01/2011","15/06/2015","14/02/2002","24/06/1999","14/12/2004","04/06/2006","14/06/2007","19/11/2009","20/12/1996","20/02/2000","21/01/1982","12/11/2004","01/01/2006","04/05/2015","03/01/2002","04/04/2001","04/04/2001"};
	int [][] aux = new int[15][15];//matriz auxiliar del tablaros 
	public Tablero()
	{
		
	}

	public void setaux()
	{
		for(int i=1;i<14;i++)
		{
			for(int j=0; j<14;j++)
			{
				aux[i][j]=0;
			}
		}
	}
	public void setcarros()
	{
		
		for(int i=0; i<10; i++)
		{
		carros[i]=Crear_carro(1,i);
			
		}
		for(int i=10; i<15; i++)
		{
		carros[i]=Crear_carro(2,i);
			
		}
		for(int i=15; i<18; i++)
		{
		carros[i]=Crear_carro(3,i);
			
		}
	
	}

	
	public  Carro Crear_carro (int tipo, int i)
		{
		int x=0;
		int y=0;
		int cont=0;
		
		do
		{
			switch(tipo)
			{
			case 1:
				x=(int)(Math.random()*14);
				y=(int)(Math.random()*14);
				if(aux[x][y]==0)
				{	
					aux[x][y]=1; 	
					cont=1;
				}
			case 2:
				x=(int)(Math.random()*14);
				y=(int)(Math.random()*13);
				if(aux[x][y]==0 && aux[x][y+1]==0)
				{
					aux[x][y]=1;
					aux[x][y+1]=1;
					cont=1;		
				}
			case 3:
				x=(int)(Math.random()*12);
				y=(int)(Math.random()*14);
				if(aux[x][y]==0 && aux[x+1][y]==0 && aux[x+2][y]==0)
				{
					aux[x][y]=1;
					aux[x+1][y]=1;
					aux[x+2][y]=1;
					cont=1;
				}
			}
			
		}while(cont==0);
		Carro C = new Carro(x, y, a[i], b[i],c[i],d[i]);
		switch(tipo)
		{
		case 1:
			C=new Trupalla(x, y, a[i], b[i],c[i],d[i]);
		case 2:
			C=new Caguano(x, y, a[i], b[i],c[i],d[i]);
		case 3:
			C=new Kromi(x, y, a[i], b[i],c[i],d[i]);

		}
return C;		
		}
	public int getC(int i) 
	{
		return c[i];
	}


	public String getD(int i) 
	{
		return d[i];
	}
	

	//registra las coordenadas asignadas a los carros de manera aleatoria 
	//genera la cabeza y luego el cuerpo del carro 
	public int[] getA() 
	{
		return a;
	}

	public String[] getB() 
	{
		return b;
	}

public int dame_x(int i)
{
	int x=carros[i].getx();
	return x;
}
public int dame_y(int i)
{
	int y=carros[i].gety();
	return y;
}
public int dame_c(int i)
{
	int x=carros[i].getC();
	return x;
}
public String dame_d(int i)
{
	String y=carros[i].getD();
	return y;
}

public void mostrar_matriz_final(int [][] K, int [][] C, int [][] T, int [][] H) //mostrar matriz
{
System.out.print(" ");

for(int j=0; j<14;j++)
{
	System.out.print("____");
}
System.out.println("___");
for(int i=0;i<15;i++)
{
	for(int j=0; j<15;j++)
	{
		System.out.print("|   ");
	}
	System.out.println("|");
	for(int j=0; j<15;j++)
	{
		int aux=1;
		if(H[i][j]==1)
		{
			System.out.print("| H ");
		}
		else 
		{
			if(K[i][j]==1)
			{ 
				System.out.print("| K ");
				aux=0;
			}
			if(T[i][j]==1)
			{
				System.out.print("| T ");
				aux=0;
			}
			if(C[i][j]==1)
			{
				System.out.print("| C ");
				aux=0;
			}
			if(aux==1)
			{
				System.out.print("|   ");
			}
		}
		
		
	}
	System.out.println("|");
	for(int j=0; j<15;j++)
	{
		System.out.print("|___");
	}
	System.out.println("|");
}
}
public void mostrar_matriz(int [][] K, int [][] C, int [][] T, int [][] H, int x, int y)
{
	System.out.print("   ");
	for(int j=1; j<15;j++)
	{
		if(j<10)
		{
		System.out.print("  "+j+" ");
		}
		else
		{
		System.out.print(" "+j+" ");
		}
		
	}

	System.out.println("  15");
	System.out.print("    ");
for(int j=0; j<14;j++)
{
	System.out.print("____");
}
System.out.println("___");

for(int i=0;i<15;i++)
{
	System.out.print("   ");
	for(int j=0; j<15;j++)
	{
		System.out.print("|   ");
	}
	System.out.println("|");
	if(i<9)
	{
		System.out.print(i+1+"  ");
	}
	else
	{
		System.out.print(i+1+" ");
	}
	
	for(int j=0; j<15;j++)
	{
		
		if(H[i][j]==1)
		{ 
		System.out.print("| H ");
		}
		else
		{
			System.out.print("|   ");
		}
		
	}
	
	System.out.println("|");
	System.out.print("   ");
	for(int j=0; j<15;j++)
	{
		System.out.print("|___");
	}
	System.out.println("|");
}
System.out.println("EL PUNTAJE OBTENIDO ES: "+calcular_puntaje(K, C, T, x-1, y-1));
}

public int calcular_puntaje(int [][] K, int [][] C, int [][] T, int x, int y)
{
	
	int puntaje=0;

			if(T[x][y]==1)
			{
				puntaje=1;
				
			}
			if(C[x][y]==1)
			{
				puntaje=2;
			}
			if(K[x][y]==1)
			{
				puntaje=3;
			}
return puntaje;		
}
public int calcular_puntaje_total(int [][] K, int [][] C, int [][] T, int [][] H)
{
	
	int puntaje=0;
	for(int i=0;i<15;i++)
	{
		for(int j=0;j<15;j++)
		{
			if(H[i][j]==1)
			{
				if(T[i][j]==1)
				{
					puntaje=puntaje+1;
				}
				if(C[i][j]==1)
				{
					puntaje=puntaje+2;
				}
					
				if(K[i][j]==1)
				{
					puntaje=puntaje+3;
				}
					
			}
		}
	}
	for(int k=15;k<18;k++)
	{
		int x=dame_x(k);
		int y=dame_y(k);
		if(H[x][y]==1&&H[x+1][y]==1&&H[x+2][y]==1)
		{
			puntaje=puntaje+10;
		}
	}
	for(int k=10;k<15;k++)
	{
		int x=dame_x(k);
		int y=dame_y(k);
		if(H[x][y]==1&&H[x][y+1]==1)
		{
			puntaje=puntaje+7;
		}
	}
	return puntaje;
}


public void lanzar_huevo(int x, int y, int puntaje) 
{
	arrayhuevo.add(new Huevo(x,y,puntaje));
	
}


}