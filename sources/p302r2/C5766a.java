package p302r2;

/* renamed from: r2.a */
/* loaded from: classes.dex */
public class C5766a implements p282q2.InterfaceC5556m<p282q2.C5549f, java.io.InputStream> {

    /* renamed from: b */
    public static final p180k2.C3672d<java.lang.Integer> f22218b = null;

    /* renamed from: a */
    public final p282q2.C5555l<p282q2.C5549f, p282q2.C5549f> f22219a;

    /* renamed from: r2.a$a */
    public static class a implements p282q2.InterfaceC5557n<p282q2.C5549f, java.io.InputStream> {

        /* renamed from: a */
        public final p282q2.C5555l<p282q2.C5549f, p282q2.C5549f> f22220a;

        public a() {
                r3 = this;
                r3.<init>()
                q2.l r0 = new q2.l
                r1 = 500(0x1f4, double:2.47E-321)
                r0.<init>(r1)
                r3.f22220a = r0
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<p282q2.C5549f, java.io.InputStream> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                r2.a r2 = new r2.a
                q2.l<q2.f, q2.f> r0 = r1.f22220a
                r2.<init>(r0)
                return r2
        }
    }

    static {
            r0 = 2500(0x9c4, float:3.503E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"
            k2.d r0 = p180k2.C3672d.m8128a(r1, r0)
            p302r2.C5766a.f22218b = r0
            return
    }

    public C5766a(p282q2.C5555l<p282q2.C5549f, p282q2.C5549f> r1) {
            r0 = this;
            r0.<init>()
            r0.f22219a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a<java.io.InputStream> mo9582a(p282q2.C5549f r2, int r3, int r4, p180k2.C3673e r5) {
            r1 = this;
            q2.f r2 = (p282q2.C5549f) r2
            q2.l<q2.f, q2.f> r3 = r1.f22219a
            if (r3 == 0) goto L28
            r4 = 0
            q2.l$b r0 = p282q2.C5555l.b.m11837a(r2, r4, r4)
            g3.g<q2.l$b<A>, B> r3 = r3.f21619a
            java.lang.Object r3 = r3.m5834a(r0)
            r0.m11838b()
            q2.f r3 = (p282q2.C5549f) r3
            if (r3 != 0) goto L27
            q2.l<q2.f, q2.f> r3 = r1.f22219a
            java.util.Objects.requireNonNull(r3)
            q2.l$b r4 = p282q2.C5555l.b.m11837a(r2, r4, r4)
            g3.g<q2.l$b<A>, B> r3 = r3.f21619a
            r3.m5837d(r4, r2)
            goto L28
        L27:
            r2 = r3
        L28:
            k2.d<java.lang.Integer> r3 = p302r2.C5766a.f22218b
            java.lang.Object r3 = r5.m8130c(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            q2.m$a r4 = new q2.m$a
            com.bumptech.glide.load.data.j r5 = new com.bumptech.glide.load.data.j
            r5.<init>(r2, r3)
            r4.<init>(r2, r5)
            return r4
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo9583b(p282q2.C5549f r1) {
            r0 = this;
            q2.f r1 = (p282q2.C5549f) r1
            r1 = 1
            return r1
    }
}
