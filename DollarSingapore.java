/**
 * class ini adalah class untuk menerima inputan costumer dalam mata uang dollar singapore
 */
public class DollarSingapore implements Currency
{
    private double custMoney;
    
    // method untuk menerima inputan uang customer
    public DollarSingapore(double inputMoney) 
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