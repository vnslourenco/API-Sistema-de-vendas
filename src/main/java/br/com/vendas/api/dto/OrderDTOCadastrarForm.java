package br.com.vendas.api.dto;

import java.util.List;

public class OrderDTOCadastrarForm {
	
	private long idUser;
	private List<Long> idProduct;
	private String SalesChannelStatus;
	
	
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public List<Long> getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(List<Long> idProduct) {
		this.idProduct = idProduct;
	}
	public String getSalesChannelStatus() {
		return SalesChannelStatus;
	}
	public void setSalesChannelStatus(String salesChannelStatus) {
		SalesChannelStatus = salesChannelStatus;
	}
	
	

}
