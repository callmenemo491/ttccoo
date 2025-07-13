package p258og;

/* renamed from: og.l */
/* loaded from: classes.dex */
public final class C5275l extends p119h2.C2448j {

    /* renamed from: p0 */
    public final /* synthetic */ java.lang.String f20472p0;

    public C5275l(java.lang.String r2, p105g2.C2222p.b<java.lang.String> r3, p105g2.C2222p.a r4) {
            r1 = this;
            r1.f20472p0 = r2
            r2 = 1
            java.lang.String r0 = "https://tools.uplift.art:3033/v1/world/account/fetch-balance"
            r1.<init>(r2, r0, r3, r4)
            return
    }

    @Override // p105g2.AbstractC2220n
    /* renamed from: l */
    public byte[] mo116l() {
            r2 = this;
            java.lang.String r0 = r2.f20472p0
            java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    @Override // p105g2.AbstractC2220n
    /* renamed from: p */
    public java.util.Map<java.lang.String, java.lang.String> mo5806p() {
            r3 = this;
            ch.e r0 = new ch.e
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r0.<init>(r1, r2)
            java.util.Map r0 = p185k7.C4038x4.m9098k(r0)
            return r0
    }
}
