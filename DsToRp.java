/**
 * class ini adalah class untuk mengonversi mata uang dollar singapore ke rupiah
 */
public class DsToRp implements Currency
{
    private Currency moneyConv;
    
    // method untuk memberikan nilai untuk atribut
    public DsToRp(Currency moneyConv)
    {
        this.moneyConv = moneyConv;
    }
    
    // method untuk mengonversi dollar singapore ke dalam satuan rupiah
    @Override
    public double getMoney()
    {
        return moneyConv.getMoney() * 10553.50 ;
    }
}