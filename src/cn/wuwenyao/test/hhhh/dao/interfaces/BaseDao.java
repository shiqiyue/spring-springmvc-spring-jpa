package cn.wuwenyao.test.hhhh.dao.interfaces;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public abstract interface BaseDao<T> extends PagingAndSortingRepository<T, Long>, JpaSpecificationExecutor<T>  {
	
}