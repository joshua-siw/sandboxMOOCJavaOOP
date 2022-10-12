import java.util.HashMap;
public class IOU {
    private HashMap<String, Double> moneyList;
    public IOU(){
        this.moneyList = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        var oldAmount = moneyList.get(toWhom);
        if(moneyList.containsKey(toWhom)){
            moneyList.replace(toWhom, oldAmount+amount);
        }else{
            moneyList.put(toWhom,amount);
        }

    }
    public double howMuchDoIOweTo(String toWhom){
        return moneyList.get(toWhom);
    }
}
