package ai;

/* renamed from: ai.k */
/* loaded from: classes.dex */
public final class C0111k extends ai.AbstractRunnableC0109i {

    /* renamed from: a0 */
    public final java.lang.Runnable f371a0;

    public C0111k(java.lang.Runnable r1, long r2, ai.InterfaceC0110j r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.f371a0 = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.Runnable r0 = r2.f371a0     // Catch: java.lang.Throwable -> Lb
            r0.run()     // Catch: java.lang.Throwable -> Lb
            ai.j r0 = r2.f370Z
            r0.mo157l()
            return
        Lb:
            r0 = move-exception
            ai.j r1 = r2.f370Z
            r1.mo157l()
            throw r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "Task["
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Runnable r1 = r4.f371a0
            java.lang.String r1 = gh.C2390b.m6120j(r1)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.Runnable r1 = r4.f371a0
            java.lang.String r1 = gh.C2390b.m6121k(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.f369Y
            r0.append(r2)
            r0.append(r1)
            ai.j r1 = r4.f370Z
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
