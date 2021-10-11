import java.io.*;

class CPU
	{
	int price=50000;

	class processor
		{
		int noofcores=2;
		String manuf="Intel";
		}
	static class RAM
		{
		String mem="2GB";
		String manuf="IBM";
		}
	
	public static void main(String []args) throws IOException
		{
		CPU c= new CPU();
		CPU.processor p= c.new processor();
		CPU.RAM r= new CPU.RAM(); bcoz static

		System.out.println("price:"+c.price);
		System.out.println("no of cores & manuf:"+p.noofcores +"  " +p.manuf);
		System.out.println("mem & manuf:"+r.mem+"  "+r.manuf);
		}
	}
nesting class in class
static ..no object.....accessible for all..no obj can invoke
. is for accessing data value