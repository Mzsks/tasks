package sk.test;

import sk.dao.GysDao;
import sk.entity.Gys;
import sk.entity.Jiaose;
import sk.entity.Yonghu;
import sk.manager.GysManager;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//GysManager gm=new GysManager();
		//Gys g=new Gys();
		//g.setGmingcheng("huawei");
		//g.setGbeizhu("长期合作");
		//gm.addnew(g);
		//jiaose();
		yonghu();

	}
	public static void jiaose(){
		GysDao gm=new GysDao();
		Jiaose j=new Jiaose();
		j.setJiaosemingcheng("admin");
		gm.ceishi(j);
	}
	public static void yonghu(){
		GysDao gm=new GysDao();
		Yonghu y=new Yonghu();
		y.setUsername("admin");
		gm.csyonghu(y);
	}

}
