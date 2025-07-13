package p133hg;

/* renamed from: hg.c */
/* loaded from: classes.dex */
public final class C3039c {
    public static final double DEFAULT_LIMIT_R_PLANET = 10000.0d;

    public static final double getClaimLimit(p133hg.C3038b r7) {
            r0 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            if (r7 != 0) goto L8
            return r0
        L8:
            java.lang.String r2 = "UTC"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            java.util.Calendar r2 = java.util.Calendar.getInstance(r2)
            long r2 = r2.getTimeInMillis()
            r4 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r4
            long r2 = r2 / r4
            double r2 = (double) r2
            int r4 = r7.getExtended_at()
            double r4 = (double) r4
            double r2 = r2 - r4
            r4 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r2 = r2 / r4
            int r2 = (int) r2
            r3 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            double r5 = (double) r2
            double r2 = java.lang.Math.pow(r3, r5)
            java.lang.String r7 = r7.getLimit()
            double r4 = java.lang.Double.parseDouble(r7)
            double r4 = r4 * r2
            r7 = 10000(0x2710, float:1.4013E-41)
            double r2 = (double) r7
            double r4 = r4 / r2
            double r0 = java.lang.Math.max(r4, r0)
            return r0
    }
}
