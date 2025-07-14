package p234n7;

/* renamed from: n7.a */
/* loaded from: classes.dex */
public class C4693a {

    /* renamed from: a */
    public final p185k7.C3918o1 f18720a;

    /* renamed from: n7.a$a */
    public interface a extends p249o7.InterfaceC5090r4 {
    }

    public C4693a(p185k7.C3918o1 r1) {
            r0 = this;
            r0.<init>()
            r0.f18720a = r1
            return
    }

    /* renamed from: a */
    public void m10736a(p234n7.C4693a.a r6) {
            r5 = this;
            k7.o1 r0 = r5.f18720a
            java.util.Objects.requireNonNull(r0)
            java.util.List<android.util.Pair<o7.r4, k7.k1>> r1 = r0.f16793c
            monitor-enter(r1)
            r2 = 0
        L9:
            java.util.List<android.util.Pair<o7.r4, k7.k1>> r3 = r0.f16793c     // Catch: java.lang.Throwable -> L59
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L59
            if (r2 >= r3) goto L2d
            java.util.List<android.util.Pair<o7.r4, k7.k1>> r3 = r0.f16793c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L59
            android.util.Pair r3 = (android.util.Pair) r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = r3.first     // Catch: java.lang.Throwable -> L59
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L2a
            java.lang.String r6 = "FA"
            java.lang.String r0 = "OnEventListener already registered."
            android.util.Log.w(r6, r0)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            goto L58
        L2a:
            int r2 = r2 + 1
            goto L9
        L2d:
            k7.k1 r2 = new k7.k1     // Catch: java.lang.Throwable -> L59
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L59
            java.util.List<android.util.Pair<o7.r4, k7.k1>> r3 = r0.f16793c     // Catch: java.lang.Throwable -> L59
            android.util.Pair r4 = new android.util.Pair     // Catch: java.lang.Throwable -> L59
            r4.<init>(r6, r2)     // Catch: java.lang.Throwable -> L59
            r3.add(r4)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            k7.o0 r6 = r0.f16796f
            if (r6 == 0) goto L4e
            k7.o0 r6 = r0.f16796f     // Catch: java.lang.Throwable -> L47
            r6.mo3127x37dae114(r2)     // Catch: java.lang.Throwable -> L47
            goto L58
        L47:
            java.lang.String r6 = "FA"
            java.lang.String r1 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r6, r1)
        L4e:
            k7.z0 r6 = new k7.z0
            r6.<init>(r0, r2)
            java.util.concurrent.ExecutorService r0 = r0.f16791a
            r0.execute(r6)
        L58:
            return
        L59:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            throw r6
    }
}
