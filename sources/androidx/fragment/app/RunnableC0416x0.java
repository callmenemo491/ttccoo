package androidx.fragment.app;

/* renamed from: androidx.fragment.app.x0 */
/* loaded from: classes.dex */
public class RunnableC0416x0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ java.util.ArrayList f2418Y;

    /* renamed from: Z */
    public final /* synthetic */ java.util.Map f2419Z;

    public RunnableC0416x0(androidx.fragment.app.AbstractC0412v0 r1, java.util.ArrayList r2, java.util.Map r3) {
            r0 = this;
            r0.f2418Y = r2
            r0.f2419Z = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            java.util.ArrayList r0 = r5.f2418Y
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L25
            java.util.ArrayList r2 = r5.f2418Y
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            java.lang.String r3 = p227n0.C4661t.h.m10606k(r2)
            java.util.Map r4 = r5.f2419Z
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            p227n0.C4661t.h.m10617v(r2, r3)
            int r1 = r1 + 1
            goto L7
        L25:
            return
    }
}
