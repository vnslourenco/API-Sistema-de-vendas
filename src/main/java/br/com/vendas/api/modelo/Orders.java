package br.com.vendas.api.modelo;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne
	private User idUser;
	@ManyToOne
	private Product idProduct;
	private OrderStatus orderStatus = OrderStatus.indefinido;
	private SalesChannelStatus salesChannelStatus = SalesChannelStatus.indefinido;
	private long price;
	private LocalDateTime createdAt = LocalDateTime.now();
	private Date updatedAt;
	
	public User getIdUser() {
		return idUser;
	}
	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}
	public Product getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Product idProduct) {
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
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	

}
