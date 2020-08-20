package com.datacollector;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.datacollector.DataCollectorModel;


@Repository
public interface DataCollectorRepository extends JpaRepository<DataCollectorModel, Long> {

	 List<DataCollectorModel> findByValue(String value);
	 DataCollectorModel findById(long id);
	 //
}


