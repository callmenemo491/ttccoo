package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.k */
/* loaded from: classes.dex */
public final class C1023k implements com.bumptech.glide.load.data.InterfaceC1017e<java.io.InputStream> {

    /* renamed from: a */
    public final p334t2.C6142t f5215a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    public static final class a implements com.bumptech.glide.load.data.InterfaceC1017e.a<java.io.InputStream> {

        /* renamed from: a */
        public final p229n2.InterfaceC4672b f5216a;

        public a(p229n2.InterfaceC4672b r1) {
                r0 = this;
                r0.<init>()
                r0.f5216a = r1
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1017e.a
        /* renamed from: a */
        public java.lang.Class<java.io.InputStream> mo2784a() {
                r1 = this;
                java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1017e.a
        /* renamed from: b */
        public com.bumptech.glide.load.data.InterfaceC1017e<java.io.InputStream> mo2785b(java.io.InputStream r3) {
                r2 = this;
                java.io.InputStream r3 = (java.io.InputStream) r3
                com.bumptech.glide.load.data.k r0 = new com.bumptech.glide.load.data.k
                n2.b r1 = r2.f5216a
                r0.<init>(r3, r1)
                return r0
        }
    }

    public C1023k(java.io.InputStream r2, p229n2.InterfaceC4672b r3) {
            r1 = this;
            r1.<init>()
            t2.t r0 = new t2.t
            r0.<init>(r2, r3)
            r1.f5215a = r0
            r2 = 5242880(0x500000, float:7.34684E-39)
            r0.mark(r2)
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1017e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ java.io.InputStream mo2781a() {
            r1 = this;
            java.io.InputStream r0 = r1.m2798c()
            return r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1017e
    /* renamed from: b */
    public void mo2782b() {
            r1 = this;
            t2.t r0 = r1.f5215a
            r0.release()
            return
    }

    /* renamed from: c */
    public java.io.InputStream m2798c() {
            r1 = this;
            t2.t r0 = r1.f5215a
            r0.reset()
            t2.t r0 = r1.f5215a
            return r0
    }
}
