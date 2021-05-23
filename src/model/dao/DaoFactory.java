package model.dao;

import model.dao.Imp.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
