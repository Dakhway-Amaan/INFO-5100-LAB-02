/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author amaan
 */
public class Student {
    /** Full name as typed, first and last together in one field. */
    private String name;
 
    /**
     * Age in whole years. Defaults to {@code 0} before it is set, which is
     * indistinguishable from a genuine zero; use a boxed {@link Integer} if
     * "not yet entered" needs to be detectable.
     */
    private int age;
 
    /** Gender chosen from the form's selector; {@code null} until one is picked. */
    private String gender;
 
    /** Contact number in whatever format the user typed, including any country code. */
    private String phone;
 
    /** Continent chosen from the form's selector; {@code null} until one is picked. */
    private String continent;
 
    /** Free-text description of prior experience; may be null or blank, both meaning "none". */
    private String experience;
 
    /**
     * Filesystem path to the uploaded photo, or null/blank if none was chosen.
     * Only the path is kept, so the file may be moved or deleted while this
     * object still refers to it; verify before loading.
     */
    private String photoPath;
 
    void setName(String name) {
        this.name = name;
    }
 
    void setAge(int age) {
        this.age = age;
    }
 
    void setGender(String gender) {
        this.gender = gender;
    }
 
    void setPhone(String phone) {
        this.phone = phone;
    }
 
    void setContinent(String continent) {
        this.continent = continent;
    }
 
    void setExperience(String experience) {
        this.experience = experience;
    }
 
    /** @param photoPath path to the chosen image, or null/blank to clear it. */
    void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
 
    // Getters return the raw stored value, including null for fields the user
    // has not filled in yet. Only toString() applies placeholder text.
    String getName() { return name; }
    int getAge() { return age; }
    String getGender() { return gender; }
    String getPhone() { return phone; }
    String getContinent() { return continent; }
    String getExperience() { return experience; }
    String getPhotoPath() { return photoPath; }
 
    /**
     * Renders the profile for display in the UI, one field per line.
     *
     * <p>Unset fields are replaced with readable stand-ins rather than the word
     * "null", and blank strings are treated the same as missing values, since a
     * user who tabs through a text box without typing has effectively left it
     * empty. The output is meant for humans; do not parse it.
     * @return 
     */
    @Override
    public String toString() {
        return "Name: " + name
            + "\nAge: " + age
            + "\nGender: " + (gender == null ? "Not selected" : gender)
            + "\nPhone: " + phone
            + "\nContinent: " + (continent == null ? "Not selected" : continent)
            + "\nExperience: " + (experience == null || experience.trim().isEmpty() ? "None" : experience)
            + "\nPhoto Path: " + (photoPath == null || photoPath.trim().isEmpty() ? "Not uploaded" : photoPath);
    }
}