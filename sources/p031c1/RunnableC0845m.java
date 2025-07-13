package p031c1;

/* renamed from: c1.m */
/* loaded from: classes.dex */
public class RunnableC0845m implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.l f4587Y;

    /* renamed from: Z */
    public final /* synthetic */ int f4588Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f4589a0;

    /* renamed from: b0 */
    public final /* synthetic */ int f4590b0;

    /* renamed from: c0 */
    public final /* synthetic */ android.os.Bundle f4591c0;

    /* renamed from: d0 */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.k f4592d0;

    public RunnableC0845m(p031c1.AbstractServiceC0833a.k r1, p031c1.AbstractServiceC0833a.l r2, int r3, java.lang.String r4, int r5, android.os.Bundle r6) {
            r0 = this;
            r0.f4592d0 = r1
            r0.f4587Y = r2
            r0.f4588Z = r3
            r0.f4589a0 = r4
            r0.f4590b0 = r5
            r0.f4591c0 = r6
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            c1.a$l r0 = r12.f4587Y
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
            android.os.IBinder r0 = r0.m2512a()
            c1.a$k r1 = r12.f4592d0
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            r1.remove(r0)
            c1.a$k r1 = r12.f4592d0
            c1.a r1 = r1.f4553a
            java.util.ArrayList<c1.a$c> r1 = r1.f4519a0
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            c1.a$c r2 = (p031c1.AbstractServiceC0833a.c) r2
            int r4 = r2.f4532c
            int r5 = r12.f4588Z
            if (r4 != r5) goto L1b
            java.lang.String r4 = r12.f4589a0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3a
            int r4 = r12.f4590b0
            if (r4 > 0) goto L4e
        L3a:
            c1.a$c r3 = new c1.a$c
            c1.a$k r4 = r12.f4592d0
            c1.a r6 = r4.f4553a
            java.lang.String r7 = r2.f4530a
            int r8 = r2.f4531b
            int r9 = r2.f4532c
            android.os.Bundle r10 = r12.f4591c0
            c1.a$l r11 = r12.f4587Y
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L4e:
            r1.remove()
        L51:
            if (r3 != 0) goto L67
            c1.a$c r3 = new c1.a$c
            c1.a$k r1 = r12.f4592d0
            c1.a r5 = r1.f4553a
            java.lang.String r6 = r12.f4589a0
            int r7 = r12.f4590b0
            int r8 = r12.f4588Z
            android.os.Bundle r9 = r12.f4591c0
            c1.a$l r10 = r12.f4587Y
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L67:
            c1.a$k r1 = r12.f4592d0
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            r1.put(r0, r3)
            r1 = 0
            r0.linkToDeath(r3, r1)     // Catch: android.os.RemoteException -> L75
            goto L7c
        L75:
            java.lang.String r0 = "MBServiceCompat"
            java.lang.String r1 = "IBinder is already dead."
            android.util.Log.w(r0, r1)
        L7c:
            return
    }
}
