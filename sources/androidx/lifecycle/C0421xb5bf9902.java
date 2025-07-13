package androidx.lifecycle;

/* renamed from: androidx.lifecycle.CompositeGeneratedAdaptersObserver */
/* loaded from: classes.dex */
class C0421xb5bf9902 implements androidx.lifecycle.InterfaceC0468t {

    /* renamed from: Y */
    public final androidx.lifecycle.InterfaceC0456n[] f2425Y;

    public C0421xb5bf9902(androidx.lifecycle.InterfaceC0456n[] r1) {
            r0 = this;
            r0.<init>()
            r0.f2425Y = r1
            return
    }

    @Override // androidx.lifecycle.InterfaceC0468t
    /* renamed from: d */
    public void mo435d(androidx.lifecycle.InterfaceC0471v r7, androidx.lifecycle.AbstractC0458o.b r8) {
            r6 = this;
            androidx.lifecycle.c0 r0 = new androidx.lifecycle.c0
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.n[] r2 = r6.f2425Y
            int r3 = r2.length
            r4 = 0
        La:
            if (r4 >= r3) goto L14
            r5 = r2[r4]
            r5.m1451a(r7, r8, r1, r0)
            int r4 = r4 + 1
            goto La
        L14:
            androidx.lifecycle.n[] r2 = r6.f2425Y
            int r3 = r2.length
        L17:
            if (r1 >= r3) goto L22
            r4 = r2[r1]
            r5 = 1
            r4.m1451a(r7, r8, r5, r0)
            int r1 = r1 + 1
            goto L17
        L22:
            return
    }
}
