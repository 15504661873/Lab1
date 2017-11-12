import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class testwhitebox3 {
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
        String result=new String();
        nl.sign=1;//生成一个初始游走位置
        nl.refreshifvisited(nl.GetLength());
        nl.refreshtimes();
        nl.ifvisited[nl.sign]=1;//标记为已访问
        System.out.print(nl.refrence[nl.sign]+" ");
        while(!result.equals("end"))//未出现结束标志时
        {    result=nl.randomWalk(nl);
        	if(!result.equals("continue")&&!result.equals("end")) 
        	{
        		System.out.print(result+" ");//当得到有效输出时，输出字符}
        		} }
	}

}
