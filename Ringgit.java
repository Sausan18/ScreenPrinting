/**
 * class ini adalah class untuk menerima inputan costumer dalam mata uang ringgit
 */
public class Ringgit implements Currency
{
    private double custMoney;
    
    // method untuk menerima inputan uang customer
    public Ringgit(double inputMoney) 
    {
        this.custMoney = inputMoney;
    }
    
    // method untuk mendapatkan uang yang customer masukkan
    @Override
    public double getMoney()
    {
        return custMoney;
    }
}