package p185k7;

/* renamed from: k7.k4 */
/* loaded from: classes.dex */
public final class C3869k4 extends p185k7.AbstractC3921o4<java.lang.Double> {
    public C3869k4(p185k7.C3895m4 r2, java.lang.Double r3) {
            r1 = this;
            java.lang.String r0 = "measurement.test.double_flag"
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // p185k7.AbstractC3921o4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ java.lang.Double mo8660a(java.lang.Object r5) {
            r4 = this;
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> Lc
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> Lc
            java.lang.Double r5 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lc
            goto L40
        Lc:
            java.lang.String r0 = r4.m8861c()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 27
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Invalid double value for "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r5)
            r5 = 0
        L40:
            return r5
    }
}
