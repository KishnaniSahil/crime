package iste.crime.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Repository
public class actionrRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public void postMurder(String VictimName,String TimeOfMurder,String PlaceOfMurder,String MurdererName,String VictimFamilyContact,String EyeWitness,String pincode){
        this.jdbcTemplate.update("EXEC crime.sp_murder ?,?,?,?,?,?,?",VictimName,TimeOfMurder,PlaceOfMurder, MurdererName,VictimFamilyContact,EyeWitness,pincode);
    }
    public void postMissing(String VictimName,String TimeOfMissing,String LastLocation,String VictimFamilyContact,String pincode){
        this.jdbcTemplate.update("EXEC crime.sp_missing ?,?,?,?,?",VictimName ,TimeOfMissing,LastLocation,VictimFamilyContact,pincode);
    }
    public void postKidnapping(String VictimName,String KidnappingLocation,String VictimFamilyContact
    , String TimeOfKidnapping,String SuspectName,String RansomMoney,String pincode){
        this.jdbcTemplate.update("exec crime.sp_kidnapping ?,?,?,?,?,?,?",VictimName,
                KidnappingLocation, VictimFamilyContact,TimeOfKidnapping,SuspectName,
                RansomMoney,pincode );
    }
    public void postTheft(String VictimName,String TheftLocation,String  VictimContact,String TimeOfTheft,String TheftItem,String pincode){
        this.jdbcTemplate.update("exec crime.sp_theft ?,?,?,?,?,?",VictimName,TheftLocation,
                VictimContact,TimeOfTheft,TheftItem,pincode);
    }
    public void postUser(String FirstName, String LastName,String Password,String age,
                         String Address,String Mobile,String Email,String gender,String Dob,String dateofcomplaint,String pincode){
        this.jdbcTemplate.update("exec crime.sp_registerUser ?,?,?,?,?,?,?,?,?,?,?",FirstName,LastName,Password,age,Address,Mobile,Email,gender,Dob,dateofcomplaint,pincode);
    }

}
