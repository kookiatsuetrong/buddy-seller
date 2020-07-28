package web;
import javax.persistence.*;

@Entity @Table(name="product_requests")
public class Product {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String topic;
	public String detail;
}
