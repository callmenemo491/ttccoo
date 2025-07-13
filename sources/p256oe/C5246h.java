package p256oe;

/* renamed from: oe.h */
/* loaded from: classes.dex */
public final class C5246h extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f20375c;

    /* renamed from: d */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f20376d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f20377e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f20378f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<me.C4595c> f20379g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<me.C4595c> f20380h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.String> f20381i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<java.lang.String> f20382j;

    /* renamed from: k */
    public final androidx.lifecycle.LiveData<java.lang.String> f20383k;

    /* renamed from: l */
    public final androidx.lifecycle.LiveData<java.lang.String> f20384l;

    /* renamed from: m */
    public me.C4595c f20385m;

    public C5246h(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r2 = "eosManager"
            p214m2.C4339q.m9706k(r3, r2)
            r1.<init>()
            r1.f20375c = r3
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f20376d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f20377e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f20378f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f20379g = r2
            r1.f20380h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            java.lang.String r3 = ""
            r2.<init>(r3)
            r1.f20381i = r2
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            java.lang.String r0 = "0%"
            r3.<init>(r0)
            r1.f20382j = r3
            oe.f r3 = new oe.f
            r0 = 0
            r3.<init>(r1, r0)
            androidx.lifecycle.LiveData r3 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f20383k = r3
            oe.f r3 = new oe.f
            r0 = 1
            r3.<init>(r1, r0)
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f20384l = r2
            return
    }

    /* renamed from: d */
    public final me.C4595c m11511d() {
            r1 = this;
            me.c r0 = r1.f20385m
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "poolDataWithMy"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }
}
