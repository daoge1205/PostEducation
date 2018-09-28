interface Car{
	public void Run();
}
abstract class EleCar implements Car{
	public abstract void Run();
	public String ConsumEle;
}
class AudiEle extends EleCar{
	public void Run(){
		ConsumEle="奥迪:每天省电百分之50";
		System.out.println(ConsumEle);
	}
}
public class demo{
	public static void main(String []args){
		Car AudiE=new AudiEle();
		AudiE.Run();		
	}
}