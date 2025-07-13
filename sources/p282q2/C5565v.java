package p282q2;

/* renamed from: q2.v */
/* loaded from: classes.dex */
public class C5565v<Data> implements p282q2.InterfaceC5556m<android.net.Uri, Data> {

    /* renamed from: b */
    public static final java.util.Set<java.lang.String> f21664b = null;

    /* renamed from: a */
    public final p282q2.InterfaceC5556m<p282q2.C5549f, Data> f21665a;

    /* renamed from: q2.v$a */
    public static class a implements p282q2.InterfaceC5557n<android.net.Uri, java.io.InputStream> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<android.net.Uri, java.io.InputStream> mo9584b(p282q2.C5560q r4) {
                r3 = this;
                q2.v r0 = new q2.v
                java.lang.Class<q2.f> r1 = p282q2.C5549f.class
                java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
                q2.m r4 = r4.m11841b(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "http"
            java.lang.String r2 = "https"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            p282q2.C5565v.f21664b = r0
            return
    }

    public C5565v(p282q2.InterfaceC5556m<p282q2.C5549f, Data> r1) {
            r0 = this;
            r0.<init>()
            r0.f21665a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a mo9582a(android.net.Uri r2, int r3, int r4, p180k2.C3673e r5) {
            r1 = this;
            android.net.Uri r2 = (android.net.Uri) r2
            q2.f r0 = new q2.f
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            q2.m<q2.f, Data> r2 = r1.f21665a
            q2.m$a r2 = r2.mo9582a(r0, r3, r4, r5)
            return r2
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public boolean mo9583b(android.net.Uri r2) {
            r1 = this;
            android.net.Uri r2 = (android.net.Uri) r2
            java.util.Set<java.lang.String> r0 = p282q2.C5565v.f21664b
            java.lang.String r2 = r2.getScheme()
            boolean r2 = r0.contains(r2)
            return r2
    }
}
