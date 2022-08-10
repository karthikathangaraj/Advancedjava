package sample;

public class pojo { //plain old java object
	
	private int id;
	private String name;
	private String dpt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public pojo(int id, String name, String dpt) {
		super();
		this.id = id;
		this.name = name;
		this.dpt = dpt;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

}
