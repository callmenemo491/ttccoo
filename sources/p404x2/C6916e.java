package p404x2;

/* renamed from: x2.e */
/* loaded from: classes.dex */
public class C6916e {

    /* renamed from: a */
    public final p160j2.InterfaceC3388a f26915a;

    /* renamed from: b */
    public final android.os.Handler f26916b;

    /* renamed from: c */
    public final java.util.List<p404x2.C6916e.b> f26917c;

    /* renamed from: d */
    public final com.bumptech.glide.ComponentCallbacks2C1006j f26918d;

    /* renamed from: e */
    public final p229n2.InterfaceC4673c f26919e;

    /* renamed from: f */
    public boolean f26920f;

    /* renamed from: g */
    public boolean f26921g;

    /* renamed from: h */
    public com.bumptech.glide.C1005i<android.graphics.Bitmap> f26922h;

    /* renamed from: i */
    public p404x2.C6916e.a f26923i;

    /* renamed from: j */
    public boolean f26924j;

    /* renamed from: k */
    public p404x2.C6916e.a f26925k;

    /* renamed from: l */
    public android.graphics.Bitmap f26926l;

    /* renamed from: m */
    public p180k2.InterfaceC3676h<android.graphics.Bitmap> f26927m;

    /* renamed from: n */
    public p404x2.C6916e.a f26928n;

    /* renamed from: o */
    public int f26929o;

    /* renamed from: p */
    public int f26930p;

    /* renamed from: q */
    public int f26931q;

    /* renamed from: x2.e$a */
    public static class a extends p049d3.AbstractC1271c<android.graphics.Bitmap> {

        /* renamed from: b0 */
        public final android.os.Handler f26932b0;

        /* renamed from: c0 */
        public final int f26933c0;

        /* renamed from: d0 */
        public final long f26934d0;

        /* renamed from: e0 */
        public android.graphics.Bitmap f26935e0;

        public a(android.os.Handler r1, int r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.f26932b0 = r1
                r0.f26933c0 = r2
                r0.f26934d0 = r3
                return
        }

        @Override // p049d3.InterfaceC1275g
        /* renamed from: b */
        public void mo2565b(java.lang.Object r3, p068e3.InterfaceC1513b r4) {
                r2 = this;
                android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
                r2.f26935e0 = r3
                android.os.Handler r3 = r2.f26932b0
                r4 = 1
                android.os.Message r3 = r3.obtainMessage(r4, r2)
                android.os.Handler r4 = r2.f26932b0
                long r0 = r2.f26934d0
                r4.sendMessageAtTime(r3, r0)
                return
        }

        @Override // p049d3.InterfaceC1275g
        /* renamed from: k */
        public void mo2574k(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r1 = 0
                r0.f26935e0 = r1
                return
        }
    }

    /* renamed from: x2.e$b */
    public interface b {
        /* renamed from: a */
        void mo14019a();
    }

    /* renamed from: x2.e$c */
    public class c implements android.os.Handler.Callback {

        /* renamed from: Y */
        public final /* synthetic */ p404x2.C6916e f26936Y;

        public c(p404x2.C6916e r1) {
                r0 = this;
                r0.f26936Y = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto Lf
                java.lang.Object r3 = r3.obj
                x2.e$a r3 = (p404x2.C6916e.a) r3
                x2.e r0 = r2.f26936Y
                r0.m14025b(r3)
                return r1
            Lf:
                r1 = 2
                if (r0 != r1) goto L1d
                java.lang.Object r3 = r3.obj
                x2.e$a r3 = (p404x2.C6916e.a) r3
                x2.e r0 = r2.f26936Y
                com.bumptech.glide.j r0 = r0.f26918d
                r0.m2769r(r3)
            L1d:
                r3 = 0
                return r3
        }
    }

    public C6916e(com.bumptech.glide.ComponentCallbacks2C0999c r5, p160j2.InterfaceC3388a r6, int r7, int r8, p180k2.InterfaceC3676h<android.graphics.Bitmap> r9, android.graphics.Bitmap r10) {
            r4 = this;
            n2.c r0 = r5.f5097Y
            com.bumptech.glide.e r1 = r5.f5099a0
            android.content.Context r1 = r1.getBaseContext()
            com.bumptech.glide.j r1 = com.bumptech.glide.ComponentCallbacks2C0999c.m2736e(r1)
            com.bumptech.glide.e r5 = r5.f5099a0
            android.content.Context r5 = r5.getBaseContext()
            com.bumptech.glide.j r5 = com.bumptech.glide.ComponentCallbacks2C0999c.m2736e(r5)
            com.bumptech.glide.i r5 = r5.mo2765n()
            m2.k r2 = p214m2.AbstractC4333k.f17720a
            c3.h r2 = p033c3.C0862h.m2578H(r2)
            r3 = 1
            c3.a r2 = r2.mo2529G(r3)
            c3.h r2 = (p033c3.C0862h) r2
            c3.a r2 = r2.mo2524B(r3)
            c3.h r2 = (p033c3.C0862h) r2
            c3.a r7 = r2.mo2545u(r7, r8)
            com.bumptech.glide.i r5 = r5.mo2748I(r7)
            r4.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r4.f26917c = r7
            r4.f26918d = r1
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            x2.e$c r1 = new x2.e$c
            r1.<init>(r4)
            r7.<init>(r8, r1)
            r4.f26919e = r0
            r4.f26916b = r7
            r4.f26922h = r5
            r4.f26915a = r6
            r4.m14026c(r9, r10)
            return
    }

    /* renamed from: a */
    public final void m14024a() {
            r6 = this;
            boolean r0 = r6.f26920f
            if (r0 == 0) goto L62
            boolean r0 = r6.f26921g
            if (r0 == 0) goto L9
            goto L62
        L9:
            r0 = 1
            x2.e$a r1 = r6.f26928n
            r2 = 0
            if (r1 == 0) goto L15
            r6.f26928n = r2
            r6.m14025b(r1)
            return
        L15:
            r6.f26921g = r0
            j2.a r0 = r6.f26915a
            int r0 = r0.mo7763e()
            long r3 = android.os.SystemClock.uptimeMillis()
            long r0 = (long) r0
            long r3 = r3 + r0
            j2.a r0 = r6.f26915a
            r0.mo7761c()
            x2.e$a r0 = new x2.e$a
            android.os.Handler r1 = r6.f26916b
            j2.a r5 = r6.f26915a
            int r5 = r5.mo7759a()
            r0.<init>(r1, r5, r3)
            r6.f26925k = r0
            com.bumptech.glide.i<android.graphics.Bitmap> r0 = r6.f26922h
            f3.b r1 = new f3.b
            double r3 = java.lang.Math.random()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.<init>(r3)
            c3.h r3 = new c3.h
            r3.<init>()
            c3.a r1 = r3.mo2523A(r1)
            c3.h r1 = (p033c3.C0862h) r1
            com.bumptech.glide.i r0 = r0.mo2748I(r1)
            j2.a r1 = r6.f26915a
            com.bumptech.glide.i r0 = r0.mo2757T(r1)
            x2.e$a r1 = r6.f26925k
            java.util.concurrent.Executor r3 = p106g3.C2233e.f10200a
            r0.m2752N(r1, r2, r0, r3)
        L62:
            return
    }

    /* renamed from: b */
    public void m14025b(p404x2.C6916e.a r4) {
            r3 = this;
            r0 = 0
            r3.f26921g = r0
            boolean r0 = r3.f26924j
            r1 = 2
            if (r0 == 0) goto L12
            android.os.Handler r0 = r3.f26916b
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            r4.sendToTarget()
            return
        L12:
            boolean r0 = r3.f26920f
            if (r0 != 0) goto L19
            r3.f26928n = r4
            return
        L19:
            android.graphics.Bitmap r0 = r4.f26935e0
            if (r0 == 0) goto L4e
            android.graphics.Bitmap r0 = r3.f26926l
            if (r0 == 0) goto L29
            n2.c r2 = r3.f26919e
            r2.mo10694f(r0)
            r0 = 0
            r3.f26926l = r0
        L29:
            x2.e$a r0 = r3.f26923i
            r3.f26923i = r4
            java.util.List<x2.e$b> r4 = r3.f26917c
            int r4 = r4.size()
        L33:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L43
            java.util.List<x2.e$b> r2 = r3.f26917c
            java.lang.Object r2 = r2.get(r4)
            x2.e$b r2 = (p404x2.C6916e.b) r2
            r2.mo14019a()
            goto L33
        L43:
            if (r0 == 0) goto L4e
            android.os.Handler r4 = r3.f26916b
            android.os.Message r4 = r4.obtainMessage(r1, r0)
            r4.sendToTarget()
        L4e:
            r3.m14024a()
            return
    }

    /* renamed from: c */
    public void m14026c(p180k2.InterfaceC3676h<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
            r3 = this;
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            r3.f26927m = r4
            java.util.Objects.requireNonNull(r5, r0)
            r3.f26926l = r5
            com.bumptech.glide.i<android.graphics.Bitmap> r0 = r3.f26922h
            c3.h r1 = new c3.h
            r1.<init>()
            r2 = 1
            c3.a r4 = r1.m2527E(r4, r2)
            com.bumptech.glide.i r4 = r0.mo2748I(r4)
            r3.f26922h = r4
            int r4 = p106g3.C2238j.m5844d(r5)
            r3.f26929o = r4
            int r4 = r5.getWidth()
            r3.f26930p = r4
            int r4 = r5.getHeight()
            r3.f26931q = r4
            return
    }
}
