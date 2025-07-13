package bi;

/* renamed from: bi.i */
/* loaded from: classes.dex */
public final class C0786i extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<java.util.List<? extends java.security.cert.X509Certificate>> {

    /* renamed from: Z */
    public final /* synthetic */ bi.C0784h f4260Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.util.List f4261a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.String f4262b0;

    public C0786i(bi.C0784h r1, java.util.List r2, java.lang.String r3) {
            r0 = this;
            r0.f4260Z = r1
            r0.f4261a0 = r2
            r0.f4262b0 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public java.util.List<? extends java.security.cert.X509Certificate> mo15e() {
            r4 = this;
            bi.h r0 = r4.f4260Z
            mi.c r0 = r0.f4254b
            if (r0 == 0) goto L11
            java.util.List r1 = r4.f4261a0
            java.lang.String r2 = r4.f4262b0
            java.util.List r0 = r0.mo9192a(r1, r2)
            if (r0 == 0) goto L11
            goto L13
        L11:
            java.util.List r0 = r4.f4261a0
        L13:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p062dh.C1469e.m3992D(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r2, r3)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.add(r2)
            goto L22
        L39:
            return r1
    }
}
