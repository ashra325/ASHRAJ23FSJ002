package javaclosedlab;

public class typeInitialization {
	public static void main(String[] args) {
		
	
	//all possible initializations
	int a=1;
	System.out.println("a="+a);
	Integer b=new Integer(3);
	System.out.println("b="+b);
	Integer c=2;
	System.out.println("c="+c);
	float d=4.36456345326f;
	System.out.println("d="+d);
	Float e=new Float(5.263649f);
	System.out.println("e="+e);
	Float f=6.326747f;
	System.out.println("f="+f);
	short g=5;
	System.out.println("g="+g);
	Short h=new Short((short)6);
	System.out.println("h="+h);
	Short i=7;
	System.out.println("i="+i);
	double j=7.8;
	System.out.println("j="+j);
	Double k=new Double(9.8);
	System.out.println("k="+k);
	Double  l=9.645;
	System.out.println("l="+l);
	long m=763457465;
	System.out.println("m="+m);
	Long n=new Long(76473675);
	System.out.println("n="+n);
	Long o=(long)3754787;
	System.out.println("o="+o);
	byte p=87;
	System.out.println("p="+p);
	Byte q=new Byte((byte)67);
	System.out.println("q="+q);
	Byte r=78;
	System.out.println("r="+r);
	//implicit typecasting
	short u= q;
	System.out.println("u="+u);
	int s=u;
	System.out.println("s="+s);
	double t=s;
	System.out.println("t="+t);
	//explicit typecasting
	byte v=(byte)a;
	System.out.println("v="+v);
	
	
	}
	}