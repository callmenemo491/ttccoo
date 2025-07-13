package p031c1;

/* renamed from: c1.k */
/* loaded from: classes.dex */
public class RunnableC0843k implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.l f4579Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f4580Z;

    /* renamed from: a0 */
    public final /* synthetic */ android.os.IBinder f4581a0;

    /* renamed from: b0 */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.k f4582b0;

    public RunnableC0843k(p031c1.AbstractServiceC0833a.k r1, p031c1.AbstractServiceC0833a.l r2, java.lang.String r3, android.os.IBinder r4) {
            r0 = this;
            r0.f4582b0 = r1
            r0.f4579Y = r2
            r0.f4580Z = r3
            r0.f4581a0 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r8 = this;
            c1.a$l r0 = r8.f4579Y
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
            android.os.IBinder r0 = r0.m2512a()
            c1.a$k r1 = r8.f4582b0
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            java.lang.Object r0 = r1.get(r0)
            c1.a$c r0 = (p031c1.AbstractServiceC0833a.c) r0
            java.lang.String r1 = "MBServiceCompat"
            if (r0 != 0) goto L2b
            java.lang.String r0 = "removeSubscription for callback that isn't registered id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r2 = r8.f4580Z
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            return
        L2b:
            c1.a$k r2 = r8.f4582b0
            c1.a r2 = r2.f4553a
            java.lang.String r3 = r8.f4580Z
            android.os.IBinder r4 = r8.f4581a0
            java.util.Objects.requireNonNull(r2)
            r2 = 0
            if (r4 != 0) goto L43
            java.util.HashMap<java.lang.String, java.util.List<m0.b<android.os.IBinder, android.os.Bundle>>> r0 = r0.f4534e     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L71
            r2 = 1
            goto L71
        L43:
            java.util.HashMap<java.lang.String, java.util.List<m0.b<android.os.IBinder, android.os.Bundle>>> r5 = r0.f4534e     // Catch: java.lang.Throwable -> L81
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L81
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L71
            java.util.Iterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L81
        L51:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r7 == 0) goto L66
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L81
            m0.b r7 = (p212m0.C4312b) r7     // Catch: java.lang.Throwable -> L81
            F r7 = r7.f17582a     // Catch: java.lang.Throwable -> L81
            if (r4 != r7) goto L51
            r6.remove()     // Catch: java.lang.Throwable -> L81
            r2 = 1
            goto L51
        L66:
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L81
            if (r4 != 0) goto L71
            java.util.HashMap<java.lang.String, java.util.List<m0.b<android.os.IBinder, android.os.Bundle>>> r0 = r0.f4534e     // Catch: java.lang.Throwable -> L81
            r0.remove(r3)     // Catch: java.lang.Throwable -> L81
        L71:
            if (r2 != 0) goto L80
            java.lang.String r0 = "removeSubscription called for "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r2 = r8.f4580Z
            java.lang.String r3 = " which is not subscribed"
            p031c1.C0842j.m2517a(r0, r2, r3, r1)
        L80:
            return
        L81:
            r0 = move-exception
            throw r0
    }
}
