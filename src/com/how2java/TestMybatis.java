package com.how2java;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.how2java.pojo.student;

public class TestMybatis {

		public static void main(String[] args) throws IOException {
	        String resource = "mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        SqlSession session = sqlSessionFactory.openSession();
	 
	        
	         //获取
	        //student c= session.selectOne("getstudent",3136);
	        //System.out.println(c.getId()+" "+c.getsNAME()+" "+c.getQqnumber()+" "+c.getSchool());
	         
	        //更新
	        //student a= session.selectOne("getstudent",3136);
	        //a.setsNAME("mimi");
	        //session.update("updatestudent",a);
	        
	        //怎么在中间插入一条数据
	       // student i = new student("986524714","李弘基","2018-08-09","西南交通大学","how2java","又恐琼楼玉宇","卢逗比");
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
