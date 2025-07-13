package p282q2;

/* renamed from: q2.c */
/* loaded from: classes.dex */
public class C5546c implements p282q2.InterfaceC5556m<java.io.File, java.nio.ByteBuffer> {

    /* renamed from: q2.c$a */
    public static final class a implements com.bumptech.glide.load.data.InterfaceC1016d<java.nio.ByteBuffer> {

        /* renamed from: Y */
        public final java.io.File f21590Y;

        public a(java.io.File r1) {
                r0 = this;
                r0.<init>()
                r0.f21590Y = r1
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: a */
        public java.lang.Class<java.nio.ByteBuffer> mo2786a() {
                r1 = this;
                java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
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
        public void mo2793f(com.bumptech.glide.EnumC1003g r3, com.bumptech.glide.load.data.InterfaceC1016d.a<? super java.nio.ByteBuffer> r4) {
                r2 = this;
                java.io.File r3 = r2.f21590Y     // Catch: java.io.IOException -> La
                java.nio.ByteBuffer r3 = p106g3.C2229a.m5827a(r3)     // Catch: java.io.IOException -> La
                r4.mo2795d(r3)     // Catch: java.io.IOException -> La
                goto L1c
            La:
                r3 = move-exception
                r0 = 3
                java.lang.String r1 = "ByteBufferFileLoader"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L19
                java.lang.String r0 = "Failed to obtain ByteBuffer for file"
                android.util.Log.d(r1, r0, r3)
            L19:
                r4.mo2794c(r3)
            L1c:
                return
        }
    }

    /* renamed from: q2.c$b */
    public static class b implements p282q2.InterfaceC5557n<java.io.File, java.nio.ByteBuffer> {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<java.io.File, java.nio.ByteBuffer> mo9584b(p282q2.C5560q r1) {
                r0 = this;
                q2.c r1 = new q2.c
                r1.<init>()
                return r1
        }
    }

    public C5546c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a<java.nio.ByteBuffer> mo9582a(java.io.File r1, int r2, int r3, p180k2.C3673e r4) {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            q2.m$a r2 = new q2.m$a
            f3.b r3 = new f3.b
            r3.<init>(r1)
            q2.c$a r4 = new q2.c$a
            r4.<init>(r1)
            r2.<init>(r3, r4)
            return r2
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
