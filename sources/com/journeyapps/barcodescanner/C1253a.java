package com.journeyapps.barcodescanner;

/* renamed from: com.journeyapps.barcodescanner.a */
/* loaded from: classes.dex */
public class C1253a extends android.view.ViewGroup {

    /* renamed from: A0 */
    public static final java.lang.String f6684A0 = null;

    /* renamed from: a0 */
    public ad.C0061d f6685a0;

    /* renamed from: b0 */
    public android.view.WindowManager f6686b0;

    /* renamed from: c0 */
    public android.os.Handler f6687c0;

    /* renamed from: d0 */
    public boolean f6688d0;

    /* renamed from: e0 */
    public android.view.SurfaceView f6689e0;

    /* renamed from: f0 */
    public android.view.TextureView f6690f0;

    /* renamed from: g0 */
    public boolean f6691g0;

    /* renamed from: h0 */
    public p454zc.C7293q f6692h0;

    /* renamed from: i0 */
    public int f6693i0;

    /* renamed from: j0 */
    public java.util.List<com.journeyapps.barcodescanner.C1253a.e> f6694j0;

    /* renamed from: k0 */
    public ad.C0066i f6695k0;

    /* renamed from: l0 */
    public ad.C0063f f6696l0;

    /* renamed from: m0 */
    public p454zc.C7294r f6697m0;

    /* renamed from: n0 */
    public p454zc.C7294r f6698n0;

    /* renamed from: o0 */
    public android.graphics.Rect f6699o0;

    /* renamed from: p0 */
    public p454zc.C7294r f6700p0;

    /* renamed from: q0 */
    public android.graphics.Rect f6701q0;

    /* renamed from: r0 */
    public android.graphics.Rect f6702r0;

    /* renamed from: s0 */
    public p454zc.C7294r f6703s0;

    /* renamed from: t0 */
    public double f6704t0;

    /* renamed from: u0 */
    public ad.AbstractC0071n f6705u0;

    /* renamed from: v0 */
    public boolean f6706v0;

    /* renamed from: w0 */
    public final android.view.SurfaceHolder.Callback f6707w0;

    /* renamed from: x0 */
    public final android.os.Handler.Callback f6708x0;

    /* renamed from: y0 */
    public p454zc.InterfaceC7291o f6709y0;

    /* renamed from: z0 */
    public final com.journeyapps.barcodescanner.C1253a.e f6710z0;

    /* renamed from: com.journeyapps.barcodescanner.a$a */
    public class a implements android.view.SurfaceHolder.Callback {

        /* renamed from: Y */
        public final /* synthetic */ com.journeyapps.barcodescanner.C1253a f6711Y;

        public a(com.journeyapps.barcodescanner.C1253a r1) {
                r0 = this;
                r0.f6711Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
                r0 = this;
                if (r1 != 0) goto Lc
                java.lang.String r1 = com.journeyapps.barcodescanner.C1253a.f6684A0
                java.lang.String r1 = com.journeyapps.barcodescanner.C1253a.f6684A0
                java.lang.String r2 = "*** WARNING *** surfaceChanged() gave us a null surface!"
                android.util.Log.e(r1, r2)
                return
            Lc:
                com.journeyapps.barcodescanner.a r1 = r0.f6711Y
                zc.r r2 = new zc.r
                r2.<init>(r3, r4)
                r1.f6700p0 = r2
                r1.m3701g()
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder r1) {
                r0 = this;
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder r2) {
                r1 = this;
                com.journeyapps.barcodescanner.a r2 = r1.f6711Y
                r0 = 0
                r2.f6700p0 = r0
                return
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$b */
    public class b implements android.os.Handler.Callback {

        /* renamed from: Y */
        public final /* synthetic */ com.journeyapps.barcodescanner.C1253a f6712Y;

        public b(com.journeyapps.barcodescanner.C1253a r1) {
                r0 = this;
                r0.f6712Y = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r15) {
                r14 = this;
                int r0 = r15.what
                r1 = 0
                r2 = 1
                r3 = 2131362791(0x7f0a03e7, float:1.8345373E38)
                if (r0 != r3) goto L120
                com.journeyapps.barcodescanner.a r0 = r14.f6712Y
                java.lang.Object r15 = r15.obj
                zc.r r15 = (p454zc.C7294r) r15
                r0.f6698n0 = r15
                zc.r r3 = r0.f6697m0
                if (r3 == 0) goto L11f
                r4 = 0
                if (r15 == 0) goto L111
                ad.i r5 = r0.f6695k0
                if (r5 == 0) goto L111
                int r6 = r15.f27963Y
                int r7 = r15.f27964Z
                int r8 = r3.f27963Y
                int r3 = r3.f27964Z
                ad.n r9 = r5.f204c
                zc.r r5 = r5.f202a
                android.graphics.Rect r15 = r9.mo105b(r15, r5)
                int r5 = r15.width()
                if (r5 <= 0) goto L10a
                int r5 = r15.height()
                if (r5 > 0) goto L3a
                goto L10a
            L3a:
                r0.f6699o0 = r15
                android.graphics.Rect r15 = new android.graphics.Rect
                r15.<init>(r1, r1, r8, r3)
                android.graphics.Rect r3 = r0.f6699o0
                android.graphics.Rect r5 = new android.graphics.Rect
                r5.<init>(r15)
                r5.intersect(r3)
                zc.r r15 = r0.f6703s0
                if (r15 == 0) goto L71
                int r15 = r5.width()
                zc.r r3 = r0.f6703s0
                int r3 = r3.f27963Y
                int r15 = r15 - r3
                int r15 = r15 / 2
                int r15 = java.lang.Math.max(r1, r15)
                int r3 = r5.height()
                zc.r r8 = r0.f6703s0
                int r8 = r8.f27964Z
                int r3 = r3 - r8
                int r3 = r3 / 2
                int r1 = java.lang.Math.max(r1, r3)
                r5.inset(r15, r1)
                goto La3
            L71:
                int r15 = r5.width()
                double r8 = (double) r15
                double r10 = r0.f6704t0
                double r8 = r8 * r10
                int r15 = r5.height()
                double r10 = (double) r15
                double r12 = r0.f6704t0
                double r10 = r10 * r12
                double r8 = java.lang.Math.min(r8, r10)
                int r15 = (int) r8
                r5.inset(r15, r15)
                int r15 = r5.height()
                int r3 = r5.width()
                if (r15 <= r3) goto La3
                int r15 = r5.height()
                int r3 = r5.width()
                int r15 = r15 - r3
                int r15 = r15 / 2
                r5.inset(r1, r15)
            La3:
                r0.f6701q0 = r5
                android.graphics.Rect r15 = new android.graphics.Rect
                android.graphics.Rect r1 = r0.f6701q0
                r15.<init>(r1)
                android.graphics.Rect r1 = r0.f6699o0
                int r3 = r1.left
                int r3 = -r3
                int r1 = r1.top
                int r1 = -r1
                r15.offset(r3, r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                int r3 = r15.left
                int r3 = r3 * r6
                android.graphics.Rect r5 = r0.f6699o0
                int r5 = r5.width()
                int r3 = r3 / r5
                int r5 = r15.top
                int r5 = r5 * r7
                android.graphics.Rect r8 = r0.f6699o0
                int r8 = r8.height()
                int r5 = r5 / r8
                int r8 = r15.right
                int r8 = r8 * r6
                android.graphics.Rect r6 = r0.f6699o0
                int r6 = r6.width()
                int r8 = r8 / r6
                int r15 = r15.bottom
                int r15 = r15 * r7
                android.graphics.Rect r6 = r0.f6699o0
                int r6 = r6.height()
                int r15 = r15 / r6
                r1.<init>(r3, r5, r8, r15)
                r0.f6702r0 = r1
                int r15 = r1.width()
                if (r15 <= 0) goto Lff
                android.graphics.Rect r15 = r0.f6702r0
                int r15 = r15.height()
                if (r15 > 0) goto Lf9
                goto Lff
            Lf9:
                com.journeyapps.barcodescanner.a$e r15 = r0.f6710z0
                r15.mo3692a()
                goto L10a
            Lff:
                r0.f6702r0 = r4
                r0.f6701q0 = r4
                java.lang.String r15 = com.journeyapps.barcodescanner.C1253a.f6684A0
                java.lang.String r1 = "Preview frame is too small"
                android.util.Log.w(r15, r1)
            L10a:
                r0.requestLayout()
                r0.m3701g()
                goto L11f
            L111:
                r0.f6702r0 = r4
                r0.f6701q0 = r4
                r0.f6699o0 = r4
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "containerSize or previewSize is not set yet"
                r15.<init>(r0)
                throw r15
            L11f:
                return r2
            L120:
                r3 = 2131362785(0x7f0a03e1, float:1.834536E38)
                if (r0 != r3) goto L13e
                java.lang.Object r15 = r15.obj
                java.lang.Exception r15 = (java.lang.Exception) r15
                com.journeyapps.barcodescanner.a r0 = r14.f6712Y
                ad.d r3 = r0.f6685a0
                if (r3 == 0) goto L130
                goto L131
            L130:
                r2 = 0
            L131:
                if (r2 == 0) goto L14a
                r0.mo3683c()
                com.journeyapps.barcodescanner.a r0 = r14.f6712Y
                com.journeyapps.barcodescanner.a$e r0 = r0.f6710z0
                r0.mo3693b(r15)
                goto L14a
            L13e:
                r15 = 2131362784(0x7f0a03e0, float:1.8345358E38)
                if (r0 != r15) goto L14a
                com.journeyapps.barcodescanner.a r15 = r14.f6712Y
                com.journeyapps.barcodescanner.a$e r15 = r15.f6710z0
                r15.mo3696e()
            L14a:
                return r1
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$c */
    public class c implements p454zc.InterfaceC7291o {

        /* renamed from: a */
        public final /* synthetic */ com.journeyapps.barcodescanner.C1253a f6713a;

        public c(com.journeyapps.barcodescanner.C1253a r1) {
                r0 = this;
                r0.f6713a = r1
                r0.<init>()
                return
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$d */
    public class d implements com.journeyapps.barcodescanner.C1253a.e {

        /* renamed from: a */
        public final /* synthetic */ com.journeyapps.barcodescanner.C1253a f6714a;

        public d(com.journeyapps.barcodescanner.C1253a r1) {
                r0 = this;
                r0.f6714a = r1
                r0.<init>()
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: a */
        public void mo3692a() {
                r2 = this;
                com.journeyapps.barcodescanner.a r0 = r2.f6714a
                java.util.List<com.journeyapps.barcodescanner.a$e> r0 = r0.f6694j0
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                com.journeyapps.barcodescanner.a$e r1 = (com.journeyapps.barcodescanner.C1253a.e) r1
                r1.mo3692a()
                goto L8
            L18:
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: b */
        public void mo3693b(java.lang.Exception r3) {
                r2 = this;
                com.journeyapps.barcodescanner.a r0 = r2.f6714a
                java.util.List<com.journeyapps.barcodescanner.a$e> r0 = r0.f6694j0
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                com.journeyapps.barcodescanner.a$e r1 = (com.journeyapps.barcodescanner.C1253a.e) r1
                r1.mo3693b(r3)
                goto L8
            L18:
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: c */
        public void mo3694c() {
                r2 = this;
                com.journeyapps.barcodescanner.a r0 = r2.f6714a
                java.util.List<com.journeyapps.barcodescanner.a$e> r0 = r0.f6694j0
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                com.journeyapps.barcodescanner.a$e r1 = (com.journeyapps.barcodescanner.C1253a.e) r1
                r1.mo3694c()
                goto L8
            L18:
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: d */
        public void mo3695d() {
                r2 = this;
                com.journeyapps.barcodescanner.a r0 = r2.f6714a
                java.util.List<com.journeyapps.barcodescanner.a$e> r0 = r0.f6694j0
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                com.journeyapps.barcodescanner.a$e r1 = (com.journeyapps.barcodescanner.C1253a.e) r1
                r1.mo3695d()
                goto L8
            L18:
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: e */
        public void mo3696e() {
                r2 = this;
                com.journeyapps.barcodescanner.a r0 = r2.f6714a
                java.util.List<com.journeyapps.barcodescanner.a$e> r0 = r0.f6694j0
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                com.journeyapps.barcodescanner.a$e r1 = (com.journeyapps.barcodescanner.C1253a.e) r1
                r1.mo3696e()
                goto L8
            L18:
                return
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$e */
    public interface e {
        /* renamed from: a */
        void mo3692a();

        /* renamed from: b */
        void mo3693b(java.lang.Exception r1);

        /* renamed from: c */
        void mo3694c();

        /* renamed from: d */
        void mo3695d();

        /* renamed from: e */
        void mo3696e();
    }

    static {
            java.lang.Class<com.journeyapps.barcodescanner.a> r0 = com.journeyapps.barcodescanner.C1253a.class
            java.lang.String r0 = r0.getSimpleName()
            com.journeyapps.barcodescanner.C1253a.f6684A0 = r0
            return
    }

    public C1253a(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            r0 = 0
            r4.f6688d0 = r0
            r4.f6691g0 = r0
            r1 = -1
            r4.f6693i0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f6694j0 = r1
            ad.f r1 = new ad.f
            r1.<init>()
            r4.f6696l0 = r1
            r1 = 0
            r4.f6701q0 = r1
            r4.f6702r0 = r1
            r4.f6703s0 = r1
            r2 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            r4.f6704t0 = r2
            r4.f6705u0 = r1
            r4.f6706v0 = r0
            com.journeyapps.barcodescanner.a$a r0 = new com.journeyapps.barcodescanner.a$a
            r0.<init>(r4)
            r4.f6707w0 = r0
            com.journeyapps.barcodescanner.a$b r0 = new com.journeyapps.barcodescanner.a$b
            r0.<init>(r4)
            r4.f6708x0 = r0
            com.journeyapps.barcodescanner.a$c r1 = new com.journeyapps.barcodescanner.a$c
            r1.<init>(r4)
            r4.f6709y0 = r1
            com.journeyapps.barcodescanner.a$d r1 = new com.journeyapps.barcodescanner.a$d
            r1.<init>(r4)
            r4.f6710z0 = r1
            android.graphics.drawable.Drawable r1 = r4.getBackground()
            if (r1 != 0) goto L52
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setBackgroundColor(r1)
        L52:
            r4.m3698b(r6)
            java.lang.String r6 = "window"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            r4.f6686b0 = r5
            android.os.Handler r5 = new android.os.Handler
            r5.<init>(r0)
            r4.f6687c0 = r5
            zc.q r5 = new zc.q
            r5.<init>()
            r4.f6692h0 = r5
            return
    }

    /* renamed from: a */
    public static void m3697a(com.journeyapps.barcodescanner.C1253a r2) {
            ad.d r0 = r2.f6685a0
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto L17
            int r0 = r2.getDisplayRotation()
            int r1 = r2.f6693i0
            if (r0 == r1) goto L17
            r2.mo3683c()
            r2.m3699e()
        L17:
            return
    }

    private int getDisplayRotation() {
            r1 = this;
            android.view.WindowManager r0 = r1.f6686b0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            return r0
    }

    /* renamed from: b */
    public void m3698b(android.util.AttributeSet r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int[] r1 = p413xb.C7025h.f27355a
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            r0 = 1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r5.getDimension(r0, r1)
            int r2 = (int) r2
            r3 = 0
            float r1 = r5.getDimension(r3, r1)
            int r1 = (int) r1
            if (r2 <= 0) goto L23
            if (r1 <= 0) goto L23
            zc.r r3 = new zc.r
            r3.<init>(r2, r1)
            r4.f6703s0 = r3
        L23:
            r1 = 3
            boolean r2 = r5.getBoolean(r1, r0)
            r4.f6688d0 = r2
            r2 = -1
            r3 = 2
            int r2 = r5.getInteger(r3, r2)
            if (r2 != r0) goto L38
            ad.h r0 = new ad.h
            r0.<init>()
            goto L47
        L38:
            if (r2 != r3) goto L40
            ad.j r0 = new ad.j
            r0.<init>()
            goto L47
        L40:
            if (r2 != r1) goto L49
            ad.k r0 = new ad.k
            r0.<init>()
        L47:
            r4.f6705u0 = r0
        L49:
            r5.recycle()
            return
    }

    /* renamed from: c */
    public void mo3683c() {
            r4 = this;
            p185k7.C3828h5.m8580I()
            java.lang.String r0 = com.journeyapps.barcodescanner.C1253a.f6684A0
            java.lang.String r1 = "pause()"
            android.util.Log.d(r0, r1)
            r0 = -1
            r4.f6693i0 = r0
            ad.d r0 = r4.f6685a0
            r1 = 0
            if (r0 == 0) goto L2c
            p185k7.C3828h5.m8580I()
            boolean r2 = r0.f167f
            if (r2 == 0) goto L21
            ad.g r2 = r0.f162a
            java.lang.Runnable r3 = r0.f174m
            r2.m103b(r3)
            goto L24
        L21:
            r2 = 1
            r0.f168g = r2
        L24:
            r2 = 0
            r0.f167f = r2
            r4.f6685a0 = r1
            r4.f6691g0 = r2
            goto L34
        L2c:
            android.os.Handler r0 = r4.f6687c0
            r2 = 2131362784(0x7f0a03e0, float:1.8345358E38)
            r0.sendEmptyMessage(r2)
        L34:
            zc.r r0 = r4.f6700p0
            if (r0 != 0) goto L45
            android.view.SurfaceView r0 = r4.f6689e0
            if (r0 == 0) goto L45
            android.view.SurfaceHolder r0 = r0.getHolder()
            android.view.SurfaceHolder$Callback r2 = r4.f6707w0
            r0.removeCallback(r2)
        L45:
            zc.r r0 = r4.f6700p0
            if (r0 != 0) goto L50
            android.view.TextureView r0 = r4.f6690f0
            if (r0 == 0) goto L50
            r0.setSurfaceTextureListener(r1)
        L50:
            r4.f6697m0 = r1
            r4.f6698n0 = r1
            r4.f6702r0 = r1
            zc.q r0 = r4.f6692h0
            android.view.OrientationEventListener r2 = r0.f27961c
            if (r2 == 0) goto L5f
            r2.disable()
        L5f:
            r0.f27961c = r1
            r0.f27960b = r1
            r0.f27962d = r1
            com.journeyapps.barcodescanner.a$e r0 = r4.f6710z0
            r0.mo3695d()
            return
    }

    /* renamed from: d */
    public void mo3684d() {
            r0 = this;
            return
    }

    /* renamed from: e */
    public void m3699e() {
            r5 = this;
            p185k7.C3828h5.m8580I()
            java.lang.String r0 = com.journeyapps.barcodescanner.C1253a.f6684A0
            java.lang.String r1 = "resume()"
            android.util.Log.d(r0, r1)
            ad.d r1 = r5.f6685a0
            if (r1 == 0) goto L14
            java.lang.String r1 = "initCamera called twice"
            android.util.Log.w(r0, r1)
            goto L4e
        L14:
            ad.d r0 = new ad.d
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            ad.f r1 = r5.f6696l0
            boolean r2 = r0.f167f
            if (r2 != 0) goto L29
            r0.f170i = r1
            ad.e r2 = r0.f164c
            r2.f186g = r1
        L29:
            r5.f6685a0 = r0
            android.os.Handler r1 = r5.f6687c0
            r0.f165d = r1
            p185k7.C3828h5.m8580I()
            r1 = 1
            r0.f167f = r1
            r2 = 0
            r0.f168g = r2
            ad.g r2 = r0.f162a
            java.lang.Runnable r0 = r0.f171j
            java.lang.Object r3 = r2.f201d
            monitor-enter(r3)
            int r4 = r2.f200c     // Catch: java.lang.Throwable -> Ld4
            int r4 = r4 + r1
            r2.f200c = r4     // Catch: java.lang.Throwable -> Ld4
            r2.m103b(r0)     // Catch: java.lang.Throwable -> Ld4
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld4
            int r0 = r5.getDisplayRotation()
            r5.f6693i0 = r0
        L4e:
            zc.r r0 = r5.f6700p0
            if (r0 == 0) goto L56
            r5.m3701g()
            goto L93
        L56:
            android.view.SurfaceView r0 = r5.f6689e0
            if (r0 == 0) goto L64
            android.view.SurfaceHolder r0 = r0.getHolder()
            android.view.SurfaceHolder$Callback r1 = r5.f6707w0
            r0.addCallback(r1)
            goto L93
        L64:
            android.view.TextureView r0 = r5.f6690f0
            if (r0 == 0) goto L93
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto L89
            zc.d r0 = new zc.d
            r0.<init>(r5)
            android.view.TextureView r1 = r5.f6690f0
            android.graphics.SurfaceTexture r1 = r1.getSurfaceTexture()
            android.view.TextureView r2 = r5.f6690f0
            int r2 = r2.getWidth()
            android.view.TextureView r3 = r5.f6690f0
            int r3 = r3.getHeight()
            r0.onSurfaceTextureAvailable(r1, r2, r3)
            goto L93
        L89:
            android.view.TextureView r0 = r5.f6690f0
            zc.d r1 = new zc.d
            r1.<init>(r5)
            r0.setSurfaceTextureListener(r1)
        L93:
            r5.requestLayout()
            zc.q r0 = r5.f6692h0
            android.content.Context r1 = r5.getContext()
            zc.o r2 = r5.f6709y0
            android.view.OrientationEventListener r3 = r0.f27961c
            if (r3 == 0) goto La5
            r3.disable()
        La5:
            r3 = 0
            r0.f27961c = r3
            r0.f27960b = r3
            r0.f27962d = r3
            android.content.Context r1 = r1.getApplicationContext()
            r0.f27962d = r2
            java.lang.String r2 = "window"
            java.lang.Object r2 = r1.getSystemService(r2)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r0.f27960b = r2
            zc.p r2 = new zc.p
            r3 = 3
            r2.<init>(r0, r1, r3)
            r0.f27961c = r2
            r2.enable()
            android.view.WindowManager r1 = r0.f27960b
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            r0.f27959a = r1
            return
        Ld4:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld4
            throw r0
    }

    /* renamed from: f */
    public final void m3700f(p128hb.C3003h r3) {
            r2 = this;
            boolean r0 = r2.f6691g0
            if (r0 != 0) goto L35
            ad.d r0 = r2.f6685a0
            if (r0 == 0) goto L35
            java.lang.String r0 = com.journeyapps.barcodescanner.C1253a.f6684A0
            java.lang.String r1 = "Starting preview"
            android.util.Log.i(r0, r1)
            ad.d r0 = r2.f6685a0
            r0.f163b = r3
            p185k7.C3828h5.m8580I()
            boolean r3 = r0.f167f
            if (r3 == 0) goto L2d
            ad.g r3 = r0.f162a
            java.lang.Runnable r0 = r0.f173l
            r3.m103b(r0)
            r3 = 1
            r2.f6691g0 = r3
            r2.mo3684d()
            com.journeyapps.barcodescanner.a$e r3 = r2.f6710z0
            r3.mo3694c()
            goto L35
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "CameraInstance is not open"
            r3.<init>(r0)
            throw r3
        L35:
            return
    }

    /* renamed from: g */
    public final void m3701g() {
            r6 = this;
            zc.r r0 = r6.f6700p0
            if (r0 == 0) goto L8e
            zc.r r1 = r6.f6698n0
            if (r1 == 0) goto L8e
            android.graphics.Rect r1 = r6.f6699o0
            if (r1 == 0) goto L8e
            android.view.SurfaceView r2 = r6.f6689e0
            if (r2 == 0) goto L34
            zc.r r2 = new zc.r
            int r1 = r1.width()
            android.graphics.Rect r3 = r6.f6699o0
            int r3 = r3.height()
            r2.<init>(r1, r3)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L34
            hb.h r0 = new hb.h
            android.view.SurfaceView r1 = r6.f6689e0
            android.view.SurfaceHolder r1 = r1.getHolder()
            r0.<init>(r1)
        L30:
            r6.m3700f(r0)
            goto L8e
        L34:
            android.view.TextureView r0 = r6.f6690f0
            if (r0 == 0) goto L8e
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            if (r0 == 0) goto L8e
            zc.r r0 = r6.f6698n0
            if (r0 == 0) goto L82
            android.view.TextureView r0 = r6.f6690f0
            int r0 = r0.getWidth()
            android.view.TextureView r1 = r6.f6690f0
            int r1 = r1.getHeight()
            zc.r r2 = r6.f6698n0
            float r3 = (float) r0
            float r4 = (float) r1
            float r3 = r3 / r4
            int r4 = r2.f27963Y
            float r4 = (float) r4
            int r2 = r2.f27964Z
            float r2 = (float) r2
            float r4 = r4 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L65
            float r4 = r4 / r3
            r2 = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L66
        L65:
            float r3 = r3 / r4
        L66:
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r4.setScale(r2, r3)
            float r0 = (float) r0
            float r2 = r2 * r0
            float r1 = (float) r1
            float r3 = r3 * r1
            float r0 = r0 - r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r1 = r1 - r3
            float r1 = r1 / r2
            r4.postTranslate(r0, r1)
            android.view.TextureView r0 = r6.f6690f0
            r0.setTransform(r4)
        L82:
            hb.h r0 = new hb.h
            android.view.TextureView r1 = r6.f6690f0
            android.graphics.SurfaceTexture r1 = r1.getSurfaceTexture()
            r0.<init>(r1)
            goto L30
        L8e:
            return
    }

    public ad.C0061d getCameraInstance() {
            r1 = this;
            ad.d r0 = r1.f6685a0
            return r0
    }

    public ad.C0063f getCameraSettings() {
            r1 = this;
            ad.f r0 = r1.f6696l0
            return r0
    }

    public android.graphics.Rect getFramingRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.f6701q0
            return r0
    }

    public p454zc.C7294r getFramingRectSize() {
            r1 = this;
            zc.r r0 = r1.f6703s0
            return r0
    }

    public double getMarginFraction() {
            r2 = this;
            double r0 = r2.f6704t0
            return r0
    }

    public android.graphics.Rect getPreviewFramingRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.f6702r0
            return r0
    }

    public ad.AbstractC0071n getPreviewScalingStrategy() {
            r1 = this;
            ad.n r0 = r1.f6705u0
            if (r0 == 0) goto L5
            return r0
        L5:
            android.view.TextureView r0 = r1.f6690f0
            if (r0 == 0) goto Lf
            ad.h r0 = new ad.h
            r0.<init>()
            return r0
        Lf:
            ad.j r0 = new ad.j
            r0.<init>()
            return r0
    }

    public p454zc.C7294r getPreviewSize() {
            r1 = this;
            zc.r r0 = r1.f6698n0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            boolean r0 = r2.f6688d0
            if (r0 == 0) goto L1d
            android.view.TextureView r0 = new android.view.TextureView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f6690f0 = r0
            zc.d r1 = new zc.d
            r1.<init>(r2)
            r0.setSurfaceTextureListener(r1)
            android.view.TextureView r0 = r2.f6690f0
            goto L33
        L1d:
            android.view.SurfaceView r0 = new android.view.SurfaceView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f6689e0 = r0
            android.view.SurfaceHolder r0 = r0.getHolder()
            android.view.SurfaceHolder$Callback r1 = r2.f6707w0
            r0.addCallback(r1)
            android.view.SurfaceView r0 = r2.f6689e0
        L33:
            r2.addView(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            zc.r r1 = new zc.r
            int r4 = r4 - r2
            int r5 = r5 - r3
            r1.<init>(r4, r5)
            r0.f6697m0 = r1
            ad.d r2 = r0.f6685a0
            if (r2 == 0) goto L5d
            ad.i r2 = r2.f166e
            if (r2 != 0) goto L5d
            ad.i r2 = new ad.i
            int r3 = r0.getDisplayRotation()
            r2.<init>(r3, r1)
            r0.f6695k0 = r2
            ad.n r1 = r0.getPreviewScalingStrategy()
            r2.f204c = r1
            ad.d r1 = r0.f6685a0
            ad.i r2 = r0.f6695k0
            r1.f166e = r2
            ad.e r3 = r1.f164c
            r3.f187h = r2
            p185k7.C3828h5.m8580I()
            boolean r2 = r1.f167f
            if (r2 == 0) goto L55
            ad.g r2 = r1.f162a
            java.lang.Runnable r1 = r1.f172k
            r2.m103b(r1)
            boolean r1 = r0.f6706v0
            if (r1 == 0) goto L5d
            ad.d r2 = r0.f6685a0
            java.util.Objects.requireNonNull(r2)
            p185k7.C3828h5.m8580I()
            boolean r3 = r2.f167f
            if (r3 == 0) goto L5d
            ad.g r3 = r2.f162a
            h4.l r4 = new h4.l
            r4.<init>(r2, r1)
            r3.m103b(r4)
            goto L5d
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "CameraInstance is not open"
            r1.<init>(r2)
            throw r1
        L5d:
            android.view.SurfaceView r1 = r0.f6689e0
            r2 = 0
            if (r1 == 0) goto L7e
            android.graphics.Rect r3 = r0.f6699o0
            if (r3 != 0) goto L72
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            r1.layout(r2, r2, r3, r4)
            goto L8d
        L72:
            int r2 = r3.left
            int r4 = r3.top
            int r5 = r3.right
            int r3 = r3.bottom
            r1.layout(r2, r4, r5, r3)
            goto L8d
        L7e:
            android.view.TextureView r1 = r0.f6690f0
            if (r1 == 0) goto L8d
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            r1.layout(r2, r2, r3, r4)
        L8d:
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.os.Bundle
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "super"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            super.onRestoreInstanceState(r0)
            java.lang.String r0 = "torch"
            boolean r2 = r2.getBoolean(r0)
            r1.setTorch(r2)
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "super"
            r1.putParcelable(r2, r0)
            boolean r0 = r3.f6706v0
            java.lang.String r2 = "torch"
            r1.putBoolean(r2, r0)
            return r1
    }

    public void setCameraSettings(ad.C0063f r1) {
            r0 = this;
            r0.f6696l0 = r1
            return
    }

    public void setFramingRectSize(p454zc.C7294r r1) {
            r0 = this;
            r0.f6703s0 = r1
            return
    }

    public void setMarginFraction(double r4) {
            r3 = this;
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L9
            r3.f6704t0 = r4
            return
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The margin fraction must be less than 0.5"
            r4.<init>(r5)
            throw r4
    }

    public void setPreviewScalingStrategy(ad.AbstractC0071n r1) {
            r0 = this;
            r0.f6705u0 = r1
            return
    }

    public void setTorch(boolean r4) {
            r3 = this;
            r3.f6706v0 = r4
            ad.d r0 = r3.f6685a0
            if (r0 == 0) goto L17
            p185k7.C3828h5.m8580I()
            boolean r1 = r0.f167f
            if (r1 == 0) goto L17
            ad.g r1 = r0.f162a
            h4.l r2 = new h4.l
            r2.<init>(r0, r4)
            r1.m103b(r2)
        L17:
            return
    }

    public void setUseTextureView(boolean r1) {
            r0 = this;
            r0.f6688d0 = r1
            return
    }
}
