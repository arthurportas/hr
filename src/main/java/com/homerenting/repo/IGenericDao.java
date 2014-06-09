/**
 * 
 */
package com.homerenting.repo;

import javax.persistence.NoResultException;
import java.io.Serializable;
import java.util.List;

/**
 * @author Arthur Portas
 * @date 24/12/2013
 */
public interface IGenericDao<T extends Serializable> {

	public long count() throws NoResultException;

	public T create(T t);

	public void delete(long id);

	public T find(long id) throws NoResultException;

	public List<T> getAll();

	public T update(T t);
}
