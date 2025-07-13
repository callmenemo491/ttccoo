package p072e7;

/* renamed from: e7.s4 */
/* loaded from: classes.dex */
public final class C1737s4 extends p072e7.AbstractC1677m4 {
    public /* synthetic */ C1737s4() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: a */
    public final void mo4335a(p072e7.C1764v4 r1, p072e7.C1764v4 r2) {
            r0 = this;
            r1.f7814b = r2
            return
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: b */
    public final void mo4336b(p072e7.C1764v4 r1, java.lang.Thread r2) {
            r0 = this;
            r1.f7813a = r2
            return
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: c */
    public final boolean mo4337c(p072e7.AbstractC1773w4<?> r2, p072e7.C1707p4 r3, p072e7.C1707p4 r4) {
            r1 = this;
            monitor-enter(r2)
            e7.p4 r0 = r2.f7833Z     // Catch: java.lang.Throwable -> Ld
            if (r0 != r3) goto La
            r2.f7833Z = r4     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r2 = 1
            return r2
        La:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            return r2
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: d */
    public final boolean mo4338d(p072e7.AbstractC1773w4<?> r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.f7832Y     // Catch: java.lang.Throwable -> Ld
            if (r0 != r3) goto La
            r2.f7832Y = r4     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r2 = 1
            return r2
        La:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            return r2
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: e */
    public final boolean mo4339e(p072e7.AbstractC1773w4<?> r2, p072e7.C1764v4 r3, p072e7.C1764v4 r4) {
            r1 = this;
            monitor-enter(r2)
            e7.v4 r0 = r2.f7834a0     // Catch: java.lang.Throwable -> Ld
            if (r0 != r3) goto La
            r2.f7834a0 = r4     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r2 = 1
            return r2
        La:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            return r2
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }
}
