package com.anish;

import java.util.List;

import com.anish.config.HibernateSessionFactoryUtil;
import com.anish.pojo.Vykladach;
import com.anish.dao.VykladachDao;

public class App {
    public static void main(String[] args) {

        System.out.println("Працює!");

        /*(delete) VykladachDao VykladachDao = new VykladachDao();
        VykladachDao.deleteAll(); */

        /*(add) Vykladach vykladach = new Vykladach();
        vykladach.setId(1);
        vykladach.setLocation("Fizyka");
        vykladach.setName("Matematyka");

        VykladachDao dao = new VykladachDao();
        dao.save(vykladach); */


        /*(findById) VykladachDao qwe = new VykladachDao();
        Vykladach teacher = qwe.findById(1);

        if (teacher != null) {
            System.out.println("Ім'я: " + teacher.getName());
            System.out.println("Кафедра: " + teacher.getLocation());
        } else {
            System.out.println("Викладача з таким ID не знайдено.");
        } */

        /*(update) Vykladach vykladach = new Vykladach();
        vykladach.setId(1);
        vykladach.setName("Ivan Petrovich");
        vykladach.setLocation("Kafedra Math");

        VykladachDao dao = new VykladachDao();
        dao.update(vykladach); */

        /*(delete with id1) VykladachDao dao = new VykladachDao();

        Vykladach teacher = dao.findById(1);

        if (teacher != null) {
            dao.delete(teacher);
            System.out.println("Викладача видалено.");
        } else {
            System.out.println("Викладача з таким ID не знайдено.");
        } */

        /*(findAll) VykladachDao ert = new VykladachDao();

        List<Vykladach> allTeachers = ert.findAll();

        if (allTeachers.isEmpty()) {
            System.out.println("Немає викладачів у базі.");
        } else {
            System.out.println("Список викладачів:");
            for (Vykladach v : allTeachers) {
                System.out.println("ID: " + v.getId() + ", Ім'я: " + v.getName() + ", Кафедра: " + v.getLocation());
            }
        } */

    }
}