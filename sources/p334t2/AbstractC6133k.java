package p334t2;

/* renamed from: t2.k */
/* loaded from: classes.dex */
public abstract class AbstractC6133k {

    /* renamed from: a */
    public static final p334t2.AbstractC6133k f23675a = null;

    /* renamed from: b */
    public static final p334t2.AbstractC6133k f23676b = null;

    /* renamed from: c */
    public static final p334t2.AbstractC6133k f23677c = null;

    /* renamed from: d */
    public static final p334t2.AbstractC6133k f23678d = null;

    /* renamed from: e */
    public static final p334t2.AbstractC6133k f23679e = null;

    /* renamed from: f */
    public static final p180k2.C3672d<p334t2.AbstractC6133k> f23680f = null;

    /* renamed from: g */
    public static final boolean f23681g = false;

    /* renamed from: t2.k$a */
    public static class a extends p334t2.AbstractC6133k {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p334t2.AbstractC6133k
        /* renamed from: a */
        public int mo12665a(int r1, int r2, int r3, int r4) {
                r0 = this;
                float r1 = r0.mo12666b(r1, r2, r3, r4)
                r2 = 1065353216(0x3f800000, float:1.0)
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 != 0) goto Lb
                goto Lf
            Lb:
                boolean r1 = p334t2.AbstractC6133k.f23681g
                if (r1 == 0) goto L11
            Lf:
                r1 = 2
                goto L12
            L11:
                r1 = 1
            L12:
                return r1
        }

        @Override // p334t2.AbstractC6133k
        /* renamed from: b */
        public float mo12666b(int r2, int r3, int r4, int r5) {
                r1 = this;
                t2.k r0 = p334t2.AbstractC6133k.f23675a
                float r2 = r0.mo12666b(r2, r3, r4, r5)
                r3 = 1065353216(0x3f800000, float:1.0)
                float r2 = java.lang.Math.min(r3, r2)
                return r2
        }
    }

    /* renamed from: t2.k$b */
    public static class b extends p334t2.AbstractC6133k {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p334t2.AbstractC6133k
        /* renamed from: a */
        public int mo12665a(int r1, int r2, int r3, int r4) {
                r0 = this;
                r1 = 2
                return r1
        }

        @Override // p334t2.AbstractC6133k
        /* renamed from: b */
        public float mo12666b(int r1, int r2, int r3, int r4) {
                r0 = this;
                float r3 = (float) r3
                float r1 = (float) r1
                float r3 = r3 / r1
                float r1 = (float) r4
                float r2 = (float) r2
                float r1 = r1 / r2
                float r1 = java.lang.Math.max(r3, r1)
                return r1
        }
    }

    /* renamed from: t2.k$c */
    public static class c extends p334t2.AbstractC6133k {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p334t2.AbstractC6133k
        /* renamed from: a */
        public int mo12665a(int r1, int r2, int r3, int r4) {
                r0 = this;
                boolean r1 = p334t2.AbstractC6133k.f23681g
                if (r1 == 0) goto L6
                r1 = 2
                return r1
            L6:
                r1 = 1
                return r1
        }

        @Override // p334t2.AbstractC6133k
        /* renamed from: b */
        public float mo12666b(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = p334t2.AbstractC6133k.f23681g
                if (r0 == 0) goto Lf
                float r4 = (float) r4
                float r2 = (float) r2
                float r4 = r4 / r2
                float r2 = (float) r5
                float r3 = (float) r3
                float r2 = r2 / r3
                float r2 = java.lang.Math.min(r4, r2)
                return r2
            Lf:
                int r3 = r3 / r5
                int r2 = r2 / r4
                int r2 = java.lang.Math.max(r3, r2)
                r3 = 1065353216(0x3f800000, float:1.0)
                if (r2 != 0) goto L1a
                goto L20
            L1a:
                int r2 = java.lang.Integer.highestOneBit(r2)
                float r2 = (float) r2
                float r3 = r3 / r2
            L20:
                return r3
        }
    }

    /* renamed from: t2.k$d */
    public static class d extends p334t2.AbstractC6133k {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p334t2.AbstractC6133k
        /* renamed from: a */
        public int mo12665a(int r1, int r2, int r3, int r4) {
                r0 = this;
                r1 = 2
                return r1
        }

        @Override // p334t2.AbstractC6133k
        /* renamed from: b */
        public float mo12666b(int r1, int r2, int r3, int r4) {
                r0 = this;
                r1 = 1065353216(0x3f800000, float:1.0)
                return r1
        }
    }

    static {
            t2.k$c r0 = new t2.k$c
            r0.<init>()
            p334t2.AbstractC6133k.f23675a = r0
            t2.k$a r0 = new t2.k$a
            r0.<init>()
            p334t2.AbstractC6133k.f23676b = r0
            t2.k$b r0 = new t2.k$b
            r0.<init>()
            p334t2.AbstractC6133k.f23677c = r0
            t2.k$d r1 = new t2.k$d
            r1.<init>()
            p334t2.AbstractC6133k.f23678d = r1
            p334t2.AbstractC6133k.f23679e = r0
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"
            k2.d r0 = p180k2.C3672d.m8128a(r1, r0)
            p334t2.AbstractC6133k.f23680f = r0
            r0 = 1
            p334t2.AbstractC6133k.f23681g = r0
            return
    }

    public AbstractC6133k() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract int mo12665a(int r1, int r2, int r3, int r4);

    /* renamed from: b */
    public abstract float mo12666b(int r1, int r2, int r3, int r4);
}
