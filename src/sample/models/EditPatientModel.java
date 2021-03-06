package sample.models;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import sample.controllers.EditPatientController;
import sample.controllers.PatientsController;
import sample.libs.CurrentStage;
import sample.libs.Messages;
import sample.libs.SQLDatabase;
import sample.libs.Session;
import sample.objects.Patient;

/**
 * Created by Petro on 04.05.2016.
 */
public class EditPatientModel extends SQLDatabase {


    private String full_name_of_patient;
    private String date_of_birth;
    private String gender;
    private String results_of_research;
    private String diagnosis;
    private String date_of_completion;
    private String full_name_of_doctor;
    private String status;
    private int id;

    public void setId(int id)
    {
        this.id = id;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    public void setFull_name_of_patient(String full_name_of_patient) { this.full_name_of_patient = full_name_of_patient; }

    public void setDate_of_birth(String date_of_birth) { this.date_of_birth = date_of_birth; }

    public void setGender(ToggleGroup toggle) {
        RadioButton chk = (RadioButton)toggle.getSelectedToggle();
        gender = chk.getText();
    }

    public void setResults_of_researsh(String results_of_research) {
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
    public EditPatientModel()
    {
        sqlSetConnect();
    }
    public void addToDB() {
        try {

            updateExecute("UPDATE patients SET Full_name='"+full_name_of_patient+"', Date_of_birth='"+date_of_birth+"', Gender='"+gender+"', Results_of_research='"+results_of_research+"', Diagnosis='"+diagnosis+"', Date_of_completion='"+date_of_completion+"', Name_of_doctor='"+full_name_of_doctor+"' WHERE ID='"+id+"'");
            PatientsController.patientsData.remove(EditPatientController.patient);
            PatientsController.patientsData.add(new Patient(id, full_name_of_patient, date_of_birth,
                    gender,
                    results_of_research, diagnosis,
                    date_of_completion, full_name_of_doctor, status));

            CurrentStage.getStage().close();
            //database.sqlInsertExecute("INSERT INTO patients VALUES ('2', '', '', '', '', '', '', '', '')");
        } catch (Exception ex) {
            ex.printStackTrace();
            Messages.error("Error", "The patient can not be added", "БД");
        }


    } // void addToDB

}
