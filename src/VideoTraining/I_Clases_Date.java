package VideoTraining;

public class I_Clases_Date {
private int day;
    private int month;  // instance
    private int year;

    public I_Clases_Date(int d, int m, int y){  //constructor
        day = d;
        month = m;
        year = y;
    }
    
    public int getDay(){
        return day;
    }
    public void setDay(int d){
        if (d>=1 && d<=31){
            day = d;
        }
    }
    public int getMonth(){  //accesor (getters)
        return month;
    }
    public void setMonth(int m){  //mutator (setter)
        if (m>=1 && m<=12){
        month = m;
        }
    }
    public int getYear(){
        return year;
    } 
    public void setYear(int y){
        if (y>=1800 && y<=2017){
            year=y;
        }
    }

    public String toString(){
        String result;
        result = day +"/" + month +"/" + year;
        return result;
    }
}


