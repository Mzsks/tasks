package sk.entity;

/**
 * Gys entity. @author MyEclipse Persistence Tools
 */

public class Gys implements java.io.Serializable {

	// Fields

	private Integer gid;
	private String gmingcheng;
	private String gbeizhu;

	// Constructors

	/** default constructor */
	public Gys() {
	}

	/** full constructor */
	public Gys(String gmingcheng, String gbeizhu) {
		this.gmingcheng = gmingcheng;
		this.gbeizhu = gbeizhu;
	}

	// Property accessors

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGmingcheng() {
		return this.gmingcheng;
	}

	public void setGmingcheng(String gmingcheng) {
		this.gmingcheng = gmingcheng;
	}

	public String getGbeizhu() {
		return this.gbeizhu;
	}

	public void setGbeizhu(String gbeizhu) {
		this.gbeizhu = gbeizhu;
	}

}