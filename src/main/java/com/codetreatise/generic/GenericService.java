package com.codetreatise.generic;

import java.util.List;

/**
 * @author Ram Alapure
 * @since 05-02-2016
 */

public interface GenericService<T extends Object> {

	T save(T entity);
    
    T update(T entity);
  
    void delete(T entity);
  
    void delete(Long id);
  
    T find(Long id);
  
    List<T> findAll();
}
