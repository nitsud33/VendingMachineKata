package com.dustinbixler;

import java.math.BigDecimal;

/**
 * Created by Dustin on 5/26/2015.
 */
public class VendingMachine {
    private BigDecimal total = BigDecimal.valueOf(0.0);
    private BigDecimal coinreturn = BigDecimal.valueOf(0.0);
    private boolean needsExactChange = false;
    private Integer colasRemaining = 1;
    private Integer chipsRemaining = 1;
    private Integer candyRemaining = 1;

    CoinAcceptor acceptor = new CoinAcceptor();
    CoinToAmount coinToAmount = new CoinToAmount();

    public VendingMachine() {
        total = total.setScale(2);
    }

    public void insert(String coin){
        if(acceptor.isAccepted(coin)){
            total = total.add(coinToAmount.amount(coin));
        }
    }
    public String readDisplay(){
        if (total.compareTo(BigDecimal.valueOf(0.0)) == 0) {
            if(needsExactChange){
                return "EXACT CHANGE ONLY";
            }else{
                return "INSERT COIN";
            }
        }
        return "$" + total.toString();
    }
    public String buyCola(){
          if(total.compareTo(BigDecimal.valueOf(1.00)) >= 0){
              if (colasRemaining > 0){
                  colasRemaining--;
                  coinreturn = total.subtract(BigDecimal.valueOf(1.00));
                  total = BigDecimal.valueOf(0.0);
                  return "THANK YOU";
              }else{
                  return "SOLD OUT";
              }
         }else{
            return "$1.00";
        }
    }
    public String buyChips(){
        if(total.compareTo(BigDecimal.valueOf(.50)) >= 0){
            if (chipsRemaining > 0){
                chipsRemaining--;
                coinreturn = total.subtract(BigDecimal.valueOf(.50));
                total = BigDecimal.valueOf(0.0);
                return "THANK YOU";
            }else{
                return "SOLD OUT";
            }
          }else{
            return "$.50";
        }
    }
    public String buyCandy(){
        if(total.compareTo(BigDecimal.valueOf(.65)) >= 0){
            if(candyRemaining > 0){
                candyRemaining--;
                coinreturn = total.subtract(BigDecimal.valueOf(.65));
                total = BigDecimal.valueOf(0.0);
                return "THANK YOU";
            }else{
                return "SOLD OUT";
            }
         }else{
            return "$.65";
        }
    }
    public void returnMoney(){
        coinreturn = total;
        total = BigDecimal.valueOf(0.0);
    }
    public BigDecimal getCoinReturn(){
        return coinreturn;
    }
    public boolean isNeedsExactChange() {
        return needsExactChange;
    }

    public void setNeedsExactChange(boolean needsExactChange) {
        this.needsExactChange = needsExactChange;
    }
}
