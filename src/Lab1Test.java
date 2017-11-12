import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;

public class Lab1Test {
	Scanner input=new Scanner(System.in);
    String filename=new String("D:\\eclipse\\Lab1\\test.txt");
    digraph nl=new digraph(30);//�����µ�����ͼ��,ͬʱ��ʼ����ά����
    

	@Before
	public void setUp() throws Exception {
		
		nl=nl.createDirectedGraph(filename);//��������ͼ        
        nl.refreshifvisited(nl.GetLength());   
	}

	@Test
	public void Test()
	{
		String str1,str2,str3;
		str1="we";
		str2="talk";
		str3=nl.queryBridgeWords(nl, str1, str2);
		System.out.println(str3);
		assertEquals("dont",str3);
	}
	
	
    
}
