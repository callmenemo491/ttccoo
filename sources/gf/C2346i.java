package gf;

/* renamed from: gf.i */
/* loaded from: classes.dex */
public final class C2346i extends p119h2.C2448j {

    /* renamed from: p0 */
    public final /* synthetic */ java.lang.String f10672p0;

    public C2346i(java.lang.String r1, java.lang.String r2, gf.C2347j<T> r3, gf.C2348k r4) {
            r0 = this;
            r0.f10672p0 = r2
            r2 = 1
            r0.<init>(r2, r1, r3, r4)
            return
    }

    @Override // p105g2.AbstractC2220n
    /* renamed from: p */
    public java.util.Map<java.lang.String, java.lang.String> mo5806p() {
            r5 = this;
            r0 = 2
            ch.e[] r0 = new ch.C0978e[r0]
            ch.e r1 = new ch.e
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r1.<init>(r2, r3)
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.String r2 = r5.f10672p0
            ch.e r3 = new ch.e
            java.lang.String r4 = "Authorization"
            r3.<init>(r4, r2)
            r0[r1] = r3
            java.util.Map r0 = p062dh.C1480p.m4014s(r0)
            return r0
    }
}
