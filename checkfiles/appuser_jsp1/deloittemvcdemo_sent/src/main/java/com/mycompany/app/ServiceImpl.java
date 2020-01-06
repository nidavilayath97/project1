package com.mycompany.app;


@Service
public class ServiceImpl implements Service {
    private Dao dao;

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public AppUser getUserByUserid(int id) {
        AppUser user = dao.getUserByUserid(id);
        return user;
    }

    @Override
    public boolean credentialsCorrect(String username, int id) {
        boolean correct = dao.credentialsCorrect(username, id);
        return correct;
    }
}
