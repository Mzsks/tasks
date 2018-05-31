package sk.entity;

/**
 * Yonghu entity. @author MyEclipse Persistence Tools
 */

public class Yonghu implements java.io.Serializable {

	// Fields

	private Integer useryid;
	private Jiaose jiaose;
	private String username;
	private String userpwd;
	private String userbeizhu;

	// Constructors

	/** default constructor */
	public Yonghu() {
	}

	/** minimal constructor */
	public Yonghu(String username, String userpwd) {
		this.username = username;
		this.userpwd = userpwd;
	}

	/** full constructor */
	public Yonghu(Jiaose jiaose, String username, String userpwd,
			String userbeizhu) {
		this.jiaose = jiaose;
		this.username = username;
		this.userpwd = userpwd;
		this.userbeizhu = userbeizhu;
	}

	// Property accessors

	public Integer getUseryid() {
		return this.useryid;
	}

	public void setUseryid(Integer useryid) {
		this.useryid = useryid;
	}

	public Jiaose getJiaose() {
		return this.jiaose;
	}

	public void setJiaose(Jiaose jiaose) {
		this.jiaose = jiaose;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUserbeizhu() {
		return this.userbeizhu;
	}

	public void setUserbeizhu(String userbeizhu) {
		this.userbeizhu = userbeizhu;
	}

}