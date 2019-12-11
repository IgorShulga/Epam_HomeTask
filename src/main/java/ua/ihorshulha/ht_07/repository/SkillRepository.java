package ua.ihorshulha.ht_07.repository;

public interface SkillRepository<Skill, Long> extends GenericRepository<Skill, Long> {

    void save(Object skill);

    Skill update(Object id);

    void remove(Object id);

    Skill getById(Object id);

    void getAll();
}