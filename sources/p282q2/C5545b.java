package p282q2;

/* renamed from: q2.b */
/* loaded from: classes.dex */
public class C5545b<Data> implements p282q2.InterfaceC5556m<byte[], Data> {

    /* renamed from: a */
    public final p282q2.C5545b.b<Data> f21587a;

    /* renamed from: q2.b$a */
    public static class a implements p282q2.InterfaceC5557n<byte[], java.nio.ByteBuffer> {

        /* renamed from: q2.b$a$a, reason: collision with other inner class name */
        public class C7416a implements p282q2.C5545b.b<java.nio.ByteBuffer> {
            public C7416a(p282q2.C5545b.a r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // p282q2.C5545b.b
            /* renamed from: a */
            public java.lang.Class<java.nio.ByteBuffer> mo11825a() {
                    r1 = this;
                    java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
                    return r0
            }

            @Override // p282q2.C5545b.b
            /* renamed from: b */
            public java.nio.ByteBuffer mo11826b(byte[] r1) {
                    r0 = this;
                    java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
                    return r1
            }
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<byte[], java.nio.ByteBuffer> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                q2.b r2 = new q2.b
                q2.b$a$a r0 = new q2.b$a$a
                r0.<init>(r1)
                r2.<init>(r0)
                return r2
        }
    }

    /* renamed from: q2.b$b */
    public interface b<Data> {
        /* renamed from: a */
        java.lang.Class<Data> mo11825a();

        /* renamed from: b */
        Data mo11826b(byte[] r1);
    }

    /* renamed from: q2.b$c */
    public static class c<Data> implements com.bumptech.glide.load.data.InterfaceC1016d<Data> {

        /* renamed from: Y */
        public final byte[] f21588Y;

        /* renamed from: Z */
        public final p282q2.C5545b.b<Data> f21589Z;

        public c(byte[] r1, p282q2.C5545b.b<Data> r2) {
                r0 = this;
                r0.<init>()
                r0.f21588Y = r1
                r0.f21589Z = r2
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: a */
        public java.lang.Class<Data> mo2786a() {
                r1 = this;
                q2.b$b<Data> r0 = r1.f21589Z
                java.lang.Class r0 = r0.mo11825a()
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: b */
        public void mo2789b() {
                r0 = this;
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
                q2.b$b<Data> r2 = r1.f21589Z
                byte[] r0 = r1.f21588Y
                java.lang.Object r2 = r2.mo11826b(r0)
                r3.mo2795d(r2)
                return
        }
    }

    /* renamed from: q2.b$d */
    public static class d implements p282q2.InterfaceC5557n<byte[], java.io.InputStream> {

        /* renamed from: q2.b$d$a */
        public class a implements p282q2.C5545b.b<java.io.InputStream> {
            public a(p282q2.C5545b.d r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // p282q2.C5545b.b
            /* renamed from: a */
            public java.lang.Class<java.io.InputStream> mo11825a() {
                    r1 = this;
                    java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                    return r0
            }

            @Override // p282q2.C5545b.b
            /* renamed from: b */
            public java.io.InputStream mo11826b(byte[] r2) {
                    r1 = this;
                    java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                    r0.<init>(r2)
                    return r0
            }
        }

        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<byte[], java.io.InputStream> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                q2.b r2 = new q2.b
                q2.b$d$a r0 = new q2.b$d$a
                r0.<init>(r1)
                r2.<init>(r0)
                return r2
        }
    }

    public C5545b(p282q2.C5545b.b<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.f21587a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a mo9582a(byte[] r2, int r3, int r4, p180k2.C3673e r5) {
            r1 = this;
            byte[] r2 = (byte[]) r2
            q2.m$a r3 = new q2.m$a
            f3.b r4 = new f3.b
            r4.<init>(r2)
            q2.b$c r5 = new q2.b$c
            q2.b$b<Data> r0 = r1.f21587a
            r5.<init>(r2, r0)
            r3.<init>(r4, r5)
            return r3
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo9583b(byte[] r1) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            r1 = 1
            return r1
    }
}
