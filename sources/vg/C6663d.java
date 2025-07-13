package vg;

/* renamed from: vg.d */
/* loaded from: classes.dex */
public final class C6663d extends androidx.recyclerview.widget.RecyclerView.AbstractC0562r {

    /* renamed from: a */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f25906a;

    /* renamed from: b */
    public final /* synthetic */ mh.InterfaceC4609a<ch.C0985l> f25907b;

    public C6663d(androidx.recyclerview.widget.RecyclerView r1, mh.InterfaceC4609a<ch.C0985l> r2) {
            r0 = this;
            r0.f25906a = r1
            r0.f25907b = r2
            r0.<init>()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562r
    /* renamed from: a */
    public void mo1905a(androidx.recyclerview.widget.RecyclerView r1, int r2) {
            r0 = this;
            r1 = 1
            if (r2 != r1) goto L1a
            androidx.recyclerview.widget.RecyclerView r1 = r0.f25906a
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 == 0) goto L10
            int r1 = r1.mo1521b()
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 <= 0) goto L1a
            mh.a<ch.l> r1 = r0.f25907b
            if (r1 == 0) goto L1a
            r1.mo15e()
        L1a:
            return
    }
}
