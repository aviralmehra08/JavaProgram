public class DeskPhone implements ITelephone
{
    private int myNumber;
    private boolean isRinging;
    public DeskPhone(int myNumber)
    {
        this.myNumber=myNumber;
    }
    @Override
    public void powerOn()
    {
        System.out.println("No action taken");
    }   
    @Override
    public void dial(int phoneNumber)
    {
        System.out.println("Now ringing "+phoneNumber);
    } 
    @Override
    public void answer()
    {
        if(isRinging)
        {
            System.out.println("Answer the desk phone");
            isRinging=false;
        }
    }
    @Override
    public boolean callPhone(int phoneNumber)
    {
        if(phoneNumber==myNumber)
        {
            isRinging=true;
            System.out.println("Ring ring");
        }
        else
        {
            isRinging=false;
            System.out.println("Mobile Phone not on of number different");
        }
        return isRinging;
    }
    @Override
    public boolean isRinging()
    {
        return isRinging;
    }
    public static void main(String args[])
    {
        ITelephone myphone=new DeskPhone(123456);
        myphone.powerOn();
        myphone.callPhone(123456);
        myphone.answer();

        myphone=new Mobile(24565);
        // myphone.powerOn();
        myphone.callPhone(24565);
        myphone.answer();
    }
}
