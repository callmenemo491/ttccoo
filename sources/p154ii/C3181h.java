package p154ii;

/* renamed from: ii.h */
/* loaded from: classes.dex */
public final class C3181h extends p080ei.AbstractC1853a {

    /* renamed from: e */
    public final /* synthetic */ p154ii.C3179f f12776e;

    /* renamed from: f */
    public final /* synthetic */ int f12777f;

    /* renamed from: g */
    public final /* synthetic */ p260oi.C5283e f12778g;

    /* renamed from: h */
    public final /* synthetic */ int f12779h;

    /* renamed from: i */
    public final /* synthetic */ boolean f12780i;

    public C3181h(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p154ii.C3179f r5, int r6, p260oi.C5283e r7, int r8, boolean r9) {
            r0 = this;
            r0.f12776e = r5
            r0.f12777f = r6
            r0.f12778g = r7
            r0.f12779h = r8
            r0.f12780i = r9
            r0.<init>(r3, r4)
            return
    }

    @Override // p080ei.AbstractC1853a
    /* renamed from: a */
    public long mo4598a() {
            r5 = this;
            ii.f r0 = r5.f12776e     // Catch: java.io.IOException -> L38
            ii.s r0 = r0.f12728j0     // Catch: java.io.IOException -> L38
            int r1 = r5.f12777f     // Catch: java.io.IOException -> L38
            oi.e r2 = r5.f12778g     // Catch: java.io.IOException -> L38
            int r3 = r5.f12779h     // Catch: java.io.IOException -> L38
            boolean r4 = r5.f12780i     // Catch: java.io.IOException -> L38
            boolean r0 = r0.mo7681c(r1, r2, r3, r4)     // Catch: java.io.IOException -> L38
            if (r0 == 0) goto L1d
            ii.f r1 = r5.f12776e     // Catch: java.io.IOException -> L38
            ii.p r1 = r1.f12742x0     // Catch: java.io.IOException -> L38
            int r2 = r5.f12777f     // Catch: java.io.IOException -> L38
            ii.b r3 = p154ii.EnumC3175b.f12678e0     // Catch: java.io.IOException -> L38
            r1.m7670L(r2, r3)     // Catch: java.io.IOException -> L38
        L1d:
            if (r0 != 0) goto L23
            boolean r0 = r5.f12780i     // Catch: java.io.IOException -> L38
            if (r0 == 0) goto L38
        L23:
            ii.f r0 = r5.f12776e     // Catch: java.io.IOException -> L38
            monitor-enter(r0)     // Catch: java.io.IOException -> L38
            ii.f r1 = r5.f12776e     // Catch: java.lang.Throwable -> L35
            java.util.Set<java.lang.Integer> r1 = r1.f12744z0     // Catch: java.lang.Throwable -> L35
            int r2 = r5.f12777f     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L35
            r1.remove(r2)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.io.IOException -> L38
            goto L38
        L35:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L38
            throw r1     // Catch: java.io.IOException -> L38
        L38:
            r0 = -1
            return r0
    }
}
