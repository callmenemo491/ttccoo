package p154ii;

/* renamed from: ii.i */
/* loaded from: classes.dex */
public final class C3182i extends p080ei.AbstractC1853a {

    /* renamed from: e */
    public final /* synthetic */ p154ii.C3179f f12781e;

    /* renamed from: f */
    public final /* synthetic */ int f12782f;

    /* renamed from: g */
    public final /* synthetic */ java.util.List f12783g;

    /* renamed from: h */
    public final /* synthetic */ boolean f12784h;

    public C3182i(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p154ii.C3179f r5, int r6, java.util.List r7, boolean r8) {
            r0 = this;
            r0.f12781e = r5
            r0.f12782f = r6
            r0.f12783g = r7
            r0.f12784h = r8
            r0.<init>(r3, r4)
            return
    }

    @Override // p080ei.AbstractC1853a
    /* renamed from: a */
    public long mo4598a() {
            r4 = this;
            ii.f r0 = r4.f12781e
            ii.s r0 = r0.f12728j0
            int r1 = r4.f12782f
            java.util.List r2 = r4.f12783g
            boolean r3 = r4.f12784h
            boolean r0 = r0.mo7680b(r1, r2, r3)
            if (r0 == 0) goto L1b
            ii.f r1 = r4.f12781e     // Catch: java.io.IOException -> L36
            ii.p r1 = r1.f12742x0     // Catch: java.io.IOException -> L36
            int r2 = r4.f12782f     // Catch: java.io.IOException -> L36
            ii.b r3 = p154ii.EnumC3175b.f12678e0     // Catch: java.io.IOException -> L36
            r1.m7670L(r2, r3)     // Catch: java.io.IOException -> L36
        L1b:
            if (r0 != 0) goto L21
            boolean r0 = r4.f12784h     // Catch: java.io.IOException -> L36
            if (r0 == 0) goto L36
        L21:
            ii.f r0 = r4.f12781e     // Catch: java.io.IOException -> L36
            monitor-enter(r0)     // Catch: java.io.IOException -> L36
            ii.f r1 = r4.f12781e     // Catch: java.lang.Throwable -> L33
            java.util.Set<java.lang.Integer> r1 = r1.f12744z0     // Catch: java.lang.Throwable -> L33
            int r2 = r4.f12782f     // Catch: java.lang.Throwable -> L33
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            r1.remove(r2)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.io.IOException -> L36
            goto L36
        L33:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L36
            throw r1     // Catch: java.io.IOException -> L36
        L36:
            r0 = -1
            return r0
    }
}
