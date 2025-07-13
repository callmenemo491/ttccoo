package one.block.eosiojava.utilities;

/* loaded from: classes.dex */
public class DateFormatter {
    public static final java.lang.String BACKEND_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    /* renamed from: BACKEND_DATE_PATTERN_WITH_TIMEZONE */
    public static final java.lang.String f20623x9a47939d = "yyyy-MM-dd'T'HH:mm:ss.SSS zzz";
    public static final java.lang.String BACKEND_DATE_TIME_ZONE = "UTC";

    private DateFormatter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long convertBackendTimeToMilli(java.lang.String r6) {
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSS zzz"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
        La:
            r3 = 2
            if (r2 >= r3) goto L2b
            r3 = r0[r2]
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L28
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L28
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "UTC"
            java.util.TimeZone r3 = java.util.TimeZone.getTimeZone(r3)     // Catch: java.lang.Throwable -> L28
            r4.setTimeZone(r3)     // Catch: java.lang.Throwable -> L28
            java.util.Date r3 = r4.parse(r6)     // Catch: java.lang.Throwable -> L28
            long r0 = r3.getTime()     // Catch: java.lang.Throwable -> L28
            return r0
        L28:
            int r2 = r2 + 1
            goto La
        L2b:
            java.text.ParseException r6 = new java.text.ParseException
            java.lang.String r0 = "Unable to parse input backend time with supported date patterns!"
            r6.<init>(r0, r1)
            throw r6
    }

    /* renamed from: convertMilliSecondToBackendTimeString */
    public static java.lang.String m11630x5f0467e9(long r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            r0.<init>(r2, r1)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTimeInMillis(r3)
            java.util.Date r3 = r1.getTime()
            java.lang.String r3 = r0.format(r3)
            return r3
    }
}
