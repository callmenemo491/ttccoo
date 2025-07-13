package androidx.activity;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public abstract class AbstractC0186b {

    /* renamed from: a */
    public boolean f616a;

    /* renamed from: b */
    public java.util.concurrent.CopyOnWriteArrayList<androidx.activity.InterfaceC0185a> f617b;

    public AbstractC0186b(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f617b = r0
            r1.f616a = r2
            return
    }

    /* renamed from: a */
    public abstract void mo439a();

    /* renamed from: b */
    public final void m440b() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.a> r0 = r2.f617b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.activity.a r1 = (androidx.activity.InterfaceC0185a) r1
            r1.cancel()
            goto L6
        L16:
            return
    }
}
