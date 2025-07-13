package p031c1;

/* renamed from: c1.i */
/* loaded from: classes.dex */
public class RunnableC0841i implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.l f4574Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f4575Z;

    /* renamed from: a0 */
    public final /* synthetic */ android.os.IBinder f4576a0;

    /* renamed from: b0 */
    public final /* synthetic */ android.os.Bundle f4577b0;

    /* renamed from: c0 */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.k f4578c0;

    public RunnableC0841i(p031c1.AbstractServiceC0833a.k r1, p031c1.AbstractServiceC0833a.l r2, java.lang.String r3, android.os.IBinder r4, android.os.Bundle r5) {
            r0 = this;
            r0.f4578c0 = r1
            r0.f4574Y = r2
            r0.f4575Z = r3
            r0.f4576a0 = r4
            r0.f4577b0 = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r9 = this;
            c1.a$l r0 = r9.f4574Y
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
            android.os.IBinder r0 = r0.m2512a()
            c1.a$k r1 = r9.f4578c0
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            java.lang.Object r0 = r1.get(r0)
            c1.a$c r0 = (p031c1.AbstractServiceC0833a.c) r0
            if (r0 != 0) goto L2b
            java.lang.String r0 = "addSubscription for callback that isn't registered id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r9.f4575Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MBServiceCompat"
            android.util.Log.w(r1, r0)
            return
        L2b:
            c1.a$k r1 = r9.f4578c0
            c1.a r1 = r1.f4553a
            java.lang.String r2 = r9.f4575Z
            android.os.IBinder r3 = r9.f4576a0
            android.os.Bundle r4 = r9.f4577b0
            java.util.Objects.requireNonNull(r1)
            java.util.HashMap<java.lang.String, java.util.List<m0.b<android.os.IBinder, android.os.Bundle>>> r5 = r0.f4534e
            java.lang.Object r5 = r5.get(r2)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L47
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L47:
            java.util.Iterator r6 = r5.iterator()
        L4b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L66
            java.lang.Object r7 = r6.next()
            m0.b r7 = (p212m0.C4312b) r7
            F r8 = r7.f17582a
            if (r3 != r8) goto L4b
            S r7 = r7.f17583b
            android.os.Bundle r7 = (android.os.Bundle) r7
            boolean r7 = p064e.C1492f.m4041a(r4, r7)
            if (r7 == 0) goto L4b
            goto L77
        L66:
            m0.b r6 = new m0.b
            r6.<init>(r3, r4)
            r5.add(r6)
            java.util.HashMap<java.lang.String, java.util.List<m0.b<android.os.IBinder, android.os.Bundle>>> r3 = r0.f4534e
            r3.put(r2, r5)
            r3 = 0
            r1.m2504d(r2, r0, r4, r3)
        L77:
            return
    }
}
