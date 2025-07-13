package p334t2;

/* renamed from: t2.w */
/* loaded from: classes.dex */
public final class C6145w implements p180k2.InterfaceC3674f<android.graphics.Bitmap, android.graphics.Bitmap> {

    /* renamed from: t2.w$a */
    public static final class a implements p214m2.InterfaceC4345w<android.graphics.Bitmap> {

        /* renamed from: Y */
        public final android.graphics.Bitmap f23728Y;

        public a(android.graphics.Bitmap r1) {
                r0 = this;
                r0.<init>()
                r0.f23728Y = r1
                return
        }

        @Override // p214m2.InterfaceC4345w
        /* renamed from: a */
        public int mo9718a() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f23728Y
                int r0 = p106g3.C2238j.m5844d(r0)
                return r0
        }

        @Override // p214m2.InterfaceC4345w
        /* renamed from: c */
        public java.lang.Class<android.graphics.Bitmap> mo9720c() {
                r1 = this;
                java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
                return r0
        }

        @Override // p214m2.InterfaceC4345w
        /* renamed from: d */
        public void mo9721d() {
                r0 = this;
                return
        }

        @Override // p214m2.InterfaceC4345w
        public android.graphics.Bitmap get() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f23728Y
                return r0
        }
    }

    public C6145w() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public p214m2.InterfaceC4345w<android.graphics.Bitmap> mo8132a(android.graphics.Bitmap r1, int r2, int r3, p180k2.C3673e r4) {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            t2.w$a r2 = new t2.w$a
            r2.<init>(r1)
            return r2
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo8133b(android.graphics.Bitmap r1, p180k2.C3673e r2) {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r1 = 1
            return r1
    }
}
