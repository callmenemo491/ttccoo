package p387w5;

/* renamed from: w5.j */
/* loaded from: classes.dex */
public final class C6807j {

    /* renamed from: a */
    public final p387w5.C6802e f26482a;

    /* renamed from: b */
    public final p387w5.C6807j.b f26483b;

    /* renamed from: c */
    public final p387w5.C6807j.e f26484c;

    /* renamed from: d */
    public boolean f26485d;

    /* renamed from: e */
    public android.view.Surface f26486e;

    /* renamed from: f */
    public float f26487f;

    /* renamed from: g */
    public float f26488g;

    /* renamed from: h */
    public float f26489h;

    /* renamed from: i */
    public float f26490i;

    /* renamed from: j */
    public int f26491j;

    /* renamed from: k */
    public long f26492k;

    /* renamed from: l */
    public long f26493l;

    /* renamed from: m */
    public long f26494m;

    /* renamed from: n */
    public long f26495n;

    /* renamed from: o */
    public long f26496o;

    /* renamed from: p */
    public long f26497p;

    /* renamed from: q */
    public long f26498q;

    /* renamed from: w5.j$a */
    public static final class a {
        /* renamed from: a */
        public static void m13878a(android.view.Surface r1, float r2) {
                r0 = 0
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 != 0) goto L7
                r0 = 0
                goto L8
            L7:
                r0 = 1
            L8:
                r1.setFrameRate(r2, r0)     // Catch: java.lang.IllegalStateException -> Lc
                goto L14
            Lc:
                r1 = move-exception
                java.lang.String r2 = "VideoFrameReleaseHelper"
                java.lang.String r0 = "Failed to call Surface.setFrameRate"
                p371v5.C6565o.m13369b(r2, r0, r1)
            L14:
                return
        }
    }

    /* renamed from: w5.j$b */
    public interface b {

        /* renamed from: w5.j$b$a */
        public interface a {
        }

        /* renamed from: a */
        void mo13879a(p387w5.C6807j.b.a r1);

        /* renamed from: b */
        void mo13880b();
    }

    /* renamed from: w5.j$c */
    public static final class c implements p387w5.C6807j.b {

        /* renamed from: a */
        public final android.view.WindowManager f26499a;

        public c(android.view.WindowManager r1) {
                r0 = this;
                r0.<init>()
                r0.f26499a = r1
                return
        }

        @Override // p387w5.C6807j.b
        /* renamed from: a */
        public void mo13879a(p387w5.C6807j.b.a r2) {
                r1 = this;
                android.view.WindowManager r0 = r1.f26499a
                android.view.Display r0 = r0.getDefaultDisplay()
                u3.b r2 = (p350u3.C6293b) r2
                r2.m12926l(r0)
                return
        }

        @Override // p387w5.C6807j.b
        /* renamed from: b */
        public void mo13880b() {
                r0 = this;
                return
        }
    }

    /* renamed from: w5.j$d */
    public static final class d implements p387w5.C6807j.b, android.hardware.display.DisplayManager.DisplayListener {

        /* renamed from: a */
        public final android.hardware.display.DisplayManager f26500a;

        /* renamed from: b */
        public p387w5.C6807j.b.a f26501b;

        public d(android.hardware.display.DisplayManager r1) {
                r0 = this;
                r0.<init>()
                r0.f26500a = r1
                return
        }

        @Override // p387w5.C6807j.b
        /* renamed from: a */
        public void mo13879a(p387w5.C6807j.b.a r3) {
                r2 = this;
                r2.f26501b = r3
                android.hardware.display.DisplayManager r0 = r2.f26500a
                android.os.Handler r1 = p371v5.C6552b0.m13317j()
                r0.registerDisplayListener(r2, r1)
                android.hardware.display.DisplayManager r0 = r2.f26500a
                r1 = 0
                android.view.Display r0 = r0.getDisplay(r1)
                u3.b r3 = (p350u3.C6293b) r3
                r3.m12926l(r0)
                return
        }

        @Override // p387w5.C6807j.b
        /* renamed from: b */
        public void mo13880b() {
                r1 = this;
                android.hardware.display.DisplayManager r0 = r1.f26500a
                r0.unregisterDisplayListener(r1)
                r0 = 0
                r1.f26501b = r0
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int r3) {
                r2 = this;
                w5.j$b$a r0 = r2.f26501b
                if (r0 == 0) goto L12
                if (r3 != 0) goto L12
                android.hardware.display.DisplayManager r3 = r2.f26500a
                r1 = 0
                android.view.Display r3 = r3.getDisplay(r1)
                u3.b r0 = (p350u3.C6293b) r0
                r0.m12926l(r3)
            L12:
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: w5.j$e */
    public static final class e implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {

        /* renamed from: c0 */
        public static final p387w5.C6807j.e f26502c0 = null;

        /* renamed from: Y */
        public volatile long f26503Y;

        /* renamed from: Z */
        public final android.os.Handler f26504Z;

        /* renamed from: a0 */
        public android.view.Choreographer f26505a0;

        /* renamed from: b0 */
        public int f26506b0;

        static {
                w5.j$e r0 = new w5.j$e
                r0.<init>()
                p387w5.C6807j.e.f26502c0 = r0
                return
        }

        public e() {
                r2 = this;
                r2.<init>()
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r2.f26503Y = r0
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "ExoPlayer:FrameReleaseChoreographer"
                r0.<init>(r1)
                r0.start()
                android.os.Looper r0 = r0.getLooper()
                int r1 = p371v5.C6552b0.f25624a
                android.os.Handler r1 = new android.os.Handler
                r1.<init>(r0, r2)
                r2.f26504Z = r1
                r0 = 0
                r1.sendEmptyMessage(r0)
                return
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long r3) {
                r2 = this;
                r2.f26503Y = r3
                android.view.Choreographer r3 = r2.f26505a0
                java.util.Objects.requireNonNull(r3)
                r0 = 500(0x1f4, double:2.47E-321)
                r3.postFrameCallbackDelayed(r2, r0)
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r4 = r4.what
                r0 = 1
                if (r4 == 0) goto L34
                if (r4 == r0) goto L24
                r1 = 2
                if (r4 == r1) goto Lc
                r4 = 0
                return r4
            Lc:
                int r4 = r3.f26506b0
                int r4 = r4 + (-1)
                r3.f26506b0 = r4
                if (r4 != 0) goto L23
                android.view.Choreographer r4 = r3.f26505a0
                java.util.Objects.requireNonNull(r4)
                r4.removeFrameCallback(r3)
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r3.f26503Y = r1
            L23:
                return r0
            L24:
                int r4 = r3.f26506b0
                int r4 = r4 + r0
                r3.f26506b0 = r4
                if (r4 != r0) goto L33
                android.view.Choreographer r4 = r3.f26505a0
                java.util.Objects.requireNonNull(r4)
                r4.postFrameCallback(r3)
            L33:
                return r0
            L34:
                android.view.Choreographer r4 = android.view.Choreographer.getInstance()
                r3.f26505a0 = r4
                return r0
        }
    }

    public C6807j(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            w5.e r0 = new w5.e
            r0.<init>()
            r3.f26482a = r0
            r0 = 0
            if (r4 == 0) goto L3a
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = p371v5.C6552b0.f25624a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            w5.j$d r2 = new w5.j$d
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3b
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3a
            w5.j$c r2 = new w5.j$c
            r2.<init>(r4)
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r3.f26483b = r2
            if (r2 == 0) goto L41
            w5.j$e r0 = p387w5.C6807j.e.f26502c0
        L41:
            r3.f26484c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f26492k = r0
            r3.f26493l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f26487f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f26490i = r4
            r4 = 0
            r3.f26491j = r4
            return
    }

    /* renamed from: a */
    public final void m13874a() {
            r3 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 30
            if (r0 < r1) goto L1d
            android.view.Surface r0 = r3.f26486e
            if (r0 == 0) goto L1d
            int r1 = r3.f26491j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L1d
            float r1 = r3.f26489h
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            goto L1d
        L18:
            r3.f26489h = r2
            p387w5.C6807j.a.m13878a(r0, r2)
        L1d:
            return
    }

    /* renamed from: b */
    public final void m13875b() {
            r2 = this;
            r0 = 0
            r2.f26494m = r0
            r0 = -1
            r2.f26497p = r0
            r2.f26495n = r0
            return
    }

    /* renamed from: c */
    public final void m13876c() {
            r10 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 30
            if (r0 < r1) goto L98
            android.view.Surface r0 = r10.f26486e
            if (r0 != 0) goto Lc
            goto L98
        Lc:
            w5.e r0 = r10.f26482a
            boolean r0 = r0.m13841a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L38
            w5.e r0 = r10.f26482a
            boolean r3 = r0.m13841a()
            if (r3 == 0) goto L35
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            w5.e$a r0 = r0.f26422a
            long r5 = r0.f26431e
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L2e
            goto L31
        L2e:
            long r7 = r0.f26432f
            long r7 = r7 / r5
        L31:
            double r5 = (double) r7
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L3a
        L35:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3a
        L38:
            float r0 = r10.f26487f
        L3a:
            float r3 = r10.f26488g
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L41
            return
        L41:
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L88
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L88
            w5.e r1 = r10.f26482a
            boolean r1 = r1.m13841a()
            if (r1 == 0) goto L70
            w5.e r1 = r10.f26482a
            boolean r2 = r1.m13841a()
            if (r2 == 0) goto L60
            w5.e$a r1 = r1.f26422a
            long r1 = r1.f26432f
            goto L65
        L60:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L65:
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L70
            r1 = 1
            goto L71
        L70:
            r1 = 0
        L71:
            if (r1 == 0) goto L77
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L79
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
        L79:
            float r2 = r10.f26488g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L86
            goto L91
        L86:
            r5 = 0
            goto L91
        L88:
            if (r6 == 0) goto L8b
            goto L91
        L8b:
            w5.e r2 = r10.f26482a
            int r2 = r2.f26426e
            if (r2 < r1) goto L86
        L91:
            if (r5 == 0) goto L98
            r10.f26488g = r0
            r10.m13877d(r4)
        L98:
            return
    }

    /* renamed from: d */
    public final void m13877d(boolean r5) {
            r4 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r4.f26486e
            if (r0 == 0) goto L30
            int r1 = r4.f26491j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            r1 = 0
            boolean r2 = r4.f26485d
            if (r2 == 0) goto L22
            float r2 = r4.f26488g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            float r1 = r4.f26490i
            float r1 = r1 * r2
        L22:
            if (r5 != 0) goto L2b
            float r5 = r4.f26489h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2b
            return
        L2b:
            r4.f26489h = r1
            p387w5.C6807j.a.m13878a(r0, r1)
        L30:
            return
    }
}
