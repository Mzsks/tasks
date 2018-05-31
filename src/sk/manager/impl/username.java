package sk.manager.impl;

import java.util.List;
import java.util.Map;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import sk.common.ResultInfo;
import sk.dao.Ilogindao;
import sk.dao.impl.logindao;
import sk.entity.As;
import sk.entity.Yonghu;
import sk.manager.Iusername;


import com.opensymphony.xwork2.ActionContext;

@Entity
@Service("username")
public class username implements Iusername {
	ResultInfo res=new ResultInfo();
	@ManyToOne
	@Autowired
	@Qualifier("logindao")
	private Ilogindao log;
	@Override
	public ResultInfo addnew(Yonghu u) {
		boolean b=log.addnew(u);
		if(b==true){
			res.res=true;
			res.mag="注册成功！";
		}else{
			res.res=false;
			res.mag="用户名已存在！";
		}	
		return res;
	}

	@Override
	public ResultInfo chaxun(Yonghu u) {
		Yonghu y=log.chaxun(u);
		if(y==null){
			res.res=false;
			res.mag="登录名不存在！";
		}else if(y.getUsername().equals(u.getUsername()) && y.getUserpwd().equals(u.getUserpwd())){
			res.res=true;
			res.mag="验证成功";
			ActionContext action=ActionContext.getContext();
			Map<String, Object> session=action.getSession();
			session.put("y", y);
		}else{
			res.res=false;
			res.mag="密码错误！";
		}
		//System.out.println(y.getUsername());
		return res;
	}

	@Override
	public List<As> caidancx(Yonghu yh) {
		List<As> lsas=log.caidancx(yh);
		return lsas;
	}

}
