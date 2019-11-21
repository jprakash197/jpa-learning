package com.mindtree.learning.jpalearning.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.learning.jpalearning.dto.RequestTrackDTO;
import com.mindtree.learning.jpalearning.dto.ResponseTrackDTO;
import com.mindtree.learning.jpalearning.entity.Track;
import com.mindtree.learning.jpalearning.exception.TrackException;
import com.mindtree.learning.jpalearning.exception.handler.Response;
import com.mindtree.learning.jpalearning.service.TrackService;

/**
 * @author M1027358 Jyoti Prakash Behera Jun 9, 2019
 */
@CrossOrigin
@RestController
public class TrackController {

	@Autowired
	TrackService trackService;

	/**
	 * Api to add tracks based on request provided.
	 * 
	 * @param track the request DTO.
	 * @return the response entity.
	 * @throws TrackException the exception thrown.
	 */
	@PostMapping(value = "/tracks")
	public ResponseEntity<Response> addTrack(@Valid @RequestBody RequestTrackDTO track) throws TrackException {
		return new ResponseEntity<>(trackService.addTrack(track), HttpStatus.CREATED);
	}

//	@GetMapping(value = "/tracks")
//	public List<Track> getAllTracks() throws TrackException {
//		return trackService.getAllTracks();
//	}

	@GetMapping(value = "/tracks")
	public ResponseEntity<ResponseTrackDTO<Track>> getAllTracks() throws TrackException {
		ResponseTrackDTO<Track> response = new ResponseTrackDTO<>();
		response.setTracks(trackService.getAllTracks());
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

	@GetMapping(value = "/tracks/{trackId}")
	public Track getTrackById(@Valid @PathVariable("trackId") int trackId) throws TrackException {
		return trackService.getTrackById(trackId);
	}

	@DeleteMapping(value = "/tracks/{trackId}")
	public String deleteEmployeeById(@Valid @PathVariable("trackId") int trackId) throws TrackException {
		return trackService.removeTrackById(trackId);
	}

	@PutMapping(value = "/tracks/{trackId}")
	public String assignTrackToEmployee(@Valid @PathVariable("trackId") int trackId, @Valid @RequestBody Track track)
			throws TrackException {
		return trackService.updateTrackById(trackId, track);
	}
}
