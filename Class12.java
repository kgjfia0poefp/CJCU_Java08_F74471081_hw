package Java08;
class CWin
{
	int width;
    int height;
    String name;
    
    void setW(int w) 
    {
    	width=w;
    }
    void setH(int h) 
    {
    	height=h;
    }
    void setName(String s)
    {
    	name=s;
    }
    void show()
    {
    	System.out.println("Name="+name);
    	System.out.println("W="+width+", H="+height);
    }
    void setWindows(int w,int h)
    {
    	width=w;
    	height=h;
   }
    void setWindows(int w,int h,String s)
   {
    	  width=w;
    	  height=h;
    	  name=s;
    }
}
public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin CW=new CWin();
		CW.setName("1st Windows");
		CW.setW(5);
		CW.setH(3);
		CW.show();
	
		CW.setName("2nd Windows");
		CW.setWindows(6,8);
		CW.show();
	
		CW.setWindows(4,2,"3rd Windows");
		CW.show();
	}

}
