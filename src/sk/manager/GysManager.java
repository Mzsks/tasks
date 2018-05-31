package sk.manager;

import sk.dao.GysDao;
import sk.entity.Gys;

public class GysManager {
	public boolean addnew(Gys g){
		GysDao gd=new GysDao();
		boolean res=gd.addnew(g);
		return res;
	}

}
