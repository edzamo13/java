package ec.formos.vendor.service.beans;

import ec.formos.vendor.service.Visitor.JuicePreparationVisitor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Order implements ItemOrder {

	@Getter
	@Setter
	private List<Inventory> inventories;
	@Getter
	@Setter
	private Integer idFruit;
	@Getter
	@Setter
	private Integer typeMeasure;
	@Getter
	@Setter
	private Double sellout;
	

	@Override
	public Order accept(JuicePreparationVisitor visitor) {
		return visitor.visitPrepareJuice(this);
	}

	@Override
	public Order acceptSellout(JuicePreparationVisitor visitor) {
		return visitor.visitSellout(this);
	}



}
