public class MeasureConverter {
    public static void main(String[] args) {
        double a = 15;
        int b = 14;
        MetricConversion metricConversion = new MetricConversion();
        double con1 = metricConversion.metersToCentimeters(a);
        double con2 = metricConversion.metersToMillimeters(a);
        double con3 = metricConversion.centimetersToMeters(a);
        double con4 = metricConversion.millimetersToMeters(a);

        System.out.println(a+" metrów to "+con1+" centymetrów");
        System.out.println(a+" metrów to "+con2+" milimetrów");
        System.out.println(a+" centymetrów to "+con3+" metra");
        System.out.println(a+" milimetrów to "+con4+" metra");
        System.out.println(" ");

        TimeConversion timeConversion = new TimeConversion();
        int con5 = timeConversion.hoursToMinutes(b);
        int con6 = timeConversion.minutesToSeconds(con5);
        int con7 = timeConversion.secondsToMilliseconds(con6);

        System.out.println(b+" godzin to "+con7+" milisekund");
    }
}
