package Java08;
class CBox
{
	int length;
	int width;
	int height;
	
	double volume()
	{
		return length*width*height;
	}
	double surfaceArea() 
	{
		return ((length*width)+(width*height)+(length*height))*2;
	}
	void showData() 
	{
		System.out.println("length="+length);
		System.out.println("width="+width);
		System.out.println("height="+height);
	}
	void showAll() 
	{
		showData();
		System.out.println("surfaceArea ="+surfaceArea());
		System.out.println("volume="+volume());
	}
}
public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box;
		box =new CBox();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		
		box.showAll();
		
	}

}
