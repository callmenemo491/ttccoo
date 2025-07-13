package p302r2;

/* renamed from: r2.b */
/* loaded from: classes.dex */
public class C5767b implements p282q2.InterfaceC5556m<android.net.Uri, java.io.InputStream> {

    /* renamed from: a */
    public final android.content.Context f22221a;

    /* renamed from: r2.b$a */
    public static class a implements p282q2.InterfaceC5557n<android.net.Uri, java.io.InputStream> {

        /* renamed from: a */
        public final android.content.Context f22222a;

        public a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.f22222a = r1
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<android.net.Uri, java.io.InputStream> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                r2.b r2 = new r2.b
                android.content.Context r0 = r1.f22222a
                r2.<init>(r0)
                return r2
        }
    }

    public C5767b(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f22221a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a<java.io.InputStream> mo9582a(android.net.Uri r3, int r4, int r5, p180k2.C3673e r6) {
            r2 = this;
            android.net.Uri r3 = (android.net.Uri) r3
            boolean r4 = p064e.C1492f.m4046f(r4, r5)
            if (r4 == 0) goto L22
            q2.m$a r4 = new q2.m$a
            f3.b r5 = new f3.b
            r5.<init>(r3)
            android.content.Context r6 = r2.f22221a
            l2.a$a r0 = new l2.a$a
            android.content.ContentResolver r1 = r6.getContentResolver()
            r0.<init>(r1)
            l2.a r3 = p197l2.C4164a.m9223c(r6, r3, r0)
            r4.<init>(r5, r3)
            goto L23
        L22:
            r4 = 0
        L23:
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
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }
}
