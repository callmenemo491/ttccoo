package p185k7;

/* renamed from: k7.j4 */
/* loaded from: classes.dex */
public final class C3855j4 extends p185k7.AbstractC3921o4<java.lang.Boolean> {
    public C3855j4(p185k7.C3895m4 r1, java.lang.String r2, java.lang.Boolean r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // p185k7.AbstractC3921o4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ java.lang.Boolean mo8660a(java.lang.Object r5) {
            r4 = this;
            java.util.regex.Pattern r0 = p185k7.C3998u3.f16879b
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Lf
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L52
        Lf:
            java.util.regex.Pattern r0 = p185k7.C3998u3.f16880c
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L1e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L52
        L1e:
            java.lang.String r0 = r4.m8861c()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 28
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Invalid boolean value for "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r5)
            r5 = 0
        L52:
            return r5
    }
}
