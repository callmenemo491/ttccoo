package th;

/* renamed from: th.a */
/* loaded from: classes.dex */
public final class C6243a<T> implements th.InterfaceC6246d<T> {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicReference<th.InterfaceC6246d<T>> f24228a;

    public C6243a(th.InterfaceC6246d<? extends T> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.f24228a = r0
            return
    }

    @Override // th.InterfaceC6246d
    public java.util.Iterator<T> iterator() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<th.d<T>> r0 = r2.f24228a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            th.d r0 = (th.InterfaceC6246d) r0
            if (r0 == 0) goto L10
            java.util.Iterator r0 = r0.iterator()
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This sequence can be consumed only once."
            r0.<init>(r1)
            throw r0
    }
}
