package p437yf;

/* renamed from: yf.f */
/* loaded from: classes.dex */
public final class C7202f extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f27734c;

    /* renamed from: d */
    public final io.tacocrypto.app.database.AppDatabase f27735d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.String>> f27736e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f27737f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f27738g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f27739h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.String> f27740i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<java.lang.String> f27741j;

    /* renamed from: k */
    public java.lang.String f27742k;

    public C7202f(android.app.Application r2, p238nd.C4728b0 r3, io.tacocrypto.app.database.AppDatabase r4) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r2 = "eosManager"
            p214m2.C4339q.m9706k(r3, r2)
            java.lang.String r2 = "appDatabase"
            p214m2.C4339q.m9706k(r4, r2)
            r1.<init>()
            r1.f27734c = r3
            r1.f27735d = r4
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f27736e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f27737f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f27738g = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f27739h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f27740i = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f27741j = r2
            return
    }

    /* renamed from: d */
    public final void m14283d(java.lang.String r4) {
            r3 = this;
            androidx.lifecycle.d0<java.lang.String> r0 = r3.f27740i
            r0.mo7l(r4)
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            f1.f r0 = new f1.f
            r0.<init>(r3)
            r1 = 200(0xc8, double:9.9E-322)
            r4.postDelayed(r0, r1)
            return
    }
}
