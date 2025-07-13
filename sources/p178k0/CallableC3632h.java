package p178k0;

/* renamed from: k0.h */
/* loaded from: classes.dex */
public class CallableC3632h implements java.util.concurrent.Callable<p178k0.C3634j.a> {

    /* renamed from: a */
    public final /* synthetic */ java.lang.String f16021a;

    /* renamed from: b */
    public final /* synthetic */ android.content.Context f16022b;

    /* renamed from: c */
    public final /* synthetic */ p178k0.C3629e f16023c;

    /* renamed from: d */
    public final /* synthetic */ int f16024d;

    public CallableC3632h(java.lang.String r1, android.content.Context r2, p178k0.C3629e r3, int r4) {
            r0 = this;
            r0.f16021a = r1
            r0.f16022b = r2
            r0.f16023c = r3
            r0.f16024d = r4
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public p178k0.C3634j.a call() {
            r4 = this;
            java.lang.String r0 = r4.f16021a     // Catch: java.lang.Throwable -> Ld
            android.content.Context r1 = r4.f16022b     // Catch: java.lang.Throwable -> Ld
            k0.e r2 = r4.f16023c     // Catch: java.lang.Throwable -> Ld
            int r3 = r4.f16024d     // Catch: java.lang.Throwable -> Ld
            k0.j$a r0 = p178k0.C3634j.m8075a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Ld
            goto L13
        Ld:
            k0.j$a r0 = new k0.j$a
            r1 = -3
            r0.<init>(r1)
        L13:
            return r0
    }
}
