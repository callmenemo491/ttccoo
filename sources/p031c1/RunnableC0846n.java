package p031c1;

/* renamed from: c1.n */
/* loaded from: classes.dex */
public class RunnableC0846n implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.l f4593Y;

    /* renamed from: Z */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.k f4594Z;

    public RunnableC0846n(p031c1.AbstractServiceC0833a.k r1, p031c1.AbstractServiceC0833a.l r2) {
            r0 = this;
            r0.f4594Z = r1
            r0.f4593Y = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            c1.a$l r0 = r3.f4593Y
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
            android.os.IBinder r0 = r0.m2512a()
            c1.a$k r1 = r3.f4594Z
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            java.lang.Object r1 = r1.remove(r0)
            c1.a$c r1 = (p031c1.AbstractServiceC0833a.c) r1
            if (r1 == 0) goto L1a
            r2 = 0
            r0.unlinkToDeath(r1, r2)
        L1a:
            return
    }
}
