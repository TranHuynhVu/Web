package dao;

import java.util.ArrayList;

public interface DAOInterFace<T> {
	
	public int insert(T t);
	
	public int update(T t);
	
	public int dalete(T t);
	
	public ArrayList<T> selectAll();
	
	public T selectById(T t);
}
