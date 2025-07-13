package ad;

/* renamed from: ad.d */
/* loaded from: classes.dex */
public class C0061d {

    /* renamed from: n */
    public static final /* synthetic */ int f161n = 0;

    /* renamed from: a */
    public ad.C0064g f162a;

    /* renamed from: b */
    public p128hb.C3003h f163b;

    /* renamed from: c */
    public ad.C0062e f164c;

    /* renamed from: d */
    public android.os.Handler f165d;

    /* renamed from: e */
    public ad.C0066i f166e;

    /* renamed from: f */
    public boolean f167f;

    /* renamed from: g */
    public boolean f168g;

    /* renamed from: h */
    public android.os.Handler f169h;

    /* renamed from: i */
    public ad.C0063f f170i;

    /* renamed from: j */
    public java.lang.Runnable f171j;

    /* renamed from: k */
    public java.lang.Runnable f172k;

    /* renamed from: l */
    public java.lang.Runnable f173l;

    /* renamed from: m */
    public java.lang.Runnable f174m;

    /* renamed from: ad.d$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ ad.C0061d f175Y;

        public a(ad.C0061d r1) {
                r0 = this;
                r0.f175Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.String r0 = "d"
                int r1 = ad.C0061d.f161n     // Catch: java.lang.Exception -> L11
                java.lang.String r1 = "Opening camera"
                android.util.Log.d(r0, r1)     // Catch: java.lang.Exception -> L11
                ad.d r1 = r3.f175Y     // Catch: java.lang.Exception -> L11
                ad.e r1 = r1.f164c     // Catch: java.lang.Exception -> L11
                r1.m98d()     // Catch: java.lang.Exception -> L11
                goto L1e
            L11:
                r1 = move-exception
                ad.d r2 = r3.f175Y
                ad.C0061d.m94a(r2, r1)
                int r2 = ad.C0061d.f161n
                java.lang.String r2 = "Failed to open camera"
                android.util.Log.e(r0, r2, r1)
            L1e:
                return
        }
    }

    /* renamed from: ad.d$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ ad.C0061d f176Y;

        public b(ad.C0061d r1) {
                r0 = this;
                r0.f176Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String r0 = "d"
                int r1 = ad.C0061d.f161n     // Catch: java.lang.Exception -> L3b
                java.lang.String r1 = "Configuring camera"
                android.util.Log.d(r0, r1)     // Catch: java.lang.Exception -> L3b
                ad.d r1 = r6.f176Y     // Catch: java.lang.Exception -> L3b
                ad.e r1 = r1.f164c     // Catch: java.lang.Exception -> L3b
                r1.m96b()     // Catch: java.lang.Exception -> L3b
                ad.d r1 = r6.f176Y     // Catch: java.lang.Exception -> L3b
                android.os.Handler r2 = r1.f165d     // Catch: java.lang.Exception -> L3b
                if (r2 == 0) goto L48
                r3 = 2131362791(0x7f0a03e7, float:1.8345373E38)
                ad.e r1 = r1.f164c     // Catch: java.lang.Exception -> L3b
                zc.r r4 = r1.f189j     // Catch: java.lang.Exception -> L3b
                if (r4 != 0) goto L21
                r1 = 0
                goto L33
            L21:
                boolean r4 = r1.m97c()     // Catch: java.lang.Exception -> L3b
                zc.r r1 = r1.f189j     // Catch: java.lang.Exception -> L3b
                if (r4 == 0) goto L33
                zc.r r4 = new zc.r     // Catch: java.lang.Exception -> L3b
                int r5 = r1.f27964Z     // Catch: java.lang.Exception -> L3b
                int r1 = r1.f27963Y     // Catch: java.lang.Exception -> L3b
                r4.<init>(r5, r1)     // Catch: java.lang.Exception -> L3b
                r1 = r4
            L33:
                android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch: java.lang.Exception -> L3b
                r1.sendToTarget()     // Catch: java.lang.Exception -> L3b
                goto L48
            L3b:
                r1 = move-exception
                ad.d r2 = r6.f176Y
                ad.C0061d.m94a(r2, r1)
                int r2 = ad.C0061d.f161n
                java.lang.String r2 = "Failed to configure camera"
                android.util.Log.e(r0, r2, r1)
            L48:
                return
        }
    }

    /* renamed from: ad.d$c */
    public class c implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ ad.C0061d f177Y;

        public c(ad.C0061d r1) {
                r0 = this;
                r0.f177Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = "d"
                int r1 = ad.C0061d.f161n     // Catch: java.lang.Exception -> L2a
                java.lang.String r1 = "Starting preview"
                android.util.Log.d(r0, r1)     // Catch: java.lang.Exception -> L2a
                ad.d r1 = r4.f177Y     // Catch: java.lang.Exception -> L2a
                ad.e r2 = r1.f164c     // Catch: java.lang.Exception -> L2a
                hb.h r1 = r1.f163b     // Catch: java.lang.Exception -> L2a
                android.hardware.Camera r2 = r2.f180a     // Catch: java.lang.Exception -> L2a
                wa.b<s9.a> r3 = r1.f12118b     // Catch: java.lang.Exception -> L2a
                android.view.SurfaceHolder r3 = (android.view.SurfaceHolder) r3     // Catch: java.lang.Exception -> L2a
                if (r3 == 0) goto L1b
                r2.setPreviewDisplay(r3)     // Catch: java.lang.Exception -> L2a
                goto L22
            L1b:
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f12119c     // Catch: java.lang.Exception -> L2a
                android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1     // Catch: java.lang.Exception -> L2a
                r2.setPreviewTexture(r1)     // Catch: java.lang.Exception -> L2a
            L22:
                ad.d r1 = r4.f177Y     // Catch: java.lang.Exception -> L2a
                ad.e r1 = r1.f164c     // Catch: java.lang.Exception -> L2a
                r1.m101g()     // Catch: java.lang.Exception -> L2a
                goto L37
            L2a:
                r1 = move-exception
                ad.d r2 = r4.f177Y
                ad.C0061d.m94a(r2, r1)
                int r2 = ad.C0061d.f161n
                java.lang.String r2 = "Failed to start preview"
                android.util.Log.e(r0, r2, r1)
            L37:
                return
        }
    }

    /* renamed from: ad.d$d */
    public class d implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ ad.C0061d f178Y;

        public d(ad.C0061d r1) {
                r0 = this;
                r0.f178Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                r0 = 0
                int r1 = ad.C0061d.f161n     // Catch: java.lang.Exception -> L40
                java.lang.String r1 = "d"
                java.lang.String r2 = "Closing camera"
                android.util.Log.d(r1, r2)     // Catch: java.lang.Exception -> L40
                ad.d r1 = r5.f178Y     // Catch: java.lang.Exception -> L40
                ad.e r1 = r1.f164c     // Catch: java.lang.Exception -> L40
                ad.a r2 = r1.f182c     // Catch: java.lang.Exception -> L40
                if (r2 == 0) goto L17
                r2.m91c()     // Catch: java.lang.Exception -> L40
                r1.f182c = r0     // Catch: java.lang.Exception -> L40
            L17:
                xb.a r2 = r1.f183d     // Catch: java.lang.Exception -> L40
                if (r2 == 0) goto L20
                java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L40
                r1.f183d = r0     // Catch: java.lang.Exception -> L40
            L20:
                android.hardware.Camera r2 = r1.f180a     // Catch: java.lang.Exception -> L40
                if (r2 == 0) goto L32
                boolean r3 = r1.f184e     // Catch: java.lang.Exception -> L40
                if (r3 == 0) goto L32
                r2.stopPreview()     // Catch: java.lang.Exception -> L40
                ad.e$a r2 = r1.f192m     // Catch: java.lang.Exception -> L40
                r2.f193a = r0     // Catch: java.lang.Exception -> L40
                r2 = 0
                r1.f184e = r2     // Catch: java.lang.Exception -> L40
            L32:
                ad.d r1 = r5.f178Y     // Catch: java.lang.Exception -> L40
                ad.e r1 = r1.f164c     // Catch: java.lang.Exception -> L40
                android.hardware.Camera r2 = r1.f180a     // Catch: java.lang.Exception -> L40
                if (r2 == 0) goto L4a
                r2.release()     // Catch: java.lang.Exception -> L40
                r1.f180a = r0     // Catch: java.lang.Exception -> L40
                goto L4a
            L40:
                r1 = move-exception
                int r2 = ad.C0061d.f161n
                java.lang.String r2 = "d"
                java.lang.String r3 = "Failed to close camera"
                android.util.Log.e(r2, r3, r1)
            L4a:
                ad.d r1 = r5.f178Y
                r2 = 1
                r1.f168g = r2
                android.os.Handler r1 = r1.f165d
                r2 = 2131362784(0x7f0a03e0, float:1.8345358E38)
                r1.sendEmptyMessage(r2)
                ad.d r1 = r5.f178Y
                ad.g r1 = r1.f162a
                java.lang.Object r2 = r1.f201d
                monitor-enter(r2)
                int r3 = r1.f200c     // Catch: java.lang.Throwable -> L79
                int r3 = r3 + (-1)
                r1.f200c = r3     // Catch: java.lang.Throwable -> L79
                if (r3 != 0) goto L77
                java.lang.Object r3 = r1.f201d     // Catch: java.lang.Throwable -> L79
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L79
                android.os.HandlerThread r4 = r1.f199b     // Catch: java.lang.Throwable -> L74
                r4.quit()     // Catch: java.lang.Throwable -> L74
                r1.f199b = r0     // Catch: java.lang.Throwable -> L74
                r1.f198a = r0     // Catch: java.lang.Throwable -> L74
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
                goto L77
            L74:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
                throw r0     // Catch: java.lang.Throwable -> L79
            L77:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
                return
            L79:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
                throw r0
        }
    }

    public C0061d(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f167f = r0
            r0 = 1
            r1.f168g = r0
            ad.f r0 = new ad.f
            r0.<init>()
            r1.f170i = r0
            ad.d$a r0 = new ad.d$a
            r0.<init>(r1)
            r1.f171j = r0
            ad.d$b r0 = new ad.d$b
            r0.<init>(r1)
            r1.f172k = r0
            ad.d$c r0 = new ad.d$c
            r0.<init>(r1)
            r1.f173l = r0
            ad.d$d r0 = new ad.d$d
            r0.<init>(r1)
            r1.f174m = r0
            p185k7.C3828h5.m8580I()
            ad.g r0 = ad.C0064g.f197e
            if (r0 != 0) goto L3a
            ad.g r0 = new ad.g
            r0.<init>()
            ad.C0064g.f197e = r0
        L3a:
            ad.g r0 = ad.C0064g.f197e
            r1.f162a = r0
            ad.e r0 = new ad.e
            r0.<init>(r2)
            r1.f164c = r0
            ad.f r2 = r1.f170i
            r0.f186g = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.f169h = r2
            return
    }

    /* renamed from: a */
    public static void m94a(ad.C0061d r1, java.lang.Exception r2) {
            android.os.Handler r1 = r1.f165d
            if (r1 == 0) goto Le
            r0 = 2131362785(0x7f0a03e1, float:1.834536E38)
            android.os.Message r1 = r1.obtainMessage(r0, r2)
            r1.sendToTarget()
        Le:
            return
    }
}
