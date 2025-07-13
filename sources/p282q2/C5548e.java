package p282q2;

/* renamed from: q2.e */
/* loaded from: classes.dex */
public class C5548e<Data> implements p282q2.InterfaceC5556m<java.io.File, Data> {

    /* renamed from: a */
    public final p282q2.C5548e.d<Data> f21596a;

    /* renamed from: q2.e$a */
    public static class a<Data> implements p282q2.InterfaceC5557n<java.io.File, Data> {

        /* renamed from: a */
        public final p282q2.C5548e.d<Data> f21597a;

        public a(p282q2.C5548e.d<Data> r1) {
                r0 = this;
                r0.<init>()
                r0.f21597a = r1
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public final p282q2.InterfaceC5556m<java.io.File, Data> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                q2.e r2 = new q2.e
                q2.e$d<Data> r0 = r1.f21597a
                r2.<init>(r0)
                return r2
        }
    }

    /* renamed from: q2.e$b */
    public static class b extends p282q2.C5548e.a<android.os.ParcelFileDescriptor> {

        /* renamed from: q2.e$b$a */
        public class a implements p282q2.C5548e.d<android.os.ParcelFileDescriptor> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // p282q2.C5548e.d
            /* renamed from: a */
            public java.lang.Class<android.os.ParcelFileDescriptor> mo11828a() {
                    r1 = this;
                    java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
                    return r0
            }

            @Override // p282q2.C5548e.d
            /* renamed from: b */
            public android.os.ParcelFileDescriptor mo11829b(java.io.File r2) {
                    r1 = this;
                    r0 = 268435456(0x10000000, float:2.524355E-29)
                    android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r0)
                    return r2
            }

            @Override // p282q2.C5548e.d
            /* renamed from: c */
            public void mo11830c(android.os.ParcelFileDescriptor r1) {
                    r0 = this;
                    android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
                    r1.close()
                    return
            }
        }

        public b() {
                r1 = this;
                q2.e$b$a r0 = new q2.e$b$a
                r0.<init>()
                r1.<init>(r0)
                return
        }
    }

    /* renamed from: q2.e$c */
    public static final class c<Data> implements com.bumptech.glide.load.data.InterfaceC1016d<Data> {

        /* renamed from: Y */
        public final java.io.File f21598Y;

        /* renamed from: Z */
        public final p282q2.C5548e.d<Data> f21599Z;

        /* renamed from: a0 */
        public Data f21600a0;

        public c(java.io.File r1, p282q2.C5548e.d<Data> r2) {
                r0 = this;
                r0.<init>()
                r0.f21598Y = r1
                r0.f21599Z = r2
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: a */
        public java.lang.Class<Data> mo2786a() {
                r1 = this;
                q2.e$d<Data> r0 = r1.f21599Z
                java.lang.Class r0 = r0.mo11828a()
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: b */
        public void mo2789b() {
                r2 = this;
                Data r0 = r2.f21600a0
                if (r0 == 0) goto L9
                q2.e$d<Data> r1 = r2.f21599Z     // Catch: java.io.IOException -> L9
                r1.mo11830c(r0)     // Catch: java.io.IOException -> L9
            L9:
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        public void cancel() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: e */
        public com.bumptech.glide.load.EnumC1008a mo2792e() {
                r1 = this;
                com.bumptech.glide.load.a r0 = com.bumptech.glide.load.EnumC1008a.f5180Y
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: f */
        public void mo2793f(com.bumptech.glide.EnumC1003g r3, com.bumptech.glide.load.data.InterfaceC1016d.a<? super Data> r4) {
                r2 = this;
                q2.e$d<Data> r3 = r2.f21599Z     // Catch: java.io.FileNotFoundException -> Le
                java.io.File r0 = r2.f21598Y     // Catch: java.io.FileNotFoundException -> Le
                java.lang.Object r3 = r3.mo11829b(r0)     // Catch: java.io.FileNotFoundException -> Le
                r2.f21600a0 = r3     // Catch: java.io.FileNotFoundException -> Le
                r4.mo2795d(r3)     // Catch: java.io.FileNotFoundException -> Le
                goto L20
            Le:
                r3 = move-exception
                r0 = 3
                java.lang.String r1 = "FileLoader"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L1d
                java.lang.String r0 = "Failed to open file"
                android.util.Log.d(r1, r0, r3)
            L1d:
                r4.mo2794c(r3)
            L20:
                return
        }
    }

    /* renamed from: q2.e$d */
    public interface d<Data> {
        /* renamed from: a */
        java.lang.Class<Data> mo11828a();

        /* renamed from: b */
        Data mo11829b(java.io.File r1);

        /* renamed from: c */
        void mo11830c(Data r1);
    }

    /* renamed from: q2.e$e */
    public static class e extends p282q2.C5548e.a<java.io.InputStream> {

        /* renamed from: q2.e$e$a */
        public class a implements p282q2.C5548e.d<java.io.InputStream> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // p282q2.C5548e.d
            /* renamed from: a */
            public java.lang.Class<java.io.InputStream> mo11828a() {
                    r1 = this;
                    java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                    return r0
            }

            @Override // p282q2.C5548e.d
            /* renamed from: b */
            public java.io.InputStream mo11829b(java.io.File r2) {
                    r1 = this;
                    java.io.FileInputStream r0 = new java.io.FileInputStream
                    r0.<init>(r2)
                    return r0
            }

            @Override // p282q2.C5548e.d
            /* renamed from: c */
            public void mo11830c(java.io.InputStream r1) {
                    r0 = this;
                    java.io.InputStream r1 = (java.io.InputStream) r1
                    r1.close()
                    return
            }
        }

        public e() {
                r1 = this;
                q2.e$e$a r0 = new q2.e$e$a
                r0.<init>()
                r1.<init>(r0)
                return
        }
    }

    public C5548e(p282q2.C5548e.d<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.f21596a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a mo9582a(java.io.File r2, int r3, int r4, p180k2.C3673e r5) {
            r1 = this;
            java.io.File r2 = (java.io.File) r2
            q2.m$a r3 = new q2.m$a
            f3.b r4 = new f3.b
            r4.<init>(r2)
            q2.e$c r5 = new q2.e$c
            q2.e$d<Data> r0 = r1.f21596a
            r5.<init>(r2, r0)
            r3.<init>(r4, r5)
            return r3
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo9583b(java.io.File r1) {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            r1 = 1
            return r1
    }
}
