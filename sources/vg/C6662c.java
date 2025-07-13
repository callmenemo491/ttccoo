package vg;

/* renamed from: vg.c */
/* loaded from: classes.dex */
public final class C6662c<T> implements androidx.lifecycle.InterfaceC0439e0<vg.C6661b<? extends T>> {

    /* renamed from: a */
    public final mh.InterfaceC4620l<T, ch.C0985l> f25905a;

    public C6662c(mh.InterfaceC4620l<? super T, ch.C0985l> r1) {
            r0 = this;
            r0.<init>()
            r0.f25905a = r1
            return
    }

    @Override // androidx.lifecycle.InterfaceC0439e0
    /* renamed from: d */
    public void mo124d(java.lang.Object r3) {
            r2 = this;
            vg.b r3 = (vg.C6661b) r3
            if (r3 == 0) goto L19
            boolean r0 = r3.f25904b
            r1 = 0
            if (r0 == 0) goto La
            goto L12
        La:
            r0 = 1
            r3.f25904b = r0
            T r0 = r3.f25903a
            r3.f25903a = r1
            r1 = r0
        L12:
            if (r1 == 0) goto L19
            mh.l<T, ch.l> r3 = r2.f25905a
            r3.mo107b(r1)
        L19:
            return
    }
}
