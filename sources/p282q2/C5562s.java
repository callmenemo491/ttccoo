package p282q2;

/* renamed from: q2.s */
/* loaded from: classes.dex */
public class C5562s<Data> implements p282q2.InterfaceC5556m<java.lang.String, Data> {

    /* renamed from: a */
    public final p282q2.InterfaceC5556m<android.net.Uri, Data> f21655a;

    /* renamed from: q2.s$a */
    public static final class a implements p282q2.InterfaceC5557n<java.lang.String, android.content.res.AssetFileDescriptor> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<java.lang.String, android.content.res.AssetFileDescriptor> mo9584b(p282q2.C5560q r4) {
                r3 = this;
                q2.s r0 = new q2.s
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Class<android.content.res.AssetFileDescriptor> r2 = android.content.res.AssetFileDescriptor.class
                q2.m r4 = r4.m11841b(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    /* renamed from: q2.s$b */
    public static class b implements p282q2.InterfaceC5557n<java.lang.String, android.os.ParcelFileDescriptor> {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<java.lang.String, android.os.ParcelFileDescriptor> mo9584b(p282q2.C5560q r4) {
                r3 = this;
                q2.s r0 = new q2.s
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Class<android.os.ParcelFileDescriptor> r2 = android.os.ParcelFileDescriptor.class
                q2.m r4 = r4.m11841b(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    /* renamed from: q2.s$c */
    public static class c implements p282q2.InterfaceC5557n<java.lang.String, java.io.InputStream> {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<java.lang.String, java.io.InputStream> mo9584b(p282q2.C5560q r4) {
                r3 = this;
                q2.s r0 = new q2.s
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
                q2.m r4 = r4.m11841b(r1, r2)
                r0.<init>(r4)
                return r0
        }
    }

    public C5562s(p282q2.InterfaceC5556m<android.net.Uri, Data> r1) {
            r0 = this;
            r0.<init>()
            r0.f21655a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a mo9582a(java.lang.String r4, int r5, int r6, p180k2.C3673e r7) {
            r3 = this;
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = r1
            goto L2d
        Lb:
            r0 = 0
            char r0 = r4.charAt(r0)
            r2 = 47
            if (r0 != r2) goto L1a
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            goto L29
        L1a:
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r2 = r0.getScheme()
            if (r2 != 0) goto L2d
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
        L29:
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L2d:
            if (r0 == 0) goto L3e
            q2.m<android.net.Uri, Data> r4 = r3.f21655a
            boolean r4 = r4.mo9583b(r0)
            if (r4 != 0) goto L38
            goto L3e
        L38:
            q2.m<android.net.Uri, Data> r4 = r3.f21655a
            q2.m$a r1 = r4.mo9582a(r0, r5, r6, r7)
        L3e:
            return r1
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo9583b(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r1 = 1
            return r1
    }
}
