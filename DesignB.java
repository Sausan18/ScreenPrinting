/**
 * class DesignB ini merupakan implements ScreenPrinting dan class ini berisi tentang design B
 */
class DesignB implements ScreenPrinting
{
    // method untuk mendapatkan harga design B
    public double getPrice()
    {
        return 50000;
    }
    
    // method untuk menampilkan harga design B
    public void designCategory()
    {
        System.out.println("The Total Price is : Rp.50000");
    }
}