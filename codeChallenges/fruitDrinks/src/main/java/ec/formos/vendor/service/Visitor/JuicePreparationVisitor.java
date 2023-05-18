
package ec.formos.vendor.service;

import ec.formos.vendor.service.beans.Order;

public interface JuicePreparationVisitor {

	Order visitPrepareJuice(Order order);

	Order visitSellout(Order order);
}
