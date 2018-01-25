
public class Singer {
	private String name;
	private int id;
	static int counter=0;
	static Singer singer[]= new Singer[10];
		
	public Singer(String name) {
		this.name=name;
		id=counter; 
		singer[counter++]=this;
	}
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Singer [name=" + this.name + ", id=" + this.id + "]";
	}
}
