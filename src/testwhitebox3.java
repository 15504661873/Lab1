import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class testwhitebox3 {
	Scanner input=new Scanner(System.in);
    String filename=new String("D:\\eclipse\\Lab1\\test.txt");
    digraph nl=new digraph(30);//�����µ�����ͼ��,ͬʱ��ʼ����ά����
    

	@Before
	public void setUp() throws Exception {
		
		nl=nl.createDirectedGraph(filename);//��������ͼ        
        nl.refreshifvisited(nl.GetLength());   
	}
	@Test
	public void test() {
        String result=new String();
        nl.sign=1;//����һ����ʼ����λ��
        nl.refreshifvisited(nl.GetLength());
        nl.refreshtimes();
        nl.ifvisited[nl.sign]=1;//���Ϊ�ѷ���
        System.out.print(nl.refrence[nl.sign]+" ");
        while(!result.equals("end"))//δ���ֽ�����־ʱ
        {    result=nl.randomWalk(nl);
        	if(!result.equals("continue")&&!result.equals("end")) 
        	{
        		System.out.print(result+" ");//���õ���Ч���ʱ������ַ�}
        		} }
	}

}
