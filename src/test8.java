import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class test8 {
	Scanner input=new Scanner(System.in);
    String filename=new String("D:\\eclipse\\Lab1\\test.txt");
    digraph nl=new digraph(30);//定义新的有向图类,同时初始化二维矩阵
    

	@Before
	public void setUp() throws Exception {
		
		nl=nl.createDirectedGraph(filename);//创建有向图        
        nl.refreshifvisited(nl.GetLength());   
	}

	@Test
	public void test() {

		String str1,str2,str3;
		str1="we";
		str2="what";
		str3=nl.queryBridgeWords(nl, str1, str2);       
        if(str3.equals("No in")) System.out.println("No "+str1+" or "+str2+" in the graph !");
        else if(str3.equals("No have")) System.out.println("No bridge words from "+str1+" to "+str2+" !");
        else 
        {
        	System.out.print("The bridge words from "+str1+" to "+str2+" are :"+str3);
        	 str3=nl.queryBridgeWords(nl, str1, str2);    
        	while(!str3.equals("No more")) 
        	{        		
        		String str4=new String(nl.queryBridgeWords(nl, str1, str2));        		
        		if(!str3.equals("No more")&&!str4.equals("No more")) 
        			{System.out.print(","+str3);str3=str4;}
        		else if(!str3.equals("No more")&&str4.equals("No more"))
        			{System.out.print("and "+str3);str3=str4;}
        	}
        }
        assertEquals("No have",str3);
	}
	
	

}
