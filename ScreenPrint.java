/**
 * class ini berguna untuk mengolah yang berkaitan tentang screenprint
 */
class ScreenPrint
{
    private ScreenPrinting screenPrinting;
    
    // method untuk memberikan nilai atribut screenprinting
    public void setScreenPrinting(ScreenPrinting screenPrinting)
    {
        this.screenPrinting = screenPrinting;
    }
    
    // method untuk mendapatkan design
    public ScreenPrinting getScreenPrinting()
    {
        return this.screenPrinting;
    }
    
    // method untuk mendapatkan price
    public double getPrice()
    {
        return screenPrinting.getPrice();
    }
    
    // method untuk menampilkan design category
    public void designCategory()
    {
        screenPrinting.designCategory();
    }
}