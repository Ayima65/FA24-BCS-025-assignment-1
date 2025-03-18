
public class Lab{
	private String labName;
	private Employe labStaff;
	private SystemUnit system []=new SystemUnit[50];
        private boolean hasmultimedia;

	public Lab(String LabName, Employe labStaff, SystemUnit[] system, boolean hasmultimedia){
             this.labName=labName;
             this.labStaff=labStaff;
             this.system=system;
	     this.hasmultimedia=hasmultimedia;

       }

 public String toString(){
		StringBuilder st= new StringBuilder();
		st.append(labName);
		st.append(labStaff);
		for(int i=0; i<system.length;i++){
			st.append(system[i]);
		}
		st.append(hasmultimedia);
		return st.toString();
	}


 public void setlabName(String labName){
       this.labName=labName;
  }
 public String getlabName(){
       return labName;
  }

 public void sethasmultimedia(boolean hasmultimedia){
        this.hasmultimedia=hasmultimedia;
  }
 public boolean gethasmultimedia(){
         return hasmultimedia;
  }
 public void setlabstaff(Employe labStaff){
         this.labStaff=labStaff;
 }
 public Employe getlabsStaff(){
         return labStaff;
 } 
 void setSystem(SystemUnit[] system){
		this.system=system;
}
 SystemUnit[] getSystemArray(){
		return system;
}
 

}