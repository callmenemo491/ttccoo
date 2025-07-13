package p154ii;

/* renamed from: ii.k */
/* loaded from: classes.dex */
public final class C3184k extends p080ei.AbstractC1853a {

    /* renamed from: e */
    public final /* synthetic */ p154ii.C3179f f12788e;

    /* renamed from: f */
    public final /* synthetic */ int f12789f;

    /* renamed from: g */
    public final /* synthetic */ p154ii.EnumC3175b f12790g;

    public C3184k(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p154ii.C3179f r5, int r6, p154ii.EnumC3175b r7) {
            r0 = this;
            r0.f12788e = r5
            r0.f12789f = r6
            r0.f12790g = r7
            r0.<init>(r3, r4)
            return
    }

    @Override // p080ei.AbstractC1853a
    /* renamed from: a */
    public long mo4598a() {
            r3 = this;
            ii.f r0 = r3.f12788e
            ii.s r0 = r0.f12728j0
            int r1 = r3.f12789f
            ii.b r2 = r3.f12790g
            r0.mo7682d(r1, r2)
            ii.f r0 = r3.f12788e
            monitor-enter(r0)
            ii.f r1 = r3.f12788e     // Catch: java.lang.Throwable -> L1f
            java.util.Set<java.lang.Integer> r1 = r1.f12744z0     // Catch: java.lang.Throwable -> L1f
            int r2 = r3.f12789f     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r1.remove(r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            r0 = -1
            return r0
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
