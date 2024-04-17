package ec.formos.vendor.service.beans;

import ec.formos.vendor.service.Visitor.JuicePreparationVisitor;

public interface ItemOrder {
	
	public Order accept(JuicePreparationVisitor visitor);
	
	public Order acceptSellout(JuicePreparationVisitor visitor);
}
