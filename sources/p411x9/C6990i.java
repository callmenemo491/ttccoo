package p411x9;

/* renamed from: x9.i */
/* loaded from: classes.dex */
public final class C6990i {

    /* renamed from: f */
    public static final p306r6.C5797a f27280f = null;

    /* renamed from: a */
    public volatile long f27281a;

    /* renamed from: b */
    public volatile long f27282b;

    /* renamed from: c */
    public final long f27283c;

    /* renamed from: d */
    public final android.os.Handler f27284d;

    /* renamed from: e */
    public final java.lang.Runnable f27285e;

    static {
            r6.a r0 = new r6.a
            java.lang.String r1 = "FirebaseAuth:"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r2 = "TokenRefresher"
            r0.<init>(r2, r1)
            p411x9.C6990i.f27280f = r0
            return
    }

    public C6990i(p251o9.C5180d r4) {
            r3 = this;
            r3.<init>()
            r6.a r0 = p411x9.C6990i.f27280f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Initializing TokenRefresher"
            r0.m12163d(r2, r1)
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "TokenRefresher"
            r2 = 10
            r0.<init>(r1, r2)
            r0.start()
            h7.g6 r1 = new h7.g6
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r3.f27284d = r1
            h6.a0 r0 = new h6.a0
            r4.m11497a()
            java.lang.String r4 = r4.f20313b
            r0.<init>(r3, r4)
            r3.f27285e = r0
            r0 = 300000(0x493e0, double:1.482197E-318)
            r3.f27283c = r0
            return
    }
}
