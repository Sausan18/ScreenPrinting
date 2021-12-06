/**
 * class DesignC ini merupakan implements ScreenPrinting dan class ini berisi tentang design C
 */
class DesignC implements ScreenPrinting
{
    // method untuk mendapatkan harga design C
    public double getPrice()
    {
        return 90000;
    }
    
    // method untuk menampilkan harga design C
    public void designCategory()
    {
        System.out.println("The Total Price is : Rp.90000");
    }
}