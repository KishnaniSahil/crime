package iste.crime.service;

import iste.crime.Repository.actionrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class actionService {
 @Autowired
 private iste.crime.Repository.actionrRepository actionrRepository;
    public void postMurder(Map<String,Object> blogData){
        String VictimName=(String) blogData.get("VictimName");
        String LastLocation=(String) blogData.get("LastLocation");
        String  TimeOfMissing=(String) blogData.get("TimeOfMissing");
        String MurdererName=(String) blogData.get("MurdererName");
        String VictimFamilyContact=(String) blogData.get("VictimFamilyContact");
        String EyeWitness=(String) blogData.get("EyeWitness");
        String pincode=(String) blogData.get("pincode");
        actionrRepository.postMurder(VictimName,LastLocation, TimeOfMissing,MurdererName,VictimFamilyContact,EyeWitness,pincode);
    }
    public void postMissing(Map<String,Object> textData){
        String VictimName=(String) textData.get("VictimName");
        String TimeOfMissing=(String) textData.get("TimeOfMissing");
        String  LastLocation=(String) textData.get(" LastLocation");
        String VictimFamilyContact=(String) textData.get("VictimFamilyContact");
        String pincode=(String) textData.get("pincode");
        actionrRepository.postMissing(VictimName,TimeOfMissing,LastLocation,VictimFamilyContact,pincode);
    }
    public void postKidnapping(Map<String,Object> rawData){
        String VictimName=(String) rawData.get("VictimName");
        String KidnappingLocation=(String) rawData.get("KidnappingLocation");
        String VictimFamilyContact=(String) rawData.get("VictimFamilyContact");
        String TimeOfKidnapping=(String) rawData.get("TimeOfKidnapping");
        String SuspectName=(String) rawData.get("SuspectName");
        String RansomMoney=(String) rawData.get("RansomMoney");
        String pincode=(String) rawData.get("pincode");
        actionrRepository.postKidnapping(VictimName,KidnappingLocation,VictimFamilyContact,
                TimeOfKidnapping,SuspectName,RansomMoney,pincode);

    }
    public void postTheft(Map<String,Object> theftData){
        String VictimName=(String) theftData.get("VictimName");
        String TheftLocation =(String) theftData.get("TheftLocation ");
        String VictimContact=(String) theftData.get("VictimContact");
        String TimeOfTheft=(String) theftData.get("TimeOfTheft");
        String TheftItem=(String) theftData.get("TheftItem");
        String pincode=(String) theftData.get("pincode");
        actionrRepository.postTheft(VictimName,TheftLocation,VictimContact,TimeOfTheft,TheftItem, pincode);

    }
    public void postUser(Map<String,Object> userData){
        String FirstName= (String) userData.get("FirstName");
        String LastName= (String) userData.get("LastName");
        String Password=(String) userData.get("Password");
        String age=(String) userData.get("age");
        String Address=(String) userData.get("Address");
        String Mobile=(String) userData.get("Mobile");
        String Email=(String) userData.get("Email");
        String gender=(String) userData.get("gender");
        String Dob=(String) userData.get("Dob");
        String dateofcomplaint=(String) userData.get("dateofcomplaint");
        String pincode=(String) userData.get("pincode");
        actionrRepository.postUser(FirstName,LastName,Password,age,Address,Mobile, Email
        ,gender,Dob,dateofcomplaint,pincode);

    }



}
