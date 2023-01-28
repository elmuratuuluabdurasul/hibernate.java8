package peaksoft.service;

import peaksoft.model.Programmer;

import java.util.Optional;

public interface ProgrammerService {
    String save (Programmer newProgrammer);
    Optional<Programmer> findById(Long id);
}
