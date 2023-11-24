import java.util.Scanner;
class Currency {
    public static float conversion(String base, float amount, String target){
        float[] cr = {0.004f, 1.13f, 0.27f, 0.01f, 0.009f, 0.007f};
        if(base.equals("PKR")){
            amount/=236;
            if(target.equals("USD")){
                return amount;
            }
        }
        else if(base.equals("JPY")){
            amount/=142;
            if(target.equals("USD")){
                return amount;
            }
        }
        else if(base.equals("INR")){
            amount /= 79;
            if(target.equals("USD")){
                return amount;
            }
        }
        else if(base.equals("BDT")){
            amount/=104;
            if(target.equals("USD")){
                return amount;
            }
        }
        else if(base.equals("Pound")){
            amount/=0.88;
            if(target.equals("USD")){
                return amount;
            }
        }
        else if(base.equals("Dirham")){
            amount/=3.67;
            if(target.equals("USD")){
                return amount;
            }
        }

        if(target.equals("PKR")){
            amount*=cr[0];
        }

        else if(target.equals("BDT")){
            amount*=cr[4];
        }
        else if(target.equals("JPY")){
            amount*=cr[5];
        }
        else if(target.equals("Dirham")){
            amount*=cr[2];
        }
        else if(target.equals("INR")){
            amount*=cr[3];
        }
        else if(target.equals("Pound")){
            amount*=cr[1];
        }
        return amount;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input Base: ");
        String base=s.next();
        System.out.println("Input Amount: ");
        float amount=s.nextFloat();
        System.out.println("Input Target: ");
        String target=s.next();
        Currency obj=new Currency();
        int ans=0;
        obj.conversion(base, amount, target);
        System.out.println(amount + " " + base + " = " + conversion(base, amount, target) + " " + target);
    }
}