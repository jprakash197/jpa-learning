package com.mindtree.learning.jpalearning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.learning.jpalearning.dto.RequestTrackDTO;
import com.mindtree.learning.jpalearning.entity.Track;
import com.mindtree.learning.jpalearning.exception.TrackException;
import com.mindtree.learning.jpalearning.exception.handler.Response;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 9, 2019
 */
@Service
public interface TrackService {
	/**
	 * This method add track based on request provided.
	 * 
	 * @param track the requestDTO.
	 * @return the Response.
	 * @throws TrackException the exception thrown.
	 */
	public Response addTrack(RequestTrackDTO track) throws TrackException;

	public List<Track> getAllTracks() throws TrackException;

	public Track getTrackById(int trackId) throws TrackException;

	public String removeTrackById(int trackId) throws TrackException;

	public String updateTrackById(int trackId, Track track) throws TrackException;

}
