package sample.objects;

/**
 * Created by Admin on 04.05.2016.
 */
public class Patient {
    private String full_name_of_patient;
    private String date_of_birth;
    private String gender;
    private String results_of_research;
    private String diagnosis;
    private String date_of_completion;
    private String full_name_of_doctor;
    private String status;
    private int id;

    public Patient(int id, String name, String birth, String gender,
                String research, String diagnosis, String completion,
                String doctor, String status) {
        this.full_name_of_patient = name;
        this.id = id;
        this.date_of_birth = birth;
        this.gender = gender;
        this.results_of_research = research;
        this.diagnosis = diagnosis;
        this.date_of_completion = completion;
        this.full_name_of_doctor = doctor;
        this.status = status;
    }
    public void setFull_name_of_patient(String name) {this.full_name_of_patient = name;}
    public void setStatus(String status) {this.status = status;}
    public void setId(int id) {this.id = id;}
    public void setDate_of_birth(String date_of_birth) { this.date_of_birth = date_of_birth; }
    public void setGender(String gender) {this.gender = gender;}
    public void setResults_of_research(String results_of_research) {
        this.results_of_research = results_of_research;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void setDate_of_completion(String date_of_completion) {
        this.date_of_completion = date_of_completion;
    }
    public void setFull_name_of_doctor(String full_name_of_doctor) {
        this.full_name_of_doctor = full_name_of_doctor;
    }

    public String getFull_name_of_patient() {return this.full_name_of_patient;}
    public int getId() {
        return this.id;
    }
    public String getStatus() {return this.status;}
    public String getDate_of_birth() { return this.date_of_birth; }
    public String getGender() {return this.gender;}
    public String getResults_of_research() {return this.results_of_research;}
    public String getDiagnosis() {return this.diagnosis;}
    public String getDate_of_completion() {return this.date_of_completion;}
    public String getFull_name_of_doctor() {return this.full_name_of_doctor;}
}
