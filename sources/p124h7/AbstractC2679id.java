package p124h7;

/* renamed from: h7.id */
/* loaded from: classes.dex */
public abstract class AbstractC2679id<ResultT, CallbackT> implements p124h7.InterfaceC2677ib<p124h7.InterfaceC2642gc, ResultT> {

    /* renamed from: a */
    public final int f11628a;

    /* renamed from: b */
    public final p124h7.BinderC2643gd f11629b;

    /* renamed from: c */
    public p251o9.C5180d f11630c;

    /* renamed from: d */
    public p375v9.AbstractC6614o f11631d;

    /* renamed from: e */
    public CallbackT f11632e;

    /* renamed from: f */
    public p411x9.InterfaceC6991j f11633f;

    /* renamed from: g */
    public final java.util.List<java.lang.Object> f11634g;

    /* renamed from: h */
    public p124h7.C2752me f11635h;

    /* renamed from: i */
    public p124h7.C2644ge f11636i;

    /* renamed from: j */
    public p375v9.AbstractC6590c f11637j;

    /* renamed from: k */
    public p124h7.C2964ya f11638k;

    /* renamed from: l */
    public boolean f11639l;

    /* renamed from: m */
    public p124h7.C2661hd f11640m;

    public AbstractC2679id(int r2) {
            r1 = this;
            r1.<init>()
            h7.gd r0 = new h7.gd
            r0.<init>(r1)
            r1.f11629b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11634g = r0
            r1.f11628a = r2
            return
    }

    /* renamed from: h */
    public static /* synthetic */ void m6830h(p124h7.AbstractC2679id r1) {
            r1.mo6467c()
            boolean r1 = r1.f11639l
            java.lang.String r0 = "no success or failure set on method implementation"
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r0)
            return
    }

    /* renamed from: c */
    public abstract void mo6467c();

    /* renamed from: d */
    public final p124h7.AbstractC2679id<ResultT, CallbackT> m6831d(CallbackT r2) {
            r1 = this;
            java.lang.String r0 = "external callback cannot be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r0)
            r1.f11632e = r2
            return r1
    }

    /* renamed from: e */
    public final p124h7.AbstractC2679id<ResultT, CallbackT> m6832e(p411x9.InterfaceC6991j r1) {
            r0 = this;
            r0.f11633f = r1
            return r0
    }

    /* renamed from: f */
    public final p124h7.AbstractC2679id<ResultT, CallbackT> m6833f(p251o9.C5180d r2) {
            r1 = this;
            java.lang.String r0 = "firebaseApp cannot be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r0)
            o9.d r2 = (p251o9.C5180d) r2
            r1.f11630c = r2
            return r1
    }

    /* renamed from: g */
    public final p124h7.AbstractC2679id<ResultT, CallbackT> m6834g(p375v9.AbstractC6614o r2) {
            r1 = this;
            java.lang.String r0 = "firebaseUser cannot be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r0)
            v9.o r2 = (p375v9.AbstractC6614o) r2
            r1.f11631d = r2
            return r1
    }
}
