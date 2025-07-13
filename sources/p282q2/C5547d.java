package p282q2;

/* renamed from: q2.d */
/* loaded from: classes.dex */
public final class C5547d<Model, Data> implements p282q2.InterfaceC5556m<Model, Data> {

    /* renamed from: a */
    public final p282q2.C5547d.a<Data> f21591a;

    /* renamed from: q2.d$a */
    public interface a<Data> {
    }

    /* renamed from: q2.d$b */
    public static final class b<Data> implements com.bumptech.glide.load.data.InterfaceC1016d<Data> {

        /* renamed from: Y */
        public final java.lang.String f21592Y;

        /* renamed from: Z */
        public final p282q2.C5547d.a<Data> f21593Z;

        /* renamed from: a0 */
        public Data f21594a0;

        public b(java.lang.String r1, p282q2.C5547d.a<Data> r2) {
                r0 = this;
                r0.<init>()
                r0.f21592Y = r1
                r0.f21593Z = r2
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: a */
        public java.lang.Class<Data> mo2786a() {
                r1 = this;
                q2.d$a<Data> r0 = r1.f21593Z
                q2.d$c$a r0 = (p282q2.C5547d.c.a) r0
                java.util.Objects.requireNonNull(r0)
                java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: b */
        public void mo2789b() {
                r2 = this;
                q2.d$a<Data> r0 = r2.f21593Z     // Catch: java.io.IOException -> Le
                Data r1 = r2.f21594a0     // Catch: java.io.IOException -> Le
                q2.d$c$a r0 = (p282q2.C5547d.c.a) r0     // Catch: java.io.IOException -> Le
                java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> Le
                java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.io.IOException -> Le
                r1.close()     // Catch: java.io.IOException -> Le
            Le:
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
        public void mo2793f(com.bumptech.glide.EnumC1003g r2, com.bumptech.glide.load.data.InterfaceC1016d.a<? super Data> r3) {
                r1 = this;
                q2.d$a<Data> r2 = r1.f21593Z     // Catch: java.lang.IllegalArgumentException -> L10
                java.lang.String r0 = r1.f21592Y     // Catch: java.lang.IllegalArgumentException -> L10
                q2.d$c$a r2 = (p282q2.C5547d.c.a) r2     // Catch: java.lang.IllegalArgumentException -> L10
                java.lang.Object r2 = r2.m11827a(r0)     // Catch: java.lang.IllegalArgumentException -> L10
                r1.f21594a0 = r2     // Catch: java.lang.IllegalArgumentException -> L10
                r3.mo2795d(r2)     // Catch: java.lang.IllegalArgumentException -> L10
                goto L14
            L10:
                r2 = move-exception
                r3.mo2794c(r2)
            L14:
                return
        }
    }

    /* renamed from: q2.d$c */
    public static final class c<Model> implements p282q2.InterfaceC5557n<Model, java.io.InputStream> {

        /* renamed from: a */
        public final p282q2.C5547d.a<java.io.InputStream> f21595a;

        /* renamed from: q2.d$c$a */
        public class a implements p282q2.C5547d.a<java.io.InputStream> {
            public a(p282q2.C5547d.c r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* renamed from: a */
            public java.lang.Object m11827a(java.lang.String r5) {
                    r4 = this;
                    java.lang.String r0 = "data:image"
                    boolean r0 = r5.startsWith(r0)
                    if (r0 == 0) goto L3e
                    r0 = 44
                    int r0 = r5.indexOf(r0)
                    r1 = -1
                    if (r0 == r1) goto L36
                    r1 = 0
                    java.lang.String r2 = r5.substring(r1, r0)
                    java.lang.String r3 = ";base64"
                    boolean r2 = r2.endsWith(r3)
                    if (r2 == 0) goto L2e
                    int r0 = r0 + 1
                    java.lang.String r5 = r5.substring(r0)
                    byte[] r5 = android.util.Base64.decode(r5, r1)
                    java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                    r0.<init>(r5)
                    return r0
                L2e:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "Not a base64 image data URL."
                    r5.<init>(r0)
                    throw r5
                L36:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "Missing comma in data URL."
                    r5.<init>(r0)
                    throw r5
                L3e:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "Not a valid image data URL."
                    r5.<init>(r0)
                    throw r5
            }
        }

        public c() {
                r1 = this;
                r1.<init>()
                q2.d$c$a r0 = new q2.d$c$a
                r0.<init>(r1)
                r1.f21595a = r0
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<Model, java.io.InputStream> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                q2.d r2 = new q2.d
                q2.d$a<java.io.InputStream> r0 = r1.f21595a
                r2.<init>(r0)
                return r2
        }
    }

    public C5547d(p282q2.C5547d.a<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.f21591a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a<Data> mo9582a(Model r2, int r3, int r4, p180k2.C3673e r5) {
            r1 = this;
            q2.m$a r3 = new q2.m$a
            f3.b r4 = new f3.b
            r4.<init>(r2)
            q2.d$b r5 = new q2.d$b
            java.lang.String r2 = r2.toString()
            q2.d$a<Data> r0 = r1.f21591a
            r5.<init>(r2, r0)
            r3.<init>(r4, r5)
            return r3
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public boolean mo9583b(Model r2) {
            r1 = this;
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "data:image"
            boolean r2 = r2.startsWith(r0)
            return r2
    }
}
