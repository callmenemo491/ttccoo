package p031c1;

/* renamed from: c1.p */
/* loaded from: classes.dex */
public class RunnableC0848p implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.l f4600Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f4601Z;

    /* renamed from: a0 */
    public final /* synthetic */ android.os.Bundle f4602a0;

    /* renamed from: b0 */
    public final /* synthetic */ p016b.C0652b f4603b0;

    /* renamed from: c0 */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.k f4604c0;

    public RunnableC0848p(p031c1.AbstractServiceC0833a.k r1, p031c1.AbstractServiceC0833a.l r2, java.lang.String r3, android.os.Bundle r4, p016b.C0652b r5) {
            r0 = this;
            r0.f4604c0 = r1
            r0.f4600Y = r2
            r0.f4601Z = r3
            r0.f4602a0 = r4
            r0.f4603b0 = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            c1.a$l r0 = r3.f4600Y
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
            android.os.IBinder r0 = r0.m2512a()
            c1.a$k r1 = r3.f4604c0
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            java.lang.Object r0 = r1.get(r0)
            c1.a$c r0 = (p031c1.AbstractServiceC0833a.c) r0
            if (r0 != 0) goto L35
            java.lang.String r0 = "sendCustomAction for callback that isn't registered action="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f4601Z
            r0.append(r1)
            java.lang.String r1 = ", extras="
            r0.append(r1)
            android.os.Bundle r1 = r3.f4602a0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MBServiceCompat"
            android.util.Log.w(r1, r0)
            return
        L35:
            c1.a$k r0 = r3.f4604c0
            c1.a r0 = r0.f4553a
            b.b r1 = r3.f4603b0
            java.util.Objects.requireNonNull(r0)
            r0 = 0
            r2 = -1
            r1.m2197b(r2, r0)
            return
    }
}
