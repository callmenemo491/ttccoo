package p184k6;

/* renamed from: k6.b0 */
/* loaded from: classes.dex */
public final class C3699b0 extends p184k6.C3697a0 {

    /* renamed from: e */
    public final java.util.concurrent.Callable<java.lang.String> f16397e;

    public C3699b0(java.util.concurrent.Callable r2, p052d6.C1310h0 r3) {
            r1 = this;
            r3 = 0
            r0 = 0
            r1.<init>(r3, r0, r0)
            r1.f16397e = r2
            return
    }

    @Override // p184k6.C3697a0
    /* renamed from: c */
    public final java.lang.String mo8159c() {
            r2 = this;
            java.util.concurrent.Callable<java.lang.String> r0 = r2.f16397e     // Catch: java.lang.Exception -> L9
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
