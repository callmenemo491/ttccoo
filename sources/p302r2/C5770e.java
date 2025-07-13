package p302r2;

/* renamed from: r2.e */
/* loaded from: classes.dex */
public class C5770e implements p282q2.InterfaceC5556m<java.net.URL, java.io.InputStream> {

    /* renamed from: a */
    public final p282q2.InterfaceC5556m<p282q2.C5549f, java.io.InputStream> f22242a;

    /* renamed from: r2.e$a */
    public static class a implements p282q2.InterfaceC5557n<java.net.URL, java.io.InputStream> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<java.net.URL, java.io.InputStream> mo9584b(p282q2.C5560q r4) {
                r3 = this;
                r2.e r0 = new r2.e
                java.lang.Class<q2.f> r1 = p282q2.C5549f.class
                java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
                q2.m r4 = r4.m11841b(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    public C5770e(p282q2.InterfaceC5556m<p282q2.C5549f, java.io.InputStream> r1) {
            r0 = this;
            r0.<init>()
            r0.f22242a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a<java.io.InputStream> mo9582a(java.net.URL r3, int r4, int r5, p180k2.C3673e r6) {
            r2 = this;
            java.net.URL r3 = (java.net.URL) r3
            q2.m<q2.f, java.io.InputStream> r0 = r2.f22242a
            q2.f r1 = new q2.f
            r1.<init>(r3)
            q2.m$a r3 = r0.mo9582a(r1, r4, r5, r6)
            return r3
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo9583b(java.net.URL r1) {
            r0 = this;
            java.net.URL r1 = (java.net.URL) r1
            r1 = 1
            return r1
    }
}
