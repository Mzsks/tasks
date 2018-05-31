package sk.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import sk.entity.Gys;
import sk.entity.Jiaose;
import sk.entity.Yonghu;


public class GysDao extends BaseDao{
	public boolean addnew(Gys g){
		boolean res=false;
		Session session=null;
		try {
			session=this.openSession();
			Gys y=(Gys)session.createQuery("from Gys where gmingcheng='huawei'").uniqueResult();
			System.out.println(y.getGmingcheng()+","+y.getGbeizhu());
			//Transaction trans=session.beginTransaction();
			//session.save(g);
			//session.flush();
			//trans.commit();
			res=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closesession(session);
		}
		return res;
	}
	public boolean ceishi(Jiaose j){
		Session session=null;
		try {
			session=this.openSession();
			Jiaose ji=(Jiaose)session.createQuery("from Jiaose where jiaosemingcheng='admin'").uniqueResult();
			System.out.println(ji.getJiaosemingcheng()+","+ji.getBeizhu());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closesession(session);
		}
		return false;
	}
	public void csyonghu(Yonghu y){
		Session session=null;
		try {
			session=this.openSession();
			Yonghu yh=(Yonghu)session.createQuery("from Yonghu where username='admin'").uniqueResult();
			System.out.println(yh.getUsername()+","+yh.getUserpwd());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closesession(session);
		}
	}

}
