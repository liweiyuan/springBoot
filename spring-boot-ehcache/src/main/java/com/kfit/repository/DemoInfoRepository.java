package com.kfit.repository;

import org.springframework.data.repository.CrudRepository;

import com.kfit.bean.DemoInfo;

/**
 * 操作数据库.
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long>{

}
