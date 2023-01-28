package peaksoft.service;

import peaksoft.dao.ProgrammerDaoImpl;
import peaksoft.model.Programmer;

import java.util.Optional;

public class ProgrammerServiceImpl implements ProgrammerService{
    ProgrammerDaoImpl programmerDao = new ProgrammerDaoImpl();
    @Override
    public String save(Programmer newProgrammer) {
        programmerDao.save(newProgrammer);
        return "Successfully saved...";
    }

    @Override
    public Optional<Programmer> findById(Long id) {
        return programmerDao.findById(id);
    }
}
