package br.com.vendas.api.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	private User idUser;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> idProduct;
	private OrderStatus orderStatus = OrderStatus.indefinido;
	private SalesChannelStatus salesChannelStatus = SalesChannelStatus.indefinido;
	private long price;
	private LocalDateTime createdAt = LocalDateTime.now();
	private LocalDateTime updatedAt = LocalDateTime.now();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getIdUser() {
		return idUser;
	}
	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}
	public List<Product> getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(List<Product> idProduct) {
		this.idProduct = idProduct;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public SalesChannelStatus getSalesChannelStatus() {
		return salesChannelStatus;
	}
	public void setSalesChannelStatus(SalesChannelStatus salesChannelStatus) {
		this.salesChannelStatus = salesChannelStatus;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", idUser=" + idUser + ", idProduct=" + idProduct + ", orderStatus=" + orderStatus
				+ ", salesChannelStatus=" + salesChannelStatus + ", price=" + price + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}

	
	
}
