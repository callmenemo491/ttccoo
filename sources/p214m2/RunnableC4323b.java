package p214m2;

/* renamed from: m2.b */
/* loaded from: classes.dex */
public class RunnableC4323b implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p214m2.C4321a f17624Y;

    public RunnableC4323b(p214m2.C4321a r1) {
            r0 = this;
            r0.f17624Y = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            m2.a r0 = r2.f17624Y
            java.util.Objects.requireNonNull(r0)
        L5:
            java.lang.ref.ReferenceQueue<m2.r<?>> r1 = r0.f17616c     // Catch: java.lang.InterruptedException -> L11
            java.lang.ref.Reference r1 = r1.remove()     // Catch: java.lang.InterruptedException -> L11
            m2.a$b r1 = (p214m2.C4321a.b) r1     // Catch: java.lang.InterruptedException -> L11
            r0.m9654b(r1)     // Catch: java.lang.InterruptedException -> L11
            goto L5
        L11:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L5
    }
}
