class Date212 {
    private int year;
    private int month;
    private int day;

    public Date212 (String date)  {
        //date = "2025108"
        this.year = Integer.parseInt(date.substring(0,4));
        this.month = Integer.parseInt(date.substring(4,6));
        this.day = Integer.parseInt(date.substring(6));
    }

    //getters
    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }   

    public int getDay() {
        return this.day;
    } 
    
    //setters 

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }   

    public boolean isEqual(Date212 other) {
        return ((this.year == other.getYear()) && (this.month == other.getMonth()) && (this.day == other.getDay()));
    }

}

//main()
//Date212 d = new Date212("2025108");
