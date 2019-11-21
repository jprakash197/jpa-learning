/*package com.mindtree.learning.jpalearning.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.learning.jpalearning.entity.Track;
import com.mindtree.learning.jpalearning.exception.DuplicateTrackException;
import com.mindtree.learning.jpalearning.exception.InvalidTrackException;
import com.mindtree.learning.jpalearning.exception.NoTrackFoundException;
import com.mindtree.learning.jpalearning.exception.TrackCreationException;
import com.mindtree.learning.jpalearning.exception.TrackDeletionException;
import com.mindtree.learning.jpalearning.exception.TrackException;
import com.mindtree.learning.jpalearning.exception.TrackFetchException;
import com.mindtree.learning.jpalearning.exception.TrackUpdationException;
import com.mindtree.learning.jpalearning.repository.TrackRepository;
import com.mindtree.learning.jpalearning.service.TrackService;

*//**
 * @author M1027358 Jyoti Prakash Behera Jun 9, 2019
 *//*
@Service
public class TrackServiceImplBefore implements TrackService {
	@Autowired
	TrackRepository trackRepository;

	@Autowired
	TrackService trackService;

	@Override
	public String addTrack(Track track) throws TrackException {
		try {
			List<Track> tracks = getAllTracks();

			if (tracks == null) {
				trackRepository.save(track);
				return "First track added successfully!!";
			} else {
				for (Track trk : tracks) {
					if (trk.getName().equalsIgnoreCase(track.getName()))
						throw new DuplicateTrackException();
				}
			}
			trackRepository.save(track);
			return "Track added successfully!!";
		} catch (DuplicateTrackException e) {
			throw new DuplicateTrackException("Track already exists!!");
		} catch (TrackException e) {
			throw new TrackCreationException("Failed to add track details!!");
		}
	}

	@Override
	public List<Track> getAllTracks() throws TrackException {
		try {
			List<Track> tracks = trackRepository.findAll();
			if (tracks.isEmpty())
				return tracks;
			else if (!tracks.isEmpty()) {
				return tracks;
			} else {
				throw new NoTrackFoundException();
			}
		} catch (NoTrackFoundException e) {
			throw new NoTrackFoundException("Failed to fetch tracks database, apparently no tracks are present!!");
		} catch (TrackException e) {
			throw new TrackFetchException("Failed to fetch tracks !!");
		}
	}

	@Override
	public Track getTrackById(int trackId) throws TrackException {
		try {
			Track track = trackRepository.findTrackByID(trackId);
			if (track != null)
				return track;
			else
				throw new InvalidTrackException();
		} catch (InvalidTrackException e) {
			throw new InvalidTrackException("Invalid track ID !!");
		} catch (TrackException e) {
			throw new TrackFetchException("Failed to fetch track!!");
		}
	}

	@Override
	public String removeTrackById(int trackId) throws TrackException {
		try {
			List<Track> tracks = getAllTracks();
			int result = 0;
			for (Track track : tracks) {
				if (track.getId() == trackId) {
					result = trackRepository.deleteTrackById(trackId);
				}
			}
			if (result != 0)
				return "Removed track details!!";
			else
				throw new InvalidTrackException();

		}catch (InvalidTrackException e) {
			throw new InvalidTrackException("Failed to remove data, may be due to Invalid ID!!");
		} catch (TrackException e) {
			throw new TrackDeletionException("Something went wrong, deletion unsuccessful!!");
		}

	}

	@Override
	public String updateTrackById(int trackId, Track track) throws TrackException {
		try {
			Track trk = trackRepository.findTrackByID(trackId);
			if (trk != null) {
				track.setId(trackId);
				trackRepository.save(track);
				return "Track with ID " + trackId + " Updated successfully !!";
			} else {
				throw new InvalidTrackException();
			}
		} 
		catch (InvalidTrackException e) {
			throw new InvalidTrackException("Invalid track ID!!");
		}catch (TrackException e) {
			throw new TrackUpdationException("Failed to update track!!");
		}
	}

}
*/