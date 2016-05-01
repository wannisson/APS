package br.com.gestaoacademica.app.utils;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class GenericService<T extends BaseEntity<ID>, ID extends Serializable> implements ServiceMap {

	@Autowired
	protected JpaRepository<T, ID> genericRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<T> findAll() {
		return this.genericRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public T insert(@RequestBody T entityObject) {

		entityObject.setId(null);

		return this.genericRepository.save(entityObject);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public T update(@RequestBody T entityObject) {

		if (entityObject.getId() == null) {
			return null;
		}

		return this.genericRepository.save(entityObject);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody T entityObject) {

		this.genericRepository.delete(entityObject);
	}

}
