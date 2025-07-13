package ve;

/* renamed from: ve.c */
/* loaded from: classes.dex */
public final class C6654c extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f25878c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f25879d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.String>> f25880e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f25881f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f25882g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<java.lang.String> f25883h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f25884i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<java.lang.String> f25885j;

    /* renamed from: k */
    public p360ue.C6404c0 f25886k;

    /* renamed from: l */
    public int f25887l;

    public C6654c(android.app.Application r3, p238nd.C4728b0 r4) {
            r2 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r3 = "eosManager"
            p214m2.C4339q.m9706k(r4, r3)
            r2.<init>()
            r2.f25878c = r4
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f25879d = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f25880e = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f25881f = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r0 = 0
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            r3.<init>(r4)
            r2.f25882g = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            java.lang.String r4 = ""
            r3.<init>(r4)
            r2.f25883h = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.<init>(r0)
            r2.f25884i = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>(r4)
            r2.f25885j = r3
            return
    }

    /* renamed from: d */
    public final void m13499d(int r9) {
            r8 = this;
            int r0 = r8.f25887l
            int r9 = r9 * r0
            int r9 = r9 / 1000
            double r0 = (double) r9
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = r0 / r2
            ue.c0 r9 = r8.f25886k
            if (r9 == 0) goto L4c
            double r2 = r9.f24945g0
            double r2 = r2 * r0
            androidx.lifecycle.d0<java.lang.String> r9 = r8.f25883h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 4
            r6 = 2
            r7 = 0
            java.lang.String r5 = vg.C6672m.m13535v(r2, r5, r7, r6)
            r4.append(r5)
            java.lang.String r5 = " BRWL"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r9.mo7l(r4)
            androidx.lifecycle.d0<java.lang.Boolean> r9 = r8.f25884i
            r4 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L3b
            r7 = 1
        L3b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            r9.mo7l(r2)
            androidx.lifecycle.d0<java.lang.String> r9 = r8.f25885j
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.mo7l(r0)
            return
        L4c:
            java.lang.String r9 = "brawlerUI"
            p214m2.C4339q.m9713w(r9)
            r9 = 0
            throw r9
    }
}
