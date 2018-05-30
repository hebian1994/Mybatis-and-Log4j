package com.how2java;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.how2java.pojo.student;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestMybatis {
	    //创建记录器
	    static Logger logger = Logger.getLogger(TestMybatis.class);
	    
		public static void main(String[] args) throws IOException {
			/*采用指定的配置文件
			 * [%-5p] %d{yyyy-MM-dd HH:mm:ss,SSS} [%t] (%F:%L)-%m%n
			 * 宽度是5的优先等级
			 * 输出日志时间点的日期或时间
			 * %t 输出产生该日志事件的线程名
			 * %f 输出日志信息所属的类的类名
			 * %l 输出日志事件的发生位置，即输出日志信息的语句处于它所在的类的第几行
			 * %m 输出代码中指定的信息，如logger.info("输出信息");中的输出信息
			 * %n 输出一个回车换行符，Windows平台为“rn”，Unix平台为“n”
			 * */
			PropertyConfigurator.configure("e:\\project\\Mybatis2\\src\\log4j.properties");
	        
			String resource = "mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        SqlSession session = sqlSessionFactory.openSession();
	        
	        logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
	         //获取
	        //student c= session.selectOne("getstudent",3136);
	        //System.out.println(c.getId()+" "+c.getsNAME()+" "+c.getQqnumber()+" "+c.getSchool());
	         
	        //更新
	        //student a= session.selectOne("getstudent",3136);
	        //a.setsNAME("mimi");
	        //session.update("updatestudent",a);
	        
	        //怎么在中间插入一条数据
	        //student i = new student("986524714","李弘基","2018-08-09","西南交通大学","how2java","又恐琼楼玉宇","卢逗比");
			//session.insert("addstudent",i);
	        
	        
	         //删除
	        
	        student d=new student();
	        for(int j=3154;j<3175;j++){
	        d.setId(j);
	        session.delete("deletestudent",d);
	        }
	        listAll(session);
	        session.commit();
	        session.close();
	        
	    }
	 
	    private static void listAll(SqlSession session) {
	        List<student> cs = session.selectList("liststudent");
	        for (student c : cs) {
	        	System.out.println(c.getId()+" "+c.getsNAME()+" "+c.getQqnumber()+" "+c.getSchool());
	        }
	    }
}
