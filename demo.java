interface Car{
	public void Run();
}
abstract class EleCar implements Car{
	public abstract void Run();
	public String ConsumEle;
}
class AudiEle extends EleCar{
	public void Run(){
		ConsumEle="�µ�:ÿ��ʡ��ٷ�֮50";
		System.out.println(ConsumEle);
	}
}
public class demo{
	public static void main(String []args){
		Car AudiE=new AudiEle();
		AudiE.Run();		
	}
}