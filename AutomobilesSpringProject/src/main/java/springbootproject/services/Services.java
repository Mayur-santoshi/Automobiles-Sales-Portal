package springbootproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootproject.dao.DAO;
import springbootproject.entity.MyEntity;

@Service
public class Services {
	
	@Autowired
	private DAO d;

	public List<MyEntity> getAllCars() {
		// TODO Auto-generated method stub
		return d.findAll();
	}

	public MyEntity getById(long id) {
		// TODO Auto-generated method stub
		return d.findById(id).orElse(null);
	}

	public MyEntity saveCar(MyEntity me) {
		// TODO Auto-generated method stub
		return d.save(me);
	}

	public void deletePets(long id) {
		// TODO Auto-generated method stub
		d.deleteById(id);
		
	}

}
