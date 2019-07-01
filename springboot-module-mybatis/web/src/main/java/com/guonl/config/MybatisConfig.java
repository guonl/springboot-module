package com.guonl.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created by guonl
 * Date: 2019-07-01 10:03
 * Description: 如果拆分多模块，mybatis无法加载到SqlSession，
 *              所以需要通过这样的一个配置
 */
@Configuration
@Slf4j
public class MybatisConfig {

    @Autowired
    private DataSource druidDataSource;


    @Value("${mybatis.mapper-locations}")
    private String mapperLocations;

//    @Value("${default-statement-timeout}")
//    private int dst;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
        log.info("sqlSessionFactory:--->mybatis.mapperLocation:" + mapperLocations);

        sqlSessionFactoryBean.setDataSource(druidDataSource);
        org.apache.ibatis.session.Configuration cfg = new org.apache.ibatis.session.Configuration();//configuration
//        cfg.setDefaultStatementTimeout(dst);//设置相关参数，我这里就只用了一个
        log.info("sqlSessionFactoryBean:-->" + sqlSessionFactoryBean.getObject());
//        log.info("default-statement-timeout:" + dst);
        sqlSessionFactoryBean.setConfiguration(cfg);
        return sqlSessionFactoryBean.getObject();
    }

}
