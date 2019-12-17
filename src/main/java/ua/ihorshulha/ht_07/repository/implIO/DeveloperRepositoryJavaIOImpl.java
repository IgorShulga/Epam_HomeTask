package ua.ihorshulha.ht_07.repository.implIO;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Developer;
import ua.ihorshulha.ht_07.repository.DeveloperRepository;

import java.io.IOException;
import java.util.List;

public class DeveloperRepositoryJavaIOImpl implements DeveloperRepository {
    @Override
    public Developer save(Developer developer) throws ApplicationException {
        return null;
    }

    @Override
    public void update(Long aLong) throws IOException {

    }

    @Override
    public void remove(Long aLong) {

    }

    @Override
    public Developer getById(Long aLong) {
        return null;
    }

    @Override
    public List<Developer> getAll() {
        return null;
    }
}
