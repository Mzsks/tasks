package sk.actions;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import sk.entity.As;
import sk.entity.Yonghu;
import sk.manager.Iusername;
import sk.manager.impl.username;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

@Controller("userindex")
public class Userindex implements Action{
	@Autowired
	@Qualifier("username")
	private Iusername iun;

	public String userdenlu(){
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ActionContext action=ActionContext.getContext();
		Yonghu yh=(Yonghu) action.getSession().get("y");
		if(yh!=null){
			List<As> lsas=iun.caidancx(yh);
			//ActionContext action=ActionContext.getContext();
			Map<String, Object> session=action.getSession();
			session.put("lsas", lsas);
			return this.SUCCESS;
		}else{
			return this.INPUT;
		}	
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
