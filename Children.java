import java.util.Random; //1�����У�2����Ů����ͬ�ȸ����£���һ�����к�������£�����һ��һŮ�ĸ��ʡ��˴ε�ֵ����ʵ�鵥һ�������Ҫ���Զ�����Ҫ����MAXSIZEʹ�ô�����
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
				System.out.print("��"+count+"�ε�ֵΪ:"+a[i][j]);		
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
		System.out.println("��һ�����к���ǰ���²��ҵڶ�����Ů�ĸ���Ϊ:"+result);		
	}
}