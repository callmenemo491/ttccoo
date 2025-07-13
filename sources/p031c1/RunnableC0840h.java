package p031c1;

/* renamed from: c1.h */
/* loaded from: classes.dex */
public class RunnableC0840h implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.l f4572Y;

    /* renamed from: Z */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.k f4573Z;

    public RunnableC0840h(p031c1.AbstractServiceC0833a.k r1, p031c1.AbstractServiceC0833a.l r2) {
            r0 = this;
            r0.f4573Z = r1
            r0.f4572Y = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            c1.a$l r0 = r3.f4572Y
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
            android.os.IBinder r0 = r0.m2512a()
            c1.a$k r1 = r3.f4573Z
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            java.lang.Object r0 = r1.remove(r0)
            c1.a$c r0 = (p031c1.AbstractServiceC0833a.c) r0
            if (r0 == 0) goto L22
            c1.a$l r1 = r0.f4533d
            c1.a$m r1 = (p031c1.AbstractServiceC0833a.m) r1
            android.os.IBinder r1 = r1.m2512a()
            r2 = 0
            r1.unlinkToDeath(r0, r2)
        L22:
            return
    }
}
