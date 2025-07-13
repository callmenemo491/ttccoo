package p178k0;

/* renamed from: k0.f */
/* loaded from: classes.dex */
public class CallableC3630f implements java.util.concurrent.Callable<p178k0.C3634j.a> {

    /* renamed from: a */
    public final /* synthetic */ java.lang.String f16016a;

    /* renamed from: b */
    public final /* synthetic */ android.content.Context f16017b;

    /* renamed from: c */
    public final /* synthetic */ p178k0.C3629e f16018c;

    /* renamed from: d */
    public final /* synthetic */ int f16019d;

    public CallableC3630f(java.lang.String r1, android.content.Context r2, p178k0.C3629e r3, int r4) {
            r0 = this;
            r0.f16016a = r1
            r0.f16017b = r2
            r0.f16018c = r3
            r0.f16019d = r4
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public p178k0.C3634j.a call() {
            r4 = this;
            java.lang.String r0 = r4.f16016a
            android.content.Context r1 = r4.f16017b
            k0.e r2 = r4.f16018c
            int r3 = r4.f16019d
            k0.j$a r0 = p178k0.C3634j.m8075a(r0, r1, r2, r3)
            return r0
    }
}
