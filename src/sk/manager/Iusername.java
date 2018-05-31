package sk.manager;

import java.util.List;

import sk.common.ResultInfo;
import sk.entity.As;
import sk.entity.Yonghu;



public interface Iusername {
	public ResultInfo addnew(Yonghu u);
	
	public ResultInfo chaxun(Yonghu u);
	public List<As> caidancx(Yonghu u);
}
