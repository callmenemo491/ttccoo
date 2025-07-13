package p282q2;

/* renamed from: q2.u */
/* loaded from: classes.dex */
public class C5564u<Data> implements p282q2.InterfaceC5556m<android.net.Uri, Data> {

    /* renamed from: b */
    public static final java.util.Set<java.lang.String> f21659b = null;

    /* renamed from: a */
    public final p282q2.C5564u.c<Data> f21660a;

    /* renamed from: q2.u$a */
    public static final class a implements p282q2.InterfaceC5557n<android.net.Uri, android.content.res.AssetFileDescriptor>, p282q2.C5564u.c<android.content.res.AssetFileDescriptor> {

        /* renamed from: a */
        public final android.content.ContentResolver f21661a;

        public a(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.f21661a = r1
                return
        }

        @Override // p282q2.C5564u.c
        /* renamed from: a */
        public com.bumptech.glide.load.data.InterfaceC1016d<android.content.res.AssetFileDescriptor> mo11844a(android.net.Uri r3) {
                r2 = this;
                com.bumptech.glide.load.data.a r0 = new com.bumptech.glide.load.data.a
                android.content.ContentResolver r1 = r2.f21661a
                r0.<init>(r1, r3)
                return r0
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<android.net.Uri, android.content.res.AssetFileDescriptor> mo9584b(p282q2.C5560q r1) {
                r0 = this;
                q2.u r1 = new q2.u
                r1.<init>(r0)
                return r1
        }
    }

    /* renamed from: q2.u$b */
    public static class b implements p282q2.InterfaceC5557n<android.net.Uri, android.os.ParcelFileDescriptor>, p282q2.C5564u.c<android.os.ParcelFileDescriptor> {

        /* renamed from: a */
        public final android.content.ContentResolver f21662a;

        public b(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.f21662a = r1
                return
        }

        @Override // p282q2.C5564u.c
        /* renamed from: a */
        public com.bumptech.glide.load.data.InterfaceC1016d<android.os.ParcelFileDescriptor> mo11844a(android.net.Uri r3) {
                r2 = this;
                com.bumptech.glide.load.data.i r0 = new com.bumptech.glide.load.data.i
                android.content.ContentResolver r1 = r2.f21662a
                r0.<init>(r1, r3)
                return r0
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<android.net.Uri, android.os.ParcelFileDescriptor> mo9584b(p282q2.C5560q r1) {
                r0 = this;
                q2.u r1 = new q2.u
                r1.<init>(r0)
                return r1
        }
    }

    /* renamed from: q2.u$c */
    public interface c<Data> {
        /* renamed from: a */
        com.bumptech.glide.load.data.InterfaceC1016d<Data> mo11844a(android.net.Uri r1);
    }

    /* renamed from: q2.u$d */
    public static class d implements p282q2.InterfaceC5557n<android.net.Uri, java.io.InputStream>, p282q2.C5564u.c<java.io.InputStream> {

        /* renamed from: a */
        public final android.content.ContentResolver f21663a;

        public d(android.content.ContentResolver r1) {
                r0 = this;
                r0.<init>()
                r0.f21663a = r1
                return
        }

        @Override // p282q2.C5564u.c
        /* renamed from: a */
        public com.bumptech.glide.load.data.InterfaceC1016d<java.io.InputStream> mo11844a(android.net.Uri r3) {
                r2 = this;
                com.bumptech.glide.load.data.n r0 = new com.bumptech.glide.load.data.n
                android.content.ContentResolver r1 = r2.f21663a
                r0.<init>(r1, r3)
                return r0
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<android.net.Uri, java.io.InputStream> mo9584b(p282q2.C5560q r1) {
                r0 = this;
                q2.u r1 = new q2.u
                r1.<init>(r0)
                return r1
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "file"
            java.lang.String r2 = "android.resource"
            java.lang.String r3 = "content"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            p282q2.C5564u.f21659b = r0
            return
    }

    public C5564u(p282q2.C5564u.c<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.f21660a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a mo9582a(android.net.Uri r1, int r2, int r3, p180k2.C3673e r4) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            q2.m$a r2 = new q2.m$a
            f3.b r3 = new f3.b
            r3.<init>(r1)
            q2.u$c<Data> r4 = r0.f21660a
            com.bumptech.glide.load.data.d r1 = r4.mo11844a(r1)
            r2.<init>(r3, r1)
            return r2
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public boolean mo9583b(android.net.Uri r2) {
            r1 = this;
            android.net.Uri r2 = (android.net.Uri) r2
            java.util.Set<java.lang.String> r0 = p282q2.C5564u.f21659b
            java.lang.String r2 = r2.getScheme()
            boolean r2 = r0.contains(r2)
            return r2
    }
}
