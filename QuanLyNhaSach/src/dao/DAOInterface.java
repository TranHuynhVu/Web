package dao;

import java.util.ArrayList;

public interface DAOInterface<T> {
	public int Insert(T t);
	public int Update(T t);
	public int Delete(T t);
	public ArrayList<T> SelectAll();
}
