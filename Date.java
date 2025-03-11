public class Date{
   
    private int day;
    private int month;
    private int year;

    public Date (int day, int month,int year){
    this.day=day;
    this.month=month;
    this.year=year;

    }
    public Date(Date other){

    this.day=other.day;
    this.month=other.month;
    this.year=other.year;
    }


    public void showDate(){
    System.out.println(day+"-"+ month +"-" +year);
    } 
    

    public boolean equals(Object obj){
    
    }
  
    public int getDay(){
    return day;
    }
    
    void setDay(int day){
    this.day=day;
    }

    public int getMonth(){
    return day;
    }
    
    void setMonth(int month){
    this.day=day;
    }
    
    public int getYear(){
    return year;
    }
    
    void setYear(int year){
    this.year=year;
    }
    

   







    
    