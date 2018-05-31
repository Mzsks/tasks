package sk.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import sk.dao.BaseDao;
import sk.dao.Ilogindao;
import sk.entity.As;
import sk.entity.Yonghu;


//注册用户
@Repository("logindao")
public class logindao extends BaseDao implements Ilogindao{
	public List<As> caidancx(Yonghu yh) {
		List<As> lsas = null;
		Session session=null;
		try{
			session=this.openSession();
			lsas=session.createQuery("from As where jsid='"+yh.getJiaose().getJid()+"'").list();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closesession(session);
		}	
		
		return lsas;
	}
	
	public boolean addnew(Yonghu u){
		boolean ban=false;
		Session session=null;
		try{
			session=this.openSession();
			Transaction trans=session.beginTransaction();
			Yonghu yh=(Yonghu)session.createQuery("from Yonghu as y where y.username='"+u.getUsername()+"'").uniqueResult();
			if(yh==null){
				session.save(u);
				ban=true;
			}
			trans.commit();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closesession(session);
		}	
		return ban;
	}
	
	
	public Yonghu chaxun(Yonghu u) {
		Session session=null;
		Yonghu yh=null;
		try{
			//String sql="SELECT * FROM yonghu WHERE username='"+u.getUsername()+"'";
			session=this.openSession();
			yh=(Yonghu)session.createQuery("from Yonghu as y where y.username='"+u.getUsername()+"'").uniqueResult();
			System.out.println(yh.getJiaose().getJid());
			//System.out.println(yh.getUsername());
			//yh=(Yonghu)session.createSQLQuery(sql);
			//Criteria criteria =session.createCriteria(Yonghu.class);
			//Criterion critrion = Restrictions.eq("username", "admin");
			//criteria = criteria.add(critrion);
			//List<Yonghu> y = criteria.list();
			//List o=q.list();
			//System.out.println(o.toString());
			//yh=(Yonghu)o;
			//yh=(Yonghu)session.get(Yonghu.class, 1);
			/*for(Yonghu yg:y){
				System.out.println(yg.getUsername()+","+yg.getUserpwd());
			}*/
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closesession(session);
		}
		return yh;
	}

}
