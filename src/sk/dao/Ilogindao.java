package sk.dao;

import java.util.List;

import sk.entity.As;
import sk.entity.Yonghu;


public interface Ilogindao {
	public List<As> caidancx(Yonghu yh);
	public boolean addnew(Yonghu u);
	public Yonghu chaxun(Yonghu u);
	
}
