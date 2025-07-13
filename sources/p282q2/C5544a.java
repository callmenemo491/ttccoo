package p282q2;

/* renamed from: q2.a */
/* loaded from: classes.dex */
public class C5544a<Data> implements p282q2.InterfaceC5556m<android.net.Uri, Data> {

    /* renamed from: a */
    public final android.content.res.AssetManager f21583a;

    /* renamed from: b */
    public final p282q2.C5544a.a<Data> f21584b;

    /* renamed from: q2.a$a */
    public interface a<Data> {
        /* renamed from: a */
        com.bumptech.glide.load.data.InterfaceC1016d<Data> mo11824a(android.content.res.AssetManager r1, java.lang.String r2);
    }

    /* renamed from: q2.a$b */
    public static class b implements p282q2.InterfaceC5557n<android.net.Uri, android.os.ParcelFileDescriptor>, p282q2.C5544a.a<android.os.ParcelFileDescriptor> {

        /* renamed from: a */
        public final android.content.res.AssetManager f21585a;

        public b(android.content.res.AssetManager r1) {
                r0 = this;
                r0.<init>()
                r0.f21585a = r1
                return
        }

        @Override // p282q2.C5544a.a
        /* renamed from: a */
        public com.bumptech.glide.load.data.InterfaceC1016d<android.os.ParcelFileDescriptor> mo11824a(android.content.res.AssetManager r2, java.lang.String r3) {
                r1 = this;
                com.bumptech.glide.load.data.h r0 = new com.bumptech.glide.load.data.h
                r0.<init>(r2, r3)
                return r0
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<android.net.Uri, android.os.ParcelFileDescriptor> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                q2.a r2 = new q2.a
                android.content.res.AssetManager r0 = r1.f21585a
                r2.<init>(r0, r1)
                return r2
        }
    }

    /* renamed from: q2.a$c */
    public static class c implements p282q2.InterfaceC5557n<android.net.Uri, java.io.InputStream>, p282q2.C5544a.a<java.io.InputStream> {

        /* renamed from: a */
        public final android.content.res.AssetManager f21586a;

        public c(android.content.res.AssetManager r1) {
                r0 = this;
                r0.<init>()
                r0.f21586a = r1
                return
        }

        @Override // p282q2.C5544a.a
        /* renamed from: a */
        public com.bumptech.glide.load.data.InterfaceC1016d<java.io.InputStream> mo11824a(android.content.res.AssetManager r2, java.lang.String r3) {
                r1 = this;
                com.bumptech.glide.load.data.m r0 = new com.bumptech.glide.load.data.m
                r0.<init>(r2, r3)
                return r0
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<android.net.Uri, java.io.InputStream> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                q2.a r2 = new q2.a
                android.content.res.AssetManager r0 = r1.f21586a
                r2.<init>(r0, r1)
                return r2
        }
    }

    public C5544a(android.content.res.AssetManager r1, p282q2.C5544a.a<Data> r2) {
            r0 = this;
            r0.<init>()
            r0.f21583a = r1
            r0.f21584b = r2
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a mo9582a(android.net.Uri r2, int r3, int r4, p180k2.C3673e r5) {
            r1 = this;
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r3 = r2.toString()
            r4 = 22
            java.lang.String r3 = r3.substring(r4)
            q2.m$a r4 = new q2.m$a
            f3.b r5 = new f3.b
            r5.<init>(r2)
            q2.a$a<Data> r2 = r1.f21584b
            android.content.res.AssetManager r0 = r1.f21583a
            com.bumptech.glide.load.data.d r2 = r2.mo11824a(r0, r3)
            r4.<init>(r5, r2)
            return r4
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public boolean mo9583b(android.net.Uri r3) {
            r2 = this;
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L2a
            java.util.List r0 = r3.getPathSegments()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.List r3 = r3.getPathSegments()
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r0 = "android_asset"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2a
            r1 = 1
        L2a:
            return r1
    }
}
