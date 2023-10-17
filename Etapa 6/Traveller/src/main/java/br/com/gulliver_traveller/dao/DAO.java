package br.com.gulliver_traveller.dao;

public interface DAO<T extends Object> {
	public String create(T object);
	public T read(T object);
	public void update(T object);
	public void delete(T object);
}