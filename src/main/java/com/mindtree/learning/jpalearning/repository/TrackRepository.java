package com.mindtree.learning.jpalearning.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mindtree.learning.jpalearning.entity.Track;
/**
 * @author M1027358 Jyoti Prakash Behera Jun 9, 2019
 */
@Repository

public interface TrackRepository extends JpaRepository<Track, Integer> {
	@Query("from Track where id=?1")
	Track findTrackByID(int id);

	@Transactional
	@Modifying
	@Query("delete from Track where id=?1")
	int deleteTrackById(int id);
}
