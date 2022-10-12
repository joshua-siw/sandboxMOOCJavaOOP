
public class SimpleDate {
    private int day;
    private int month;
    private int year;
    public SimpleDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    @Override
    public int hashCode(){
        return (int) year*month*day;//maybe use pow((year*day),month) to get more distinct results
    }
    @Override
    public boolean equals(Object object){
        // if the variables are located in the same place, they're the same
        if(this == object) {
            return true;
        }
        // if comparedObject is not of type Book, the objects aren't the same
        if (!(object instanceof SimpleDate)) {
                return false;
            }
        //convert the object to SimpleDate
        SimpleDate comparedDate = (SimpleDate) object;
        // if the instance variables of the objects are the same, so are the objects
        if(this.year == comparedDate.year &&
                this.month == comparedDate.month &&
                this.day == comparedDate.day){
            return true;
            }
        // otherwise, the objects aren't the same
        return false;
    }
}
