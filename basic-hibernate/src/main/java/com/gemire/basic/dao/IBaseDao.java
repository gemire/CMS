package com.gemire.basic.dao;

import java.util.List;
import java.util.Map;

import com.gemire.basic.model.Pager;

/**
 * 公共的DAO处理对象，这个对象中包含了Hibernate的所有基本操作和对SQL的操作
 * @author gemire
 *
 * @param <T>
 */
public interface IBaseDao<T> {
	/**
	 * 添加对象
	 * @param t
	 * @return
	 */
	public T add(T t);
	/**
	 * 更新对象
	 * @param t
	 */
	public void update(T t);
	/**
	 * 根据ID删除对象
	 * @param id
	 */
	public void delete(int id);
	/**
	 * 根据ID加载对象
	 * @param id
	 * @return
	 */
	public T load(int id);
	
	/**
	 * 不分页列表对象
	 * @param hql
	 * @return
	 */
	public List<T> list(String hql);
	public List<T> list(String hql, Object arg);
	/**
	 * 不分页列表对象 
 	 * @param hql 查询对象的hql
	 * @param args 查询参数
	 * @return 一组不分页的列表对象
	 */
	public List<T> list(String hql, Object[] args);
	public List<T> listByAlias(String hql,Map<String,Object> alias);
	/**
	 * 基于别名和查询参数的混合列表对象
	 * @param hql
	 * @param args
	 * @param alias 别名对象
	 * @return
	 */
	public List<T> list(String hql,Object[] args,Map<String,Object> alias);
	
	/**
	 * 习惯于把分页相关的不用list,而用find,查询
	 * 分页列表对象
	 * @param hql
	 * @return
	 */
	public Pager<T> find(String hql);
	public Pager<T> find(String hql, Object arg);
	/**
	 * 分页列表对象 
 	 * @param hql 查询对象的hql
	 * @param args 查询参数
	 * @return 一组不分页的列表对象
	 */
	public Pager<T> find(String hql, Object[] args);
	public Pager<T> findByAlias(String hql,Map<String,Object> alias);
	/**
	 * 基于别名和查询参数的混合列表对象
	 * @param hql
	 * @param args
	 * @param alias 别名对象
	 * @return
	 */
	public Pager<T> find(String hql,Object[] args,Map<String,Object> alias);
	
	/**
	 * 根据hql查询一组对象
	 * @param hql
	 * @return
	 */
	public Object queryObject(String hql);
	public Object queryObject(String hql,Object arg);
	public Object queryObject(String hql,Object[] args);
	public Object queryObject(String hql,Object[] args,Map<String,Object> alias);
	public Object queryObjectByAlias(String hql,Map<String,Object> alias);
	
	/**
	 * 根据Hql更新对象
	 * @param hql
	 */
	public void updateByHql(String hql);
	public void updateByHql(String hql,Object arg);
	public void updateByHql(String hql,Object[] args);
	
	/**
	 * 根据SQL查询对象，不包含关联
	 * @param sql 查询的Sql语句
	 * @param args 查询条件
	 * @param clz 查询的实体对象
	 * @param hasEntity 该对象是否是一个Hibernate所管理的实体，如果不是，需要使用setResultTransformer来查询
	 * @return 一组对象
	 */
	public List<Object> listBySql(String sql,Object[] args,Class<Object> clz,boolean hasEntity);
	public List<Object> listBySql(String sql,Object arg,Class<Object> clz,boolean hasEntity);
	public List<Object> listBySql(String sql,Class<Object> clz,boolean hasEntity);
	public List<Object> listBySql(String sql,Object[] args,Map<String,Object> alias,Class<Object> clz,boolean hasEntity);
	public List<Object> listByAliasSql(String sql,Map<String,Object> alias,Class<Object> clz,boolean hasEntity);
	
	/**
	 * 带分页的原生SQL查询
	 * 根据SQL查询对象，不包含关联
	 * @param sql 查询的Sql语句
	 * @param args 查询条件
	 * @param clz 查询的实体对象
	 * @param hasEntity 该对象是否是一个Hibernate所管理的实体，如果不是，需要使用setResultTransformer来查询
	 * @return 一组对象
	 */
	public Pager<Object> findBySql(String sql,Object[] args,Class<Object> clz,boolean hasEntity);
	public Pager<Object> findBySql(String sql,Object arg,Class<Object> clz,boolean hasEntity);
	public Pager<Object> findBySql(String sql,Class<Object> clz,boolean hasEntity);
	public Pager<Object> findBySql(String sql,Object[] args,Map<String,Object> alias,Class<Object> clz,boolean hasEntity);
	public Pager<Object> findByAliasSql(String sql,Map<String,Object> alias,Class<Object> clz,boolean hasEntity);
}
