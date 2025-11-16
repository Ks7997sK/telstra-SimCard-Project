package au.com.telstra.simcardactivator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import au.com.telstra.simcardactivator.model.SimCard;

@Repository
public interface SimCardDao extends JpaRepository<SimCard, Long>{

}
