package p185k7;

/* renamed from: k7.i4 */
/* loaded from: classes.dex */
public final class C3841i4 extends p185k7.AbstractC3921o4<java.lang.Long> {
    public C3841i4(p185k7.C3895m4 r1, java.lang.String r2, java.lang.Long r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // p185k7.AbstractC3921o4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ java.lang.Long mo8660a(java.lang.Object r5) {
            r4 = this;
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> Lc
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> Lc
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lc
            goto L40
        Lc:
            java.lang.String r0 = r4.m8861c()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 25
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Invalid long value for "
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
