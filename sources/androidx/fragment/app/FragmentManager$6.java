package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.InterfaceC0468t {
    @Override // androidx.lifecycle.InterfaceC0468t
    /* renamed from: d */
    public void mo435d(androidx.lifecycle.InterfaceC0471v r2, androidx.lifecycle.AbstractC0458o.b r3) {
            r1 = this;
            androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_START
            r0 = 0
            if (r3 == r2) goto Lb
            androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
            if (r3 == r2) goto La
            return
        La:
            throw r0
        Lb:
            throw r0
    }
}
