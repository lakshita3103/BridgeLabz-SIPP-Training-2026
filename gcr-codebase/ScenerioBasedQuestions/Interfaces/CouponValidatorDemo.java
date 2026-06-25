interface CouponValidator {

    // Abstract method
    boolean validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        // Coupon is valid if:
        // 1. Length is between 5 and 10
        // 2. Starts with "SAVE"

        return CouponValidator.isLengthValid(code)
                && code.startsWith("SAVE");
    }
}

public class CouponValidatorDemo {
    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "SAVE50",
                "DISCOUNT",
                "SAVE",
                "SAVE12345",
                "ABC123"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}