package sk.test;

import sk.common.ResultInfo;
import sk.entity.Yonghu;
import sk.manager.Iusername;
import sk.manager.impl.username;


public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Yonghu user=new Yonghu();
		user.setUsername("admin");
		Iusername i=new username();
		ResultInfo res=i.chaxun(user);

	}

}
