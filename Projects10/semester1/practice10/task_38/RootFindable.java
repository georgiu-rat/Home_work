package semester1.practice10.task_38;

public interface RootFindable {
    double evaluate(double x);
    default double findRootBisection(double left, double right, double eps) {
        double fLeft = evaluate(left);
        double fRight = evaluate(right);
        if (fLeft * fRight > 0) {
            throw new IllegalArgumentException("На заданому інтервалі немає зміни знака функції!");}
        double mid = left;
        while ((right - left) / 2.0 > eps) {
            mid = left + (right - left) / 2.0;
            double fMid = evaluate(mid);
            if (fMid == 0.0) {
                break;
            } else if (fLeft * fMid < 0) {
                right = mid;
            } else {
                left = mid;
                fLeft = fMid;}}
        return mid;}
}
