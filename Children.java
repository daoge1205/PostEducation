import java.util.Random; //1代表男，2代表女。求同等概率下，第一个是男孩的情况下，最终一男一女的概率。此次的值用于实验单一情况，若要测试多种需要设置MAXSIZE使得代码简便
public class Children{
	public static void main(String []args){
		Random rand=new Random();
		int [][]a=new int[100][100];
		for(int i=0;i<100;i++)
			for(int j=0;j<100;j++)
				a[i][j]=0;
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
				int a1=rand.nextInt(2)+1;
				int b=rand.nextInt(2)+1;
				a[i][j]=a1*10+b;
			}
		}
		int count=0;
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
				count++;
				System.out.print("第"+count+"次的值为:"+a[i][j]);		
			}
		}
		int NeedCount=0;
		int OtherCount=0;
		for(int i=0;i<100;i++)
			for(int j=0;j<100;j++){
				if(a[i][j]==12)
					NeedCount++;
				if(a[i][j]==11 ||a[i][j]==21)
					OtherCount++;
			}
		//float ceshi=(float)1/3;
		//System.out.println(NeedCount+"\t"+OtherCount+"\t"+ceshi);
		float result=(float)NeedCount/(NeedCount+OtherCount);
		System.out.println("第一个是男孩的前提下并且第二个是女的概率为:"+result);		
	}
}