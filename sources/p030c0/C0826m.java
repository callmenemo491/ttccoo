package p030c0;

/* renamed from: c0.m */
/* loaded from: classes.dex */
public class C0826m {

    /* renamed from: a */
    public android.content.Context f4461a;

    /* renamed from: b */
    public java.util.ArrayList<p030c0.C0823j> f4462b;

    /* renamed from: c */
    public java.util.ArrayList<p030c0.C0831r> f4463c;

    /* renamed from: d */
    public java.util.ArrayList<p030c0.C0823j> f4464d;

    /* renamed from: e */
    public java.lang.CharSequence f4465e;

    /* renamed from: f */
    public java.lang.CharSequence f4466f;

    /* renamed from: g */
    public android.app.PendingIntent f4467g;

    /* renamed from: h */
    public android.graphics.Bitmap f4468h;

    /* renamed from: i */
    public int f4469i;

    /* renamed from: j */
    public int f4470j;

    /* renamed from: k */
    public boolean f4471k;

    /* renamed from: l */
    public boolean f4472l;

    /* renamed from: m */
    public p030c0.AbstractC0827n f4473m;

    /* renamed from: n */
    public java.lang.CharSequence f4474n;

    /* renamed from: o */
    public java.lang.String f4475o;

    /* renamed from: p */
    public boolean f4476p;

    /* renamed from: q */
    public boolean f4477q;

    /* renamed from: r */
    public boolean f4478r;

    /* renamed from: s */
    public android.os.Bundle f4479s;

    /* renamed from: t */
    public int f4480t;

    /* renamed from: u */
    public int f4481u;

    /* renamed from: v */
    public java.lang.String f4482v;

    /* renamed from: w */
    public int f4483w;

    /* renamed from: x */
    public boolean f4484x;

    /* renamed from: y */
    public android.app.Notification f4485y;

    /* renamed from: z */
    @java.lang.Deprecated
    public java.util.ArrayList<java.lang.String> f4486z;

    public C0826m(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f4462b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f4463c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f4464d = r0
            r0 = 1
            r3.f4471k = r0
            r1 = 0
            r3.f4476p = r1
            r3.f4480t = r1
            r3.f4481u = r1
            r3.f4483w = r1
            android.app.Notification r2 = new android.app.Notification
            r2.<init>()
            r3.f4485y = r2
            r3.f4461a = r4
            r3.f4482v = r5
            long r4 = java.lang.System.currentTimeMillis()
            r2.when = r4
            android.app.Notification r4 = r3.f4485y
            r5 = -1
            r4.audioStreamType = r5
            r3.f4470j = r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f4486z = r4
            r3.f4484x = r0
            return
    }

    /* renamed from: b */
    public static java.lang.CharSequence m2482b(java.lang.CharSequence r2) {
            if (r2 != 0) goto L3
            return r2
        L3:
            int r0 = r2.length()
            r1 = 5120(0x1400, float:7.175E-42)
            if (r0 <= r1) goto L10
            r0 = 0
            java.lang.CharSequence r2 = r2.subSequence(r0, r1)
        L10:
            return r2
    }

    /* renamed from: a */
    public android.app.Notification m2483a() {
            r5 = this;
            c0.o r0 = new c0.o
            r0.<init>(r5)
            c0.m r1 = r0.f4490c
            c0.n r1 = r1.f4473m
            if (r1 == 0) goto Le
            r1.mo2475b(r0)
        Le:
            if (r1 == 0) goto L15
            android.widget.RemoteViews r2 = r1.mo2490e(r0)
            goto L16
        L15:
            r2 = 0
        L16:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L1d
            goto L29
        L1d:
            r4 = 24
            if (r3 < r4) goto L22
            goto L29
        L22:
            android.app.Notification$Builder r3 = r0.f4489b
            android.os.Bundle r4 = r0.f4492e
            r3.setExtras(r4)
        L29:
            android.app.Notification$Builder r3 = r0.f4489b
            android.app.Notification r3 = r3.build()
            if (r2 == 0) goto L34
            r3.contentView = r2
            goto L39
        L34:
            c0.m r2 = r0.f4490c
            java.util.Objects.requireNonNull(r2)
        L39:
            if (r1 == 0) goto L43
            android.widget.RemoteViews r2 = r1.mo2489d(r0)
            if (r2 == 0) goto L43
            r3.bigContentView = r2
        L43:
            if (r1 == 0) goto L4c
            c0.m r0 = r0.f4490c
            c0.n r0 = r0.f4473m
            java.util.Objects.requireNonNull(r0)
        L4c:
            if (r1 == 0) goto L55
            android.os.Bundle r0 = r3.extras
            if (r0 == 0) goto L55
            r1.mo2481a(r0)
        L55:
            return r3
    }

    /* renamed from: c */
    public p030c0.C0826m m2484c(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = m2482b(r1)
            r0.f4466f = r1
            return r0
    }

    /* renamed from: d */
    public p030c0.C0826m m2485d(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.CharSequence r1 = m2482b(r1)
            r0.f4465e = r1
            return r0
    }

    /* renamed from: e */
    public final void m2486e(int r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L8
            android.app.Notification r3 = r1.f4485y
            int r0 = r3.flags
            r2 = r2 | r0
            goto Le
        L8:
            android.app.Notification r3 = r1.f4485y
            int r0 = r3.flags
            int r2 = ~r2
            r2 = r2 & r0
        Le:
            r3.flags = r2
            return
    }

    /* renamed from: f */
    public p030c0.C0826m m2487f(android.graphics.Bitmap r10) {
            r9 = this;
            if (r10 == 0) goto L61
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L9
            goto L61
        L9:
            android.content.Context r0 = r9.f4461a
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165316(0x7f070084, float:1.7944846E38)
            int r1 = r0.getDimensionPixelSize(r1)
            r2 = 2131165315(0x7f070083, float:1.7944844E38)
            int r0 = r0.getDimensionPixelSize(r2)
            int r2 = r10.getWidth()
            if (r2 > r1) goto L2a
            int r2 = r10.getHeight()
            if (r2 > r0) goto L2a
            goto L61
        L2a:
            double r1 = (double) r1
            int r3 = r10.getWidth()
            r4 = 1
            int r3 = java.lang.Math.max(r4, r3)
            double r5 = (double) r3
            double r1 = r1 / r5
            double r5 = (double) r0
            int r0 = r10.getHeight()
            int r0 = java.lang.Math.max(r4, r0)
            double r7 = (double) r0
            double r5 = r5 / r7
            double r0 = java.lang.Math.min(r1, r5)
            int r2 = r10.getWidth()
            double r2 = (double) r2
            double r2 = r2 * r0
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            int r3 = r10.getHeight()
            double r5 = (double) r3
            double r5 = r5 * r0
            double r0 = java.lang.Math.ceil(r5)
            int r0 = (int) r0
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r10, r2, r0, r4)
        L61:
            r9.f4468h = r10
            return r9
    }

    /* renamed from: g */
    public p030c0.C0826m m2488g(android.net.Uri r3) {
            r2 = this;
            android.app.Notification r0 = r2.f4485y
            r0.sound = r3
            r3 = -1
            r0.audioStreamType = r3
            android.media.AudioAttributes$Builder r3 = new android.media.AudioAttributes$Builder
            r3.<init>()
            r1 = 4
            android.media.AudioAttributes$Builder r3 = r3.setContentType(r1)
            r1 = 5
            android.media.AudioAttributes$Builder r3 = r3.setUsage(r1)
            android.media.AudioAttributes r3 = r3.build()
            r0.audioAttributes = r3
            return r2
    }
}
