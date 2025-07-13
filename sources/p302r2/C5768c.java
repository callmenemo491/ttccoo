package p302r2;

/* renamed from: r2.c */
/* loaded from: classes.dex */
public class C5768c implements p282q2.InterfaceC5556m<android.net.Uri, java.io.InputStream> {

    /* renamed from: a */
    public final android.content.Context f22223a;

    /* renamed from: r2.c$a */
    public static class a implements p282q2.InterfaceC5557n<android.net.Uri, java.io.InputStream> {

        /* renamed from: a */
        public final android.content.Context f22224a;

        public a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.f22224a = r1
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<android.net.Uri, java.io.InputStream> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                r2.c r2 = new r2.c
                android.content.Context r0 = r1.f22224a
                r2.<init>(r0)
                return r2
        }
    }

    public C5768c(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f22223a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a<java.io.InputStream> mo9582a(android.net.Uri r3, int r4, int r5, p180k2.C3673e r6) {
            r2 = this;
            android.net.Uri r3 = (android.net.Uri) r3
            boolean r4 = p064e.C1492f.m4046f(r4, r5)
            if (r4 == 0) goto L3b
            k2.d<java.lang.Long> r4 = p334t2.C6146x.f23729d
            java.lang.Object r4 = r6.m8130c(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L1e
            long r4 = r4.longValue()
            r0 = -1
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            if (r4 == 0) goto L3b
            q2.m$a r4 = new q2.m$a
            f3.b r5 = new f3.b
            r5.<init>(r3)
            android.content.Context r6 = r2.f22223a
            l2.a$b r0 = new l2.a$b
            android.content.ContentResolver r1 = r6.getContentResolver()
            r0.<init>(r1)
            l2.a r3 = p197l2.C4164a.m9223c(r6, r3, r0)
            r4.<init>(r5, r3)
            goto L3c
        L3b:
            r4 = 0
        L3c:
            return r4
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public boolean mo9583b(android.net.Uri r2) {
            r1 = this;
            android.net.Uri r2 = (android.net.Uri) r2
            boolean r0 = p064e.C1492f.m4045e(r2)
            if (r0 == 0) goto L16
            java.util.List r2 = r2.getPathSegments()
            java.lang.String r0 = "video"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }
}
