package p154ii;

/* renamed from: ii.j */
/* loaded from: classes.dex */
public final class C3183j extends p080ei.AbstractC1853a {

    /* renamed from: e */
    public final /* synthetic */ p154ii.C3179f f12785e;

    /* renamed from: f */
    public final /* synthetic */ int f12786f;

    /* renamed from: g */
    public final /* synthetic */ java.util.List f12787g;

    public C3183j(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p154ii.C3179f r5, int r6, java.util.List r7) {
            r0 = this;
            r0.f12785e = r5
            r0.f12786f = r6
            r0.f12787g = r7
            r0.<init>(r3, r4)
            return
    }

    @Override // p080ei.AbstractC1853a
    /* renamed from: a */
    public long mo4598a() {
            r3 = this;
            ii.f r0 = r3.f12785e
            ii.s r0 = r0.f12728j0
            int r1 = r3.f12786f
            java.util.List r2 = r3.f12787g
            boolean r0 = r0.mo7679a(r1, r2)
            if (r0 == 0) goto L2e
            ii.f r0 = r3.f12785e     // Catch: java.io.IOException -> L2e
            ii.p r0 = r0.f12742x0     // Catch: java.io.IOException -> L2e
            int r1 = r3.f12786f     // Catch: java.io.IOException -> L2e
            ii.b r2 = p154ii.EnumC3175b.f12678e0     // Catch: java.io.IOException -> L2e
            r0.m7670L(r1, r2)     // Catch: java.io.IOException -> L2e
            ii.f r0 = r3.f12785e     // Catch: java.io.IOException -> L2e
            monitor-enter(r0)     // Catch: java.io.IOException -> L2e
            ii.f r1 = r3.f12785e     // Catch: java.lang.Throwable -> L2b
            java.util.Set<java.lang.Integer> r1 = r1.f12744z0     // Catch: java.lang.Throwable -> L2b
            int r2 = r3.f12786f     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2b
            r1.remove(r2)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.io.IOException -> L2e
            goto L2e
        L2b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L2e
            throw r1     // Catch: java.io.IOException -> L2e
        L2e:
            r0 = -1
            return r0
    }
}
