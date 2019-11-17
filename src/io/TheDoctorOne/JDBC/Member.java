package io.TheDoctorOne.JDBC;

public class Member {
    private int id;
    private String name, age, job;

    /**
     * @param id the id to set member id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param name the name to set name of the member
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param age the age to set age of the member
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @param job the job to set member's job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the member id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the member's age
     */
    public String getAge() {
        return age;
    }

    /**
     * @return the member's job
     */
    public String getJob() {
        return job;
    }

    /**
     * @return the member's name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n" + "Age : " + age + "\n" + "Job : " + job;
    }
}