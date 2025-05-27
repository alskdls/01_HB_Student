package com.anish;

import com.anish.pojo.Vykladach;
import com.anish.dao.VykladachDao;

public class App {
    public static void main(String[] args) {
        Vykladach vykladach = new Vykladach();
        vykladach.setId(1);
        vykladach.setLocation("Fizyka");
        vykladach.setName("Matematyka");

        VykladachDao dao = new VykladachDao();
        dao.save(vykladach);
    }
}