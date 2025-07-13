package p105g2;

/* renamed from: g2.c */
/* loaded from: classes.dex */
public class RunnableC2209c implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p105g2.AbstractC2220n f10112Y;

    /* renamed from: Z */
    public final /* synthetic */ p105g2.C2210d f10113Z;

    public RunnableC2209c(p105g2.C2210d r1, p105g2.AbstractC2220n r2) {
            r0 = this;
            r0.f10113Z = r1
            r0.f10112Y = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            g2.d r0 = r2.f10113Z     // Catch: java.lang.InterruptedException -> La
            java.util.concurrent.BlockingQueue<g2.n<?>> r0 = r0.f10116Z     // Catch: java.lang.InterruptedException -> La
            g2.n r1 = r2.f10112Y     // Catch: java.lang.InterruptedException -> La
            r0.put(r1)     // Catch: java.lang.InterruptedException -> La
            goto L11
        La:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L11:
            return
    }
}
