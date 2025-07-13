package p031c1;

/* renamed from: c1.e */
/* loaded from: classes.dex */
public class RunnableC0837e implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ java.lang.String f4560Y;

    /* renamed from: Z */
    public final /* synthetic */ android.os.Bundle f4561Z;

    /* renamed from: a0 */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.e f4562a0;

    public RunnableC0837e(p031c1.AbstractServiceC0833a.e r1, java.lang.String r2, android.os.Bundle r3) {
            r0 = this;
            r0.f4562a0 = r1
            r0.f4560Y = r2
            r0.f4561Z = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r8 = this;
            c1.a$e r0 = r8.f4562a0
            c1.a r0 = r0.f4541d
            s.a<android.os.IBinder, c1.a$c> r0 = r0.f4520b0
            java.util.Set r0 = r0.keySet()
            s.g$c r0 = (p319s.AbstractC5940g.c) r0
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            android.os.IBinder r1 = (android.os.IBinder) r1
            c1.a$e r2 = r8.f4562a0
            c1.a r2 = r2.f4541d
            s.a<android.os.IBinder, c1.a$c> r2 = r2.f4520b0
            java.lang.Object r1 = r2.get(r1)
            c1.a$c r1 = (p031c1.AbstractServiceC0833a.c) r1
            c1.a$e r2 = r8.f4562a0
            java.lang.String r3 = r8.f4560Y
            android.os.Bundle r4 = r8.f4561Z
            java.util.Objects.requireNonNull(r2)
            java.util.HashMap<java.lang.String, java.util.List<m0.b<android.os.IBinder, android.os.Bundle>>> r5 = r1.f4534e
            java.lang.Object r5 = r5.get(r3)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L10
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L10
            java.lang.Object r6 = r5.next()
            m0.b r6 = (p212m0.C4312b) r6
            S r7 = r6.f17583b
            android.os.Bundle r7 = (android.os.Bundle) r7
            boolean r7 = p064e.C1492f.m4044d(r4, r7)
            if (r7 == 0) goto L3f
            c1.a r7 = r2.f4541d
            S r6 = r6.f17583b
            android.os.Bundle r6 = (android.os.Bundle) r6
            r7.m2504d(r3, r1, r6, r4)
            goto L3f
        L5f:
            return
    }
}
