/**
 * class ini adalah class untuk mengonversi mata uang ringgi ke rupiah
 */
public class RmToRp implements Currency
{
    private Currency moneyConv;
    
    // method untuk memberikan nilai untuk atribut
    public RmToRp(Currency moneyConv)
    {
        this.moneyConv = moneyConv;
    }
    
    // method untuk mengonversi ringgit malaysia ke dalam satuan rupiah
    @Override
    public double getMoney()
    {
        return moneyConv.getMoney() * 3433.23 ;
    }
}