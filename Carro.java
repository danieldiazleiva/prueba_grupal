package prueba_grupal;

public class Carro 
{
	
	private int x;
	private int y;
	private int a;
	private String b;
	private int c;
	private String d;
	Tablero tab1 =new Tablero();
	public Carro(int x, int y,int a, String b,int c, String d)
{
	this.x=x;
	this.y=y;
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
}
public Carro() {
	// TODO Auto-generated constructor stub
}
public int getx()
{
	return x;
}
public int gety()
{
	return y;
}
public int getA() {
	return a;
}

public String getB() {
	return b;
}

public int getC() {
	return c;
}

public String getD() {
	return d;
}
public void datos_basicos(int i)
{	
		if(i<10)
		{
			System.out.println("TRUPALLA "+(i+1));
		}
		if(i<15&&i>9)
		{
			System.out.println("CAGUANOS "+(i+1));
		}
		if(i<18&&i>14)
		{
			System.out.println("KROMIS "+(i+1));
		}
		System.out.println("OCUPANTES DEL CARRO: "+c);
		System.out.println("FECHA DE INGRESO: "+d);
		System.out.println("UBICACION:");
		System.out.println("FILA: "+x);
		System.out.println("COLUMNA: "+y);
		System.out.println("");
		System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("");
}
}
