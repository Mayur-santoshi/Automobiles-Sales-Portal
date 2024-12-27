package springbootproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootproject.entity.MyEntity;

@Repository
public interface DAO extends JpaRepository<MyEntity, Long>{
	
}
