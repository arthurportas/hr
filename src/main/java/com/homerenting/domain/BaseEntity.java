/**
 * 
 */
package com.homerenting.domain;

/**
 * @author Arthur Portas
 * @date 17/12/2013
 */
public abstract class BaseEntity {

	/**
	 * HashCode
	 * */
	public abstract int hashCode();
	/**
	 * Equals
	 * */
	public abstract boolean equals(final Object obj);
	/**
	 * ToString
	 * */
	public abstract String toString();
	
}
